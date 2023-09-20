public class Onibus extends Transporte {

    private String empresa;
    private int numAssentos;
    
    public Onibus(int placa, String marca, String empresa, int numAssentos) {
        super(placa, marca);

        this.empresa = empresa;
        this.numAssentos = numAssentos;
    }

    public void setEmpresa() {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setNumAssentos() {
        this.numAssentos = numAssentos;
    }

    public int getNumAssentos() {
        return numAssentos;
    }

    public String toString() {
        System.out.println("Onibus");
        return super.toString() + "\nEmpresa: " + empresa + "\nNumero de assentos: " + numAssentos;
    }
    
}
