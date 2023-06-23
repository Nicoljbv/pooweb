package figuras;

public class Circulo extends Figura {
    
    //Atributos 
    private double diametro;
    final private double pi=3.1416;

    //Método constructor vacío
    public Circulo() {
    }
    //Método constructor con parámetros 
    public Circulo( double diametro) {
        this.diametro = diametro;
    }

    //Métodos accesores
    public double getDiametro() {
        return diametro;
    }
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    public double getPi() {
        return pi;
    }
    

    //Uso de los métodos abstractos
    @Override
    //Calcular el area
    public double calcularArea(){
        double radio,radio2,area;
        radio=diametro/2;
        radio2=Math.pow(radio, 2);
        area=pi*radio2;
        System.out.println("El radio del circulo es "+radio+" El area es: "+area);
        return area;
    }
    public double calcularPerimetro(){
        double perimetro;
        perimetro=pi*diametro;
        return perimetro;
    }
    
    
     
    

    
}

