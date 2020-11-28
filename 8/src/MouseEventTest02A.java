import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventTest02A extends JFrame {
  JPanel panel; // 後でイベントソースを特定するために使う 
  JButton bt; // 後でイベントソースを特定するために使う 

  public static void main(String[] args) {
    MouseEventTest02A w = new MouseEventTest02A( "MouseEventTest02A" );
    w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    w.setSize( 350, 250 );
    w.setVisible( true );
  }
  public MouseEventTest02A( String title ){
    super( title );

    panel = (JPanel)getContentPane();
    panel.addMouseListener( new MouseCheck() ); // 同じリスナを設定

    bt = new JButton("ボタン");
    bt.addMouseListener( new MouseCheck() ); // 同じリスナを設定

    panel.add( bt, BorderLayout.NORTH );
  }
  void whichComponent( MouseEvent e ){
    JComponent source = (JComponent)e.getSource(); // イベントソースを得る
    if( source == panel ){ // イベントソースを調べる
      System.out.print( "マウスイベントの発生場所は パネル：" );
    }
    if( source == bt ){
      System.out.print( "マウスイベントの発生場所は ボタン：" );
    }
  }

  class MouseCheck implements MouseListener {
    public void mousePressed( MouseEvent e ){
      whichComponent( e );
      System.out.println( "マウスボタンが押されました" );
    }
    public void mouseReleased( MouseEvent e ){
      whichComponent( e );
      System.out.println( "マウスボタンが離されました" );
    }
    public void mouseClicked( MouseEvent e ){
      whichComponent( e );
      System.out.println( "マウスがクリックされました" );
    }
    public void mouseEntered( MouseEvent e ){
      whichComponent( e );
      System.out.println( "マウスが入ってきました" );
    }
    public void mouseExited( MouseEvent e ){
      whichComponent( e );
      System.out.println( "マウスが出ていきました" );
    }
  }
}