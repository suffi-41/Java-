package sufiyan.com;

class Phone extends Thread{
     public Phone(String phone_name){
         super(phone_name);
     }
     public void run(){
         System.out.println("Thank you!");
     }
}

public class thread_constructor {
    public static void main(String[]args){
        Phone redmi=new Phone("Redmi");
        Phone oppo=new Phone("oppo");
        Phone vivo=new Phone("vivo");
        System.out.println(redmi.getName());
        System.out.println(oppo.getName());
        System.out.println(vivo.getName());
        System.out.println(redmi.getId());
        System.out.println(oppo.getId());
        System.out.println(vivo.getId());
        oppo.start();
        redmi.start();

    }
}
