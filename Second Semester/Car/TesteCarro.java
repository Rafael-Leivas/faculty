public class TesteCarro {
    public static void main (String[] args){

        Carro carro1 = new Carro("Vermelho","Ferrari",1992);
        Carro carro2 = new Carro("Roxo","Audi",2004);

        System.out.printf("Carro 1: %s\n",carro1);
        System.out.printf("Carro 2: %s\n",carro2);

        carro1.acelerar(5,2);
        carro2.acelerar(20,5);

        System.out.printf("Carro 1: %s\n",carro1);
        System.out.printf("Carro 2: %s\n",carro2);
    }
}