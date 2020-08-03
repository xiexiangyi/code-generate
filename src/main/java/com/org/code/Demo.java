package com.org.code;

import com.org.code.generate.CodeGenerate;
import com.org.code.generate.config.DataSourceConfig;
import com.org.code.generate.config.GlobalConfig;

public class Demo {

    public static void mysqlDemo(){
        GlobalConfig globalConfig = new GlobalConfig();//全局配置
//        globalConfig.setTemplatepath("/template/style1");//自定义模板路径
        globalConfig.setAuthor("xxx");
        globalConfig.setMapperPackage("com.xxx.zb.room.dal.db");//dao包名
        globalConfig.setServicePackage("com.xxx.zb.room.dal.service");//service包名
        globalConfig.setServiceImplPackage("com.xxx.zb.room.dal.service.impl");
        globalConfig.setControllerPackage("com.xxx.zb.roomcontroller");
        globalConfig.setMapperxml("xml");
//     globalConfig.setForm("form");
//        globalConfig.setTableNames(new String[]{"cs_credit","cs_credit_ext"});//需要生成的实体
//     globalConfig.setPrefix(new String[]{"pre_"});//生成的实体移除前缀
//        globalConfig.setOutputDir("D://code/");//文件输出路径，不配置的话默认输出当前项目的resources/code目录下
        //要修改的参数
//     globalConfig.setEntityPackage("com.giveu.contract.bean.fn.general.resp");//实体包名
//     globalConfig.setEntryClass("com.giveu.contract.bean.fn.general.resp.CsProductSnapshot");
//        globalConfig.setTableNames(new String[]{"p"});
        globalConfig.setTableNames(new String[]{"adv_info"});//需要生成的实体
//     globalConfig.setDtoPre("");
//     globalConfig.setColumnAlias("u");

        //数据库配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("xxx");
        dsc.setUsername("xxx");
        dsc.setPassword("xxx");
        CodeGenerate codeGenerate = new CodeGenerate(globalConfig, dsc);
        //生成代码
        codeGenerate.generateToFile();
    }
    public static void main(String[] args) {
        mysqlDemo();
    }
    public static void  oracleDemo(){
        GlobalConfig globalConfig = new GlobalConfig();//全局配置
//        globalConfig.setTemplatepath("/template/style1");//自定义模板路径
        globalConfig.setAuthor("xiexiangyi");
        globalConfig.setMapperPackage("com.xxx.contract.module.fn.mapper");//dao包名
        globalConfig.setServicePackage("com.xxx.demo.service");//service包名
        globalConfig.setServiceImplPackage("com.xxx.demo.service.impl");
        globalConfig.setControllerPackage("com.xxx.demo.controller");
        globalConfig.setMapperxml("xml");
        globalConfig.setForm("form");
//        globalConfig.setTableNames(new String[]{"cs_credit","cs_credit_ext"});//需要生成的实体
        globalConfig.setPrefix(new String[]{"pre_"});//生成的实体移除前缀
//        globalConfig.setOutputDir("D://code/");//文件输出路径，不配置的话默认输出当前项目的resources/code目录下
        //要修改的参数
        globalConfig.setEntityPackage("com.xxx.contract.bean.fn.general.resp");//实体包名
        globalConfig.setEntryClass("com.xxx.contract.bean.fn.general.resp.CsProductSnapshot");
//        globalConfig.setTableNames(new String[]{"p"});
        globalConfig.setTableNames(new String[]{"xxx"});//需要生成的实体
        globalConfig.setDtoPre("");
        globalConfig.setColumnAlias("u");

        //数据库配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
        dsc.setUsername("xxx");
        dsc.setPassword("xxx");
        dsc.setUrl("jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=xxx)(PORT=1521))(CONNECT_DATA=(SERVER=DEDICATED)(SERVICE_NAME=xxx)))");
        CodeGenerate codeGenerate = new CodeGenerate(globalConfig, dsc);
        //生成代码
        codeGenerate.generateToFile();
    }
}
