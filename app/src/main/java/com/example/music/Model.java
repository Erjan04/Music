package com.example.music;

import android.widget.TextView;

public class Model {

    private Integer number;
    private String name,avtor,vanshot;

    public Model(Integer number, String name, String avtor, String vanshot) {
        this.number = number;
        this.name = name;
        this.avtor = avtor;
        this.vanshot = vanshot;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getVanshot() {
        return vanshot;
    }

    public void setVanshot(String vanshot) {
        this.vanshot = vanshot;
    }
}
