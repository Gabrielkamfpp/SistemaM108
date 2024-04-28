package Controller;

import Model.Aluno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlunoController {

    private List<Aluno> alunos;

    public AlunoController() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(String nome, LocalDate dataNascimento) {
        Aluno aluno = new Aluno(nome, dataNascimento);
        alunos.add(aluno);
    }

    public void removerAluno(int id) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                alunoParaRemover = aluno;
                break;
            }
        }
        if (alunoParaRemover != null) {
            alunos.remove(alunoParaRemover);
        }
    }

    public Aluno buscarAlunoPorId(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }
}