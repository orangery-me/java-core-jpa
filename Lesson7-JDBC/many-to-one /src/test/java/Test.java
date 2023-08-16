import java.time.LocalDate;

import org.hibernate.Session;

import dao.DAOAuthor;
import model.Author;
import model.Book;

public class Test {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthorID(13);
        DAOAuthor daoAuthor= new DAOAuthor();
        author= daoAuthor.getByID(author);
        author.setDob(LocalDate.of(1975, 3, 12));
        System.out.println(daoAuthor.insert_update(author));

    }
}
