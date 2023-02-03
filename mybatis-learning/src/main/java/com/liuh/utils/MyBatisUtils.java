package com.liuh.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @PackageName: com.liuh.utils
 * @FileName: MyBatisUtils
 * @Description: SqlSessionFactory 工具类
 * @Author: Liuh
 * @Date: 2023/2/3
 */
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    String resource = "mybatis-config.xml";
    InputStream inputStream;

    {
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取 SqlSession 链接
     *
     * @return
     */
    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }
}
