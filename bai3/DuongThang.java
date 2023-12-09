/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Admin
 */
public class DuongThang extends Hinh {
    private int chieuDai;

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public DuongThang(int chieuDai) {
        this.chieuDai = chieuDai;
    }
    public void Inkq() {
        System.out.println("Mau" + getMau() + "va co" + getSoCanh()+"canh");
    }
    public void ve() {
        for(int i = 0; i<chieuDai; i++) {
            System.out.print("-");
        }
    }
}
