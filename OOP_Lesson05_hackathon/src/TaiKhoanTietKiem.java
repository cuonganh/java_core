
import java.util.Scanner;

public class TaiKhoanTietKiem extends TaiKhoan implements TaiKhoanInterface {

    static Scanner sc = new Scanner(System.in);

    TaiKhoanTietKiem() {
        super();
    }

    TaiKhoanTietKiem(String stk, double laiSuat, long soTienKhoiTao) {
        this.soTaiKhoan = stk;
        this.laiSuat = laiSuat;
        this.soDu = soTienKhoiTao;

    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        System.out.println("So tai khoan dang chuoi 13 so");
        String temp = sc.next();
        try {
            Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            System.out.println("So tai khoan la chuoi 13 so"); 
        }
        if (temp.length() == 13) {
            this.soTaiKhoan = sc.next();
            System.out.println("Khoi tao tai khoan thanh cong");
        } else {
            System.out.println("So tai khoan khong hop le");
        }

    }

    
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu + soDu*laiSuat;
    }
    
    public double getLaiXuat(){
        return laiSuat;   
    }

    @Override
    public void rutTien(long soTienRut) {
        if(soDu > soTienRut && soTienRut >0){     
        this.soDu = soDu - soTienRut;
        }else{
            System.out.println("Vuot qua so du tai khoan");
        }
    }

    @Override
    public void guiTien(long soTienGui) {
        if(soTienGui > 0)
        this.soDu = soDu + soTienGui;
        else System.out.println("So tien gui la so khong am");
    }

    @Override
    public void kiemTraSoDu() {
        System.out.println("So du hien tai la " + this.getSoDu());
    }

}
