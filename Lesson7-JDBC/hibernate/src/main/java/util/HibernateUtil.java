package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
    public static final SessionFactory sessionFactory = buildSessionFactory();

    private static org.hibernate.SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
            return null;
        }
    }

    public static SessionFactory getSessionfactory() {
        return sessionFactory;
    }

    public static void shutdown(){
        getSessionfactory().close();
    }
    
}
