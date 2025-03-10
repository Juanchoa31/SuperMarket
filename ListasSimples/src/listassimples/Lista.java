package listassimples;

import javax.swing.JOptionPane;

public class Lista {

    private Nodo cabeza;
    private int tamanio;

    public Lista() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    public boolean ValidarLista() {
        return cabeza == null;
    }

    //1. Registrar producto
    public String insertarNodo(Producto dato) {
        // 1. crear el nodo nuevo
        Nodo nuevo = new Nodo(dato);

        // 2. validar si la lista se encuentra vacia
        if (ValidarLista()) {
            cabeza = nuevo;
        } else {
            nuevo.setEnlace(cabeza);
            cabeza = nuevo;
        }

        tamanio++;
        return "Produto registrado con éxito";
    }

    //2. Mostrar todos los productos
    public void MostrarDatos() {

        if (ValidarLista()) {
            System.out.println("El inventario se encuentra vacío");
        } else {
            Nodo aux = cabeza;
            while (aux != null) {
                System.out.println(aux.getDato());
                aux = aux.getEnlace();
            }
        }
    }

    //3. Mostrar el total en pesos de todos los productos
    public double MostrarValoresProductos() {
        double acumulador = 0;
        if (ValidarLista()) {
            System.out.println("El inventario se encuentra vacío");
        } else {
            Nodo aux = cabeza;
            while (aux != null) {
                acumulador = acumulador + (aux.getDato().getStock() * aux.getDato().getValorUnitario());
                aux = aux.getEnlace();
            }
        }

        return acumulador;
    }

    //4. Mostrar el total en pesos de todos los productos
    public double MostrarValoresProductosEspecificos(String nombreProducto) {
        double acumulador = 0;

        if (ValidarLista()) {
            System.out.println("El inventario se encuentra vacío");
        } else {
            Nodo aux = cabeza;
            while (aux != null) {
                if (aux.getDato().getNombre().equalsIgnoreCase(nombreProducto)) {
                    acumulador += aux.getDato().getStock() * aux.getDato().getValorUnitario();
                }
                aux = aux.getEnlace();
            }
        }
        return acumulador;
    }

    //5. Método para salir
    public void SalirDelPrograma() {
        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
        System.exit(0);
    }
}
