
import sun.util.calendar.BaseCalendar.Date;

public class Student extends Person {

    Student() {
    }

    Student(int mssv, String ten, Gender gioiTinh, Date ngaySinh) {
        this.mssv = mssv;
        this.name = ten;
        this.gender = gioiTinh;
        this.dateOfBirth = ngaySinh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getMssv() {
        return mssv;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void hienThi() {
        System.out.println("MSSV: " + this.mssv + ": " + this.name + ", " + this.dateOfBirth + ", " + this.gender);
    }
    
}

enum Gender{
    MALE, FEMALE, UNKNOWN
}