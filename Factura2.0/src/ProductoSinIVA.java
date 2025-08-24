public class ProductoSinIVA extends Producto {
    public ProductoSinIVA(String nombre, double precio, int inventario) {
        super(nombre, precio, inventario);
    }

    @Override
    public double obtenerIVA() {
        return 0;
    }

}
