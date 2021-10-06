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

    // Act - Action
    // A dónde voy a ir?
    int resultado;
    resultado = operaciones.suma(numeroUno, numeroDos);

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
    resultado = operaciones.suma(numeroUno, numeroDos);

    // Assert
    assertEquals(7, resultado);
  }

  @Test
  public void reciboCincoYObtengoSeis() {
    // Arrange
    int numeroUno = 5;
    Operaciones operaciones = new Operaciones();

    // Act
    int resultado = operaciones.agregarUno(numeroUno);

    // Assert
    assertEquals(6, resultado);
  }

  @Test
  public void reciboCuatroYObtengoCinco() {
    // Arrange
    int numeroUno = 4;
    Operaciones operaciones = new Operaciones();

    // Act
    int resultado = operaciones.agregarUno(numeroUno);

    // Assert
    assertEquals(5, resultado);
  }

  @Test
  public void reciboCincoYTresObtengoDos() {
    // Arrange
    int numeroUno = 5;
    int numeroDos = 3;
    Operaciones operaciones = new Operaciones();

    // Act
    int resultado = operaciones.restaValorAbsoluto(numeroUno, numeroDos);

    // Assert
    assertEquals(2, resultado);
  }

  @Test
  public void reciboCuatroYOchoYObtengoCuatro() {
    // Arrange
    int numeroUno = 4;
    int numeroDos = 8;
    Operaciones operaciones = new Operaciones();

    // Act
    int resultado = operaciones.restaValorAbsoluto(numeroUno, numeroDos);

    // Assert
    assertEquals(4, resultado);
  }

  @Test
  public void reciboDosYCincoObtengoDiez() {
    // Arrange
    int numeroUno = 2;
    int numeroDos = 5;
    Operaciones operaciones = new Operaciones();

    // Act
    int resultado = operaciones.multiplicacion(numeroUno, numeroDos);

    // Assert
    assertEquals(10, resultado);
  }

  @Test
  public void reciboSieteYTresObtengoVeintiuno() {
    // Arrange
    int numeroUno = 7;
    int numeroDos = 3;
    Operaciones operaciones = new Operaciones();

    // Act
    int resultado = operaciones.multiplicacion(numeroUno, numeroDos);

    // Assert
    assertEquals(21, resultado);
  }

  @Test
  public void reciboDosYDosObtengoCuatro() {
    // Arrange
    int numeroUno = 2;
    int numeroDos = 2;
    Operaciones operaciones = new Operaciones();

    // Act
    int resultado = operaciones.multiplicacion(numeroUno, numeroDos);

    // Assert
    assertEquals(4, resultado);
  }

}
