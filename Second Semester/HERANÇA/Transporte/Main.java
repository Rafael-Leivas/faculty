public class Main {
    public static void main(String[] args) {

        Carro c = new Carro(111, "Porshe", "Branco", "Uno", 4);

        Moto m = new Moto(6969, "Honda", "Preto", "Hornet");

        Onibus o = new Onibus(88, "Mercedez", "Jotur", 40);

        System.out.println(c);
        c.acelerar();
        System.out.println("------------");
        System.out.println(m);
        m.acelerar();
        System.out.println("------------");
        System.out.println(o);
        o.acelerar();
        System.out.println("------------");

    }
}