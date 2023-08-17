import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Employee;
import model.Meeting;
import util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
       try {
        Session session = HibernateUtil.getSessionfactory().openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee= new Employee(7,"Dinh Bao Chau Thi", "chauthi128@gmail.com");
        session.save(employee);

        Meeting meeting= new Meeting(2,LocalDate.of(2023, 8, 17), "Floor 2 Block B1");
        meeting.add(employee);
        session.save(meeting);

        transaction.commit();
        session.close();
       } catch (Exception e) {
        e.printStackTrace();
       }

    }
}
