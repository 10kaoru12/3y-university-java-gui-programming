import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout01 extends JFrame {

    public static void main(String[] args) {
        Layout01 w = new Layout01( "Layout01" );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 350, 200 );
        w.setVisible( true );
    }
    public Layout01( String title ){ // コンストラクタ
        super( title );

        JPanel pane = (JPanel)getContentPane(); // コンテントペインを得る

        JButton buttonNorth = new JButton( "North" ); // ボタン生成
        pane.add( buttonNorth, BorderLayout.NORTH ); // 配置位置を指定してボタン追加

        JButton buttonCenter  = new JButton( "Center" );
        pane.add( buttonCenter, BorderLayout.CENTER );

        JButton buttonSouth = new JButton( "South" );
        pane.add( buttonSouth, BorderLayout.SOUTH );

        JButton buttonWest  = new JButton( "West" );
        pane.add( buttonWest, BorderLayout.WEST );

        JButton buttonEast  = new JButton( "East" );
        pane.add( buttonEast, BorderLayout.EAST );
    }
}