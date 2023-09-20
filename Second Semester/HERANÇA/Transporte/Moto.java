
public class Moto extends Automoveis {

    public Moto(int placa, String marca, String cor, String modelo) {
        super(placa, marca, cor, modelo);
    }

    public String toString() {
        System.out.println("Moto");
        return super.toString();
    }
    
}
