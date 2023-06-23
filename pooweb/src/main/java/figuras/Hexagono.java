package figuras;

public class Hexagono extends Figura {
    //Atributos
    private double lado;

    //Método constructor vacío 
    public Hexagono(){

    }
    //Método constructor con parámetros 
    public Hexagono(double lado) {
        this.lado = lado;
    }
    

    //Métodos accesores
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    //Uso de los métodos abstractos 
    public double calcularArea(){
        double area, apotema,perimetro;
        perimetro=6*lado;
        apotema=Math.tan(Math.toDegrees(30))*(lado/2);
        area=(perimetro*apotema)/2;
        System.out.println("El perimetro del hexagono es: "+perimetro+" El apotema del hexagono es: "+apotema+" El area es: "+area);
        return area;

    }

    public double calcularPerimetro(){
        double perimetro;
        perimetro=6*lado;
        return perimetro;
    }
    
    
}

