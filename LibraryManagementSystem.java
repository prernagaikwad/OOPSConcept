public class LibraryManagementSystem
{

    public static void main(String[] args)
    {

        Library library = new Library();

        Book book1 = new Book("Effective Java","Joshua Bloch","123456789");
        Book book2 = new Book("Clean code","Robert C.Martin","987654321");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Alice",1);
        Member member2 = new Member("Bob",2);

        library.registerMember(member1);
        library.registerMember(member2);

        member1.borrowBook(book1);
        System.out.println(member1);

        member1.returnBook(book1);
        System.out.println(member1);

        Librarian librarian = new Librarian("Charlie",3);
        Book book3 = new Book("Design Patterns","Erich Gamma","111231345");
        librarian.addBook(library,book3);

        System.out.println(library);

    }

}
