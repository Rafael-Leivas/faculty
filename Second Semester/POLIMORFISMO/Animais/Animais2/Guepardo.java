public class Guepardo extends Animais implements Convercacao{
    private static final int VELOCIDADE_KMH = 130;

    @Override
    public void falar(){
        System.out.println("Raw Raw.");
    }

    public Guepardo() {
        setMetrosPercorridos(0);
    }

    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            double distancia = VELOCIDADE_KMH * 1000 / 3600 * segundos;
            setMetrosPercorridos(getMetrosPercorridos() + distancia);
            System.out.printf("O guepardo correu %.1f metros.%n", getMetrosPercorridos());
        }
    }

} // fim da classe Guepardo