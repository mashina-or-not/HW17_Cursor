package service;

import model.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(Book book);

    Book getBookById(int id);

    List<Book> getAllBook();
}
