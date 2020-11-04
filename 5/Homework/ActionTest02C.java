import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionTest02C extends JFrame {

    public static void main(String[] args) {
        ActionTest02C w = new ActionTest02C("ActionTest02C");
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(300, 200);
        w.setVisible(true);
    }

    public ActionTest02C(String title) {
        super(title);
        JButton button = new JButton(new Action02()); // ボタンの生成と共にActionクラスのインスタンスを設定
        getContentPane().add(button, BorderLayout.NORTH);
    }

    class Action02 extends AbstractAction { // Action クラスの定義
        Integer count = 0;

        Action02() {
            putValue(Action.NAME, "増やす");
            putValue(Action.SHORT_DESCRIPTION, "インクリメント");
            System.out.println("初期値は" + count);
        }

        public void actionPerformed(ActionEvent e) { // ボタンがクリックされたときの処理
            count++;
            System.out.println("現在値は" + count);
        }
    }
}
