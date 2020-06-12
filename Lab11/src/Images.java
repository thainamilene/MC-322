import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Images extends JLabel implements ActionListener {
   Window window;
   int x;
   public Images(String image, int width, int height, int x) {
      super(new ImageIcon(image));
      setSize(width, height);
      this.x = x;
   }

   public void setWindow(Window window) {
      this.window = window;
   }
   public void actionPerformed(ActionEvent evento) {
      moveLeft();
   }

   public void moveRight() {
      window.removeImage(x);
      if (x!=0 && (x+1)%7 == 0) {
         x-=6;
      } else {
         x++;
      }
      window.addImage(this, x);
   }

   public void moveLeft() {
      window.removeImage(x);
      if (x%7 == 0) {
         x+=6;
      } else {
         x--;
      }
      window.addImage(this, x);
   }
   public void moveTop() {
      window.removeImage(x);
      if (x < 7) {
            x+=42;
      } else {
            x-=7;
      }
      window.addImage(this, x);
    }
    public void moveBottom() {
      window.removeImage(x);
      if (x > 41) {
         x-=42;
      } else{
         x+=7;
      }
      window.addImage(this, x);
    }

    public void moveRandomly() {
      int k = (int) (Math.random()*4);
      if (k == 0) {
         moveLeft();
      } else if(k == 1){
         moveRight();
      } else if (k == 2) {
         moveTop();
      } else {
         moveBottom();
      }
   }
}
