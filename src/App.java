import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Feriado novoFeriado = new Feriado("01/01/2023", "Confraternização mundial");
        String feriadoAtual = novoFeriado.getFeriado("01/01/2023");
        System.out.println(feriadoAtual);
    }
}
