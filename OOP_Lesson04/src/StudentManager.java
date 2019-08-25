
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager extends Person implements StudentInterface {

    static Scanner sc = new Scanner(System.in);
    static int temp = 0;
    ArrayList<Student> dssv = new ArrayList<>();

    Student std = new Student();

    @Override
    public void themSinhVien(Student sv) {
        dssv.add(sv);
        System.out.println("Da them 1 nguoi");
    }

    @Override
    public void xoaSinhVien(int mssv) {
        System.out.println("Xoa sinh vien co MSSV " + mssv);
        timKiem(mssv);
        dssv.remove(temp);
    }

    @Override
    public void updateSinhVien(int mssv) {
        this.mssv = mssv;
        String ngSinh;
        String giTinh;

        timKiem(mssv);
        System.out.println("Cap nhat ten: ");
        dssv.get(temp).setName(sc.nextLine());
        System.out.println("Cap nhat ngay sinh: ");
        ngSinh = sc.nextLine();
        dssv.get(temp).setDateOfBirth(dateOfBirth);
        System.out.println("Cap nhat gioi tinh: MALE, FEMALE or UNKNOWN");
        giTinh = sc.nextLine();

        if (giTinh.equals("MALE")) {
            dssv.get(temp).setGender(Gender.MALE);
        }

        if (giTinh.equals("FEMALE")) {
            dssv.get(temp).setGender(Gender.FEMALE);
        } else {
            dssv.get(temp).setGender(Gender.UNKNOWN);
        }

    }

    @Override
    public int timKiem(int mssv) {

        for (int i = 0; i < dssv.size(); i++) {
            int tg = dssv.get(i).getMssv();
            int key = mssv;
            if (tg == key) {
                temp = i;
                System.out.println("Tim thay MSSV " + key + ", tai DSSV[" + i + "]");
                return temp;
            } else {
                System.out.println("MSSV " + key + " khong ton tai");
            }
        }
        return -1;      // Exception?

    }

    @Override
    public void hienThi() {
        System.out.println("MSSV: " + this.mssv + ": " + this.name + ", " + this.dateOfBirth + ", " + this.gender);
    }

    public void hienThi(int mssv) {
        timKiem(mssv);
        System.out.println("MSSV: " + dssv.get(temp).mssv + ": " + dssv.get(temp).name + ", " + dssv.get(temp).dateOfBirth + ", " + dssv.get(temp).gender);
    }

}
