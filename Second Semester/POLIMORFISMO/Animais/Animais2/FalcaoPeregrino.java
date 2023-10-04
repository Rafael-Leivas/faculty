public class FalcaoPeregrino extends Animais implements Convercacao{
    private static final int VELOCIDADE_KMH = 390;

    @Override
    public void falar(){
        System.out.println("Piu Piu.");
    }
    
    public FalcaoPeregrino() {
        setMetrosPercorridos(0);
    }
    
    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            double distancia = VELOCIDADE_KMH * 1000 / 3600 * segundos;
            setMetrosPercorridos(getMetrosPercorridos() + distancia);
            System.out.printf("O falcão peregrino voou %.1f metros.%n", getMetrosPercorridos());
        }
    }

} // fim da classe FalcaoPeregrino
