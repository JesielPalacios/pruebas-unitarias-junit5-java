package EjerciciosClase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacionesTest {

  @Test
  public void reciboCincoYTresYObtengoOcho() {
    // Arrange  
    // Preparar los datos que se van a enviar para hacer la prueba
    int numeroUno = 5;
    int numeroDos = 3;

    // Act
    // A dónde voy a ir?
    int resultado;
    resultado = Operaciones.Suma(numeroUno, numeroDos);

    // Assert
    // Validar que está bien o mal.
    assertEquals(8, resultado);
  }
}
