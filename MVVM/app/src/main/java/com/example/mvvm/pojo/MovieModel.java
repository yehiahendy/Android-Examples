package com.example.mvvm.POJO;

public class MovieModel {
    private String name;
    private String date;
    private int id;
    private String descreption;

    public MovieModel(String name, String date, int id, String descreption) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.descreption = descreption;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }


}
