package sufiyan.com;

class Library_class{
    protected String[] book=new String[100];
    public int no_of_book;
    public boolean boolean_book;
    public Library_class(){
        this.no_of_book=0;
        this.boolean_book=true;
    }

    public void Add_book(String book){
        this.book[this.no_of_book]=book;
        this.no_of_book++;
        System.out.println(book+"has been added!");
    }
    public void Show_available_book(){
        for(String book:this.book){
            if(book==null) {
                continue;
            }
            System.out.println("* "+book);
        }
    }
    public void Issue_book(String book_list){

        for(int x=0; x<this.book.length; x++){
            if(this.book[x].equals(book_list)) {
                System.out.println(book_list + " has been issued!");
                this.boolean_book = true;
                this.book[x] = null;
                this.no_of_book--;
                this.boolean_book = false;
                return;
            }
            System.out.println("*"+this.book[x]);
        }
        System.out.println("this dosen't existe");

    }
    public void Return_book(String book){
        System.out.println(book+"book has been return!");
        Add_book(book);
    }

}



public interface Library_method_2 {
    public static void main(String[]args){
         Library_class manuu=new Library_class();
         manuu.Add_book("Python ");
         manuu.Show_available_book();

         manuu.Return_book("java ");
         manuu.Add_book("Htmlbook");
         manuu.Show_available_book();

        manuu.Issue_book("java ");
        manuu.Issue_book("Python ");
        manuu.Issue_book("Htmlbook");
        manuu.Show_available_book();
        
    }
}
