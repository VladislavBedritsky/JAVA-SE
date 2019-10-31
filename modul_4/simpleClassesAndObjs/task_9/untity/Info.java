package modul_4.simpleClassesAndObjs.task_9.untity;

import java.util.ArrayList;
import java.util.List;

public class Info {

    private List<Book> books;

   public Info () {
       books = new ArrayList<>();
   }

   public void add (Book book) {
       books.add(book);
   }

   public void setBooks (List<Book> books) {
       this.books = books;
   }
   public List<Book> getBooks () {
       return books;
   }
   @Override
    public boolean equals (Object obj) {
       if (this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;
       Info other = (Info) obj;
       return books.equals(other.books);
   }
   @Override
    public int hashCode () {
       int result = 1;
       for (Book temp : books) {
           result = 31 * result + (temp == null ? 0 : temp.hashCode());
       }
       return result;
   }
    @Override
    public String toString() {
        return "Info{ books=" + books + '}';
    }
}
