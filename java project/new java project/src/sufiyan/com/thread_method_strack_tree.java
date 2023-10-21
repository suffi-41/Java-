package sufiyan.com;


class thread extends Thread{
    public thread(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("Thank you!"+this.getName());
            try{
                Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
class Practice extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello ,brother!");
        }
    }
}
class Practiceb extends Thread{
    public void run() {
        while (true) {
            System.out.println("hello, sister!");
        }
    }
}
class Practicc extends Thread{
    public void run(){
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Welcome!");
    }
}

public class thread_method_strack_tree {
    public static void main(String[]args){
     /*   thread t1=new thread("Mohd sufiyan");
        thread t2=new thread("Mohd adnan");
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
   */
        Practice p1=new Practice();
        Practiceb p2=new Practiceb();
        Practicc p3=new Practicc();
        p1.setPriority(4);
        System.out.println(p3.getPriority());

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p1.getState());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
