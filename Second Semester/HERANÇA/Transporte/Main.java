public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("UHAOS", "Porshe", "Branco", "Uno", 4);
        Carro carro2 = new Carro("OKJNA", "Ferrari", "Vermelha", "Puro Sangue", 4);
        Carro carro3 = new Carro("UHAOS", "Porshe", "Branco", "Uno", 4);

        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(carro3));
        System.out.println(carro2.equals(carro3));
        System.out.println("------------");

        Moto m = new Moto("6969", "Honda", "Preto", "Hornet");

        Onibus o = new Onibus("88", "Mercedez", "Jotur", 40);

        System.out.println(carro1);
        carro1.acelerar();
        System.out.println("------------");
        System.out.println(m);
        m.acelerar();
        System.out.println("------------");
        System.out.println(o);
        o.acelerar();
        System.out.println("------------");

    }
}