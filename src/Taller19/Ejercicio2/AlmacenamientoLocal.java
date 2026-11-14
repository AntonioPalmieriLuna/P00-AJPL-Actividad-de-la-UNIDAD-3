package Taller19.Ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento{
    @Override
    public void guardar() {
        System.out.println("Guardando en LOCAL");
    }
    @Override
    public void recuperar() {
        System.out.println("Recuperando LOCALMENTE");
    }
}
