/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin tam giac");
        
        System.out.println("Nhap canh 1");
        int canh1 = scanner.nextInt();
        System.out.println("Nhap canh 2");
        int canh2 = scanner.nextInt();
        System.out.println("Nhap canh 3");
        int canh3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap mau");
        String mau = scanner.nextLine();
        
        TamGiac tamGiac = new TamGiac();
        tamGiac.setCanh1(canh1);
        tamGiac.setCanh2(canh2);
        tamGiac.setCanh3(canh3);
        tamGiac.setMau(mau);
        tamGiac.Inkq();
        
        if(tamGiac.laTamGiac()) {
            tamGiac.tinhChuVi();
            tamGiac.tinhDienTich();
        }
        
    }
    
}
