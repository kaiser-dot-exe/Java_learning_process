public class Library {
    private Book[] books;
    private int book_amount;
    private final int capacity =100;

    public Library(){
        this.books=new Book[100];
        this.book_amount=0;

    }


    public void Add_book(Book book){


        if (book_amount<capacity){
            books[book_amount]=book;
            book_amount++;
            System.out.println("'"+book.getName()+"' add to library.");
        }else{
            System.out.println("The library is full! No more books can be added.");

        }
    }



}
