package sufiyan.com;

interface Interface_class{
    void display_data();
}

abstract class Abstract_class{
    abstract void papa();
    abstract void mummy();
    public void me(){
        System.out.println("I am son of my father:");
    }
}

class Class extends Abstract_class implements Interface_class{
    private String name;
    private String papa;
    private String mummy;
   public Class(String name,String papa, String mummy){
       this.name=name;
       this.papa=papa;
       this.mummy=mummy;
   }

    @Override
    public void display_data() {
        System.out.println(this.name+this.papa+this.mummy);
    }
    @Override
    public void papa(){
        System.out.println("my father name is:"+this.papa);
    }
    @Override
    public void mummy(){
        System.out.println("my mummy name is:"+this.mummy);
    }
    public void me(){
        System.out.println("I am "+this.name);
    }
}

public interface abstract_interface_method {
    public static void main(String[]args){
        Class sufiyan=new Class("Sufiyan","  mohd Shabaar","  Shabnam khatun");
        sufiyan.me();

        Abstract_class aman=new Class("sufiyan"," mohd shabbar","shabnam khantun");
        aman.papa();

        Interface_class rehan= new Class("sufiyan"," mohd shabbar", "shabnam khatun");
        rehan.display_data();
    }
}
