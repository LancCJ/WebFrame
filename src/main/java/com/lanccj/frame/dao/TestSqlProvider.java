package com.lanccj.frame.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.lanccj.frame.entity.Test;

public class TestSqlProvider {

    public String insertSelective(Test record) {
        BEGIN();
        INSERT_INTO("Test");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=DECIMAL}");
        }
        
        if (record.getName() != null) {
            VALUES("NAME", "#{name,jdbcType=CHAR}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Test record) {
        BEGIN();
        UPDATE("Test");
        
        if (record.getName() != null) {
            SET("NAME = #{name,jdbcType=CHAR}");
        }
        
        WHERE("ID = #{id,jdbcType=DECIMAL}");
        
        return SQL();
    }
}