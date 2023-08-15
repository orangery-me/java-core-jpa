package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import model.Person;
import util.HibernateUtil;

public class PersonDAO implements DAOInterface<Person> {

    @Override
    public List<Person> getAll() {
        List <Person> Persons= new ArrayList<Person>();
        try {
            Session session = HibernateUtil.getSessionfactory().openSession();
            org.hibernate.Transaction transaction= session.beginTransaction();

            // Cau lenh HQL
            org.hibernate.query.Query query = session.createQuery("from Person p");
            Persons = query.getResultList();

            transaction.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Persons;
    }

    @Override
    public Person getByID(Person t) {
        Person person= null;
        try {
            Session session = HibernateUtil.getSessionfactory().openSession();
            org.hibernate.Transaction transaction= session.beginTransaction();

            // Cau lenh HQL
            String hql= "from Person p where p.id = :id";
            org.hibernate.query.Query query = session.createQuery(hql);
            query.setParameter("id",t.getId());
            person= (Person)query.getSingleResult();

            transaction.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    public boolean insert_update(Person t) {
        try {
            Session session = HibernateUtil.getSessionfactory().openSession();
            org.hibernate.Transaction transaction= session.beginTransaction();

            // Cau lenh HQL
            session.saveOrUpdate(t);

            transaction.commit();
            session.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Person t) {
        try {
            Session session = HibernateUtil.getSessionfactory().openSession();
            org.hibernate.Transaction transaction= session.beginTransaction();

            // Cau lenh HQL
            session.delete(t);

            transaction.commit();
            session.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    
}
