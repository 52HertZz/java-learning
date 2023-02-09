package com.liuh.pojo;

/**
 * @PackageName: com.liuh.pojo
 * @FileName: MaleEmployee
 * @Description: 男员工
 * @Author: Liuh
 * @Date: 2023/2/9
 */
public class MaleEmployee extends Employee {

    private MaleHealthForm maleHealthForm = null;

    public MaleHealthForm getMaleHealthForm() {
        return maleHealthForm;
    }

    public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
        this.maleHealthForm = maleHealthForm;
    }
}
