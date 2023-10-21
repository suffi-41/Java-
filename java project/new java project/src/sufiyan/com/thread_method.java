package sufiyan.com;

import java.sql.SQLOutput;

class my_thread extends Thread{
    public void run(){
        while(true){
            System.out.println("hello .Sufiyan!");
            System.out.println("Good morning!");
        }
    }
}

class my_thread2 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("Hello Rehan");
            System.out.println("Good morning!");
        }
    }
}

class sufiyan extends Thread{
    public void run() {
        while (true) {

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("hello");

        }
    }
}

class Rehan extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("goob morning");
        }
    }
}

class Adnan implements Runnable{
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Runnable class Adnan!");
        }
    }
}

class Shibban implements Runnable{
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Runnable method of class shibban");
        }
    }
}
public class thread_method {
    public static void main(String[]args){
       Adnan a=new Adnan();
       Thread t=new Thread(a);

       Shibban s=new Shibban();
       Thread sh=new Thread(s);

       t.start();
       sh.start();
    }
}
