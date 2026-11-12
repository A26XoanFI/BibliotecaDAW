package com.daw.biblioteca;
import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
class LibroTest {
 @Test void creaLibroDisponible(){Libro l=new Libro("123","Java","Ana");assertAll(()->assertEquals("123",l.getIsbn()),()->assertEquals("Java",l.getTitulo()),()->assertEquals("Ana",l.getAutor()),()->assertTrue(l.isDisponible()));}
 @Test void rechazaCamposVacios(){assertThrows(IllegalArgumentException.class,()->new Libro("","Java","Ana"));assertThrows(IllegalArgumentException.class,()->new Libro("123",null,"Ana"));}
}
