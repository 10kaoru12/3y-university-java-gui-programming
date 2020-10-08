import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Layout02 extends JFrame {

    public static void main(String[] args) {
        Layout02 w = new Layout02( "Layout02" );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 250, 300 );
        w.setVisible( true );
    }
    public Layout02( String title ){
        super( title );
        JPanel pane = (JPanel)getContentPane();
        pane.setLayout( new FlowLayout() ); // レイアウト方法を指定

        for( int i=0 ; i<16 ; i++ ){
            pane.add( new JButton( Integer.toString(i) ) ); // ボタンの生成と追加
        }
    }
}