public class Professor extends Usuario {
    private String departamento;
    
    public Professor(String nome, int idade, String departamento){
        super(nome, idade, 5);
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}