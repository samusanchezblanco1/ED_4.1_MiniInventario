import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("MiniInventario iniciado correctamente.");
        System.out.println("Mejora del main para inventario");
    }
    public static void buscarProducto(ArrayList<String> productos, String nombreBuscado) {
        boolean encontrado = false;
        for (String producto : productos) {
            if (producto.equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Producto encontrado en el inventario.");
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }
}
