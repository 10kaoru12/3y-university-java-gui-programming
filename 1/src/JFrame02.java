import javax.swing.*;

class JFrame02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame( "JFrame02" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); //*** 閉じるボタンの設定
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}