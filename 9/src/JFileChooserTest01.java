import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class JFileChooserTest01 extends JFrame {

  ImageIcon icon = null;
  JLabel label = new JLabel();

  public static void main(String[] args) {
    JFileChooserTest01 w = new JFileChooserTest01( "JFileChooserTest01" );
    w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    w.setSize( 350, 300 );
    w.setVisible( true );
  }
  JFileChooserTest01( String title ){
    super( title );
    JPanel pane = (JPanel)getContentPane();

    JToolBar tool = new JToolBar();
    pane.add( tool, BorderLayout.NORTH );
    tool.add( new LoadImageFile( "画像ファイルをオープン" ) );

    pane.add( label, BorderLayout.CENTER );
  }
  class LoadImageFile extends AbstractAction {
    LoadImageFile( String text ){ super(text); }
    public void actionPerformed( ActionEvent e ){
      JFileChooser fileChooser = new JFileChooser( "." ); // カレントディレクトリを指定してファイルチューザを生成
      fileChooser.setFileSelectionMode( JFileChooser.FILES_ONLY ); // モードを設定
      fileChooser.setDialogTitle( "画像選択" ); // タイトルを指定

      int ret = fileChooser.showOpenDialog( label ); // ダイアログを開く

      if( ret != JFileChooser.APPROVE_OPTION ) return; // 選ばれていなければ

      String fileName = fileChooser.getSelectedFile().getAbsolutePath(); // 選ばれていればそのファイルのパスを得る
      icon = new ImageIcon( fileName );
      label.setIcon( icon );
    }
  }
}