public class Fornecedores {
    private int cnpj;
    private String ceo;
    private String nomeEmpresa;

    public Fornecedores(int cnpj,String ceo,String nomeEmpresa){
        setCNPJ(cnpj);
        setCEO(ceo);
        setNomeEmpresa(nomeEmpresa);
    }
    public Fornecedores(){}
    public void setCNPJ(int cnpj){
        this.cnpj=cnpj;
    }
    public int getCNPJ(){
        return cnpj;
    }
    public void setCEO(String ceo){
        this.ceo=ceo;
    }
    public String getCEO(){
        return ceo;
    }
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa=nomeEmpresa;
    }
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }
}
