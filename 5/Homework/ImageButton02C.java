import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ImageButton02C extends JFrame {

    public static void main(String[] args) {
        ImageButton02C w = new ImageButton02C("ImageButton02C");
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(200, 150);
        w.setVisible(true);
    }

    public ImageButton02C(String title) {
        super(title);

        JPanel pane = (JPanel) getContentPane();

        JButton item = new JButton(new TestIcon()); // ボタンの生成
        item.setRolloverIcon(new TestIcon("RoundRect")); // マウスが入った時のアイコン
        item.setPressedIcon(new TestIcon("Rect")); // 押された時のアイコン
        item.setRolloverEnabled(true); // ロールオーバを可能にする
        item.setToolTipText("Test"); // ツールチップの設定
        pane.add(item); // ボタンの追加

    }

    class TestIcon implements Icon {
        static final int width = 100;
        static final int height = 100;
        Color color = Color.green;
        String figure;

        public TestIcon() { // 色を与えない場合は白がデフォルト
            figure = "circle";
        }

        public TestIcon(String f) { // 色を与えてアイコンを生成する
            this.figure = f;
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {
            g.setColor(this.color);
            switch (figure) {
                case "Rect":
                    g.fillRect(x, y, width, height);
                case "RoundRect":
                    g.fillRoundRect(x, y, width, height, 20, 20);
                default:
                    g.fillOval(x, y, width, height);
            }
        }

        public int getIconWidth() {
            return this.width;
        }

        public int getIconHeight() {
            return this.height;
        }
    }

}