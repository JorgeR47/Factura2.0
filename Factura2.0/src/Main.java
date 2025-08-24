public class Main {
    public static void main(String[] args) {

        //dado un cliente, empresa, producto

        Empresa empresa = new Empresa("IG");
        Cliente carlitos = new Cliente("Carlitos");
        empresa.abastecerProductos(
                new ProductoConIVA15("Mochila", 89.99,  5),
                new ProductoSinIVA("Zapatos", 50.00,  1),
                new ProductoConIVA15("Linterna", 5.56,  3),
                new ProductoSinIVA("Gorra", 3.00,  2),
                new ProductoConIVA12("Gasdas", 2.00, 4)
        );

        //cuando el cliente compra algunos productos
        Factura factura = empresa.facturarProductosACliente(
                carlitos,
                new ProductoAdquirido(empresa.obtenerProducto(1), 1), //359,96
                new ProductoAdquirido(empresa.obtenerProducto(2), 2), //50
                new ProductoAdquirido(empresa.obtenerProducto(4), 1) //3
                );

        //se genera una factura
        System.out.println(factura);  //subtotal: 412.96 - descuento: 80 + iva: 53,99 = 386,95

    }
}