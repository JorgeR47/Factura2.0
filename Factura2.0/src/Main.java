public class Main {
    public static void main(String[] args) {

        //dado un cliente, empresa, producto

        Empresa empresa = new Empresa("IG");
        Cliente carlitos = new Cliente("Carlitos");
        empresa.abastecerProductos(
                new ProductoConIVA15("HP Laptop", 599.99,  5),
                new ProductoSinIVA("Notebook X10", 150.00,  1),
                new ProductoConIVA15("Mouse ", 25.56,  3),
                new ProductoSinIVA("DELL Laptop", 300.00,  2),
                new ProductoConIVA12("ASUS Laptop", 200.00, 4)
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