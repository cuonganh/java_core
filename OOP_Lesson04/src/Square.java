
public class Square extends Shape implements ShapeInterface{
    double edge;
    Square(double canh){
        this.edge = canh;
       
    }

    @Override
    public void tinhDienTich() {
        this.dienTich = edge*edge;
    }


    @Override
    public void tinhChuVi() {
        this.chuVi = edge*4;
    }
     @Override
     public void show(){
         System.out.println("Hinh vuong nay co chu vi: " + this.chuVi + ", dien tich: " + this.dienTich);
         
     }
}
