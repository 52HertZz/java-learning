package com.liuh.pojo;

/**
 * @PackageName: com.liuh.pojo
 * @FileName: FemaleEmployee
 * @Description: 女员工
 * @Author: Liuh
 * @Date: 2023/2/9
 */
public class FemaleEmployee extends Employee {
    
    private FemaleHealthForm femaleHealthForm = null;

    public FemaleHealthForm getFemaleHealthForm() {
        return femaleHealthForm;
    }

    public void setFemaleHealthForm(FemaleHealthForm femaleHealthForm) {
        this.femaleHealthForm = femaleHealthForm;
    }
}
