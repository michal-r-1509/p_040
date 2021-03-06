import javax.swing.*;
import java.awt.*;

public class Grafika extends JPanel {

    private String obraz_kamienia = "images/stone.png";
    private String obraz_papieru = "images/paper.png";
    private String obraz_nozyc = "images/scissors.png";
    public int liczbakomp, liczbagracz;
    int x1 = 35;
    int x2 = 270;
    int y = 270;

    public Grafika(int liczbakomp, int liczbagracz) {
        this.liczbakomp = liczbakomp;
        this.liczbagracz = liczbagracz;
        setFocusable(true);
    }

        public void drawK (Graphics2D g2d) {
            if (liczbakomp == 0)
                g2d.drawImage(wczytajObraz0(), x1, y, this);
            else if (liczbakomp == 1)
                g2d.drawImage(wczytajObraz1(), x1, y, this);
            else if (liczbakomp == 2)
                g2d.drawImage(wczytajObraz2(), x1, y, this);
        }

        public void drawG (Graphics2D g2d){
                if (liczbagracz == 0)
                    g2d.drawImage(wczytajObraz0(), x2, y, this);
                else if (liczbagracz == 1)
                    g2d.drawImage(wczytajObraz1(), x2, y, this);
                else if (liczbagracz == 2)
                    g2d.drawImage(wczytajObraz2(), x2, y, this);
        }


        public Image wczytajObraz0() {
        ImageIcon i = new ImageIcon(getClass().getResource(obraz_kamienia));
        return i.getImage();
    }
        public Image wczytajObraz1() {
        ImageIcon i = new ImageIcon(getClass().getResource(obraz_papieru));
        return i.getImage();
    }
        public Image wczytajObraz2() {
        ImageIcon i = new ImageIcon(getClass().getResource(obraz_nozyc));
        return i.getImage();
    }
}
