package sufiyan.com;

class Library{
    protected String[] book=new String[100];
    public int no_of_book;


   public void Library(){
         this.no_of_book=0;
   }

   public void Add_book(String book){
       this.book[this.no_of_book]=book;
       this.no_of_book++;
       System.out.println(book+" has been added");
   }

   public void show_available_book() {
       for (String book_list : this.book) {
           System.out.println("* " + book_list);

           if (book_list==null){
                 continue;
           }
       }
   }


   public void issue_book(String book){
       for(String new_book:this.book){
           if(new_book.equals(book)){
               System.out.println("* "+new_book+"has been issued!");
               new_book=null;
               return ;
           }
       }
   }

   public void return_book(String book){
       System.out.println(book+" has been return!");
       Add_book(book);
   }


}

public class library_method {
    public static void main(String[]args){

        Library manuu=new Library();
        manuu.Add_book("c++");
        manuu.Add_book("java book");
        manuu.Add_book("python ");
        manuu.Add_book("html book");
        manuu.show_available_book();
        manuu.return_book("css book ");
        manuu.issue_book("python");


    }
}
