/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten lop");
        String tenLop = scanner.nextLine();
        System.out.println("Nhap so luong sinh vien");
        int soSinhVien = scanner.nextInt();
        
        LopHoc lopHoc = new LopHoc(tenLop, soSinhVien);
        lopHoc.inDanhSachSinhVien();
        
        lopHoc.sapXepVaInDiemCaoDenThap();
       
        // TODO code application logic here
    }
    
}
