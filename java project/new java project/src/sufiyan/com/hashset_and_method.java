package sufiyan.com;

import java.util.HashSet;
import java.util.Iterator;

public class hashset_and_method {
    public static void main(String[]args) {
        HashSet<Integer> hashset = new HashSet<Integer>(5,0.25f);
        hashset.add(11);
        hashset.add(54);
        hashset.add(54);
        hashset.add(34);
        hashset.add(67);
        hashset.add(98);

        System.out.println(hashset);
        for(Iterator hash = hashset.iterator(); hash.hasNext();){
            System.out.println(hash.next());
        }







    }
}
