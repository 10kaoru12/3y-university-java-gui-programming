import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventTest04C extends JFrame {
    Point startPoint = new Point(-1, -1); // 直線の始点
    Point endPoint = new Point(-1, -1); // 直線の終点
    TestPanel testPanel; // 描画用パネルを入れる
    Dimension dim = null; // ウィンドウサイズを入れる
    Image buffer = null; // オフラインイメージを入れる
    Graphics bufferContext = null; // オフラインイメージのグラフィックスを入れる

    public static void main(String[] args) {
	MouseEventTest04C w = new MouseEventTest04C( "MouseEventTest04C" );
	w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	w.setSize( 350, 250 );
	w.setVisible( true );
    }
    public MouseEventTest04C( String title ){
	super( title );
	testPanel = new TestPanel(); // 描画用パネルを生成
	testPanel.addMouseListener( new MouseCheck() ); // リスナを設定
	testPanel.addMouseMotionListener( new MouseCheck() ); // リスナを設定
	getContentPane().add(testPanel);
    }
    class TestPanel extends JPanel { // 描画用パネルの定義
	public void paintComponent(Graphics g) { // ここに描画したい内容を書く
	    if (buffer == null) { // 一度だけ初期化
		dim = getSize(); // パネルのサイズを得る
		buffer = createImage(dim.width, dim.height); // オフラインイメージを生成
		bufferContext = buffer.getGraphics(); // オフラインイメージのグラフィックスを得る
	    }
	    bufferContext.setColor(Color.black); 
	    bufferContext.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y); // オフラインイメージに直線を描く
	    g.drawImage(buffer, 0, 0, this); // オフラインイメージをパネルに描く
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