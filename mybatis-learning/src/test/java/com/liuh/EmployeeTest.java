package com.liuh;

import com.liuh.mapper.EmployeeMapper;
import com.liuh.pojo.Employee;
import com.liuh.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @PackageName: com.liuh
 * @FileName: EmployeeTest
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/9
 */
public class EmployeeTest {

    @Test
    public void getEmployeeTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmployee(1L);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
