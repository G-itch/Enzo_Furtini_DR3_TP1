package test.java;

import main.java.ScientificCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    private ScientificCalculator calculadora;

    @BeforeEach
    void configurar() {
        // Fase de configuração - criando uma nova instância da calculadora antes de cada teste
        calculadora = new ScientificCalculator();
    }

    @Test
    void testarSoma() {
        // Fase de configuração
        double a = 5.0;
        double b = 3.0;
        double esperado = 8.0;

        // Fase de execução
        double resultado = calculadora.add(a, b);

        // Fase de verificação
        assertEquals(esperado, resultado, 0.0001, "A soma de 5.0 e 3.0 deveria ser 8.0");
    }

    @Test
    void testarSubtracao() {
        // Fase de configuração
        double a = 10.0;
        double b = 4.0;
        double esperado = 6.0;

        // Fase de execução
        double resultado = calculadora.subtract(a, b);

        // Fase de verificação
        assertEquals(esperado, resultado, 0.0001, "A subtração de 10.0 e 4.0 deveria ser 6.0");
    }

    @Test
    void testarRaizQuadradaPositiva() {
        // Teste do caminho feliz para raiz quadrada
        double entrada = 16.0;
        double esperado = 4.0;
        
        double resultado = calculadora.squareRoot(entrada);
        
        assertEquals(esperado, resultado, 0.0001, "A raiz quadrada de 16.0 deveria ser 4.0");
    }

    @Test
    void testarRaizQuadradaNegativa() {
        // Teste de caso de borda para raiz quadrada com número negativo
        double entrada = -4.0;
        
        assertThrows(IllegalArgumentException.class, 
            () -> calculadora.squareRoot(entrada),
            "Raiz quadrada de número negativo deveria lançar IllegalArgumentException");
    }

    @Test
    void testarDivisaoPorZero() {
        // Teste de exceção para divisão por zero
        double a = 10.0;
        double b = 0.0;
        
        assertThrows(IllegalArgumentException.class,
            () -> calculadora.divide(a, b),
            "Divisão por zero deveria lançar IllegalArgumentException");
    }

    @Test
    void testarLogaritmo() {
        // Teste para logaritmo com número positivo
        double entrada = Math.E; // Logaritmo natural de e deveria ser 1
        double esperado = 1.0;
        
        double resultado = calculadora.log(entrada);
        
        assertEquals(esperado, resultado, 0.0001, "Logaritmo natural de e deveria ser 1.0");
    }

    @Test
    void testarSeno() {
        // Teste para função seno
        double entrada = 30.0; // sen(30°) = 0.5
        double esperado = 0.5;
        
        double resultado = calculadora.sin(entrada);
        
        assertEquals(esperado, resultado, 0.0001, "Seno de 30 graus deveria ser 0.5");
    }

    @Test
    void testarCosseno() {
        // Teste para função cosseno
        double entrada = 60.0; // cos(60°) = 0.5
        double esperado = 0.5;
        
        double resultado = calculadora.cos(entrada);
        
        assertEquals(esperado, resultado, 0.0001, "Cosseno de 60 graus deveria ser 0.5");
    }

    @Test
    void testarPotencia() {
        // Teste para função de potência
        double base = 2.0;
        double expoente = 3.0;
        double esperado = 8.0;
        
        double resultado = calculadora.power(base, expoente);
        
        assertEquals(esperado, resultado, 0.0001, "2 elevado a 3 deveria ser 8.0");
    }

    @Test
    void testarMultiplicacao() {
        // Teste para multiplicação
        double a = 6.0;
        double b = 7.0;
        double esperado = 42.0;
        
        double resultado = calculadora.multiply(a, b);
        
        assertEquals(esperado, resultado, 0.0001, "6 multiplicado por 7 deveria ser 42.0");
    }

    @Test
    void testarLogaritmoNumeroNegativo() {
        // Teste para logaritmo com número negativo
        double entrada = -1.0;
        
        assertThrows(IllegalArgumentException.class,
            () -> calculadora.log(entrada),
            "Logaritmo de número negativo deveria lançar IllegalArgumentException");
    }
} 