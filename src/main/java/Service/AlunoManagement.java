package Service;

import Model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;


public class AlunoManagement {

    private final Aluno alunoService;

    @Autowired
    public AlunoManagement(Aluno alunoService) {
        this.alunoService = alunoService;
    }

    public Aluno createAluno(String nome, String matricula, String curso) {
        return alunoService;
    }

    public Aluno findAlunoByMatricula(String matricula) {
        return alunoService.buscarAlunoPorMatricula(matricula);
    }

    // Example usage (assuming this is a Spring Boot application)
    public static void main(String[] args) {
        // Spring Boot application context will handle bean creation and injection
    }
}

