/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {
    private String ten;
    private String MSSV;
    private int diem;

    public Student(String ten, String MSSV, int diem) {
        this.ten = ten;
        this.MSSV = MSSV;
        this.diem = diem;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
    public static Student scanInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap MSSV: ");
        String MSSV = scanner.nextLine();
        System.out.println("Nhap diem");
        int diem = scanner.nextInt();
        
        return new Student(ten,MSSV, diem);
    }
    public void printInfo() {
        System.out.println("Ten cua sinh vien" + ten);
        System.out.println("MSSV: " + MSSV);
        System.out.println("Diem" + diem);
    }
    public void kiemTraDiem() {
        if (diem < 5) {
            System.out.println(ten+ " " +"phai hoc lai!");
        } 
    }
}
