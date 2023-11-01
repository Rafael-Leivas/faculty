public class Tarefa {
    private int id;
    private String nome;
    private String descricao;

    public Tarefa() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null )
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Tarefa tarefa = (Tarefa) obj;
        return this.id == tarefa.getId();
    }
    
}