public class ProdutoCorporal extends Produto{
    private String tipoProdutoCorporal;
    private String fragrancia;
    ProdutoCorporal(double valor, String linha,String tipoProdutoCorporal,String fragancia){
        super(linha, valor);
        setCodigo();
        setFragancia(fragancia);
        setTipoProdutoCorporal(tipoProdutoCorporal);
    }
    ProdutoCorporal(){}
    public void setFragancia(String fragancia){
        this.fragrancia=fragancia;
    }
    public String getFrangancia(){
        return fragrancia;
    }
    public void setTipoProdutoCorporal(String tipoProdutoCorporal){
        this.tipoProdutoCorporal=tipoProdutoCorporal;
    }
    public String getTipoProdutoCorporal(){
        return tipoProdutoCorporal;
    }
}

