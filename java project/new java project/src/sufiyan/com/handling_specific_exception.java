package sufiyan.com;

import java.util.Scanner;

public class handling_specific_exception {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int[] marks=new int[4];
        marks[0]=4;
        marks[1]=6;
        marks[2]=8;
        marks[3]=78;

        System.out.print("Enter the array index:");
        int index=input.nextInt();
        System.out.print("Enter the number:");
        int number=input.nextInt();
        try{
            System.out.println("Welcone to try !");
            try{
                int p=marks[index]/number;
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

        try{
            int divide=marks[index]/number;
            System.out.println(divide);
        }
        catch(ArithmeticException e){
            System.out.println("Arithemetin exception occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bount exception occured!");
            System.out.println(e);
        }
        catch (Exception other_exception){
            System.out.println(other_exception);
        }
    }
}
