import javax.swing.*;
import java.awt.*;

public class MenuTest01 extends JFrame {

    public static void main(String[] args) {
        MenuTest01 w = new MenuTest01( "MenuTest01" );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 350, 250 );
        w.setVisible( true );
    }
    public MenuTest01( String title ){
        super( title );

        JMenuBar menuBar = new JMenuBar(); // メニューバーの生成
        setJMenuBar( menuBar ); // メニューバーの設定

        JMenu file = new JMenu( "File" ); // メニューの生成
        menuBar.add( file ); // メニューバーにメニューを追加

        JMenuItem item;
        item = new JMenuItem( "Open" ); // メニュー項目の生成
        file.add( item ); // メニューにメニュー項目を追加
        item = new JMenuItem( "Save" ); // メニュー項目の生成
        file.add( item ); // メニューにメニュー項目を追加
        file.addSeparator(); // メニューにセパレータを追加
        item = new JMenuItem( "Exit" ); // メニュー項目の生成
        file.add( item ); // メニューにメニュー項目を追加
    }
}