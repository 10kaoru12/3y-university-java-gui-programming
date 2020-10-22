import javax.swing.*;
import java.awt.event.*;

public class Test01 {

    public static void main(String[] args) {
        new Test01(); // Test01インスタンス生成
        try{
            Thread.sleep(10000); // 10秒待つ
        }
        catch( InterruptedException e ){
            System.out.println( e );
        }
        System.exit(0); // 追加: プログラムの終了
    }
    public Test01(){
        Timer timer = new Timer( 1000, new Tick() ); // タイマーの生成
        timer.start(); // タイマーの開始
    }
    class Tick implements ActionListener { // ActionListenerの定義
        public void actionPerformed( ActionEvent e ){ // Action イベントが起こると呼び出される
            System.out.print( "*" ); // 標準出力に "*" を出力
        }
    }
}