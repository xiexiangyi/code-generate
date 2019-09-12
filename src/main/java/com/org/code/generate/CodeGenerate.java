package com.org.code.generate;


import com.org.code.generate.config.DataSourceConfig;
import com.org.code.generate.config.GlobalConfig;
import com.org.code.generate.po.TableField;
import com.org.code.generate.po.TableInfo;
import com.org.code.generate.utils.CommonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CodeGenerate implements ICallBack {
    private static Logger logger = LoggerFactory.getLogger(CodeGenerate.class);
    private List<TableInfo> tableInfoList;
    private TableInfo tableInfo;
    private GlobalConfig globalConfig;
    private DataSourceConfig dataSourceConfig;
    public CodeGenerate(GlobalConfig globalConfig, DataSourceConfig dataSourceConfig) {
        this.globalConfig = globalConfig;
        this.dataSourceConfig = dataSourceConfig;
    }
    @Override
    public Map execute() {
        Map data = new HashMap();
        data.put("entityPackage", globalConfig.getEntityPackage());
        data.put("controllerPackage", globalConfig.getControllerPackage());
        data.put("servicePackage", globalConfig.getServicePackage());
        data.put("serviceImplPackage", globalConfig.getServiceImplPackage());
        data.put("mapperPackage", globalConfig.getMapperPackage());
        //移除表前缀，表名之间的下划线，得到实体类型
        String entity = CommonUtils.getNoUnderlineStr(CommonUtils.removePrefix(tableInfo.getName().toLowerCase(), globalConfig.getPrefix()));
        data.put("entity", StringUtils.capitalize(entity));//实体名称
        data.put("author", globalConfig.getAuthor());//创建作者
        data.put("date", CommonUtils.getFormatTime("yyyy-MM-dd", new Date()));//创建时间
        data.put("table", tableInfo);//表信息
        data.put("entryClass", globalConfig.getEntryClass());
        boolean isKeyFlag = false;
        for (TableField field : tableInfo.getFields()) {
            if (field.isKeyIdentityFlag()) {//获取主键字段信息
                data.put("tbKey", field.getName());
                data.put("tbKeyType", field.getPropertyType());
                isKeyFlag = true;
                break;
            }
        }
        if (!isKeyFlag) {
            throw new RuntimeException(String.format("[%s]表缺少主键，不能没有主键", tableInfo.getName()));
        }
        return data;
    }


    public void generateToFile() {
        if (dataSourceConfig == null) {
            throw new RuntimeException("dataSourceConfig is null");
        }
        if (globalConfig == null) {
            throw new RuntimeException("globalConfig is null");
        }
        tableInfoList = dataSourceConfig.getTablesInfo(globalConfig.getTableNames());
        for (TableInfo tableInfo : tableInfoList) {
            this.tableInfo = tableInfo;
            logger.info("------Code----Generation----[单表模型:" + tableInfo.getName() + "]------- 生成中。。。");
            try {
                CodeFactory codeFactory = new CodeFactory();
                codeFactory.setCallBack(this);
                codeFactory.setGlobalConfig(globalConfig);
                codeFactory.invoke("entityTemplate.ftl", "entity");
                codeFactory.invoke("MapperXML.ftl", "mapperxml");

//                codeFactory.invoke("controllerTemplate.ftl", "controller");
//                codeFactory.invoke("serviceTemplate.ftl", "service");
//                codeFactory.invoke("serviceImplTemplate.ftl", "serviceImpl");
//                codeFactory.invoke("mapperTemplate.ftl", "mapper");

                logger.info("-------Code----Generation-----[单表模型：" + tableInfo.getName() + "]------ 生成完成。。。");
            } catch (Exception e) {
                e.printStackTrace();
                logger.info("-------Code----Generation-----[单表模型：" + tableInfo.getName() + "]------ 生成失败。。。");
            }
        }
    }

}
