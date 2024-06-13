/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author tjnk1
 */
public class PhieuThue {
    String MaPhieuThue;
    String LoaiThue;
    String TenMon;
    String Lop;
    Double GiaDay;
    int TrangThai;
    Date ThoiGianBatDau;
    Date ThoiGianKetThuc;
    GiaSu GiaSu;
    NhanVien NhanVien;
    KhachHang KhachHang;

    public String getMaPhieuThue() {
        return MaPhieuThue;
    }

    public void setMaPhieuThue(String MaPhieuThue) {
        this.MaPhieuThue = MaPhieuThue;
    }

    public String getLoaiThue() {
        return LoaiThue;
    }

    public void setLoaiThue(String LoaiThue) {
        this.LoaiThue = LoaiThue;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public Double getGiaDay() {
        return GiaDay;
    }

    public void setGiaDay(Double GiaDay) {
        this.GiaDay = GiaDay;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Date getThoiGianBatDau() {
        return ThoiGianBatDau;
    }

    public void setThoiGianBatDau(Date ThoiGianBatDau) {
        this.ThoiGianBatDau = ThoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date ThoiGianKetThuc) {
        this.ThoiGianKetThuc = ThoiGianKetThuc;
    }

    public GiaSu getGiaSu() {
        return GiaSu;
    }

    public void setGiaSu(GiaSu GiaSu) {
        this.GiaSu = GiaSu;
    }

    public NhanVien getNhanVien() {
        return NhanVien;
    }

    public void setNhanVien(NhanVien NhanVien) {
        this.NhanVien = NhanVien;
    }

    public KhachHang getKhachHang() {
        return KhachHang;
    }

    public void setKhachHang(KhachHang KhachHang) {
        this.KhachHang = KhachHang;
    }
    
}
