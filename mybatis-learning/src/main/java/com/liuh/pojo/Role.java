package com.liuh.pojo;

/**
 * @PackageName: com.liuh.pojo
 * @FileName: Role
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/3
 */
public class Role {
    private int id;
    private String roleName;
    private String note;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
