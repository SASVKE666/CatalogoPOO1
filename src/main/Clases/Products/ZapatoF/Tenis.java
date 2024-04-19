package main.Clases.Products.ZapatoF;
import main.Clases.Products.Zapato;

public class Tenis extends Zapato{
    //  attribute
    private String deporte;

    //  constructors
    public Tenis (){
        super();
    }

    public Tenis(String nombre, double precio,  String color, String marca, double talla, String material, String deporte){
        super(nombre, precio, color, marca, talla, material);
        this.deporte = deporte;
    }

    //  getters
    public String getDeporte(){
        return this.deporte;
    }

    //  setters 
    public void setDeporte(String deporte){
        this.deporte = deporte;
    }

    //  toString method
    @Override
    public String toString(){
        return 
        super.toString() + 
        "\nDeporte :" + this.deporte;
    }
}