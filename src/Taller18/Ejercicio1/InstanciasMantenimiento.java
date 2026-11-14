package Taller18.Ejercicio1;

public class InstanciasMantenimiento {
    void main(){
        Limpieza limpieza = new MantenimientoLimpieza();
        limpieza.limpiar();

        Reparaciones reparacion = new MantenimientoReparacion();
        reparacion.reparar();
    }
}
