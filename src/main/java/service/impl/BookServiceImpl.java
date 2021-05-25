package service.impl;

import dao.impl.BookDao;
import model.Book;
import service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDao();

    @Override
    public void addBook(Book book) {
        bookDao.create(book);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookDao.delete(book);
    }

    @Override
    public Book getBookById(int id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAllBook() {
        return bookDao.getAll();
    }
}
