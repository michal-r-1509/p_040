import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /*OknoGry ogr = new OknoGry();
        ogr.setVisible(true);*/

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                OknoGry ogr = new OknoGry();
                ogr.setVisible(true);
            }
        });
    }
}
