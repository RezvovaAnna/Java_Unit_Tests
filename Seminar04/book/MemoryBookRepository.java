package Seminar04.book;

import java.util.List;

public interface MemoryBookRepository {
    Book findById(String id);

    List<Book> findAll();
}
