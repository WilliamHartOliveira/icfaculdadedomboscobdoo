
package ic.faculdadedombosco.model;

/**
 *
 * @author Anderson
 */
public class GradeDisciplina {

    private String disciplina_gradeDisciplina;
    private String curso_gradeDisciplina;
    private Recurso recurso__gradeDisciplina;
    private Requisitante professor_gradeDisciplina;
    private String status_gradeDisciplina;

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

    public Requisitante getProfessor_gradeDisciplina() {
        return this.professor_gradeDisciplina;
    }

    public void setProfessor_gradeDisciplina(Requisitante professor__gradeDisciplina) {
        this.professor_gradeDisciplina = professor__gradeDisciplina;
    }

    public Recurso getRecurso__gradeDisciplina() {
        return this.recurso__gradeDisciplina;
    }

    public void setRecurso__gradeDisciplina(Recurso recurso_gradeDisciplina) {
        this.recurso__gradeDisciplina = recurso_gradeDisciplina;
    }

    public String getStatus_gradeDisciplina() {
        return status_gradeDisciplina;
    }

    public void setStatus_gradeDisciplina(String status_gradeDisciplina) {
        this.status_gradeDisciplina = status_gradeDisciplina;
    }

}
