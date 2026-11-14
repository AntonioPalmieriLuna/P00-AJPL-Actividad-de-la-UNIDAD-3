package Taller18.Ejercicio3;

public class Camion implements LlenarMercancia, Conduccion {

    @Override
    public void conducir() {
        System.out.println("Conduciendo");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancia");
    }
}
