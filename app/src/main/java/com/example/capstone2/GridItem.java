package com.example.capstone2;

public class GridItem {
    String name;
    String mobile;
    int resId;

    // Generate > Constructor
    public GridItem(String name) {
        this.name = name;
    }

    // Generate > Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Generate > toString() : 아이템을 문자열로 출력

    @Override
    public String toString() {
        return "GrieItem{" +
                "name='" + name + '}';
    }
}
