package dao;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.hibernate.Session;

import model.Cat;
import util.HibernateUtil;

public class CatDAO implements DAOInterface<Cat> {

    @Override
    public List<Cat> getAll() {
        List <Cat> cats= new ArrayList<Cat>();
        try {
            Session session = HibernateUtil.getSessionfactory().openSession();
            org.hibernate.Transaction transaction= session.beginTransaction();

            // Cau lenh HQL
            org.hibernate.query.Query query = session.createQuery("from Cat");
            cats = query.getResultList();

            transaction.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cats;
    }

    @Override
    public Cat getByID(Cat t) {
        Cat cat= null;
        try {
            Session session = HibernateUtil.getSessionfactory().openSession();
            org.hibernate.Transaction transaction= session.beginTransaction();

            // Cau lenh HQL
            String hql= "from Cat c where c.id = :id";
            org.hibernate.query.Query query = session.createQuery(hql);
            query.setParameter("id",t.getId());
            cat= (Cat)query.getSingleResult();

            transaction.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cat;
    }

    @Override
    public boolean insert() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public boolean update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
