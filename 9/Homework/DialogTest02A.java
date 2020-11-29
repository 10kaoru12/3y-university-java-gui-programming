import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DialogTest02A extends JFrame {
    JPanel pane;
    public static void main(String[] args) {
        DialogTest02A w = new DialogTest02A( "DialogTest02A" );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 550, 300 );
        w.setVisible( true );
    }
    public DialogTest02A(String title ) {
        super( title );
        pane = (JPanel)getContentPane();
        JToolBar tool = new JToolBar();
        pane.add( tool, BorderLayout.NORTH );
        tool.add( new Dialog( "Input Dialog ComboBox type" ) );
    }
    class Dialog extends AbstractAction {
        Dialog( String text ){ super( text ); }
        public void actionPerformed( ActionEvent e ){

            Object[] select = {"A","B","O","AB"};
            Object[] msg = {};
            Object ans = JOptionPane.showInputDialog( pane, msg, "血液型を選んでください",
                    JOptionPane.PLAIN_MESSAGE, null,select,select[0]);
            System.out.println(ans);
        }
    }
}