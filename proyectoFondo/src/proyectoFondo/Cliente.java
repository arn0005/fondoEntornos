package proyectoFondo;

public class Cliente {

    String nombre;
    boolean atendido;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.atendido = false;
    }

    public void atender() {
        if (!this.atendido) {
            this.atendido = true;
            System.out.println("El cliente esta siendo atendido");
        } else {
            System.out.println("El cliente ya esta atendido");
        }
    }

    public void abandonar() {
        if (this.atendido) {
            this.atendido = false;
            System.out.println("El cliente ha abandonado la cola");
        } else {
            System.out.println("El cliente no se encuentra en la cola");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre;
    }

}
