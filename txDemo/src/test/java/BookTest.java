import com.itpwan.pojo.Book;
import com.itpwan.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Kevin pawn
 * @date 21/12/10 21:07
 */
public class BookTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testFindAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        String[] beanNamesForType = context.getBeanNamesForType(Book.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
//        List<Book> books = bookService.findAll();
//        for (Book book : books) {
//            System.out.println(book);
//        }
    }
}
