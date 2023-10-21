package sufiyan.com;

interface cemera{
    void take_cemera();
    void record_video();
}

class smart_phone implements cemera{
    public void take_cemera(){
        System.out.println("take cemera");
    }
    public void record_video(){
        System.out.println("record video");
    }
}

public interface polymorphism{
    public static void main(String[]args){
        cemera cem=new smart_phone();
        cem.take_cemera();
    }
}
