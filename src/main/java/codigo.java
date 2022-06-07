import java.lang.Math;
public abstract class codigo {
    protected String codigo;
    public String getCodigo(){
        return this.codigo;
    }
    public boolean averiguaCodigo(String codigo){
        if(codigo==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void setCodigo(){
        if(averiguaCodigo(codigo)){
            this.codigo=Integer.toString((int)(Math.random()*100000+100000));

        }
    }

    public void mostraCodigo(){
        System.out.println(this.codigo);
    }
}

