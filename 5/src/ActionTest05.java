import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionTest05 extends JFrame {

  public static void main(String[] args) {
    ActionTest05 w = new ActionTest05( "ActionTest05" );
    w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    w.setSize( 350, 200 );
    w.setVisible( true );
  }
  public ActionTest05( String title ){
    super( title );

    Action action = new A(); // アクションの生成

    JPanel pane = (JPanel)getContentPane();

    JButton button = new JButton( action ); // ボタンの生成とアクションの設定

    KeyStroke keyStroke = KeyStroke.getKeyStroke( "A" ); // "A"のキーストロークを得る
    button.getInputMap().put( keyStroke, action ); // キーストロークにアクションを設定 
    button.getActionMap().put( action, action ); // アクションにアクションを登録

    pane.add( button, BorderLayout.NORTH );

    JTextArea ta = new JTextArea(); // キー入力を扱うコンポーネント
    pane.add( ta, BorderLayout.CENTER ); // この2行を追加しよう
  }

  class A extends AbstractAction {
    A(){
      putValue( Action.NAME, "A" );
    }
    public void actionPerformed( ActionEvent e ){
      System.out.println( "A が押されました" );
    }
  }
}