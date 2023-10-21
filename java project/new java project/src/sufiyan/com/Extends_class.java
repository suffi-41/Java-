package sufiyan.com;
import java.util.Scanner;

class Employee{
    private String name;
    private int id;
    private float salary;
    public String my_name;
    private int[]arr=new int[3];
    Scanner input=new Scanner(System.in);
    public Employee(String name, int id, float salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee name is:"+this.name);
        System.out.println("Employee id :"+this.id);
        System.out.println("Employee salary is:"+this.salary);
    }
    public void take_input(){
        System.out.print("Enter your name:");
        my_name=input.nextLine();
        System.out.println(my_name);
    }
    public void taken_input_from_user(){
        System.out.println("Enter the multiple number");
        for(int i=0; i<arr.length; i++){
            arr[i]=input.nextInt();
            System.out.println(arr[i]);
        }
    }

}

class worker extends Employee{
    private String[]worker_name=new String[6];

    public worker(String name, int id, float salary){
        super(name,id,salary);
        for(int i=0; i<worker_name.length; i++){
            worker_name[i]=input.nextLine();
        }
    }
    public void display_worker(){
        for(int i=0; i<worker_name.length; i++){
            System.out.println(worker_name[i]);
        }
    }
}


public class Extends_class {
    public static void main(String[]args){

        worker worker_name=new worker("sufiyan",41, 20000);
        worker_name.display_worker();


    }
}
