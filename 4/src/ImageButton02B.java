import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ImageButton02B extends JFrame {

  public static void main(String[] args) {
    ImageButton02B w = new ImageButton02B( "ImageButton02B" );
    w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    w.setSize( 200, 150 );
    w.setVisible( true );
  }
  public ImageButton02B( String title ){
    super( title );

    JPanel pane = (JPanel)getContentPane();

    JRadioButton item = new JRadioButton();
    item.setIcon( new TestIcon()  ); // デフォルトアイコン
    item.setPressedIcon( new TestIcon( Color.blue ) ); // 押された時
    item.setRolloverIcon( new TestIcon( Color.green ) ); // カーソルがある時
    item.setSelectedIcon( new TestIcon( Color.red ) ); // 選択時
    item.setRolloverSelectedIcon( new TestIcon( Color.yellow ) ); // カーソルがあり、選択時
    item.setRolloverEnabled(true);
    item.setToolTipText( "Test" );
    pane.add( item );

  }

  class TestIcon implements Icon {
    static final int width  = 100;
    static final int height = 100;
    Color color;

    public TestIcon() { 
      color = Color.white;
    }
    public TestIcon( Color c ) { 
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