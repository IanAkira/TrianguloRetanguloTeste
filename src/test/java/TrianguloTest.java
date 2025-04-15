
import model.Triangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

    @Test
    public void testGetArea() {
        double altura = 3;
        double base = 2;
//Retorno esperado para a altura e base especificada
        double retornoEsperado = 3;
//Instancia um objeto da classe Triangulo
        Triangulo triangulo = new Triangulo(base, altura);
//Chama a operacao getArea()
        double retornoFeito = triangulo.getArea();
//Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
