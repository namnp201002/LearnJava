package javalearning.basic;
import java.util.*;

public class Phieu extends Info{
    private List<Info> listThongTin = new ArrayList();
    private String _maPhieu;
    private String _maSinhVien;
    private String _tenSinhVien;
    private int _tongSoTinChi;
    private int _tongHocPhi;

    public void nhapThongTinPhieu(){
        System.out.print("Nhap Ma Phieu: ");
        _maPhieu = input.nextLine();
        System.out.print("Nhap MSV: ");
        _maSinhVien = input.nextLine();
        System.out.print("Nhap Ten SV: ");
        _tenSinhVien = input.nextLine();
        this._tongHocPhi = 0;
        this._tongSoTinChi = 0;

        for(int i = 0; i < 3; i++){
            Phieu A = new Phieu();
            A.nhapTT();
            this._tongSoTinChi += A.get_soTinChi();
            this._tongHocPhi += A.get_hocPhi();
            listThongTin.add(A);
        }
    }
    public void xuatThongTin(){
        System.out.println("HOC VIEN CONG NGHE BUU CHINH VIEN THONG");
        System.out.println("Ma Phieu: " + this._maPhieu + " ----- Ma SV: " + this._maSinhVien);
        System.out.println("Ho va ten: " + this._tenSinhVien);
        for(int i = 0; i < 3; i++){
            listThongTin.get(i).xuatTT();
        }
        System.out.println("Tong So Tin Chi: " + this._tongSoTinChi);
        System.out.println("Tong Hoc Phi: " + this._tongHocPhi);
    }
    public void sapXepTheoHocPhi(){
        Collections.sort(listThongTin, new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                return o2.get_hocPhi() - o1.get_hocPhi();
            }
        });
    }
}
