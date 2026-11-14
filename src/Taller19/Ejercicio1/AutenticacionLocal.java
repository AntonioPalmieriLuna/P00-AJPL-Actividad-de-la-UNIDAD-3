package Taller19.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion{
    @Override
    public void autenticar(String usuario, String clave) {
        System.out.println("Autenticando Localmente al usuario: "+usuario+" la clave: "+clave);
    }
}
