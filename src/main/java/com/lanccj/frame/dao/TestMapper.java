package com.lanccj.frame.dao;

import com.lanccj.frame.entity.Test;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TestMapper {
    @Delete({
        "delete from Test",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into Test (ID, NAME)",
        "values (#{id,jdbcType=DECIMAL}, #{name,jdbcType=CHAR})"
    })
    int insert(Test record);

    @InsertProvider(type=TestSqlProvider.class, method="insertSelective")
    int insertSelective(Test record);

    @Select({
        "select",
        "ID, NAME",
        "from Test",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.CHAR)
    })
    Test selectByPrimaryKey(Long id);

    @UpdateProvider(type=TestSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Test record);

    @Update({
        "update Test",
        "set NAME = #{name,jdbcType=CHAR}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(Test record);
}