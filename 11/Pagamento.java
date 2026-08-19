public abstract class Pagamento {
    protected double valor;
    protected String data;
    protected String descricao;
    
    public Pagamento(double valor, String data, String descricao){
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }
    
    public double getValor(){
        return valor;
    }
    public String getData(){
        return data;
    }
    public String getDescricao(){
        return descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public abstract void processarPagamento();
}