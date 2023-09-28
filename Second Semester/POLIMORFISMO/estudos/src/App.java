import devflix.Filme;
import devflix.Video;

public class App {

    public static void main(String[] args) throws Exception {
        Filme filme = new Filme("Carros");
        filme.play();
        filme.play("Inglês");
    }

}