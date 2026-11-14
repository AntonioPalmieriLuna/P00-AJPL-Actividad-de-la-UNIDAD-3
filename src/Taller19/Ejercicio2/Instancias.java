package Taller19.Ejercicio2;

public class Instancias {
    void main(){
        Almacenamiento local = new AlmacenamientoLocal();
        Almacenamiento nube = new AlmacenamientoNube();

        GestorArchivos gestor = new GestorArchivos(local);
        gestor.gestionarAlmacenamiento();

        gestor = new GestorArchivos(nube);
        gestor.gestionarAlmacenamiento();
    }
}
