public class ProductoAdquirido {
    private Producto producto;
    private final int cantidad;
    private final double importe;

    public ProductoAdquirido(Producto producto, int cantidad) {
        if(!validarCantidad(cantidad)){
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0");
        }
        this.producto = producto;
        this.cantidad = producto.descontarInventario(cantidad);
        importe = producto.obtenerPrecioUnitario() * this.cantidad;

    }

    private boolean validarCantidad(int cantidad) {
        return cantidad >0;
    }

    public double obtenerImporte() {
        return importe;
    }

    public double obtenerIVA() {
        //return (producto instanceof ProductoConIVA)? ((ProductoConIVA)producto).obtenerIVA()*cantidad: 0;
        return producto.obtenerIVA()*cantidad;
    }

    @Override
    public String toString() {
        return "{" +
                 producto +
                ", Cantidad: " + cantidad +
                ", Importe: " + importe +
                '}' + "\n";
    }
}
