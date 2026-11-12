package com.daw.biblioteca;
import org.junit.jupiter.api.*;import static org.junit.jupiter.api.Assertions.*;
class BibliotecaTest {
 private Biblioteca b;
 @BeforeEach void preparar(){b=new Biblioteca();b.agregarLibro(new Libro("123","Java","Ana"));b.registrarUsuario(new Usuario("u1","Lucía"));b.registrarUsuario(new Usuario("u2","Pedro"));}
 @Test void agregaYListaLibros(){assertEquals(1,b.listarLibros().size());assertEquals("Java",b.listarLibros().get(0).getTitulo());}
 @Test void noAdmiteIsbnDuplicado(){assertFalse(b.agregarLibro(new Libro("123","Otro","Luis")));assertEquals(1,b.listarLibros().size());}
 @Test void buscaLibroPorIsbn(){assertNotNull(b.buscarLibro("123"));assertNull(b.buscarLibro("999"));}
 @Test void registraUsuarioSinDuplicados(){assertNotNull(b.buscarUsuario("u1"));assertFalse(b.registrarUsuario(new Usuario("u1","Otra")));}
 @Test void prestaLibroDisponible(){assertTrue(b.prestarLibro("123","u1"));assertFalse(b.buscarLibro("123").isDisponible());assertEquals("u1",b.obtenerPrestatario("123"));}
 @Test void impidePrestarDosVeces(){assertTrue(b.prestarLibro("123","u1"));assertFalse(b.prestarLibro("123","u1"));}
 @Test void impidePrestamoConUsuarioInexistente(){assertFalse(b.prestarLibro("123","u9"));assertTrue(b.buscarLibro("123").isDisponible());}
 @Test void impidePrestamoConLibroInexistente(){assertFalse(b.prestarLibro("999","u1"));}
 @Test void devuelveLibroPrestado(){b.prestarLibro("123","u1");assertTrue(b.devolverLibro("123","u1"));assertTrue(b.buscarLibro("123").isDisponible());assertNull(b.obtenerPrestatario("123"));}
 @Test void impideDevolverLibroPrestadoPorOtroUsuario(){b.prestarLibro("123","u1");assertFalse(b.devolverLibro("123","u2"));assertFalse(b.buscarLibro("123").isDisponible());}
 @Test void impideDevolverLibroSinPrestamo(){assertFalse(b.devolverLibro("123","u1"));assertFalse(b.devolverLibro("999","u1"));}
}
