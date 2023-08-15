
import java.util.List;

import org.hibernate.Session;

import model.Person;
import util.HibernateUtil;

public class Test {
    public static void main(String[] args) {

        try {
            Session session = HibernateUtil.getSessionfactory().openSession();
            org.hibernate.Transaction transaction= session.beginTransaction();

            // Cau lenh HQL
            org.hibernate.query.Query query = session.createQuery("select p.name, p.spouse.name from Person p");
            List <Object[]> results = query.list(); 

            results.forEach((a) -> System.out.println(a[0]+" is married with "+a[1]));

            transaction.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
