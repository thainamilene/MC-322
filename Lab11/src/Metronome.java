import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Metronome extends ActionSubject implements ActionListener {
    private final Timer metro;

    public Metronome(int range) {
       metro = new Timer(range, this);
    }

   public void start() {
      metro.start();
   }

   public void stop() {
      metro.stop();
   }

   public void actionPerformed(ActionEvent event) {
      notify(event);
   }
}
