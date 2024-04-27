package Repository;

import Model.Aluno;
import java.time.LocalDate;
import java.util.Optional;

public class AlunoRepository<AlunoService> {

    private AlunoRepository alunoRepository;

    public <AlunoRepository> void AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = (Repository.AlunoRepository) alunoRepository;
    }

    public Aluno criarAluno(String nome, LocalDate dataNascimento) {
        // Validações de dados...
        Aluno aluno = new Aluno(nome, dataNascimento);
        return alunoRepository.save(aluno);
    }

    private Aluno save(Aluno aluno) {

        return aluno;
    }

    public Aluno buscarAlunoPorId(int id, Aluno aluno) throws Throwable {
        return (Aluno) alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado: " + id));
    }

    private <T> Optional<Object> findById(long id) {
        return null;
    }

    public Aluno atualizarAluno(Aluno aluno) {
        // Validações de dados...
        return alunoRepository.save(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunoRepository.delete(aluno);
    }

    private void delete(Aluno aluno) {
        int Aluno = 0;
        removerAluno(buscarAlunoPorId(Aluno, aluno));
    }

    public Aluno CriarAluno(String joãoSilva, String number, String ciênciaDaComputação) {
    }
}

public void main() {
}