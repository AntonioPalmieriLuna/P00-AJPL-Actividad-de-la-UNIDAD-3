package Taller19.Ejercicio1;

public class GestorAutenticacion {
    ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void gestionarAutenticacion(String usuario, String clave) {
        servicioAutenticacion.autenticar(usuario, clave);
    }
}
