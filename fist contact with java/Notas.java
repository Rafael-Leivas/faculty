import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        
	int tempo;
	double juros;
	double capital;
	double montante;
	double juro;
		
		System.out.print("%sInforme o seu cápital: ");
		capital = scanner.nextDouble();

		System.out.print("%sInforme o juros: ");
		juros = scanner.nextDouble();

		System.out.print("%sInforme o tempo em meses: ");
		tempo = scanner.nextInt();

		juro = juros / 100;

		montante = capital * Math.pow((1+juro), tempo);
		
		System.out.printf("O seu montante é: %f", montante);

    } // fim do método main
} // fim da classe Notas