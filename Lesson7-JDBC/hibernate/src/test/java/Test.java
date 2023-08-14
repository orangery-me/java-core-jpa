import java.sql.Date;
import java.time.LocalDate;

import org.hibernate.Session;

import dao.CatDAO;
import model.Cat;
import util.HibernateUtil;

public class Test {
    public static void main(String[] args) {

        try {
            Session session = HibernateUtil.getSessionfactory().openSession();
            org.hibernate.Transaction transaction= session.beginTransaction();

            // Transient 
            Cat cat = new Cat();
            cat.setGender(true);
            cat.setName("Mimi");

            // persistent 
            session.saveOrUpdate(cat);
            transaction.commit();

            // detached -> persistent
            session.refresh(cat);
            System.out.println(cat.getId());
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
