package main.Clases.Products;

import main.Clases.Producto;

public class Zapato extends Producto{
    //  atributos
    private String material;
    private double talla;

    //  constructors
    public Zapato(){ 
        super(); 
    }

    public Zapato(int codigo){
        super(codigo);
    }

    

    public Zapato(String nombre, double precio, String color, String marca, double venta, int cant,
     double talla, String material) {
        super(nombre, precio, color, marca, venta, cant);
        this.material = material;
        this.talla = talla;
    }

    //  getters
    public double getTalla(){
        return this.talla;
    }

    public String getMaterial(){
        return this.material;
    }

    //  setters
    public void setTalla(double talla){
        this.talla = talla;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    //  toString method
    @Override
    public String toString(){
        return 
        super.toString() + 
        "\nTalla: " + this.talla + 
        "\nMaterial: " + this.material;
    }


}
