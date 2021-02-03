import javax.swing.*;
import java.awt.*;

public class Grafika extends JPanel {

    private String obraz_kamienia = "images/stone.png";
    private String obraz_papieru = "images/paper.png";
    private String obraz_nozyc = "images/scissors.png";

    String tablica[] = {"images/stone.png", "images/paper.png", "images/scissors.png"};


    public Grafika() {
        setFocusable(true);
        System.out.println(tablica[1]);
    }

        public void draw (Graphics2D g2d){
        g2d.drawImage(wczytajObraz(), 50, 50, this);
    }

        public Image wczytajObraz () {
        ImageIcon i = new ImageIcon(getClass().getResource(obraz_kamienia));
        return i.getImage();
    }
}
