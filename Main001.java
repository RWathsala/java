public class Main001 {
    public static void main (String[]args)
    {
      Rectangles RECT= new Rectangles();
      Trangle Tran= new  Trangle();

      RECT.lenth =5;
      RECT.calArea();
      RECT.calcPerimeter();


      Tran.height=15;
      Tran.side_a=10;
      Tran.side_b=8;
      Tran.side_c=4;
      Tran.calArea();
      Tran.calcPerimeter();

    }



}
