import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionTest02 extends JFrame {

  public static void main(String[] args) {
    ActionTest02E w = new ActionTest02E( "ActionTest02" );
    w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    w.setSize( 300, 200 );
    w.setVisible( true );
  }
  public ActionTest02( String title ){
    super( title );
    JButton button = new JButton( new Action02() ); // ボタンの生成と共にActionクラスのインスタンスを設定
    getContentPane().add( button, BorderLayout.NORTH );
  }
  class Action02 extends AbstractAction{ // Action クラスの定義
    Action02(){
      putValue( Action.NAME, "開く" );
      putValue( Action.SMALL_ICON, new ImageIcon( "open.gif" ) );
      putValue( Action.SHORT_DESCRIPTION, "ツールチップ" );
    }
    public void actionPerformed( ActionEvent e ){ // ボタンがクリックされたときの処理
      System.out.println( "Action02 が処理されました" );
    }
  }
}
