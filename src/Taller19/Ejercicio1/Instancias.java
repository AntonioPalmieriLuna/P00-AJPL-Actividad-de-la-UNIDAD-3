package Taller19.Ejercicio1;

public class Instancias {
    void main(){
        AutenticacionLocal autenticacionLocal = new AutenticacionLocal();

        GestorAutenticacion gestorAutenticacion = new GestorAutenticacion(autenticacionLocal);
        gestorAutenticacion.gestionarAutenticacion("usuario", "12345");

        AutenticacionOAuth autenticacionOAuth = new AutenticacionOAuth();

        gestorAutenticacion=new GestorAutenticacion(autenticacionOAuth);
        gestorAutenticacion.gestionarAutenticacion("usuario", "12345");
    }
}
