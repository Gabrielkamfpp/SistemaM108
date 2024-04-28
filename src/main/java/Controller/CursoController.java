package Controller;

import Model.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoController {

    private List<Curso> cursos;

    public CursoController() {
        cursos = new ArrayList<>();
    }

    // Add a new course
    public void adicionarCurso(String nome, String descricao, int cargaHoraria) {
        Curso curso = new Curso(nome, descricao, cargaHoraria);
        cursos.add(curso);
    }

    // Remove a course by ID
    public void removerCurso(int id) {
        cursos.removeIf(curso -> curso.getId() == id);
    }

    // Find a course by ID
    public Curso buscarCursoPorId(int id) {
        for (Curso curso : cursos) {
            if (curso.getId() == id) {
                return curso;
            }
        }
        return null; // Return null if course not found
    }

    // Get all courses
    public List<Curso> getTodosCursos() {
        return new ArrayList<>(cursos); // Return a copy to avoid external modification
    }

    // Update a course (assuming you have setters in the Curso class)
    public void atualizarCurso(int id, String nome, String descricao, int cargaHoraria) {
        Curso curso = buscarCursoPorId(id);
        if (curso != null) {
            curso.setNome(nome);
            curso.setDescricao(descricao);
            curso.setCargaHoraria(cargaHoraria);
        }
    }
}