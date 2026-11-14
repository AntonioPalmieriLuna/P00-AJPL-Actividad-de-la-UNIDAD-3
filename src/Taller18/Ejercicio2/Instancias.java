package Taller18.Ejercicio2;

public class Instancias {
    void main(){
        Retiros cajeros = new Cajeros();
        cajeros.retirar();

        Transferencias web = new Web();
        web.transferir();

        PagosFacturas facturacion = new Facturacion();
        facturacion.pagarFactura();
    }
}
