public class Moto extends Veiculo {
    private String tipoPartida;
    
    public Moto(String marca, String modelo, int ano, String tipoPartida){
        super(marca, modelo, ano);
        this.tipoPartida = tipoPartida;
    }
    
    public String getTipoPartida(){
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida){
        this.tipoPartida = tipoPartida;
    }
    
    public void apresentar(){
        super.apresentar();
        System.out.println("Tipo de Partida: " + tipoPartida);
    }
}