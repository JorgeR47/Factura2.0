public class Empresa {
    private final String nombre;
    private Producto[] productos;
    private int numeroDeFactura;
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.numeroDeFactura = 23;
    }

    public void abastecerProductos(Producto... productos) {
        this.productos = productos;
    }

    public Producto obtenerProducto(int codigoProducto) {
        if(!validarCodigoProducto(codigoProducto)){
            throw new IllegalArgumentException("Codigo de producto no valido");
        }
        return productos[codigoProducto-1];
    }

    private boolean validarCodigoProducto(int codigoProducto) {
        return codigoProducto >  0 && codigoProducto <= productos.length;
    }

    public Factura facturarProductosACliente(Cliente carlitos, ProductoAdquirido... productoAdquirido) {
        Factura factura = new Factura(numeroDeFactura++,
                new Fecha(12, 1, 2024),
                carlitos,
                this.nombre,
                productoAdquirido
        );
        return factura;
    }
}
