import javax.swing.*;

public class ImageLabel01 extends JFrame {

    public static void main(String[] args) {
        ImageLabel01 w = new ImageLabel01( "Imagelabel01" );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 1000, 1000 );
        w.setVisible( true );
    }
    public ImageLabel01( String title ){ // コンストラクタ
        super( title );
        JLabel panel = new JLabel( new ImageIcon("./4/src/stream.jpg") ); // 画像を指定してラベルを生成
        getContentPane().add( panel ); // ラベルをコンテントペインに追加
    }
}