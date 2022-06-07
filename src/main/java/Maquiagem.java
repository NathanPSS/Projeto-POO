public class Maquiagem extends Produto{
    private String tipoMaquiagem;
    private String cor;
    Maquiagem(double valor, String linha,String cor,String tipoMaquiagem){
        super(linha, valor);
        setCodigo();
        setCor(cor);
        setTipoMaquiagem(tipoMaquiagem);;
    }
    Maquiagem(){}
    public void setTipoMaquiagem(String tipoMaquiagem){
        this.tipoMaquiagem=tipoMaquiagem;
    }
    public String getTipoMaquiagem(){
        return tipoMaquiagem;
    }
    public void setCor(String cor){
        this.cor=cor;
    }
    public String getCor(){
        return cor;
    }
}

