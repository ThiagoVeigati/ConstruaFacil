package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test(priority = 1)
    public void testarSomarDoisNumeros() {
        /* 1 - Preprara - Configurar - Given */
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

        // 2 - Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoAtual, resultadoEsperado);
    }
    @Test(priority = 2)
    public void testarSubtrairDoisNumeros() {
        /* 1 - Preprara - Configurar - Given */
        int num1 = 8;
        int num2 = 3;
        int resultadoEsperado = 5;

        // 2 - Executar - When
        int resultadoAtual = Calc.subtrairDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoAtual, resultadoEsperado);
    }
    @Test(priority = 3)
    public void testarmultiplicarDoisNumeros() {
        /* 1 - Preprara - Configurar - Given */
        int num1 = 5;
        int num2 = 3;
        int resultadoEsperado = 15;

        // 2 - Executar - When
        int resultadoAtual = Calc.multiplicarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoAtual, resultadoEsperado);
    }
    @Test(priority = 4)
    public void testardividirDoisNumeros() {
        /* 1 - Preprara - Configurar - Given */
        int num1 = 10;
        int num2 = 2;
        int resultadoEsperado = 5;

        // 2 - Executar - When
        int resultadoAtual = Calc.dividirDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoAtual, resultadoEsperado);
    }
}

