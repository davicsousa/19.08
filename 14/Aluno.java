public class Aluno extends Usuario {
    private String matricula;
    
    public Aluno(String nome, int idade, String matricula){
        super(nome, idade, 3);
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}