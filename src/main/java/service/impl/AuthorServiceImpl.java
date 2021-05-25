package service.impl;

import dao.impl.AuthorDao;
import model.Author;
import service.AuthorService;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private AuthorDao authorDao = new AuthorDao();

    @Override
    public void addAuthor(Author author) {
        authorDao.create(author);
    }

    @Override
    public void updateAuthor(Author author) {
        authorDao.update(author);
    }

    @Override
    public void deleteAuthor(Author author) {
        authorDao.delete(author);
    }

    @Override
    public Author getAuthorById(int id) {
        return authorDao.getById(id);
    }

    @Override
    public List<Author> getAllAuthor() {
        return authorDao.getAll();
    }
}
