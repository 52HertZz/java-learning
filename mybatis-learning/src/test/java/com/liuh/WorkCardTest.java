package com.liuh;

import com.liuh.mapper.WorkCardMapper;
import com.liuh.pojo.WorkCard;
import com.liuh.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @PackageName: com.liuh
 * @FileName: WorkCardTest
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/9
 */
public class WorkCardTest {

    @Test
    public void selectTask() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            WorkCardMapper mapper = sqlSession.getMapper(WorkCardMapper.class);
            WorkCard workCardByEmpId = mapper.getWorkCardByEmpId(1L);
            System.out.println(workCardByEmpId.getNote());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }


    }
}
