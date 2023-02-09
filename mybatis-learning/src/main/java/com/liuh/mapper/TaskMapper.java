package com.liuh.mapper;

import com.liuh.pojo.Task;

/**
 * @PackageName: com.liuh.mapper
 * @FileName: TaskMapper
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/9
 */
public interface TaskMapper {

    /**
     * 查询角色
     *
     * @param id
     * @return
     */
    Task getTask(Long id);
}
