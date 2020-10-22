import javax.swing.*;
import java.awt.event.*;

public class ActionTest01 {

  public static void main(String[] args) {
    new ActionTest01();
    try{
      Thread.sleep(10000);
    }
    catch( InterruptedException e ){
      System.out.println( e );
    }
    System.exit(0); // 追加: プログラムを終了する
  }
  public ActionTest01(){
    Timer timer = new Timer( 1000, new Tick() );
    timer.start();
  }
  class Tick extends AbstractAction {
    public void actionPerformed( ActionEvent e ){
      System.out.print( "*" );
    }
  }
}