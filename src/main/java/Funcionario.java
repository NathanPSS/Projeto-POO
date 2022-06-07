public class Funcionario extends Pessoa {
    private String endereco;
    private String cargo;
    Funcionario(String nomeCompleto, String CPF, String cargo,String endereco,String telefone){
        super(nomeCompleto,CPF,telefone);
        setCargo(cargo);
        setCodigo();
        setEndereco(endereco);

    }
    Funcionario(){};

    public String getCargo(){
        return this.cargo;
    }
    public String getEndereco(){
        return this.endereco;
    }



    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public void MostraFuncionario(){
        MostraPessoa();
        System.out.println(this.cargo);
        System.out.println(this.endereco);
        System.out.println(this.codigo);
    }

}
