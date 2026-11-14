package Taller19.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion{
    @Override
    public void autenticar(String usuario, String clave) {
        System.out.println("Autenticando OAuth al usuario: "+usuario+" con la clave: "+clave);
    }
}
