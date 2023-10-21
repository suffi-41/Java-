package sufiyan.com;


class Exception2 extends Exception{
    public Exception2(){
        super("we failled ,please enter the valuable number");
    }
    @Override
    public String toString(){
        return super.toString();
    }
    public String getMessage(){
        return super.getMessage();
    }
}

public class throw_throws_method {
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static double areaOfCircle(int radius) throws ArithmeticException {
        if (radius < 0) {
            try {
                throw new Exception2();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println("area of circle");
                System.out.println(e);
            }

        }
        return 3.14 * radius * radius;
    }
    public static double area_of_rectangale(double length, double width) throws ArithmeticException{
        if(length<0 || width<0){
            try{
                throw new Exception2();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println("area of rectangle");
                System.out.println(e);
            }
        }
        if(length<0){
            length=(-1)*(length);
        }
        else if(width<0){
            width=(-1)*(width);
        }
        return length*width;

    }


    public static void main(String[]args){

        System.out.println(area_of_rectangale(-4,6));
        System.out.println( areaOfCircle(-4));

        try {
            divide(6, 0);
        }
        catch(Exception e){
            System.out.println("Exception is level 1:!"+e);
        }



    }
}
