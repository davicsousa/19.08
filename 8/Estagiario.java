public class Estagiario extends Funcionario {
    private String faculdade;
    private int horasCargaHoraria;
    
    public Estagiario(String nome, double salarioBase, String faculdade, int horasCargaHoraria){
        super(nome, salarioBase);
        this.faculdade = faculdade;
        this.horasCargaHoraria = horasCargaHoraria;
    }
    
    public String getFaculdade(){
        return faculdade;
    }
    public int getHorasCargaHoraria(){
        return horasCargaHoraria;
    }

    public void setFaculdade(String faculdade){
        this.faculdade = faculdade;
    }
    public void setHorasCargaHoraria(int horasCargaHoraria){
        this.horasCargaHoraria = horasCargaHoraria;
    }
    
   
    public double calcularSalario(){
        double auxilioTransporte = 200.00;
        return salarioBase + auxilioTransporte;
    }
    
   
    public void apresentar(){
        super.apresentar();
        System.out.println("Faculdade: " + faculdade);
        System.out.println("Carga Horaria Semanal: " + horasCargaHoraria + "h");
    }
}