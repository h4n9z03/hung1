/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Admin
 */
public class Hinh {
    private String mau;
    private int soCanh;

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public Hinh() {
        this.mau =  "Red";
        this.soCanh = 4;
    }
    
    public void Inkq() {
        System.out.println("Hinh mau" +mau+"va co"+ soCanh + "canh");
    }
}
