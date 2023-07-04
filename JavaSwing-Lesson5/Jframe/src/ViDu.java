import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame jf= new JFrame();
        // Đặt tên cho cửa sổ
        jf.setTitle("Dictionary");
        // Cài đặt kích cỡ
        jf.setSize(400, 500);
        // Cho phép hiển thị
        jf.setVisible(true);

        // Khi đóng cửa sổ => Tự động thoát và tắt chương trình
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        // Set vij trí cửa sổ
        jf.setLocation(450, 100);
    }
}
