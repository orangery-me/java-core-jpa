import dao.CatDAO;
import model.Cat;

public class Test {
    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.setId(1);
        CatDAO catDAO= new CatDAO();

        System.out.println(catDAO.getByID(cat));

    }
}
