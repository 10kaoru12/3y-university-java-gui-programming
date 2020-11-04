import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionTest02D extends JFrame {
    Integer count = 0;

    public static void main(String[] args) {
        ActionTest02D w = new ActionTest02D("ActionTest02D");
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(300, 200);
        w.setVisible(true);
    }

    public ActionTest02D(String title) {
        super(title);
        JButton button = new JButton(new increment()); // ボタンの生成と共にActionクラスのインスタンスを設定
        getContentPane().add(button, BorderLayout.NORTH);
        button = new JButton(new decrement());
        getContentPane().add(button, BorderLayout.SOUTH);
        System.out.println("初期値は" + count);
    }

    class increment extends AbstractAction { // Action クラスの定義

        increment() {
            putValue(Action.NAME, "増やす");
            putValue(Action.SHORT_DESCRIPTION, "インクリメント");
        }

        public void actionPerformed(ActionEvent e) { // ボタンがクリックされたときの処理
            count++;
            System.out.println("現在値は" + count);
        }
    }

    class decrement extends AbstractAction {
        decrement() {
            putValue(Action.NAME, "減らす");
            putValue(Action.SHORT_DESCRIPTION, "デクリメント");
        }

        public void actionPerformed(ActionEvent e) {
            count--;
            System.out.println("現在値は" + count);
        }
    }
}
