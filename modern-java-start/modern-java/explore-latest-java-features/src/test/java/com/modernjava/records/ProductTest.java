package com.modernjava.records;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

class ProductTest {

    @Test
    void createProduct() {
        var product = new Product("iPhone",
                new BigDecimal("999.99"),
                "ELECTRONICS");

        System.out.println(product);
        assertEquals("iPhone", product.name());
        assertEquals("ELECTRONICS", product.type());
    }


    @Test
    void nameNotValid() {
        var exception = assertThrows(IllegalArgumentException.class,
                () -> new Product("",
                        new BigDecimal("999.99"),
                        "ELECTRONICS"));

        assertEquals("name is not valid!", exception.getMessage());
    }


    @Test
    void costNotValid() {
        var exception = assertThrows(IllegalArgumentException.class,
                () -> new Product("iPhone",
                        new BigDecimal("0.00"),
                        "ELECTRONICS"));

        assertEquals("cost is not valid!", exception.getMessage());
    }



    @Test
    void customerConstructor() {
        var product = new Product("iPhone",
                new BigDecimal("999.99"));

        assertEquals("iPhone", product.name());
        assertEquals("GENERAL", product.type());
    }



    @Test
    void productComparison() {
        var product = new Product("iPhone",
                new BigDecimal("999.999"),
                "ELECTRONICS");

        var product1 = new Product("iPhone",
                new BigDecimal("999.999"),
                "ELECTRONICS1");

        assertEquals(product, product1);

        System.out.println("hashCode product : " + product.hashCode());
        System.out.println("hashCode product1: " + product1.hashCode());
        assertEquals(product.hashCode(), product1.hashCode());

    }

}