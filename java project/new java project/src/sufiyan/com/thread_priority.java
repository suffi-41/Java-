package sufiyan.com;

class Priority extends Thread{
    public Priority(String name){
        super(name);
    }
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("First class priority"+ " "+this.getName());
            System.out.println("thread id is:"+this.getId());
        }
    }
}

class Second_priority extends Thread{
    public Second_priority(String name){
        super(name);
    }
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Second class priority");
        }
    }

}
public class thread_priority {
    public static void main(String[]args){
         Priority sufiyan=new Priority("sufiyan");
         Priority rehan=new Priority("Rehan");
         Priority rehan1=new Priority("Rehan1");
         Priority rehan2=new Priority("Rehan2");

        rehan.setPriority(Thread.MAX_PRIORITY);
        sufiyan.setPriority(Thread.MIN_PRIORITY);

        sufiyan.start();
        rehan.start();
        rehan1.start();
        rehan2.start();








    }
}
