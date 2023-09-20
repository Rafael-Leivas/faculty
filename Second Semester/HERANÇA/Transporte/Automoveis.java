public class Automoveis extends Transporte {
    
    private String cor;
    private String modelo;

    public Automoveis(int placa, String marca, String cor, String modelo) {
        super(placa, marca);

        this.cor = cor;
        this.modelo = modelo;

    }
    
}
