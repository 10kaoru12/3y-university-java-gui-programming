import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ImageLabel03 extends JFrame {

    public static void main(String[] args) {
        ImageLabel03 w = new ImageLabel03( "ImageLabel03" );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 400, 420 );
        w.setVisible( true );
    }
    public ImageLabel03( String title ){
        super( title );
        JPanel panel = (JPanel)getContentPane();
        panel.setLayout( new FlowLayout() );

        JLabel item;
        Icon icon = new ImageIcon( "exit.gif" );

        item = new JLabel( "デフォルト" ); // ラベルを生成
        item.setIcon( icon ); // アイコンを設定
        item.setBorder( new LineBorder( Color.black) ); // 枠を設定
        panel.add( item ); // パネルにラベルを追加

        item = new JLabel( "左寄せ", icon, SwingConstants.LEFT ); // 3つのパラメータを指定してラベルを生成
        item.setPreferredSize( new Dimension(350, 50) ); // 大きさを指定
        item.setBorder( new LineBorder( Color.black) ); // 枠を設定
        panel.add( item ); // パネルにラベルを追加

        item = new JLabel( "中央", icon, SwingConstants.CENTER );
        item.setPreferredSize( new Dimension(350, 50) );
        item.setBorder( new LineBorder( Color.black) );
        panel.add( item );

        item = new JLabel( "右寄せ", icon, SwingConstants.RIGHT );
        item.setPreferredSize( new Dimension(350, 50) );
        item.setBorder( new LineBorder( Color.black) );
        panel.add( item );

        item = new JLabel( "LEADING", icon, SwingConstants.LEADING );
        item.setPreferredSize( new Dimension(350, 50) );
        item.setBorder( new LineBorder( Color.black) );
        panel.add( item );

        item = new JLabel( "TRAILING", icon, SwingConstants.TRAILING );
        item.setPreferredSize( new Dimension(350, 50) );
        item.setBorder( new LineBorder( Color.black) );
        panel.add( item );

        item = new JLabel( "左寄せ" );
        item.setIcon( icon );
        item.setHorizontalAlignment( SwingConstants.LEFT );
        item.setPreferredSize( new Dimension(350, 50) );
        item.setBorder( new LineBorder( Color.black) );
        panel.add( item );

    }
}