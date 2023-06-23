package figuras;

public class Triangulo extends Figura {
    //Atributos
    private double baseTA;
    private double alturaTA;
    //Método constructor vacío
    public Triangulo() {
    }
    //Método constructor con parámetros
     public Triangulo(double base, double altura) {
        this.baseTA = base;
        this.alturaTA = altura;
    }
  
    //Métodos accesores
    public double getBase() {
        return baseTA;
    }

    public void setBase(int base) {
        this.baseTA = base;
    }

    public double getAltura() {
        return alturaTA;
    }

    public void setAltura(int altura) {
        this.alturaTA = altura;
    } 

    //Uso de los métodos abstractos
    //Calcular el area
    @Override
    public double calcularArea(){
        double area;
        area=(baseTA*alturaTA)/2;
        // System.out.println("La base del triangulo es "+base+" La altura es: "+altura+" El area es: "+area);
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro, lado3,suma;
        suma=(Math. pow(baseTA, 2) + Math. pow(alturaTA, 2));
        lado3=Math.sqrt(suma);
        perimetro=baseTA+alturaTA+lado3;
        return perimetro;
    }
}
