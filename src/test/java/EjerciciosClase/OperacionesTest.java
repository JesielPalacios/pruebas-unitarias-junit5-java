package EjerciciosClase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacionesTest {
  Operaciones operaciones;

  @BeforeEach
  public void setUp() {
    operaciones = new Operaciones();
  }

  @Test
  public void reciboCincoYTresYObtengoOcho() {
    // Arrange
    // Preparar los datos que se van a enviar para hacer la prueba
    int numeroUno = 5;
    int numeroDos = 3;

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

    // Act
    int resultado;
    resultado = operaciones.suma(numeroUno, numeroDos);

    // Assert
    assertEquals(7, resultado);
  }

  // Sección: "Refactor: Agregar 1."
  @Test
  public void reciboCincoYObtengoSeis() {
    // Arrange
    int numeroUno = 5;

    // Act
    int resultado = operaciones.agregarUno(numeroUno);

    // Assert
    assertEquals(6, resultado);
  }

  @Test
  public void reciboCuatroYObtengoCinco() {
    // Arrange
    int numeroUno = 4;

    // Act
    int resultado = operaciones.agregarUno(numeroUno);

    // Assert
    assertEquals(5, resultado);
  }

  // Sección: "Resta con valor absoluto."
  @Test
  public void reciboCincoYTresObtengoDos() {
    // Arrange
    int numeroUno = 5;
    int numeroDos = 3;

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

    // Act
    int resultado = operaciones.restaValorAbsoluto(numeroUno, numeroDos);

    // Assert
    assertEquals(4, resultado);
  }

  // Sección: "Los panes."
  @Test
  public void reciboDosYCincoObtengoDiez() {
    // Arrange
    int numeroUno = 2;
    int numeroDos = 5;

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

    // Act
    int resultado = operaciones.multiplicacion(numeroUno, numeroDos);

    // Assert
    assertEquals(4, resultado);
  }

  // Sección: "Cuando quiero compartir."
  @Test
  public void reciboSeisYDosObtengoTres() {
    // Arrange
    int numeroUno = 6;
    int numeroDos = 2;

    // Act
    int resultado = operaciones.division(numeroUno, numeroDos);

    // Assert
    assertEquals(3, resultado);
  }

  @Test
  public void reciboDiezYCincoObtengoDos() {
    // Arrange
    int numeroUno = 10;
    int numeroDos = 5;

    // Act
    int resultado = operaciones.division(numeroUno, numeroDos);

    // Assert
    assertEquals(2, resultado);
  }

  @Test
  public void reciboDosYDosObtengoUno() {
    // Arrange
    int numeroUno = 2;
    int numeroDos = 2;

    // Act
    int resultado = operaciones.division(numeroUno, numeroDos);

    // Assert
    assertEquals(1, resultado);
  }

  // Sección: "Teléfono no roto ."
  @Test
  public void reciboholaYObtengohola() {
    // Arrange
    String palabraUno = "uno";

    // Act
    String resultado = operaciones.palabra(palabraUno);

    // Assert
    assertEquals("uno", resultado);
  }

  @Test
  public void reciboBancolombiaYObtengoBancolombia() {
    // Arrange
    String palabraUno = "Bancolombia";

    // Act
    String resultado = operaciones.palabra(palabraUno);

    // Assert
    assertEquals("Bancolombia", resultado);
  }

  // Sección: "Teléfono no roto ."
  @Test
  public void reciboholaYObtengoCuatro() {
    // Arrange
    String palabraUno = "hola";

    // Act
    int resultado = operaciones.longitudPalabra(palabraUno);

    // Assert
    assertEquals(4, resultado);
  }

  @Test
  public void reciboBancolombiaYObtengoOnce() {
    // Arrange
    String palabraUno = "Bancolombia";

    // Act
    int resultado = operaciones.longitudPalabra(palabraUno);

    // Assert
    assertEquals(11, resultado);
  }

}
