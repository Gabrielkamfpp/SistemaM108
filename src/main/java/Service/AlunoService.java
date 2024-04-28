package Controller;

import Model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import Repository.AlunoService;

public class AlunoManagement {

    private final AlunoService alunoService;

    @Autowired
    public AlunoManagement(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public Aluno createAluno(String nome, String matricula, String curso) {
        return alunoService.criarAluno(nome, matricula, curso);
    }

    public Aluno findAlunoByMatricula(String matricula) {
        return alunoService.buscarAlunoPorMatricula(matricula);
    }

    // Example usage (assuming this is a Spring Boot application)
    public static void main(String[] args) {
        // Spring Boot application context will handle bean creation and injection
    }
}

