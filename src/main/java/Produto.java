public abstract class Produto extends codigo{
    protected int quantidadeEmEstoque=0;
    protected double valor;
    protected String linha;
    protected String armazenamentoDoProduto;

    Produto(){}
    Produto(String linha, double valor){
        setCodigo();
        setLinha(linha);
        setValor(valor);
    }
    public Double getValor(){
        return this.valor;
    }
    public String getLinha(){
        return this.linha;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public void setLinha(String linha){
        this.linha=linha;
    }
    public void setTipo(String linha){
        this.linha=linha;
    }
    public void VendeProdutos(int quantidade){
        this.quantidadeEmEstoque-=quantidade;
    }
    public void AbasteceProdutos(int quantidade){
        this.quantidadeEmEstoque+=quantidade;
    }
    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    }
    public String getArmazenamentoDoProduto(){
        return armazenamentoDoProduto;
    }
    public void setArmazenamentoDoProduto(String armazenamentoDoProduto){
        this.armazenamentoDoProduto=armazenamentoDoProduto;
    }
    public void MostraProdutos(){
        System.out.println(" ");
        System.out.println(this.linha);
        System.out.println(this.valor);
        System.out.println(this.codigo);

    }

}
