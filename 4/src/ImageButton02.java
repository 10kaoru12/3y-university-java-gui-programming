import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ImageButton02 extends JFrame {

  public static void main(String[] args) {
    ImageButton02 w = new ImageButton02( "ImageButton02" );
    w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    w.setSize( 200, 150 );
    w.setVisible( true );
  }
  public ImageButton02( String title ){
    super( title );

    JPanel pane = (JPanel)getContentPane();

    JButton item = new JButton(); // ボタンの生成
    item.setIcon( new TestIcon()  ); // 通常アイコンの設定
    item.setPressedIcon( new TestIcon( Color.blue ) ); // 押された時のアイコン
    item.setRolloverIcon( new TestIcon( Color.green ) ); // マウスが入った時のアイコン
    item.setRolloverEnabled(true); // ロールオーバを可能にする
    item.setToolTipText( "Test" ); // ツールチップの設定
    pane.add( item ); // ボタンの追加

  }

  class TestIcon implements Icon {
    static final int width  = 100;
    static final int height = 100;
    Color color;

    public TestIcon() { // 色を与えない場合は白がデフォルト
      color = Color.white;
    }
    public TestIcon( Color c ) { // 色を与えてアイコンを生成する
      color = c;
    }
    public void paintIcon( Component c, Graphics g, int x, int y ) {
      g.setColor( this.color );
      g.fillOval( x, y, width, height );
    }
    public int getIconWidth() { 
      return this.width;
    }
    public int getIconHeight() {
      return this.height;
    }
  }

}