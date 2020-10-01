import java.awt.event.*;
import javax.swing.*;

public class JFrame04 extends JFrame {
    public static void main(String[] args) {
        new JFrame04( "JFrame04" );
    }
    public JFrame04( String title ){
        super( title );
        setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE );
        addWindowListener( new WindowClosing() ); // リスナの設定
        setSize(500, 300);
        setVisible(true);
    }
    class WindowClosing extends WindowAdapter { // 実際のリスナの内部クラス定義
        public void windowClosing(WindowEvent e) {
            int ans = JOptionPane.showConfirmDialog( JFrame04.this, "ほんとうに終了しますか？" ); // ダイアログを表示して結果を得る
            if( ans == JOptionPane.YES_OPTION ){
                System.exit(0);
            }
        }
    }
}