public class Automoveis extends Transporte {
    
    private String cor;
    private String modelo;

    public Automoveis(String placa, String marca, String cor, String modelo) {
        super(placa, marca);

        this.cor = cor;
        this.modelo = modelo;

    }

    public void setCor() {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo() {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String toString() {
        return super.toString() + "\nCor: " + cor + "\nModelo: " + modelo;
    }
    
}
