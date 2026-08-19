public class Professor extends Pessoa {
    private String departamento;
    
    public Professor(String nome, int idade, String departamento){
        super(nome, idade);
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
  
    public void apresentar(){
        super.apresentar();
        System.out.println("Departamento: " + departamento);
    }
}