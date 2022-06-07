public class Perfume extends Produto{
    private String familiaAromatica;
    private String descricao;
    Perfume(double valor, String linha,String familiaAromatica,String descricao){
        super(linha, valor);
        setFamiliaAromatica(familiaAromatica);
        setDescricao(descricao);
        setCodigo();
    }
    Perfume(){}
    public void setFamiliaAromatica(String familiaAromatica){
        this.familiaAromatica=familiaAromatica;
    }
    public String getFamiliaAromatica(){
        return familiaAromatica;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}

