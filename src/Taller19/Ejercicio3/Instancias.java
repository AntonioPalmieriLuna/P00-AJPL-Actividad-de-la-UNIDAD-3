package Taller19.Ejercicio3;

public class Instancias {
    void main(){
        GeneradorReporte Excel = new ReporteExcel();
        GeneradorReporte PDF = new ReportePDF();

        GestorReportes gestor = new GestorReportes(Excel);
        gestor.gestionarReporte();

        gestor = new GestorReportes(PDF);
        gestor.gestionarReporte();
    }
}
