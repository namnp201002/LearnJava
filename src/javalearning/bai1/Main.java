package javalearning.bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QLCB quanLyCanBo = new QLCB();
        Scanner input = new Scanner(System.in);
        int luaChon;
        do{
            System.out.println("MOI NHAP LUA CHON");
            System.out.println("1. Them moi Can Bo.");
            System.out.println("2. Tim kiem Can Bo theo HO TEN.");
            System.out.println("3. In danh sach cac Can Bo.");
            System.out.println("0. Thoat.");
            luaChon = input.nextInt();
            switch (luaChon){
                case 1:
                    CanBo A = new CanBo();
                    A.nhapThongTin();
                    quanLyCanBo.themMoiCanBo(A);
                    break;
                case 2:
                    String name = input.nextLine();
                    name = input.nextLine();
                    quanLyCanBo.searchHoTen(name);
                    break;
                case 3:
                    quanLyCanBo.showDsCanBo();
                    break;
            }
        }while(luaChon == 1 || luaChon == 2 || luaChon == 3);

    }
}
