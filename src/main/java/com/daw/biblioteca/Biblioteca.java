package com.daw.biblioteca;
import java.util.*;
public class Biblioteca {
 private final Map<String,Libro> libros=new HashMap<>(); private final Map<String,Usuario> usuarios=new HashMap<>(); private final Map<String,String> prestamos=new HashMap<>();
 public boolean agregarLibro(Libro l){if(l==null)throw new IllegalArgumentException("Libro obligatorio");if(libros.containsKey(l.getIsbn()))return false;libros.put(l.getIsbn(),l);return true;}
 public List<Libro> listarLibros(){List<Libro> r=new ArrayList<>(libros.values());r.sort(Comparator.comparing(Libro::getIsbn));return Collections.unmodifiableList(r);}
 public Libro buscarLibro(String isbn){return libros.get(isbn);}
 public boolean registrarUsuario(Usuario u){if(u==null)throw new IllegalArgumentException("Usuario obligatorio");if(usuarios.containsKey(u.getId()))return false;usuarios.put(u.getId(),u);return true;}
 public Usuario buscarUsuario(String id){return usuarios.get(id);}
 public boolean prestarLibro(String isbn,String id){Libro l=libros.get(isbn);if(l==null||!usuarios.containsKey(id)||!l.isDisponible()||prestamos.containsKey(isbn))return false;l.marcarPrestado();prestamos.put(isbn,id);return true;}
 public boolean devolverLibro(String isbn){String id=prestamos.get(isbn);if(id==null){return false;}return devolverLibro(isbn,id);}
 public boolean devolverLibro(String isbn,String id){Libro l=libros.get(isbn);if(l==null||id==null||id.isBlank()||!prestamos.containsKey(isbn))return false;String prestadoA=prestamos.get(isbn);if(!id.equals(prestadoA))return false;prestamos.remove(isbn);l.marcarDevuelto();return true;}
 public String obtenerPrestatario(String isbn){return prestamos.get(isbn);}
}
