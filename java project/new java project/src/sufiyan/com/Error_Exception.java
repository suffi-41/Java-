package sufiyan.com;

import java.util.Scanner;
public class Error_Exception {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value od X:");
        int x=input.nextInt();
        System.out.print("Enter the value of Y:");
        int y=input.nextInt();
        try{
            int c=x/y;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("we failled to divide! ");
            System.out.println(e);
        }
    }
}
