package ${entityPackage};

import java.util.Date;
import java.io.Serializable;

/**
 * 描述: ${table.comment}
 * author: ${author}
 * date: ${date}
 */
@Data
public class ${entity} implements Serializable {


<#-- 循环属性名称 -->
<#list table.fields as field>
<#if field.comment??>
    /**
     * ${field.comment}
     */
</#if>
    <#if field.propertyType=="Date">
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    </#if>
    private ${field.propertyType} ${field.propertyName};
</#list>
<#-- 循环set/get方法 -->
<#--<#list table.fields as field>-->
<#--<#if field.propertyType == "Boolean">-->
<#--<#assign getprefix="is"/>-->
<#--<#else>-->
<#--<#assign getprefix="get"/>-->
<#--</#if>-->
<#--    public ${field.propertyType} ${getprefix}${field.capitalName}() {-->
<#--	return ${field.propertyName};-->
<#--    }-->

<#--    public void set${field.propertyName?cap_first}(${field.propertyType} ${field.propertyName}) {-->
<#--        this.${field.propertyName} = ${field.propertyName};-->
<#--    }-->
<#--</#list>-->
}