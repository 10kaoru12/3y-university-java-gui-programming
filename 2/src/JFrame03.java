import java.awt.event.*; // イベントを取り扱うので必要
import javax.swing.*;

class JFrame03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame( "JFrame03" );
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }); // 無名内部クラスとしてリスナを定義して追加
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}