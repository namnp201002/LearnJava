package javalearning.bai1;

import java.util.ArrayList;
import java.util.List;

public class QLCB {
    public List<CanBo> dsCanBo = new ArrayList<>();

    public void themMoiCanBo(CanBo A){
        dsCanBo.add(A);
    }
    public void searchHoTen(String ten){
        boolean checkSearch = false;
        for(CanBo item : dsCanBo){
            if(item.getHoTen().equals(ten)){
                checkSearch = true;
                System.out.println("Ho Ten: " + item.getHoTen() + ", Tuoi: " + item.getTuoi() +
                        ", Gioi Tinh: " + item.getGioiTinh() + ", Dia Chi: " + item.getDiaChi());
            }
        }
        if(checkSearch == false){
            System.out.println("Not Found!");
        }
    }
    public void showDsCanBo(){
        System.out.println("-----THONG TIN DANH SACH CAN BO-----");
        for(CanBo item : dsCanBo){
            System.out.println("Ho Ten: " + item.getHoTen() + ", Tuoi: " + item.getTuoi() +
                    ", Gioi Tinh: " + item.getGioiTinh() + ", Dia Chi: " + item.getDiaChi());
        }
    }
}
