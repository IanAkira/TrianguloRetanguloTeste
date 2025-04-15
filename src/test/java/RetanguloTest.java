/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import model.Retangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RetanguloTest {

    @Test
    public void testgetArea() {
        double altura = 3;
        double base = 2;
//Retorno esperado para a altura e base especificada
        double retornoEsperado = 6;
//Instancia um objeto da classe Triangulo
        Retangulo retangulo = new Retangulo(base, altura);
//Chama a operacao getArea()
        double retornoFeito = retangulo.getArea();
//Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
