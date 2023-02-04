package com.liuh.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @PackageName: com.liuh.utils
 * @FileName: SqlSessionFactoryUtils
 * @Description: SqlSessionFactory 工具类
 * @Author: Liuh
 * @Date: 2023/2/3
 */
public class SqlSessionFactoryUtils {

    private final static Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;

    private static SqlSessionFactory sqlSessionFactory = null;


    /**
     * 构造方法私有化
     */
    private SqlSessionFactoryUtils() {
    }

    /**
     * 创建  SqlSession 工厂
     *
     * @return
     */
    private static SqlSessionFactory getSqlSessionFactory() {
        // 保证 SqlSessionFactory 唯一性
        synchronized (LOCK) {
            if (sqlSessionFactory != null) {
                return sqlSessionFactory;
            }
            String resource = "mybatis-config.xml";
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }

        }
        return sqlSessionFactory;
    }

    /**
     * 创建 SqlSession
     *
     * @return
     */
    public static SqlSession openSqlSession() {
        if (sqlSessionFactory == null) {
            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
