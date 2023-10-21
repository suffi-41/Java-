package sufiyan.com;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Array_Deque_method {
    public static void main(String[]args){
        ArrayDeque<Integer> arr_deque=new ArrayDeque<Integer>();
        arr_deque.add(56);
        arr_deque.addFirst(23);
        arr_deque.offer(34);
        arr_deque.offerFirst(3);
        arr_deque.offerLast(2);
        for(int i=0; i<arr_deque.size(); i++){
            System.out.println(arr_deque.getLast());
        }
        for(int i : arr_deque){
            System.out.println(i);
        }

        System.out.println(arr_deque.getLast());
        System.out.println("using Peek method in Array Deque ");
        System.out.println(arr_deque.peek());
        System.out.println(arr_deque.peekFirst());
        System.out.println(arr_deque.peekLast());

//        System.out.println("using remove methood in arrat deque!");
//        System.out.println(arr_deque.remove());
//        System.out.println(arr_deque.removeLast());
//        System.out.println(arr_deque.removeFirst());
//        arr_deque.clear();
        for(int i : arr_deque){
            System.out.println(i);
        }
        System.out.println("Using iterator method with while loop!");
        Iterator value=arr_deque.iterator();

        while( value.hasNext()){
            System.out.println(value.next());
        }

        System.out.println("Using iterator method with for loop!");
       for(Iterator value1=arr_deque.iterator(); value1.hasNext(); ){
           System.out.println(value1.next());
       }
        System.out.println(arr_deque);

       for(Iterator aman=arr_deque.iterator(); aman.hasNext();){
           System.out.println(aman.next());
       }
    }
}
