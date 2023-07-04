package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import controller.MenuController;

import java.awt.BorderLayout;
import java.awt.Font;

public class MenuView extends JFrame{
    private JLabel label;

    public MenuView(){

        this.setTitle("Menu View");
        this.setSize(500, 500);
        this.setLocationRelativeTo(rootPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout(10,10));
        Font font= new Font(Font.MONOSPACED, Font.PLAIN ,18);

        JMenuBar menuBar= new JMenuBar();  
        this.setJMenuBar(menuBar);

        JMenu mFile= new JMenu("File");
        JMenu mEdit= new JMenu("Edit");
        JMenu mSelect= new JMenu("Selection");
        JMenu mView= new JMenu("View");

        JMenuItem miOpen= new JMenuItem("Open");
        JMenuItem miSave= new JMenuItem("Save");
        JMenuItem miSaveAs= new JMenuItem("Save as");
        JMenuItem miCopy= new JMenuItem("Copy");
        JMenuItem miPaste= new JMenuItem("Paste");
        JMenuItem miCut= new JMenuItem("Cut");
        JMenuItem miFind= new JMenuItem("Find");
        JMenuItem miReplace= new JMenuItem("Replace");
        JMenuItem miExit= new JMenuItem("Exit");

        MenuController mc= new MenuController(this);

        menuBar.add(mFile);
        menuBar.add(mEdit);
        menuBar.add(mSelect);
        menuBar.add(mView);
        
        mFile.add(miOpen);
        mFile.add(miSave);
        mFile.add(miSaveAs);
        mFile.add(miExit);

        mEdit.add(miCopy);
        mEdit.add(miPaste);
        mEdit.add(miCut);
        mEdit.add(miFind);
        mEdit.add(miReplace);

        label= new JLabel();
        label.setFont(font);
        this.add(label,BorderLayout.CENTER);

        miOpen.addActionListener(mc);
        miSave.addActionListener(mc);
        miSaveAs.addActionListener(mc);
        miCopy.addActionListener(mc);
        miPaste.addActionListener(mc);
        miCut.addActionListener(mc);
        miFind.addActionListener(mc);
        miReplace.addActionListener(mc);
        miExit.addActionListener(mc);
        
        JToolBar toolbar= new JToolBar();
        JButton undo= new JButton("Undo");
        JButton copy= new JButton("Copy");
        JButton cut= new JButton("Cut");
        JButton paste= new JButton("Paste");
        toolbar.add(undo);
        undo.setToolTipText("Undo your recent behavior");
        toolbar.add(copy);
        toolbar.add(cut);
        toolbar.add(paste);
        undo.addActionListener(mc);
        copy.addActionListener(mc);
        cut.addActionListener(mc);
        paste.addActionListener(mc);
        
        this.add(toolbar,BorderLayout.NORTH);

        this.setVisible(true);

    }

    public void setTextLabel(String s){
        this.label.setText("Bạn đã click "+s);
    }
    public static void main(String[] args) {
        try {
            MenuView mv= new MenuView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
