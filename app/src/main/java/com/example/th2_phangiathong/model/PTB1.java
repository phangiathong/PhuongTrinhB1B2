package com.example.th2_phangiathong.model;

public class PTB1 {
    //ax + b =0
    private float a;
    private float b;
    //insert code

    public PTB1(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    //Phương thức
    public String giaiPT() {
        if(a==0) {
            if(b==0) {
                return "PT vô số nghiệm";
            }else {
                return "PT vô nghiệm";
            }
        }else {
            return "" + (-b/a); //Ép kiểu.
        }
    }
}
