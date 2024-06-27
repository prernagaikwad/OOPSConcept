import java.util.ArrayList;
import java.util.List;

public class Member
{
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;

    public Member(String name,int memberId)
    {
        this.name =name;
        this.memberId=memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public int getMemberId()
    {
        return memberId;
    }

    public List<Book> getBorrowedBooks()
    {
        return borrowedBooks;
    }

    public void borrowBook(Book book)
    {
        if(!book.isIssued())
        {
            book.issueBook();
            borrowedBooks.add(book);
        }
        else {
            System.out.println("Book is already issued");
        }
    }

    public void returnBook(Book book)
    {
        if(borrowedBooks.contains(book))
        {
            book.returnBook();
            borrowedBooks.remove(book);
        }
        else
        {
            System.out.println("This book was not borrowed by you");
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberId=" + memberId +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
