package javalearning.basic;
import java.util.Scanner;
public class Info {
    private String _maHocPhan;
    private String _tenHocPhan;
    private String _ngayBatDau;
    private int  _soTinChi;
    private int _hocPhi;

    Scanner input = new Scanner(System.in);

    public String get_maHocPhan() {
        return this._maHocPhan;
    }

    public String get_tenHocPhan() {
        return this._tenHocPhan;
    }

    public String get_ngayBatDau() {
        return this._ngayBatDau;
    }

    public int get_soTinChi() {
        return this._soTinChi;
    }

    public int get_hocPhi() {
        return this._hocPhi;
    }

    public void set_maHocPhan(String _maHocPhan) {
        this._maHocPhan = _maHocPhan;
    }

    public void set_tenHocPhan(String _tenHocPhan) {
        this._tenHocPhan = _tenHocPhan;
    }

    public void set_ngayBatDau(String _ngayBatDau) {
        this._ngayBatDau = _ngayBatDau;
    }

    public void set_soTinChi(int _soTinChi) {
        this._soTinChi = _soTinChi;
    }

    public void set_hocPhi(int _hocPhi) {
        this._hocPhi = _hocPhi;
    }
    protected void nhapTT(){
        String X;

        System.out.print("Nhap Ma Hoc Phan: ");
        X = input.nextLine();
        set_maHocPhan(X);

        System.out.print("Nhap Ten Hoc Phan: ");
        X = input.nextLine();
        set_tenHocPhan(X);

        System.out.print("Nhap So Tin Chi: ");
        int Y = input.nextInt();
        set_soTinChi(Y);

        System.out.print("Nhap Hoc Phi: ");
        Y = input.nextInt();
        set_hocPhi(Y);

        X = input.nextLine();

        System.out.print("Ngay Bat Dau: ");
        X = input.nextLine();
        set_ngayBatDau(X);
    }
    protected void xuatTT(){
        System.out.println(this.get_maHocPhan() + " -- " + this.get_tenHocPhan() + " -- " +
                this.get_soTinChi() + " -- " + this.get_hocPhi() + " -- " + this.get_ngayBatDau());
    }
}
