import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Cat;
import util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSessionfactory().openSession();

            try{
                Transaction transaction= session.beginTransaction();
                Cat cat1= new Cat();
                cat1.setName("Tom");
                cat1.setGender(false);
                session.save(cat1);
                transaction.commit();
            }
            finally{
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
