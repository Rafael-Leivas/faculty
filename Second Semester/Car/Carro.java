public class Carro {
    private String cor;
    private String marca;
    private double velocidade;
    private int ano;

    public Carro (String cor, String marca, int ano) {
        this.velocidade = 0.0;
        setCor(cor);
        setMarca(marca);
        setAno(ano);
    }

    public void setCor(String cor) {
        this.cor = cor ;
    }

    public String getCor() {
        return this.cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void acelerar(double a, int t) {
        this.velocidade = this.velocidade + (a * t);
    }

    public String toString() {
        return String.format("cor = %s, marca = %s, ano = %d, velocidade = %f",
        getCor(),
        getMarca(),
        getAno(),
        getVelocidade());
    }

}