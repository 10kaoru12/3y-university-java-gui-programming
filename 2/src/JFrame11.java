import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrame11 extends JFrame {
    JPanel contentPane;
    public static void main(String[] args) {
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        new JFrame11( "JFrame11" );
    }
    public JFrame11( String title ){
        super( title );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        JMenuBar menuBar = new JMenuBar(); // メニューバーの生成
        setJMenuBar( menuBar ); // メニューバーの設定(追加)
        JMenu file = new JMenu( "File" ); // メニュー生成1
        JMenu edit = new JMenu( "Edit" ); // メニュー生成2
        JMenu help = new JMenu( "Help" ); // メニュー生成3
        menuBar.add( file ); // メニュー追加1
        menuBar.add( edit ); // メニュー追加2
        menuBar.add( help ); // メニュー追加3

        setSize(400, 300);
        setVisible(true);
    }
}