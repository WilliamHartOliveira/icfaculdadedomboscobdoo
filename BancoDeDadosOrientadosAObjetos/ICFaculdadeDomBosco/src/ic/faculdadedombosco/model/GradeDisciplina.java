/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ic.faculdadedombosco.model;

/**
 *
 * @author Anderson
 */
public class GradeDisciplina {

    String disciplina_gradeDisciplina;
    String curso_gradeDisciplina;
    Recurso recurso_gradeDisciplina;
    Requisitante professor__gradeDisciplina;
    String status_gradeDisciplina;

    public String getCurso_gradeDisciplina() {
        return curso_gradeDisciplina;
    }

    public void setCurso_gradeDisciplina(String curso_gradeDisciplina) {
        this.curso_gradeDisciplina = curso_gradeDisciplina;
    }

    public String getDisciplina_gradeDisciplina() {
        return disciplina_gradeDisciplina;
    }

    public void setDisciplina_gradeDisciplina(String disciplina_gradeDisciplina) {
        this.disciplina_gradeDisciplina = disciplina_gradeDisciplina;
    }

    public Requisitante getProfessor__gradeDisciplina() {
        return professor__gradeDisciplina;
    }

    public void setProfessor__gradeDisciplina(Requisitante professor__gradeDisciplina) {
        this.professor__gradeDisciplina = professor__gradeDisciplina;
    }

    public Recurso getRecurso_gradeDisciplina() {
        return recurso_gradeDisciplina;
    }

    public void setRecurso_gradeDisciplina(Recurso recurso_gradeDisciplina) {
        this.recurso_gradeDisciplina = recurso_gradeDisciplina;
    }

    public String getStatus_gradeDisciplina() {
        return status_gradeDisciplina;
    }

    public void setStatus_gradeDisciplina(String status_gradeDisciplina) {
        this.status_gradeDisciplina = status_gradeDisciplina;
    }

}
