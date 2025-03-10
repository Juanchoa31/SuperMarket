package listassimples;

public class ListasSimples {

    public static void main(String[] args) {
        Lista lista = new Lista();
        int opc;
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Registrar un producto\n"
                    + "2. Mostrar todos los productos\n"
                    + "3. Mostrar el total en $ de todos los productos\n"
                    + "4. Mostrar el total en $ de un producto especifico\n"
                    + "5. Salir\nSeleccionar una opción"));
        
            switch (opc){
                case 1:
                    String code = JOptionPane.showInputDialog("Ingrese el codigo del producto:");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
                    double valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor unitario del producto:"));
                    int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto:"));
                    
                    Producto producto = new Producto(code, nombre, stock, valorUnitario);
                    JOptionPane.showMessageDialog(null, lista.insertarNodo(producto));
                    
                    break;
                
                case 2:
                    lista.MostrarDatos();
                    break;
                   
                case 3:
                    double total = lista.MostrarValoresProductos();
                    JOptionPane.showMessageDialog(null, "El total en $ de todos los productos es: " + total);
                    break;
                 
                case 4:
                    String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto a consultar:");
                    double totalEspecifico = lista.MostrarValoresProductosEspecificos(nombreProducto);
                    JOptionPane.showMessageDialog(null, "El total en $ de " + nombreProducto + " es: " + totalEspecifico);
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, intente nuevamente.");
            }    
        }while (opc != 5);
    }
}
