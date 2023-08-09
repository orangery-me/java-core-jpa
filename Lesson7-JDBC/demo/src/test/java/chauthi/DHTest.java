package chauthi;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.DonHang;
import util.HibernateUtil;

public class DHTest {
    public static void main(String[] args) {
        try {
            Session session= HibernateUtil.getSessionFactory().openSession();

            try{
                Transaction transaction = session.beginTransaction();
                DonHang donHang1= new DonHang("qk2", "Nguyen Van B", LocalDate.of(2023,12,9), "");
                session.save(donHang1);
                transaction.commit();

            }
            finally{
                session.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }
}
