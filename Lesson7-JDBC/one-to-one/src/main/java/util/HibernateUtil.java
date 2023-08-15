package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import model.Person;

public class HibernateUtil {
    public static final SessionFactory sessionFactory = buildSessionFactory();

    private static org.hibernate.SessionFactory buildSessionFactory() {
        try {
            Configuration configuration= new Configuration().configure().addAnnotatedClass(Person.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            return configuration.buildSessionFactory(serviceRegistry);
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
