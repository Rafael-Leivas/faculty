/* TesteRelogio.java
   Classe para instanciar um relógio e demonstrar o uso dos seus métodos. */

public class TesteRelogio {
    public static void main(String[] args) {

//Aqui estou criando dois objetos de relógio
	Relogio relogio1 = new Relogio(0,0,0);
	Relogio relogio2 = new Relogio(0,0,0);

	System.out.printf("Relógio 1: %s%n", relogio1);
	System.out.printf("Relógio 2: %s%n", relogio2);

	relogio1.setHora(13);
	relogio1.setMinuto(27);
	relogio1.setSegundo(6);

	// continua no próximo slide
	System.out.printf("%nRelógio 1 alterado para: %s%n", relogio1);
	System.out.printf("Relógio 2 alterado para: %s%n", relogio2);

	relogio2.setHora(23);
	relogio2.setMinuto(14);
	relogio2.setSegundo(-1);
	
	System.out.printf("%nRelógio 1 alterado para: %s%n", relogio1);
	System.out.printf("Relógio 2 alterado para: %s%n", relogio2);
    } // fim do método main
} // fim da classe TesteRelogio