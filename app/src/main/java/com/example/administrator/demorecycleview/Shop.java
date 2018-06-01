package com.example.administrator.demorecycleview;

public class Shop {
    String name;
    int hinh;

    public Shop(String name, int hinh) {
        this.name = name;
        this.hinh = hinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
