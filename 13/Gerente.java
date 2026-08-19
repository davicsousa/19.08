public class Gerente extends Funcionario {
    private double bonusGestao;
    
    public Gerente(String nome, double salarioBase, double bonusGestao){
        super(nome, salarioBase);
        this.bonusGestao = bonusGestao;
    }
    
    public double getBonusGestao(){
        return bonusGestao;
    }

    public void setBonusGestao(double bonusGestao){
        this.bonusGestao = bonusGestao;
    }
    
   
    public double calcularBonus(){
        return bonusGestao;
    }
}