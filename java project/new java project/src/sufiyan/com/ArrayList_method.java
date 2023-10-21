package sufiyan.com;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_method {
    public static void main(String[]args) {
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        ArrayList<Integer> arr_list_2 = new ArrayList<Integer>();
        arr_list_2.add(23);
        arr_list_2.add(6);
        arr_list_2.add(7);
        arr_list_2.add(5);
        arr_list_2.add(23);

        arr_list.add(5);
        arr_list.add(6);
        arr_list.add(7);
        arr_list.add(5);
        arr_list.add(6);
        arr_list.add(6);
        System.out.println(arr_list_2.contains(5));
        System.out.println(arr_list.contains(4));
        System.out.println(arr_list.indexOf(5));
        System.out.println(arr_list.lastIndexOf(5));
        System.out.println(arr_list.equals(5));
        arr_list.set(0,24);
        arr_list.set(1,24);
        System.out.println(arr_list.subList(1,4));
        arr_list.remove(5);
//        arr_list.removeAll(arr_list);
//        arr_list.clear();
        System.out.println(arr_list.toArray());


        for(int i=0; i<arr_list.size(); i++){
            System.out.print(arr_list.get(i));
            System.out.print(",");
        }

        for(int i:arr_list){
            System.out.print(i+",");
        }
    }
}
