package com.liuh.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @PackageName: com.liuh.handler
 * @FileName: MyTypeHandler
 * @Description: 实现 java 数据类型和数据库数据类的转换
 * @Author: Liuh
 * @Date: 2023/2/6
 */
public class MyTypeHandler implements TypeHandler<String> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        System.out.println("设置了 String 参数【" + s + "】");
        preparedStatement.setString(i, s);
    }

    @Override
    public String getResult(ResultSet resultSet, String s) throws SQLException {
        String result = resultSet.getString(s);
        System.out.println("读取 String 参数 1 【" + result + "】");
        return result;
    }

    @Override
    public String getResult(ResultSet resultSet, int i) throws SQLException {
        String result = resultSet.getString(i);
        System.out.println("读取 String 参数 2 【" + result + "】");
        return result;
    }

    @Override
    public String getResult(CallableStatement callableStatement, int i) throws SQLException {
        String result = callableStatement.getString(i);
        System.out.println("读取 String 参数 3 【" + result + "】");
        return result;
    }
}
