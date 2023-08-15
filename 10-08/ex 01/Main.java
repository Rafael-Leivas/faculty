import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int parImpar;
        int numero;
        int number;
        int soma;
        int resto;

	do{
		System.out.printf("Escolha entre, 1 para PAR e 2 para Ímpar: ");
        	parImpar = scan.nextInt();
	}while(parImpar != 1 && parImpar != 2 );
        
        System.out.printf("Digite o seu número: ");
        numero = scan.nextInt();
        
        int randomNumber = random.nextInt(10);
        
        soma = randomNumber + numero;
        
        resto = soma % 2;
	
	    System.out.printf("O computador escolheu o número: %d \n", randomNumber);
        
        if (parImpar == 1){
            if (resto == 0){
                System.out.printf("Você VENCEU a soma deu %d, o resultado deu Par", soma);
            }else{
                System.out.printf("Você PERDEU a soma deu %d, o resultado foi Ímpar.", soma);
            }
        }else{
            if (resto == 0){
                System.out.printf("Você PERDEU a soma deu %d, o resultado foi Par.", soma);
            }else{
                System.out.printf("Você VENCEU a soma deu %d, o resultado deu Ímpar.", soma);
            }
        }
        
        
    }
}