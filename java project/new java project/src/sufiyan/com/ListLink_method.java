package sufiyan.com;
import java.util.LinkedList;
import java.util.Collection;
public class ListLink_method {
    public static void main(String[]args){
        LinkedList<String> name=new LinkedList<String>();
        name.add("sufiyan");
        name.add("shibban");
        name.add("adnan");
        name.add("rehan");
        name.add("");
//      name.remove(3);
//        name.clear();
        name.set(4,"aman khan");
        for(String new_name:name){
            System.out.println(new_name);
        }
        for(int i=0; i<name.size(); i++){
            System.out.println(name.get(i));
        }

    }

}
