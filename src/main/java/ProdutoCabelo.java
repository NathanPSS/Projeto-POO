public class ProdutoCabelo extends Produto{
    private String tipoProdutoCapilar;

    ProdutoCabelo(double valor, String linha,String tipoProdutoCapilar){
        super(linha, valor);
        setCodigo();
        setTipoProdutoCapilar(tipoProdutoCapilar);
    }
    ProdutoCabelo(){}
    public String getTipoProdutoCapilar(){
        return tipoProdutoCapilar;
    }
    public void setTipoProdutoCapilar(String tipoProdutoCapilar){
        this.tipoProdutoCapilar=tipoProdutoCapilar;
    }
}
