/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class LopHoc {
    private String tenLop;
    private int soSinhVien;
    private Student[] danhSachSinhVien;

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }

    public void setSoSinhVien(int soSinhVien) {
        this.soSinhVien = soSinhVien;
    }

    public LopHoc(String tenLop, int soSinhVien) {
        this.tenLop = tenLop;
        this.soSinhVien = soSinhVien;
        this.danhSachSinhVien = new Student[soSinhVien];
        
        for (int i = 0; i<soSinhVien; i++) {
            danhSachSinhVien[i] = Student.scanInfo();
        }
    }
    public void inDanhSachSinhVien() {
        System.out.println("Danh sach sinh vien cua lop "+ tenLop);
        for (Student student : danhSachSinhVien) {
            student.printInfo();
        }
    }
      public void sapXepVaInDiemCaoDenThap() {
        Arrays.sort(danhSachSinhVien, Comparator.comparingDouble(Student::getDiem).reversed());

        // Gọi phương thức kiểm tra điểm cho mỗi sinh viên
        for (Student student : danhSachSinhVien) {
            student.kiemTraDiem();
        }
    }
}
