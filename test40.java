public class test40 {


    int a;
    int b;

   public void setData(int x, int y){
        this.a=x;
        this.b=y;
    }

    public void showData(){
        System.out.println("value of x = " +a);
        System.out.println("value of y= " +b);

    }
    public static void main (String args[]){
         test40 test40Object= new test40();
        test40Object.setData(2,5);
        test40Object.showData();
       // System.out.println(a);
       // System.out.println(b);

    }
}
