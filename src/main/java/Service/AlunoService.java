import Model.Aluno;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@Autowired

private Repository.AlunoService alunoService;

Aluno novoAluno = alunoService.CriarAluno("João Silva", "12345", "Ciência da Computação");

Aluno alunoEncontrado = alunoService.buscarAlunoPorMatricula("12345");

public void main() {
}

