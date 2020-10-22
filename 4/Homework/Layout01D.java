import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout01D extends JFrame {

    public static void main(String[] args) {
        Layout01D w = new Layout01D("Layout01D");
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(350, 200);
        w.setVisible(true);
    }

    public Layout01D(String title) { // コンストラクタ
        super(title);

        JPanel pane = (JPanel)getContentPane(); // コンテントペインを得る

        JButton buttonNorth = new JButton("North"); // ボタン生成
        pane.add(buttonNorth, BorderLayout.NORTH); // 配置位置を指定してボタン追加

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        JButton north = new JButton("North");
        centerPanel.add(north, BorderLayout.NORTH);
        JButton south = new JButton("South");
        centerPanel.add(south, BorderLayout.SOUTH);
        JButton west = new JButton("West");
        centerPanel.add(west, BorderLayout.WEST);
        JButton east = new JButton("East");
        centerPanel.add(east, BorderLayout.EAST);
        pane.add(centerPanel, BorderLayout.CENTER);

        JButton buttonSouth = new JButton("South");
        pane.add(buttonSouth, BorderLayout.SOUTH);

        JButton buttonWest = new JButton("West");
        pane.add(buttonWest, BorderLayout.WEST);

        JButton buttonEast = new JButton("East");
        pane.add(buttonEast, BorderLayout.EAST);
    }
}