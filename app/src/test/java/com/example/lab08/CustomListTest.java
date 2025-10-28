package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    public void testHasCity(){
        CustomList cities = new CustomList();
        City city1 = new City("Edmonton", "AB");
        City city2 = new City("New York", "NY");
        cities.addCity(city1);
        assertFalse(cities.hasCity(city2));
        assertTrue(cities.hasCity(city1));
    }
}
