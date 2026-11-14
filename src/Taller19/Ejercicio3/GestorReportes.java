package Taller19.Ejercicio3;

public class GestorReportes {
    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador){
        this.generador = generador;
    }

    public void gestionarReporte(){
        generador.generarReporte();
    }
}
