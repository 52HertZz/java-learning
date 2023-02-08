package com.liuh.pojo;

/**
 * @PackageName: com.liuh.pojo
 * @FileName: SexEnum
 * @Description: 性别枚举类
 * @Author: Liuh
 * @Date: 2023/2/6
 */
public enum SexEnum {
    MALE(1, "男"),
    FEMALE(0, "女");

    SexEnum(int i, String sex) {

    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexEnum getSexById(int id) {
        for (SexEnum value : SexEnum.values()) {
            if (value.id == id) {
                return value;
            }
        }
        return null;
    }
}
