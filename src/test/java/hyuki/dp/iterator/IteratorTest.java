package hyuki.dp.iterator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Yoshimasa Tanabe
 */
public class IteratorTest {

  @Test
  public void test() throws Exception {
    // Setup
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Book1"));
    bookShelf.appendBook(new Book("Book2"));
    bookShelf.appendBook(new Book("Book3"));
    bookShelf.appendBook(new Book("Book4"));

    Iterator it = bookShelf.iterator();

    // Exercise & Verify
    while (it.hasNext()) {
      Book book = (Book) it.next();
      assertThat(book, is(notNullValue()));
      System.out.println(book.getName());
    }
  }

}
