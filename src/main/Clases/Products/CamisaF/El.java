package main.Clases.Products.CamisaF;
import main.Clases.Products.Camisa;

public class El extends Camisa{
    //  attributes
    private String tipo;

    //  constructors
    public El (){
        super();
    }

    public El(String nombre, double precio,  String color, String marca, String talla, String tela, String tipo){
        super(nombre, precio, color, marca, talla, tela);
        this.tipo = tipo;
    }

    //  getters
    public String getTipo(){
        return this.tipo;
    }

    //setters
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    //toString method
    @Override
    public String toString(){
        return 
        super.toString() + 
        "\nTipo: " + this.tipo;
    }
}
