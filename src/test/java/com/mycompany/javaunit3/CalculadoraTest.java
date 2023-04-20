/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.javaunit3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class CalculadoraTest {
    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(10, Calculadora.sumar(5, 5));
        assertEquals(0, Calculadora.sumar(0, 0));
    }
     @Test
    public void testRestar() {
        Calculadora calculator = new Calculadora();
        int result = calculator.restar(10, 3);
        assertEquals(7, result);
    }
}