public class Gra {
    private int liczbalosowa, liczbagracza;
    public int wynik;

    public Gra(int liczbalosowa, int liczbagracza) {
        this.liczbalosowa = liczbalosowa;
        this.liczbagracza = liczbagracza;
    }

    public int wynikGry(){
        if (liczbalosowa == liczbagracza)
            return wynik = 0;
        else if(liczbalosowa == 0 & liczbagracza == 1)
            return wynik = 2;
        else if(liczbalosowa == 0 & liczbagracza == 2)
            return wynik = 1;
        else if(liczbalosowa == 1 & liczbagracza == 0)
            return wynik = 1;
        else if(liczbalosowa == 1 & liczbagracza == 2)
            return wynik = 2;
        else if(liczbalosowa == 2 & liczbagracza == 0)
            return wynik = 2;
        else if(liczbalosowa == 2 & liczbagracza == 1)
            return wynik = 1;
    return wynik;
    }
}
