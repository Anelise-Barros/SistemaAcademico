
package sistemaacademico;


public class Curso {
    
    private String codCurso;
    private String nomeCurso;
    private int maxCurso; 
    
    public Curso (String codCurso, String nomeCurso, int maxCurso){
        this.codCurso = codCurso;
        this.nomeCurso = nomeCurso;
        this.maxCurso = maxCurso;
    }

    //Getters e Setters
    public String getCodCurso() {
        return codCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getMaxCurso() {
        return maxCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setMaxCurso(int maxCurso) {
        this.maxCurso = maxCurso;
    }
    
    public String toString (){
        String /*retorno = " ";*/
        retorno = "Código do Curso: " + this.codCurso + "\n";
        retorno += "Nome do Curso: " + this.nomeCurso + "\n";
        retorno += "Capacidade máxima de alunos no curso: " + this.maxCurso + "\n";
        return retorno;
    }
}
