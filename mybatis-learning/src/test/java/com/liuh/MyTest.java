package com.liuh;

import com.liuh.mapper.RoleMapper;
import com.liuh.pojo.Role;
import com.liuh.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @PackageName: com.liuh
 * @FileName: MyTest
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/3
 */
public class MyTest {

    @Test
    public void insertRole() {
        Role role = new Role();
        role.setRoleName("b1");
        role.setNote("b2");
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
            boolean b = mapper.insertRole(role);
            System.out.println(b);
        } finally {
            if (sqlSession != null) {
                // 增、删、改操作需要提交事务
                sqlSession.commit();
                sqlSession.close();
            }
        }

    }

    @Test
    public void selectRole() {

        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
            Role role = mapper.selectRole(1);
            System.out.println(role.getRoleName());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
