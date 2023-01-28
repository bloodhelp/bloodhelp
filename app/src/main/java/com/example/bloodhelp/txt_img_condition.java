package com.example.bloodhelp;

public class txt_img_condition {
    int img;

    public int getImg() {
        return img;
    }

    public txt_img_condition(int img, String txt) {
        this.img = img;
        this.txt = txt;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    String txt;
}
