package main.Clases.Products.CamisaF;
import main.Clases.Products.Camisa;

public class Ella extends Camisa{

    //  attributes
    private String estilo;

    //constructos
    public Ella(){
        super();
    }

    public Ella(String nombre, double precio,  String color, String marca, String talla, String tela, String estilo){
        super(nombre, precio, color, marca, talla, tela);
        this.estilo = estilo;
    }

    //  getters
    public String getEstilo(){
        return this.estilo;
    }

    //  setters
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }

    //  toString method
    @Override
    public String toString(){
        return 
        super.toString() + 
        "\nEstilo: " + this.estilo;
    }
}
