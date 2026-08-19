public class Funcionariobiblioteca extends Usuario {
    private String codigoFuncional;
    
    public Funcionariobiblioteca(String nome, int idade, String codigoFuncional){
        super(nome, idade, 10);
        this.codigoFuncional = codigoFuncional;
    }
    
    public String getCodigoFuncional(){
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional){
        this.codigoFuncional = codigoFuncional;
    }
}