import java.util.Random;

public class Generator {

    private int liczbalosowa;

    public Generator(int liczbalosowa) {
        this.liczbalosowa = liczbalosowa;
    }

    public int randomBetween(int end){
        Random random = new Random();
        liczbalosowa = random.nextInt(end);
        return liczbalosowa;
    }
}

