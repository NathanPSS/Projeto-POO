
    public abstract class Pessoa extends codigo implements Pessoainterface{
        protected String nomeCompleto;
        protected String cpf;
        protected String telefone;
        Pessoa(String nomeCompleto,String cpf,String telefone){
            setCPF(cpf);
            setNome(nomeCompleto);
            setTelefone(telefone);
        }
        Pessoa(){}
        @Override
        public String getTelefone(){
            return this.telefone;
        }
        @Override
        public String getCPF(){
            return this.cpf;
        }
        @Override
        public String getNome(){
            return this.nomeCompleto;
        }
        public void setNome(String nomeCompleto){
            this.nomeCompleto=nomeCompleto;
        }
        public void setCPF(String cpf){
            this.cpf=cpf;
        }
        public void setTelefone(String telefone){
            this.telefone=telefone;
        }
        public void MostraPessoa(){
            System.out.println(this.telefone);
            System.out.println(this.cpf);
            System.out.println(this.nomeCompleto);
        }
    }


