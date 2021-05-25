import model.Author;
import model.Book;
import model.User;
import service.AuthorService;
import service.BookService;
import service.impl.AuthorServiceImpl;
import service.impl.BookServiceImpl;
import service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        //users
        User vlad = new User("Vlad");
        User ihor = new User("Ihor");
        User ivan = new User("Ivan");
        User vova = new User("Vova");

        //authors
        Author van = new Author("Van");
        Author bob = new Author("Bob");
        Author jo = new Author("Jo");
        Author vitas = new Author("Vitas");
        Author jackie = new Author("Jackie");

        //books
        Book leatherMan = new Book("Leather Man");
        Book threeLittleBirds = new Book("Three Little Birds");
        Book armourOfGod = new Book("Armour of God");
        Book element7th = new Book("7th element");

        //book leatherMan
        leatherMan.addAuthor(van);
        vlad.addBook(leatherMan);
        userService.addUser(vlad);

        //book threeLittleBirds
        threeLittleBirds.addAuthor(bob);
        ihor.addBook(threeLittleBirds);
        userService.addUser(ihor);

        //book armourOfGod
        armourOfGod.addAuthor(jo);
        armourOfGod.addAuthor(jackie);
        ivan.addBook(armourOfGod);
        userService.addUser(ivan);

        //book element7th
        element7th.addAuthor(vitas);
        vova.addBook(element7th);
        userService.addUser(vova);

        AuthorService authorService = new AuthorServiceImpl();
        BookService bookService = new BookServiceImpl();
        System.out.println(authorService.getAllAuthor());
        System.out.println(bookService.getAllBook());

    }
}
