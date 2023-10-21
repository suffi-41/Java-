package sufiyan.com;
import java.util.Scanner;
import java.util.Random;


interface libarary_data{
    void add_book(String book);
    void show_book();
    void issue_book(String book);
}
abstract class libarary_abstract{
    abstract void return_book (String book);
    abstract void second_issue_book(String book);
}


class Libarary extends libarary_abstract implements libarary_data{
    protected String []book=new String[100];
    protected int no_of_book;
    public int[][] flats = new int[2][4];
    Scanner sc = new Scanner(System.in);
    Random random=new Random();

    public Libarary(){
        this.no_of_book=0;
    }
    @Override
    public void add_book(String book){
        this.book[no_of_book]=book;
        no_of_book++;
        System.out.println(book + " have been added!");
    }
    @Override
    public void show_book(){
        for(String available_book : this.book) {
            if(available_book==null){
                continue;
            }
            else{
                System.out.println(available_book);
            }
        }

    }

    @Override
    public void issue_book(String book) {

        for(int i=0; i<this.book.length; i++){
            if(this.book[i] == book){
                System.out.println(book +" has been issued!");
                this.book[i]=null;
                no_of_book--;
                return ;
            }
            else if(this.book[i] != book ){

                continue;
            }
            else{
                System.out.println(book + "is not available!");
            }

        }
    }

    @Override
    void second_issue_book(String book) {
        for(String available_book : this.book){

            if(available_book.equals(book)){
                System.out.println(book +"have been issued !");
            }
            else{
                System.out.println(book + "is not available!");
            }

        }

    }

    @Override
    public void return_book(String book){
        System.out.println(book+ "have been return !");
        add_book(book);
    }

    public long summing_of_multiple_number(int...arr){
        int sum=0;
        for(int number : arr){
            sum+=number;
        }
        return sum;
    }
    public double second_multiple(int x, int y, int...arr){
        boolean name=true;
        double sum=1;

        if(x>y){
            for(int number: arr){
                sum+=number;
            }
            name=false;
        }
        else if (x<y){
            for(double number : arr){
                sum*=number;
            }
        }
        return sum;
    }

    public void print_string(String...name){
        for(String user_name : name){
            System.out.println(user_name);
        }
    }
    public void take_2d_array_input() {

        for (int i = 0; i < flats.length; i++) {
            for (int x = 0; x < flats[i].length; i++) {
                flats[i][x] = sc.nextInt();
            }
        }
    }
    public void print_2d_array(){
        for(int i=0; i<flats.length; i++){
            for(int j=0; i<flats[i].length; j++){
                System.out.println(flats[i][j]);
            }
        }

    }

    public int rec(int n){
        if(n%2==0) {
            if (n==1 || n == 0) {
                return n;
            } else {
                return n * rec(n - 1);
            }
        }
        else{
            if(n==1 || n==0){
                return 1;
            }
            else{
                return n*rec(n-1);
            }
        }
    }
    public void random_number(){
        int user_input = random.nextInt(100);
        System.out.println(user_input);

    }

}

class Anderoid_developer{
    private String name;
    private String role;
    public Anderoid_developer(String name, String role){
        this.name=name;
        this.role=role;
    }
    public void print_data(){
        System.out.println("Andoride developer name "+this.name+ " his role is "+this.role);
    }
    public void phone(){
        System.out.println("Andorid developer is the best scope!");
    }
}

class Web_developer extends Anderoid_developer{
    private String developer_name;
    private String developer_role;
    public Web_developer(String name, String role, String developer_name, String developer_role){
        super(name, role);
        this.developer_name=developer_name;
        this.developer_role=developer_role;
    }
    public void print_wed_developer_data(){
        System.out.println("Web developer name is "+this.developer_name+" his role is "+this.developer_role);
    }
    public void phone(){
        System.out.println("I am a programmer!");
    }
}


public interface java_method {
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      Anderoid_developer sufiyan = new Web_developer("sufiyan", "programmer", "armaan" , "web_sufiyan");
      sufiyan.phone();
      sufiyan.print_data();

      Web_developer sufiyan1 = new Web_developer("sufiyan", "programmer", "aman khan", "web developer");
      sufiyan1.phone();
      sufiyan1.print_wed_developer_data();

      int []arr=new int[10];
        System.out.println("enter the array index:");
      int no_of_index=sc.nextInt();
      arr[no_of_index]=34;
      System.out.print("Ent4er the number:");
      int no=sc.nextInt();
      try{

          System.out.println(arr[no_of_index]);
      }
      catch (ArithmeticException e){
          System.out.println(e);
      }
    }
}


