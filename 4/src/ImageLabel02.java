import javax.swing.*;
import java.awt.*;

public class ImageLabel02 extends JFrame {

    public static void main(String[] args) {
        ImageLabel02 w = new ImageLabel02( "ImageLabel02" );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 250, 150 );
        w.setVisible( true );
    }
    public ImageLabel02( String title ){
        super( title );
        JLabel panel = new JLabel( new DrawIcon() ); // 自分で作ったアイコンを設定してラベルを生成
        getContentPane().add( panel );
    }
    class DrawIcon implements Icon { // 自分でアイコンを設計
        static final int width  = 100;
        static final int height = 100;

        public void paintIcon( Component c, Graphics g, int x, int y ) { // アイコンを描く
            g.setColor( Color.green ); // 描画色を緑にする
            g.fillOval( x, y, width, height ); // 塗りつぶし円を描く
            g.fillOval(x+100,y+100,width,height);
            g.fillOval(x-100,y+100,width,height);
            g.fillOval(x+100,y-100,width,height);
            g.fillOval(x-100,y-100,width,height);
        }
        public int getIconWidth() { // アイコンの幅を返す
            return this.width;
        }
        public int getIconHeight() { // アイコンの高さを返す
            return this.height;
        }
    }
}