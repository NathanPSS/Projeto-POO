public class Contratos extends codigo{
    private double valor;
    private String nomeEmpresa;
    private String nomePessoaIntermediaria;
    private String produtoOuServico;
    Contratos(double valor, String nomeEmpresa, int codigo,String nomePessoaIntermediaria,String produtoOuServico){
        setCodigo();
        setNomeEmpresa(nomeEmpresa);
        setNomePessoaIntermediaria(nomePessoaIntermediaria);
        setProdutoOuServico(produtoOuServico);
    }
    Contratos(){}
    public void setValor(double valor){
        this.valor=valor;
    }
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa=nomeEmpresa;
    }
    public void setNomePessoaIntermediaria(String nomePessoaIntermediaria){
        this.nomePessoaIntermediaria=nomePessoaIntermediaria;
    }
    public void setProdutoOuServico(String produtoOuServico){
        this.produtoOuServico=produtoOuServico;
    }
    public double getValor(){
        return valor;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public String getProdutoOuServico() {
        return produtoOuServico;
    }
    public String getNomePessoaIntermediaria() {
        return nomePessoaIntermediaria;
    }
}
