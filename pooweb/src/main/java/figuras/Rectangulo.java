package figuras;

public class Rectangulo extends Figura{

    //Atributos 
    private double base;
    private double altura;


    
    //Método contructor vacío
    public Rectangulo() {
    }
    //Método constructor con parámetros 
    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
    
    //Métodos accesores
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
     
    public double calcularPerimetro(){
        double perimetro;
        perimetro=((2*altura)+(2*base));
        return perimetro;
    }

    //Uso de los métodos contructores
    //Calcular el area
    @Override
    public double calcularArea(){
        double area;
        area=base*altura;
        System.out.println("La base del rectangulo es: "+base+" La altura del rectangulo es: "+altura+" El area es: "+area);
        return area;
    }


    
    
    
}

