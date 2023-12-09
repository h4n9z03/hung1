/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Admin
 */
public class TamGiac extends Hinh {
    private int canh1;
    private int canh2;
    private int canh3;

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }
    public TamGiac() {
        this.canh1 = 0;
        this.canh2 = 0;
        this.canh3 = 0;
    }
    public void Inkq() {
        System.out.println("Canh1" + canh1);
        System.out.println("Canh2" + canh2);
        System.out.println("Canh3" + canh3);
        System.out.println("Mau" + getMau());
    }
    public void tinhChuVi() {
        int p = canh1 + canh2 + canh3;
        System.out.println("Chu vi tam giac la " + p);
    }
    public void tinhDienTich() {
        double nuaCV = (canh1+canh2+canh3) /2;
        double s = Math.sqrt(nuaCV*(nuaCV-canh1)*(nuaCV-canh2)*(nuaCV-canh3));
        System.out.println("Dien tich tam giac la" + s);
    }
    public boolean laTamGiac() {
        // Kiểm tra điều kiện tổng độ dài hai cạnh bất kỳ lớn hơn cạnh còn lại
        boolean dieuKien1 = (canh1 + canh2) > canh3;
        boolean dieuKien2 = (canh1 + canh3) > canh2;
        boolean dieuKien3 = (canh2 + canh3) > canh1;

        // Nếu tất cả các điều kiện đều đúng, đây là tam giác
        return dieuKien1 && dieuKien2 && dieuKien3;
    }
    
}
