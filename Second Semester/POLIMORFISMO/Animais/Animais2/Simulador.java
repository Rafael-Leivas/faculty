public class Simulador {
    private static final int DURACAO = 60;
    private static final int INTERVALO = 5;

    public static void main(String[] args) {
        System.out.println("Simulador de Animais\n");

        Animais[] animais = new Animais[3];
        animais[0] = new FalcaoPeregrino();
        animais[1] = new Guepardo();
        animais[2] = new PeixeAgulhao();

	// continua no próximo slide
        for (int t = INTERVALO; t <= DURACAO; t += INTERVALO) {
            System.out.printf("t = %d%n", t);

            for (Animais animal : animais) {
                animal.mover(INTERVALO);
            }

            System.out.println();
        }

        Convercacao c = new FalcaoPeregrino();
        c.falar();
    }
} // fim da classe Simulador