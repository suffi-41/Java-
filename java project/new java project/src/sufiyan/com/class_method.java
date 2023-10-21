package sufiyan.com;
import java.util.Scanner;


class Array_class{
    protected int no_of_first_box;
    protected int no_of_second_box;
    protected int[][]arr=new int[no_of_first_box][no_of_second_box];
    protected String[][]name=new String[no_of_first_box][no_of_second_box];
    protected int []number=new int[no_of_first_box];
    protected String[]name_of_person=new String[no_of_second_box];
    Scanner input=new Scanner(System.in);
  public Array_class(){
      System.out.print("Enter the value of first box:");
      no_of_first_box=input.nextInt();
      System.out.print("Enter the value of second box:");
      no_of_second_box=input.nextInt();
  }
   public void taken_arr_input() {
       System.out.println("Enter the multiple no:");
       for (int i = 0; i <arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = input.nextInt();
           }
       }
   }
   public void taken_name_input(){
       System.out.println("Enter the multiple name:");
       for(int i=0; i<name.length; i++){
           for(int j=0; j<name[i].length; j++){
               name[i][j]=input.nextLine();
           }
       }

   }
   public void taken_input_number(){
       System.out.println("Enter the multiple number:");
      for(int i=0; i<number.length; i++){
          number[i]=input.nextInt();
      }
   }
   public void taken_input_name_of_person(){
       System.out.println("Enter the multiple name of th person:");
      for(int i=0; i<name_of_person.length; i++){
          name_of_person[i]=input.nextLine();
      }
   }
   public void reverse_number(){
      for(int i=0; i<number.length/2; i++){
          int first_value=number[i];
          int second_value=number[number.length-i-1];
          number[i]=second_value;
          number[number.length-i-1]=first_value;
      }
   }
   public void reverse_string(){
      for(int i=0; i<name_of_person.length; i++){
          String first_string=name_of_person[i];
          String second_string=name_of_person[name_of_person.length-i-1];
          name_of_person[i]=second_string;
          name_of_person[name_of_person.length-i-1]=first_string;
      }
   }
   public void display_name(){
       System.out.println("Display name:");
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<name[i].length; j++){
               System.out.println(name[i][j]);
           }
       }
   }
   public void display_arr(){
       System.out.println("Display array89");
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){
               System.out.println(arr[i][j]);
           }
       }
   }
   public void display_number(){
       System.out.println("Multiple number:");
      for(int item:number){
          System.out.println(item);
      }
   }
   public void display_no_of_the_person(){
       System.out.println("Display of the name of the person:");
       for(String name:name_of_person){
           System.out.println(name);
       }
   }
}

public class class_method {
    public static void main(String[]args){

        Array_class sufiyan=new Array_class();
        sufiyan.taken_input_name_of_person();


    }
}
