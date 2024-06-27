public class Librarian extends Member
{
    public  Librarian(String name , int memberId)
    {
      super(name, memberId);
    }

    public void addBook(Library library ,Book book)
    {
        library.addBook(book);
    }

    public void removeBook(Library library,Book book)
    {
        library.removeBook(book);
    }

}
