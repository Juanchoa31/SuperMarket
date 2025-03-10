package listassimples;

public class Producto {

    private String code, nombre;
    private int stock;
    private double valorUnitario;

    public Producto(String code, String nombre, int stock, double valorUnitario) {
        this.code = code;
        this.nombre = nombre;
        this.stock = stock;
        this.valorUnitario = valorUnitario;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Producto" + " Código = " + code + ", Nombre = " + nombre + ", Stock = " + stock + ", Valor unitario = " + valorUnitario;
    }
}
