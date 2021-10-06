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

    Operaciones operaciones = new Operaciones();

    // Act
    // A dónde voy a ir?
    int resultado;
    resultado = operaciones.Suma(numeroUno, numeroDos);

    // Assert
    // Validar que está bien o mal.
    assertEquals(8, resultado);

    // Toda función debe tener más de una validación, tanto éxito como fallo
    // y validar multiples veces o diferentes casos de uso.
  }

  @Test
  public void reciboCuatroYTresYObtengoSiete() {
    // Arrange  
    int numeroUno = 4;
    int numeroDos = 3;
    Operaciones operaciones = new Operaciones();

    // Act
    int resultado;
    resultado = operaciones.Suma(numeroUno, numeroDos);

    // Assert
    assertEquals(7, resultado);
  }
}
