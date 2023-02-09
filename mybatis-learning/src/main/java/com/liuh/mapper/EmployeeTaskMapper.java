package com.liuh.mapper;

import com.liuh.pojo.EmployeeTask;

/**
 * @PackageName: com.liuh.mapper
 * @FileName: EmployeeTaskMapper
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/9
 */
public interface EmployeeTaskMapper {

    EmployeeTask getEmployeeTaskByEmpId(Long empId);
}
