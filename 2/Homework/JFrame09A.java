import javax.swing.*;
import java.awt.*;

class JFrame09A {
    public static void main(String[] args) {
        JFrame frame = new JFrame( "JFrame09" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); //***
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds( 0, 0, 100, 100 );
        frame.setMinimumSize(new Dimension(100, 100));
        frame.setVisible(true);
    }
}

