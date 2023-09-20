public class Carro extends Automoveis{

    private int qtdPortas;
    
    public Carro(String placa, String marca, String cor, String modelo, int qtdPortas) {
        super(placa, marca, modelo, modelo);

        this.qtdPortas = qtdPortas;

    }

    public boolean equals(Object o) {
        if(o.getClass().equals(Carro.class)) {
            Carro outro = (Carro) o;
            if (getPlaca().equals(outro.getPlaca())) {
                return true;
            }
        }
        return false;
    }

    public void setQtdPortas() {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public String toString() {
        System.out.println("Carro");
        return super.toString() + "\nQuantidade de portas: " + qtdPortas;
    }
    
}
