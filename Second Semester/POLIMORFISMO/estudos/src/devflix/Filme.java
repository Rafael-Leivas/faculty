package devflix;

public class Filme extends Video {

    public Filme(String nome) {
        super(nome);
    }

    //Exemplo de POLIMORFISMO, pegando o mesmo método de Video  
    @Override
    public void play() {
        System.out.println("Play: filme " + getNome());
    }    

    //Exemplo de SO brecarga
    public void play(String idioma) {
        System.out.println("Play: filme " + getNome() + ", no Idioma " + idioma);
    }

}
