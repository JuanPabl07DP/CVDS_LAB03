package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    /**
     * Mediante esta prueba verificamos que la clase CalculadorDescuentos no maneja Excepciones. Por ende , esta prueba falla.
     */
    @Test
    public void validateInvalidParameters(){
        try {
            double tarifa = CalculadorDescuentos.calculoTarifa(-6, -4, -1);
            Assert.assertTrue(false);
        } catch (Exception e){
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validateDiscountForBeYoung(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 16, 14);
        Assert.assertTrue(950000==tarifa);
    }
    @Test
    public void validateDiscountForBeYoungAndAnticipatedDays(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 30, 12);
        Assert.assertTrue(800000==tarifa);
    }
    @Test
    public void validateThatHasNoDiscountForBeingAnAdult(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 5, 34);
        Assert.assertTrue(1000000==tarifa);
    }
    @Test
    public void validateDiscountForBeingAnAdultAndAnticipatedDays(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 60, 45);
        Assert.assertTrue(850000==tarifa);
    }
    @Test
    public void validateDiscountForBeingAnOldMan(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 6, 67);
        Assert.assertTrue(920000==tarifa);
    }
    @Test
    public void validateDiscountForBeingAnOldManAndAnticipatedDays() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(1000000, 31, 70);
        Assert.assertTrue(770000 == tarifa);
    }
}