package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test
    public void testarSomarDoisNumeros() {
        /* 1 - Preprara - Configurar - Given */
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

        // 2 - Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
    @Test
    public void testarSubtrairDoisNumeros() {
        /* 1 - Preprara - Configurar - Given */
        int num1 = 8;
        int num2 = 3;
        int resultadoEsperado = 5;

        // 2 - Executar - When
        int resultadoAtual = Calc.subtrairDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("O resultado esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

}
