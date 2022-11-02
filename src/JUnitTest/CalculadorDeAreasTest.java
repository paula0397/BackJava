package JUnitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadorDeAreasTest {

    @Test
    public void calcularAreaCirculo_deberiaCalcularCorrectamente(){
        //DADO
        CalculadorDeAreas sujetoDePrueba = new CalculadorDeAreas();
        double radio = 10;
        String respuestaEsperada = "El area del circulo es de 314.1592653589793 unidades";

        //CUANDO
        String respuesta = sujetoDePrueba.calcularAreaDelCirculo(radio);

        //ENTONCES
        Assertions.assertEquals(respuestaEsperada, respuesta);

    }

    @Test
    public void calcularAreaCuadrado_deberiaCalcularCorrectamente(){

        //DADO
        CalculadorDeAreas sujetoDePrueba = new CalculadorDeAreas();
        double lado = 5;
        String respuestaEsperada = "El area del cuadrado es de 25.0 unidades";

        //CUANDO
        String respuesta = sujetoDePrueba.calcularAreaDelCuadrado(lado);

        //ENTONCES
        Assertions.assertEquals(respuestaEsperada, respuesta);
    }
}
