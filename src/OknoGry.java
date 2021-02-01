import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OknoGry extends JFrame implements ActionListener{

    private JLabel tyt1, tyt2, lkomp, lty, lwynkomp, lwyngracz, ldwukrop, komunikaty;
    private JButton bkamien, bpapier, bnozyce;
    private int liczbagracza;
    int wynikkomp;
    int wynikgracz;

    public OknoGry(){
        setLayout(null);
        setSize(410, 420);
        setTitle("Kamień, papier, nożyce");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tyt1 = new JLabel("KAMIEŃ, PAPIER, NOŻYCE");
        tyt1.setBounds(80,5, 300, 50);
        tyt1.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(tyt1);

        tyt2 = new JLabel("Zagraj z komputerem");
        tyt2.setBounds(140,45, 150, 20);
        tyt2.setFont(new Font("SansSerif", Font.BOLD, 12));
        add(tyt2);

        bkamien = new JButton("KAMIEŃ");
        bkamien.setBounds(30,80, 100, 100);
        bkamien.setFont(new Font("SansSerif", Font.BOLD, 16));
        bkamien.addActionListener( this);
        add(bkamien);

        bpapier = new JButton("PAPIER");
        bpapier.setBounds(150,80, 100, 100);
        bpapier.setFont(new Font("SansSerif", Font.BOLD, 16));
        bpapier.addActionListener( this);
        add(bpapier);

        bnozyce = new JButton("NOŻYCE");
        bnozyce.setBounds(270,80, 100, 100);
        bnozyce.setFont(new Font("SansSerif", Font.BOLD, 16));
        bnozyce.addActionListener( this);
        add(bnozyce);

        lkomp = new JLabel("KOMPUTER");
        lkomp.setBounds(45,220, 100, 20);
        lkomp.setFont(new Font("SansSerif", Font.BOLD, 12));
        add(lkomp);

        lty = new JLabel("GRACZ");
        lty.setBounds(300,220, 100, 20);
        lty.setFont(new Font("SansSerif", Font.BOLD, 12));
        add(lty);

        lwynkomp = new JLabel("0");
        lwynkomp.setBounds(170,280, 50, 30);
        lwynkomp.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(lwynkomp);

        lwyngracz = new JLabel("0");
        lwyngracz.setBounds(210,280, 50, 30);
        lwyngracz.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(lwyngracz);

        ldwukrop = new JLabel(":");
        ldwukrop.setBounds(195,280, 10, 30);
        ldwukrop.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(ldwukrop);

        komunikaty = new JLabel("");
        komunikaty.setBounds(30,350, 380, 20);
        komunikaty.setFont(new Font("SansSerif", Font.BOLD, 12));
        add(komunikaty);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();

        Generator los = new Generator(1);
        int liczbalosowa = los.randomBetween( 3);

        if(zrodlo == bkamien){
            liczbagracza = 0;}
        else if (zrodlo == bpapier){
            liczbagracza = 1;}
        else if (zrodlo == bnozyce){
            liczbagracza = 2;}

        //System.out.println(liczbagracza);
        //System.out.println("komp: " + liczbalosowa + "    gracz: " + liczbagracza);

        Gra gra = new Gra(liczbalosowa, liczbagracza);
        int wyniki = gra.wynikGry();

        if (wyniki == 0){
            komunikaty.setText("Remis");
        }
        else if (wyniki == 1){
            wynikkomp += 1;
            komunikaty.setText("Wygrywa komputer");
        }
        else if (wyniki == 2){
            wynikgracz += 1;
            komunikaty.setText("Wygrywa gracz");
        }
        lwynkomp.setText(String.valueOf(wynikkomp));
        lwyngracz.setText(String.valueOf(wynikgracz));
    }
}
