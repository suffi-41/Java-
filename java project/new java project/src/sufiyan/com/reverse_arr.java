package sufiyan.com;
import java.util.Scanner;
public class reverse_arr {
    public static String selting_password(String password){
        String selt="@785$";
        String new_password=password+selt;
        return new_password;
    }
    public static void reverse_arr(int arr[],int n){
        for(int i=0; i<arr.length/2; i++){
            int first_value=arr[i];
            int second_value=arr[arr.length-i-1];
            arr[i]=second_value;
            arr[arr.length-i-1]=first_value;
        }
    }
    public static void display(int arr[], int n){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        reverse_arr(arr,3);
        display(arr,363);


        Scanner input=new Scanner(System.in);
        System.out.print("Enter the password:");
        String password=input.nextLine();
        String newpassword=selting_password(password);
        System.out.println("your password is:"+newpassword +"you have to got password with seltiing !");
    }
}