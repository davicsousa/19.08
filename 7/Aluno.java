public class Aluno extends Pessoa {
    private String curso;
    private double nota1;
    private double nota2;
    
    public Aluno(String nome, int idade, String curso, double nota1, double nota2){
        super(nome, idade);
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public String getCurso(){
        return curso;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    
    public double calcularMedia(){
        return (nota1 + nota2) / 2.0;
    }
    
    
    public void apresentar(){
        super.apresentar();
        System.out.println("Curso: " + curso);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }
}