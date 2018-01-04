package com.ld.meituancaidan;

/**
 * Created by BillTian on 2017/12/28.
 */

public class Subject {
    //主题名
    private String name;
    //主体图标资源id
    private int icon;

    public Subject(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
