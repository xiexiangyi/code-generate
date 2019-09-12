<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${entryClass}">

    <resultMap id="BaseResultMap"
               type="${entryClass}">
        <#list table.fields as field>
            <result column="${field.name}" property="${field.propertyName}"/>
        </#list>
    </resultMap>