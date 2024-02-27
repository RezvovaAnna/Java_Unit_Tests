package seminar04.book;

import Seminar04.book.BookRepository;
import Seminar04.book.BookService;
import Seminar04.book.Book;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {


    @Test
    void testFindBookByAuthor() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        when(bookService.findBookById("1")).thenReturn((new Book("1", "Onegin", "Pushkin")));

        Book result = bookService.findBookById("1");
        assertThat(result.getAuthor()).isEqualTo("Pushkin");

    }

    @Test
    void testFindBookByTitle() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        when(bookService.findBookById("1")).thenReturn((new Book("1", "Onegin", "Pushkin")));
        Book result = bookService.findBookById("1");

        assertThat(result.getTitle()).isEqualTo("Onegin");

    }

    @Test
    void testFindBookById() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        when(bookService.findBookById("1")).thenReturn((new Book("1", "Onegin", "Pushkin")));
        Book result = bookService.findBookById("1");

        assertThat(result.getId()).isEqualTo("1");

    }

    @Test
    void testFindAllBook() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        Book book1 = new Book("1", "Onegin", "Pushkin");
        Book book2 = new Book("2", "Sakhalin Island", "Chekhov");

        when(bookService.findAllBooks()).thenReturn(Arrays.asList(book1, book2));
        List<Book> result = bookService.findAllBooks();

        assertThat(result).hasSize(2);

    }
}



