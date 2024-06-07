package main.Clases;

public class Producto {
    //  atributos
    private String nombre;
    private double precio;
    private int codigo;
    private String color;
    private String marca;
    private static int serie = 100;
    private double venta;
    private int cant;

    //  contructores
    public Producto(){
        this.codigo = ++Producto.serie;  
    }

    public Producto(int codigo){

        this.codigo = codigo;

    }


    public Producto(String nombre, double precio, String color, String marca, double venta, int cant) {
        this.codigo = ++ Producto.serie;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.color = color;
        this.venta = venta;
        this.cant = cant;
    }
    
    //  getters
    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getColor(){
        return this.color;
    }

    public String getMarca(){
        return this.marca;
    }
    
    //  setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    //  toString() method
    @Override
    public String toString(){
        return 
        /* "Serie: " + serie + */
        "\nNombre: " + this.nombre +
        "\nPrecio: " + this.color + 
        "\nCodigo: " + this.getCodigo() + 
        "\nColor: " + this.color +
        "\nMarca: " + this.marca + 
        "\nVenta: " + this.venta + 
        "\nCantidad: " +this.cant;
    }

    //  method equals()
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        // if objs have the same serie in me memory return true
        if (this == obj){
            return true;
        }
        
        if (obj.getClass() != this.getClass()) {
            return false;   
        }
        
        //  aux obj to compare
        Producto aux = (Producto) obj;
        //  if the object "codigo" are the same, return true
        return this.getCodigo() == aux.getCodigo();
  
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getSerie() {
        return serie;
    }

    public static void setSerie(int serie) {
        Producto.serie = serie;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }




}
