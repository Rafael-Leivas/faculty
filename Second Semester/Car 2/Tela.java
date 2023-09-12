import java.util.Scanner;

public class Tela {
    
    public static double pedirAceleracao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua velocidade:");
        double aceleracao = sc.nextDouble();
        return aceleracao;
    } 

    public static int pedirTempo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu tempo:");
        int tempo = sc.nextInt();
        return tempo;
    }
}