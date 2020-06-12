import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

     public static String directory = Main.class.getResource(".").getPath();

    public static void main(String[] args) {
        Window window = new Window();

        for (int i = 1; i < 49; i++) {
            window.addImage(new Images (directory + "field.png", 100, 100, 0));
        }
        Images img = new Images (directory + "dog.png", 100, 100, 0); //<a href='https://www.freepik.com/free-photos-vectors/hand'>Hand vector created by freepik - www.freepik.com</a>
        window.addImage(img, 0);
        img.setWindow(window);

        Metronome metro = new Metronome(500);

        metro.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        img.moveRandomly();
                    }
                }
        );

        StyleButton buttonStart = new StyleButton(directory + "start.png");
        window.addControl(buttonStart);


        StyleButton buttonTop = new StyleButton(directory + "Top.png");
        window.addControl(buttonTop);
        buttonTop.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        img.moveTop();
                    }
                }
        );

          StyleButton buttonStop = new StyleButton(directory + "stop.png");
          window.addControl(buttonStop);

        StyleButton buttonLeft = new StyleButton(directory + "Left.png");
        window.addControl(buttonLeft);
        buttonLeft.addActionListener(img);

        StyleButton buttonBottom = new StyleButton(directory + "Bottom.png");
        window.addControl(buttonBottom);
        buttonBottom.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        img.moveBottom();
                    }
                }
        );
        StyleButton buttonRight = new StyleButton(directory + "Right.png");
        window.addControl(buttonRight);
        buttonRight.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent actionEvent) {
                        img.moveRight();
                    }
                }
        );

        buttonStart.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        metro.start();
                    }
                }
                );


          buttonStop.addActionListener(
             new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   metro.stop();
                }
             }
          );
   }
}
