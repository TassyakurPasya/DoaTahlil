package com.example.doatahlil;

public class modeldoaTahlil {
    private String no,name,arab,translate;

    public Doa(String no, String name, String arab, String translate){
        this.no = no;
        this.name = name;
        this.arab = arab;
        this.translate = translate;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArab() {
        return arab;
    }

    public void setArab(String arab) {
        this.arab = arab;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}
