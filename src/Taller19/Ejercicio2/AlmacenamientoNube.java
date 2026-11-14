package Taller19.Ejercicio2;

public class AlmacenamientoNube implements Almacenamiento{
    @Override
    public void guardar() {
        System.out.println("Guardando en la NUBE");
    }
    @Override
    public void recuperar() {
        System.out.println("Recuperando de la NUBE");
    }
}
