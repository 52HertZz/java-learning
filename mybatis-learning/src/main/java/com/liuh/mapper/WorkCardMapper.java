package com.liuh.mapper;

import com.liuh.pojo.WorkCard;

/**
 * @PackageName: com.liuh.mapper
 * @FileName: WorkCardMapper
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/9
 */
public interface WorkCardMapper {

    WorkCard getWorkCardByEmpId(Long empId);

}
