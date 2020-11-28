import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventTest01 extends JFrame {

    public static void main(String[] args) {
        KeyEventTest01 w = new KeyEventTest01( "KeyEventTest01" );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 350, 250 );
        w.setVisible( true );
    }
    public KeyEventTest01( String title ){
        super( title );
        enableEvents( AWTEvent.KEY_EVENT_MASK ); // キーイベントを有効に
    }
    protected void processKeyEvent( KeyEvent e ) { // キーイベントを扱うメソッドをオーバライド
        int id = e.getID(); // キーイベントの種類を特定
        if( id == KeyEvent.KEY_PRESSED ){ // キーイベントの種類を判定
            System.out.println( "キーが押されました" );
        }
        if( id == KeyEvent.KEY_TYPED ){
            System.out.println( "キーがタイプされました" );
        }
        if( id == KeyEvent.KEY_RELEASED ){
            System.out.println( "キーが離されました" );
        }

    }
}