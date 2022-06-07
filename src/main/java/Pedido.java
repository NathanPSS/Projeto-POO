public class Pedido extends codigo{
    private String codigosDoProduto;
    private String CPF;

    Pedido(String CPF,String codigosDoProduto){
        setCliente(CPF);
        setCodigo();
        setCodigoDoProduto(codigosDoProduto);

    }
    Pedido(){}
    public void setCliente(String CPF){
        this.CPF=CPF;
    }
    public void setCodigoDoProduto(String codigosDoProduto){
        this.codigosDoProduto=codigosDoProduto;
    }
    public String getCPF(){
        return CPF;
    }
    public String getCodigoDoProduto(){
        return codigosDoProduto;
    }
}

