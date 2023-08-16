package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;

import model.Author;
import util.HibernateUtil;

public class DAOAuthor implements DAOInterface<Author>{

    @Override
    public List<Author> getAll() {
        List <Author> authors= new ArrayList<Author>();
        try {
            org.hibernate.Session session = HibernateUtil.getSessionfactory().openSession();
            Transaction transaction = session.beginTransaction();

            org.hibernate.query.Query query = session.createQuery("from Author");
            authors = query.getResultList();

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return authors;
    }

    @Override
    public Author getByID(Author t) {
        Author author = new Author();
        try {
            org.hibernate.Session session = HibernateUtil.getSessionfactory().openSession();
            Transaction transaction= session.beginTransaction();

            org.hibernate.query.Query query= session.createQuery("from Author a where a.id =:id");
            query.setParameter("id", t.getAuthorID());
            author= (Author)query.getSingleResult();
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return author;
    }

    @Override
    public boolean insert_update(Author t) {
        try {
            org.hibernate.Session session = HibernateUtil.getSessionfactory().openSession();
            Transaction transaction = session.beginTransaction();

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
    public boolean delete(Author t) {
        try {
            org.hibernate.Session session= HibernateUtil.getSessionfactory().openSession();
            Transaction transaction = session.beginTransaction();

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
