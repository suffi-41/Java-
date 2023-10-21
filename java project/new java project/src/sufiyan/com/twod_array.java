package sufiyan.com;
import java.util.Scanner;
public class twod_array {
    public static void two_array(int arr[][], int n, int m){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void two_array_for_string(String name[][], int n, int m){
        for(int i=0; i<name.length; i++){
            for(int j=0; j<name[i].length; j++){
                System.out.println(name[i][j]);
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[][] flats=new int[2][3];
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=103;
        flats[1][1]=104;
        flats[1][2]=105;

        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.println(flats[i][j]);
            }
        }
         float[][]marks=new float[1][2];
        for(int i=0; i< marks.length; i++){
           for(int j=0; j<marks[i].length; j++){
               System.out.println("Enter the miltiple number");
               marks[i][j]=sc.nextFloat();
            }
        }
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks[i].length; j++){
                System.out.println(marks[i][j]);
            }
        }

        String[][]name=new String[2][2];
        for(int i=0; i<name.length; i++){
            for(int j=0; j<name[i].length; j++){
                name[i][j]=sc.nextLine();
            }
        }

        two_array_for_string(name,2,2);
        for(int i=0; i<name.length; i++){
            for(int j=0; j<name[i].length; j++ ){
                System.out.println(name[i][j]);
            }

        }
    }
}

