package JUnitTest;

public class CalculadorDeAreas {

    public String calcularAreaDelCirculo(Double radio){
        double area = (radio * radio) * Math.PI;
        return "El area del circulo es de " + area + " unidades";
    }

    public String calcularAreaDelCuadrado(Double longitudLado){
        double area = longitudLado * longitudLado;
        return "El area del cuadrado es de " + area + " unidades";
    }
}
