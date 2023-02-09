package com.liuh;

import com.liuh.mapper.TaskMapper;
import com.liuh.pojo.Task;
import com.liuh.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @PackageName: com.liuh
 * @FileName: TaskTest
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/9
 */
public class TaskTest {

    @Test
    public void selectTask() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
            Task task = mapper.getTask(1L);
            System.out.println(task.getTitle());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
