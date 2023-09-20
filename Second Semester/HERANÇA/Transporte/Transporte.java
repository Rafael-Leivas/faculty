public class  Transporte {

    private int placa;
    private String marca;

    public Transporte(int placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public void setNome() {
        this.placa = placa;
    }

    public int getPlaca() {
        return placa;
    }

    public void setMarca() {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public String toString() {
        return "Placa: " + placa + "\nMarca: " + marca;
    }
    
}
