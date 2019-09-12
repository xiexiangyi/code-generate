package com.org.code;

import com.org.code.generate.CodeGenerate;
import com.org.code.generate.config.DataSourceConfig;
import com.org.code.generate.config.GlobalConfig;

public class Demo {
    public static void main(String[] args) {
        GlobalConfig globalConfig = new GlobalConfig();//全局配置
//        globalConfig.setTemplatepath("/template/style1");//自定义模板路径
        globalConfig.setAuthor("xiexiangyi");
        globalConfig.setEntityPackage("com.giveu.contract.bean.fn.general.resp");//实体包名
        globalConfig.setEntryClass("com.giveu.contract.bean.fn.general.resp.CsCreditExtDto");
        globalConfig.setMapperPackage("com.giveu.contract.module.fn.mapper");//dao包名
        globalConfig.setServicePackage("com.xinhuo.demo.service");//service包名
        globalConfig.setServiceImplPackage("com.xinhuo.demo.service.impl");
        globalConfig.setControllerPackage("com.xinhuo.demo.controller");
        globalConfig.setMapperxml("");
//        globalConfig.setTableNames(new String[]{"cs_credit","cs_credit_ext"});//需要生成的实体
        globalConfig.setTableNames(new String[]{"cs_credit"});//需要生成的实体
        globalConfig.setPrefix(new String[]{"pre_"});//生成的实体移除前缀
//        globalConfig.setOutputDir("D://code/");//文件输出路径，不配置的话默认输出当前项目的resources/code目录下

        DataSourceConfig dsc = new DataSourceConfig();//数据库配置
        dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
        dsc.setUsername("DAFY_SALES2");
        dsc.setPassword("Test$20150508");
        dsc.setUrl("jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=FTdevdb02.dafycredit.com)(PORT=1521))(CONNECT_DATA=(SERVER=DEDICATED)(SERVICE_NAME=devdb02)))");
//        dsc.setDriverName("com.mysql.jdbc.Driver");
//        dsc.setUrl("jdbc:mysql://192.168.33.76:3306/test?useUnicode=true&amp;characterEncoding=UTF-8&amp;&useSSL=false");
//        dsc.setUsername("root");//填写自己的数据库账号
//        dsc.setPassword("root");//填写自己的数据库密码
        CodeGenerate codeGenerate = new CodeGenerate(globalConfig, dsc);
        //生成代码
        codeGenerate.generateToFile();
    }
}
