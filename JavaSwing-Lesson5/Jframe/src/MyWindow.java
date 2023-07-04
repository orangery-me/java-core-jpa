import javax.swing.JFrame;

public class MyWindow extends JFrame {

    public MyWindow(){
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

    };
    public void showIt(){
        this.setVisible(true);
    }

    public void showIt(String title){
        this.setTitle(title);
        this.setVisible(true);
    }

    public void showIt(String title, int width, int height){
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow mw= new MyWindow();
        mw.showIt("Dictionary", 400, 400);
        
    }
}
