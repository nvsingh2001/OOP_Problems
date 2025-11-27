package bookmanagementsystem;

import java.util.Scanner;

public class LibrarySystem {
    private static final Book[] BOOKS = new Book[5];

    static Book getBook(int id) {
        for (Book book : BOOKS) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    static void getAvailableBooks() {
        for (Book book : BOOKS) {
            if(book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args){
        BOOKS[0] = new Book(100,"1984","George Orwell",true);
        BOOKS[1] = new Book(101,"12 Rules of Life","Dr. Jordan B Peterson",true);
        BOOKS[2] = new Book(102,"Beyond Good and Evil","Friedrich Nietzsche",true);
        BOOKS[3] = new Book(103,"Archipelago of Gulag","Aleksandr Isayevich Solzhenitsyn",true);
        BOOKS[4] = new Book(104,"Crime and Punishment","Fyodor Dostoevsky", true);

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Library System");
            System.out.println("--------------");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Checkout Book");
            System.out.println("4. Quit");
            System.out.println("--------------");
            System.out.print("Enter your choice: ");

            switch (sc.nextInt()){
                case 1:
                    System.out.print("\nEnter Book ID:");
                    Book book = getBook(sc.nextInt());
                    if(book == null){
                        System.out.println("Invalid Book ID");
                    }else{
                        if(book.isAvailable()){
                            System.out.println(book.getTitle() + " is issued!");
                            book.setAvailable(false);
                        }else{
                            System.out.println("Book is not available!");
                        }
                    }
                    break;
                case 2:
                    System.out.print("\nEnter Book ID: ");
                    Book book1 = getBook(sc.nextInt());
                    if(book1 == null){
                        System.out.println("Invalid Book ID");
                    }else{
                        book1.setAvailable(true);
                        System.out.println("Thank you for returning the book!");
                    }
                    break;
                case 3:
                    getAvailableBooks();
                    break;
                case 4:
                    sc.close();
                    System.out.println("Bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(true);
    }
}
