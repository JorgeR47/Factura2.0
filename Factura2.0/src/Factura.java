import java.util.Arrays;

public class Factura {
    private final int numero;
    private final Fecha fecha;
    private final Cliente cliente;
    private final String nombreEmpresa;
    private final ProductoAdquirido[] productoAdquirido;
    private final double descuento;
    private double iva;
    private final double total;
    private double subtotal;

    public Factura(int numero, Fecha fecha, Cliente cliente, String nombreEmpresa, ProductoAdquirido[] productoAdquirido) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.nombreEmpresa = nombreEmpresa;
        this.productoAdquirido = productoAdquirido;
        calcularSubtotalEIva();
        descuento = calcularDescuento();
        total = subtotal - descuento + iva;
    }

    private double calcularDescuento() {
        return (int) (subtotal / 100) * 20;
    }

    private void calcularSubtotalEIva() {

        for (ProductoAdquirido adq : productoAdquirido) {
            subtotal += adq.obtenerImporte();
            iva += adq.obtenerIVA();
        }

    }

    @Override
    public String toString() {
        return "Factura" + " |" +"\n" +
                "N°:" + numero +  "| " +
                "Fecha: " + fecha + " | " +
                "Cliente: " + cliente + " | " +
                "Empresa: '" + nombreEmpresa + '\'' + "\n" +
                "Productos: " + "\n" + Arrays.toString(productoAdquirido) + "\n" +
                "Subtotal: " + subtotal + "\n" +
                "Descuento: " + descuento + "\n" +
                "IVA: " + iva + "\n" +
                "Total: " + total + "\n";
    }
}
