package Model;

import java.time.LocalDate;

public class Aluno {
    private static int proximoId = 1;

    private int id;
    private String nome;
    private LocalDate dataNascimento;

    public Aluno(String nome, LocalDate dataNascimento) {
        this.id = proximoId++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Model.Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}