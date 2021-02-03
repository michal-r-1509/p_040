public class Gra {
    private int liczbalosowa, liczbagracza;
    public int wynik;

    public Gra(int liczbalosowa, int liczbagracza) {
        this.liczbalosowa = liczbalosowa;
        this.liczbagracza = liczbagracza;
    }

    public int wynikGry(){
        if (liczbalosowa == liczbagracza)
            wynik = 0;
        else if(liczbalosowa == 0 & liczbagracza == 1)
            wynik = 2;
        else if(liczbalosowa == 0 & liczbagracza == 2)
            wynik = 1;
        else if(liczbalosowa == 1 & liczbagracza == 0)
            wynik = 1;
        else if(liczbalosowa == 1 & liczbagracza == 2)
            wynik = 2;
        else if(liczbalosowa == 2 & liczbagracza == 0)
            wynik = 2;
        else if(liczbalosowa == 2 & liczbagracza == 1)
            wynik = 1;
        return wynik;
    }
}