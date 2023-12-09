/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CauThu {
    private String ten;
    private int tuoi;
    private String viTri;
    private int soAo;
    private double gia;

    public CauThu(String ten, int tuoi, int soAo, String viTri, double gia) {
        this.ten = ten;
        this.viTri = viTri;
        this.soAo = soAo;
        this.tuoi = tuoi;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getSoAo() {
        return soAo;
    }

    public void setSoAo(int soAo) {
        this.soAo = soAo;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public void chuyenBong() {
        System.out.println(ten+"chuyen bong");
    }
    public void sutVaoGon() {
        System.out.println(ten+"Sut vao gon");
    }
    public void chay() {
        System.out.println(ten+"chay");
    }
    public static CauThu scanInfo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ten cau thu: ");
        String ten = scanner.nextLine();
        
        System.out.println("Nhap tuoi cau thu");
        int tuoi = scanner.nextInt();
        
        System.out.println("Nhap so ao cau thu");
        int soAo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Nhap vi tri cua cau thu");
        String viTri = scanner.nextLine(); 
        
        System.out.println("Nhap gia cau thu");
        double gia = scanner.nextDouble();
        
        return new CauThu(ten,tuoi,soAo, viTri, gia);

    }
    public void printInfo() {
        System.out.println("Thong tin cau thu");
        System.out.println("Ten" + ten);
        System.out.println("Tuoi" + tuoi);
        System.out.println("So ao" + soAo);
        System.out.println("Vi tri" + viTri);
        System.out.println("Gia" + gia);
    }
}
