import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DialogTest03C extends JFrame {
    JPanel pane;
    public static void main(String[] args) {
        DialogTest03C w = new DialogTest03C( "DialogTest03C" );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 550, 300 );
        w.setVisible( true );
    }
    public DialogTest03C(String title ) {
        super( title );
        pane = (JPanel)getContentPane();
        JToolBar tool = new JToolBar();
        pane.add( tool, BorderLayout.NORTH );
        tool.add( new Dialog( "Confirm Dialog" ) );
    }
    class Dialog extends AbstractAction {
        Dialog(String text ){ super( text ); }
        public void actionPerformed( ActionEvent e ){
            String msg="Javaは得意ですか？";
            int ans = JOptionPane.showConfirmDialog( pane, msg,"Java Question",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); // 確認ダイアログを生成・表示、選択した結果が返ってくる
            String answerMsg = ans == 0 ? "Javaは得意です" : "Javaは苦手です";
            JOptionPane.showMessageDialog(pane,answerMsg,"Java Answer",JOptionPane.WARNING_MESSAGE);
        }
    }
}