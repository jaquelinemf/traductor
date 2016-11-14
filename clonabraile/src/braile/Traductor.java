package braile;
public class Traductor implements ITraductor{

    private String Mensaje;

    public Traductor(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    @Override
    public void imprimir() {
        System.out.println("El mensaje es: "+Mensaje);
        
    }
    
}
