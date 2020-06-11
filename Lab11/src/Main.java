import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

     public static String diretorio = Main.class.getResource(".").getPath();

    public static void main(String[] args) {
        Window window = new Window();

        for (int i = 1; i < 49; i++) {
            window.addFieldImage(new Images (diretorio + "field.png", 100, 100, 0));
        }
        Images img = new Images (diretorio + "dog.png", 100, 100, 0); //<a href='https://www.freepik.com/free-photos-vectors/hand'>Hand vector created by freepik - www.freepik.com</a>
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

        JButton buttonLeft = new JButton("Esquerda");
        window.addControl(buttonLeft);
        buttonLeft.addActionListener(img);

        JButton buttonRight = new JButton("Direita");
        window.addControl(buttonRight);
        buttonRight.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent actionEvent) {
                        img.moveRight();
                    }
                }
        );

        JButton buttonTop = new JButton("Cima");
        window.addControl(buttonTop);
        buttonTop.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        img.moveTop();
                    }
                }
        );

        JButton buttonBottom = new JButton("Embaixo");
        window.addControl(buttonBottom);
        buttonBottom.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        img.moveBottom();
                    }
                }
        );


        JButton buttonStart = new JButton("Inicia");
        window.addControl(buttonStart);

        buttonStart.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        metro.start();
                    }
                }
                );

          JButton buttonStop = new JButton("Para");
          window.addControl(buttonStop);

          buttonStop.addActionListener(
             new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   metro.stop();
                }
             }
          );
   }
}
