package Taller19.Ejercicio2;

public class GestorArchivos {
    Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    public void gestionarAlmacenamiento(){
        almacenamiento.guardar();
        almacenamiento.recuperar();
    }
}
