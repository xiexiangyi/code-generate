package com.giveu.contract.bean.fn.general.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
* @author  ${author}
* @Description
* @Date ${date}
* @see
*/
@Data
public class ${entity}Form{
<#list table.fields as field>
    <#if field.comment??>
        /**
        * ${field.comment}
        */
    </#if>
    <#if field.propertyType=="Date">
        private ${field.propertyType} ${field.name};
        private ${field.propertyType} ${field.name}_start;
        private ${field.propertyType} ${field.name}_end;
    </#if>
    private List<${field.propertyType}> ${field.name};

</#list>
}