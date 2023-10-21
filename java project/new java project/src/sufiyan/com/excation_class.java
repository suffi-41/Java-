package sufiyan.com;
import java.util.Scanner;

class my_exception extends Exception{
    public String toString(){
        return super.toString()+"I am to string ";
    }
    public String getMessage(){
        return super.getMessage()+"I am get message";
    }
}
class Exception1 extends Exception{
    public Exception1(String new_name){
        super(new_name);
    }
    public String toString(){
        return super.toString();
    }
    public String getMessage(){
        return super.getMessage();
    }
}
public class excation_class {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<9){
            try{
                throw new Exception1("sufiyan");
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("finishing");

            }
        }
        System.out.println("Hello ,sufiyan");

    }
}

