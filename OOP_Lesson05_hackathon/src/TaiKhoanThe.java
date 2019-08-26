
import java.util.Scanner;

public class TaiKhoanThe extends TaiKhoan implements TaiKhoanInterface {

    static Scanner sc = new Scanner(System.in);

    TaiKhoanThe() {
        super();
    }

    TaiKhoanThe(String stk, long soTienKhoiTao) {
        this.soTaiKhoan = stk;
        this.soDu = soTienKhoiTao;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        System.out.println("So tai khoan dang chuoi 13 so");
        String temp = sc.next();
        try {
            Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            // 
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

    public long getSoDu() {
        return soDu;
    }

    @Override
    public void rutTien(long soTienRut) {
        if (soDu > 0 && soDu > soTienRut) {
            this.soDu = soDu - soTienRut;
        } else {
            System.out.println("Vuot qua so du tai khoan");
        }
    }

    @Override
    public void guiTien(long soTienGui) {
        if (soTienGui > 0) {
            this.soDu = soDu + soTienGui;
        } else {
            System.out.println("So tien gui la so khong am");
        }
    }

    @Override
    public void kiemTraSoDu() {
        System.out.println("So du hien tai la " + this.getSoDu());
    }

    
}
