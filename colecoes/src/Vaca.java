class Vaca {
    private int id;
    private String nome;

    public Vaca(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Vaca() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Vaca: " +
                "id=" + id +
                "| nome='" + nome;
    }
}