import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionTest02F extends JFrame {
    Integer count = 0;

    public static void main(String[] args) {
        ActionTest02F w = new ActionTest02F("ActionTest02F");
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(300, 200);
        w.setVisible(true);
    }

    public ActionTest02F(String title) {
        super(title);
        Action increment=new increment();
        Action decrement=new decrement();
        Action clear=new clear();

        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu=new JMenu("操作");
        menuBar.add(menu);
        JMenuItem item=new JMenuItem(increment);
        menu.add(item);
        item=new JMenuItem(decrement);
        menu.add(item);
        item=new JMenuItem(clear);
        menu.add(item);

        JButton button = new JButton(increment); // ボタンの生成と共にActionクラスのインスタンスを設定
        getContentPane().add(button, BorderLayout.NORTH);
        button = new JButton(clear);
        getContentPane().add(button, BorderLayout.CENTER);
        button = new JButton(decrement);
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

    class clear extends AbstractAction {
        clear() {
            putValue(Action.NAME, "クリア");
            putValue(Action.SHORT_DESCRIPTION, "クリア");
        }

        public void actionPerformed(ActionEvent e) {
            count = 0;
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
