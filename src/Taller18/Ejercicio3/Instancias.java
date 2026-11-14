package Taller18.Ejercicio3;

public class Instancias {
    void main(){
        Camion camion = new Camion();

        System.out.println("---Camión---");
        camion.conducir();
        camion.cargarMercancia();

        Conduccion tractor = new Tractor();

        System.out.println("\n---Tractor---");
        tractor.conducir();

    }
}
