import java.time.LocalDate;
import org.hibernate.Transaction;

import model.Student;
import model.Teacher;
import util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
        try {
            org.hibernate.Session session = HibernateUtil.getSessionfactory().openSession();
            Transaction transaction = session.beginTransaction();

            Teacher teacher= new Teacher("049304","Ho Nhu Y",LocalDate.of(1999, 1, 12), "Math");
            Student student= new Student("048256","Nguyen Thanh Nga",LocalDate.of(2003, 1, 13),3.5);

            session.save(student);
            session.save(teacher);

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
