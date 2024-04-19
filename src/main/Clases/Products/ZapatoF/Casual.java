package main.Clases.Products.ZapatoF;
import main.Clases.Products.Zapato;

public class Casual extends Zapato{
    //attributes
    private String categoria;

    //  constructos
    public Casual(){
        super();
    }

    public Casual(String nombre, double precio, String color, String marca, double talla, String material, String categoria){
        super(nombre, precio, color, marca, talla, material);
        this.categoria = categoria;
    }

    //  getters
    public String getCategoria(){
        return this.categoria;
    }

    //  setters
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    //  toString methos
    @Override
    public String toString(){
        return 
        super.toString() + 
        "\nCategoria: " + this.categoria;
    }
}