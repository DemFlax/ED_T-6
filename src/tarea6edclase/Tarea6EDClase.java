package tarea6edclase;

public class Tarea6EDClase {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        int unidadesProductos = 3;
        if (numProductos > unidadesProductos) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * 0.8;
            totalPrecioMasEnvio(total);
        } else {
            total = precioProducto * 0.95;
            totalPrecioMasEnvio(total);
        }
    }

    private void totalPrecioMasEnvio(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
