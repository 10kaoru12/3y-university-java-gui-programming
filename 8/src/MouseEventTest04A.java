import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventTest04A extends JFrame {
  int x0 = 0;
  int y0 = 0;
  JPanel panel;

  public static void main(String[] args) {
    MouseEventTest04A w = new MouseEventTest04A( "MouseEventTest04A" );
    w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    w.setSize( 350, 250 );
    w.setVisible( true );
  }
  public MouseEventTest04A( String title ){
    super( title );
    panel = (JPanel)getContentPane();
    panel.addMouseListener( new MouseCheck() ); // 両方に同じリスナを設定
    panel.addMouseMotionListener( new MouseCheck() ); // 両方に同じリスナを設定
  }
  class MouseCheck extends MouseInputAdapter { // リスナの実装
    public void mousePressed( MouseEvent e ){ // マウスを押した位置が始点
      x0 = e.getX();
      y0 = e.getY();
    }
    public void mouseDragged( MouseEvent e ){ // マウスをドラッグした位置が終点
      Graphics g = panel.getGraphics();
      int x = e.getX();
      int y = e.getY();
      g.drawLine( x0, y0, x, y ); // 直線を引く
      x0 = x;
      y0 = y;
    }
  }
}