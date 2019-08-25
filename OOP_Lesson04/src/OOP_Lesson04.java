
import sun.util.calendar.BaseCalendar;


public class OOP_Lesson04 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("========== Shape Trainning ==========");
        Square sq = new Square(5);
        sq.tinhChuVi();
        sq.tinhDienTich();
        sq.show();

        System.out.println("========== Student Manager ==========");
        Student std01 = new Student();
        std01.setMssv(1);
        std01.setName("Anh");
        std01.setGender(Gender.MALE);
        std01.hienThi();
        
        Student std02 = new Student();
        std02.setMssv(2);
        std02.setName("Cuong");
        std02.setGender(Gender.MALE);
        
        Student std03 = new Student();
        std03.setMssv(3);
        
        StudentManager sm01 = new StudentManager();
        sm01.themSinhVien(std01);
        sm01.themSinhVien(std02);
        sm01.themSinhVien(std03);
        
        sm01.timKiem(2);
        sm01.updateSinhVien(3);
        sm01.hienThi();
        
        sm01.xoaSinhVien(1);
        sm01.hienThi(3);
        sm01.hienThi();
    }

}
