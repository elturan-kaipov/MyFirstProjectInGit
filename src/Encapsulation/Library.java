package Encapsulation;

public class Library {
    public static void main(String[] args) {
        Book book=new Book();
        book.setTitle("Grit");
        System.out.println(book.getTitle());

        book.setAuthor("Michel Smith");
        System.out.println(book.getAuthor());

        book.setPages(123);
        System.out.println(book.getPages());

    }
}
