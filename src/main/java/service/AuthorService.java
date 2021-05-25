package service;

import model.Author;

import java.util.List;

public interface AuthorService {

    void addAuthor(Author author);

    void updateAuthor(Author author);

    void deleteAuthor(Author author);

    Author getAuthorById(int id);

    List<Author> getAllAuthor();
}
