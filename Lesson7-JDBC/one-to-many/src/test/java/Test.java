import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Customer;
import model.TheOrder;
import util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
        try {
            org.hibernate.Session session = HibernateUtil.getSessionfactory().openSession();
            Transaction transaction = session.beginTransaction();

            // Customer customer = new Customer("Dinh Truyen", "chintruyen@gmail.com");
            // TheOrder ord1= new TheOrder("Duy Chau DX QN", customer);
            // TheOrder ord2= new TheOrder("Nam Cao DN", customer);
            // TheOrder ord3= new TheOrder("Nguyen Nhan DN", customer);
            // List<TheOrder> orders= new ArrayList<TheOrder>();
            // orders.add(ord1);
            // orders.add(ord2);
            // orders.add(ord3);
            Query query = session.createQuery("from Customer c where size(c.orders)>0");
            List <Customer> customers= query.getResultList();
            customers.forEach(a-> System.out.println(a));

            // customer.setOrders(orders);
            // session.save(customer);
            // session.save(ord1);
            // session.save(ord2);
            // session.save(ord3);

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
