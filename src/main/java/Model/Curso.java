package Model;

public class Curso {
    private static int proximoId = 1;

    private int id;
    private String nome;
    private String descricao;
    private int cargaHoraria;

    public Curso(String nome, String descricao, int cargaHoraria) {
        this.id = proximoId++;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    // Método estático para controlar a sequência dos IDs
    public static int proximoId() {
        return proximoId;
    }

    // Construtor sem ID, para uso em casos onde o ID é recuperado de alguma fonte externa
    public Curso(int id, String nome, String descricao, int cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        proximoId = Math.max(proximoId, id + 1);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Método para converter para String
    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public void setNome(String nome) {
    }

    public void setDescricao(String descricao) {
    }

    public void setCargaHoraria(int cargaHoraria) {
    }
}