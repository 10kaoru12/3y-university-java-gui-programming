import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventTest04B extends JFrame {
    Point startPoint = new Point(-1, -1); // 直線の始点
    Point endPoint = new Point(-1, -1); // 直線の終点
    TestPanel testPanel; // 描画用パネルを入れる

    public static void main(String[] args) {
	MouseEventTest04B w = new MouseEventTest04B( "MouseEventTest04B" );
	w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	w.setSize( 350, 250 );
	w.setVisible( true );
    }
    public MouseEventTest04B( String title ){
	super( title );
	testPanel = new TestPanel(); // 描画用パネルを生成
	testPanel.addMouseListener( new MouseCheck() ); // リスナを設定
	testPanel.addMouseMotionListener( new MouseCheck() ); // リスナを設定
	getContentPane().add(testPanel);
    }
    class TestPanel extends JPanel { // 描画用パネルの定義
	public void paintComponent(Graphics g) { // ここに描画したい内容を書く
	    g.setColor(Color.black);
	    g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
	    startPoint = endPoint; // 終点を次の始点に
	}
    }
    class MouseCheck extends MouseInputAdapter {
	public void mousePressed( MouseEvent e ){
	    startPoint = e.getPoint(); // 始点の設定
	}
	public void mouseDragged( MouseEvent e ){
	    endPoint = e.getPoint(); // 終点の設定
	    testPanel.repaint(); // パネルを再描画
	}
    }
}