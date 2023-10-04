public class PeixeAgulhao extends Animais implements Convercacao{
    private static final int VELOCIDADE_KMH = 115;

    @Override
    public void falar(){
        System.out.println("Glub Glub.");
    }

    public PeixeAgulhao() {
        setMetrosPercorridos(0);
    }

    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            double distancia = VELOCIDADE_KMH * 1000 / 3600 * segundos;
            setMetrosPercorridos(getMetrosPercorridos() + distancia);
            System.out.printf("O peixe-agulhao nadou %.1f metros.%n", getMetrosPercorridos());
        }
    }
} // fim da classe PeixeAgulhao