public class AreaCalculator {

    public static double area(double radius){

        if(radius<0){
            return -1.0;
        }else{
            System.out.println( 3.14*radius*radius);
        }
        return 3.14*radius*radius;
    }
    public static double area(double x, double y){
        if(x<0 || y<0){
            return -1.0;
        }else{
            System.out.println(x*y);
        }
        return x*y;
    }
    public static void main(String[] args){
     area(2.0);
  area(4.0,5.0);
}
}