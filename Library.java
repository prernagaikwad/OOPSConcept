import java.util.ArrayList;
import java.util.List;

public class Library
{
   private List<Book> books;
   private List<Member>members;

   public Library()
   {
       this.books = new ArrayList<>();
       this.members = new ArrayList<>();
   }

   public void addBook(Book book)
   {
       books.add(book);
   }

   public void removeBook(Book book)
   {
      books.remove(book);
   }

   public void registerMember(Member member)
   {
       members.add(member);

   }

   public void unregisterMember(Member member)
   {
       members.remove(member);
   }

    public List<Book> getBooks()
    {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public Book findBookByIsbn(String isbn)
    {
        for(Book book : books)
        {
            if(book .getIsbn().equals(isbn))
            {
                return book;
            }
        }
    return null;

    }
    public Member findMemberById(int memberId)
    {
        for(Member member : members)
        {
            if(member.getMemberId() == memberId)
            {
                return member;
            }

        }
        return null;

    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", members=" + members +
                '}';
    }
}
