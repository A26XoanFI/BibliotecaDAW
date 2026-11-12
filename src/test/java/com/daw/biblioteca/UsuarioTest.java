package com.daw.biblioteca;
import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
class UsuarioTest {
 @Test void creaUsuario(){Usuario u=new Usuario("u1","Lucía");assertEquals("u1",u.getId());assertEquals("Lucía",u.getNombre());}
 @Test void rechazaNombreVacio(){assertThrows(IllegalArgumentException.class,()->new Usuario("u1"," "));}
}
