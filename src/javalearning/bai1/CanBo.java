package javalearning.bai1;
import java.util.Scanner;
public class CanBo {
    private String _hoTen;
    private int _tuoi;
    private String _gioiTinh;
    private String _diaChi;
    public String getHoTen() {
        return _hoTen;
    }

    public void setHoTen(String hoTen) {
        this._hoTen = hoTen;
    }

    public int getTuoi() {
        return _tuoi;
    }

    public void setTuoi(int tuoi) {
        this._tuoi = tuoi;
    }

    public String getGioiTinh() {
        return _gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this._gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return _diaChi;
    }

    public void setDiaChi(String diaChi) {
        this._diaChi = diaChi;
    }

    public void nhapThongTin(){
        Scanner cin = new Scanner(System.in);

        String x;
        System.out.printf("Nhap ho ten Can Bo: ");
        x = cin.nextLine();
        setHoTen(x);

        System.out.printf("Nhap tuoi Can Bo: ");
        int y = cin.nextInt();
        setTuoi(y);

        x = cin.nextLine();

        System.out.printf("Nhap gioi Tinh: ");
        x = cin.nextLine();
        setGioiTinh(x);

        System.out.printf("Nhap dia chi: ");
        x = cin.nextLine();
        setDiaChi(x);
    }

}
