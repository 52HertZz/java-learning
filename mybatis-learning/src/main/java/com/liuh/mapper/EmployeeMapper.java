package com.liuh.mapper;

import com.liuh.pojo.Employee;

/**
 * @PackageName: com.liuh.mapper
 * @FileName: EmployeeMapper
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/9
 */
public interface EmployeeMapper {

    Employee getEmployee(Long id);
}
