package com.daw.biblioteca;
public class Libro {
 private final String isbn, titulo, autor; private boolean disponible = true;
 public Libro(String isbn,String titulo,String autor){if(vacio(isbn)||vacio(titulo)||vacio(autor))throw new IllegalArgumentException("ISBN, título y autor son obligatorios");this.isbn=isbn.trim();this.titulo=titulo.trim();this.autor=autor.trim();}
 private boolean vacio(String s){return s==null||s.isBlank();}
 public String getIsbn(){return isbn;} public String getTitulo(){return titulo;} public String getAutor(){return autor;} public boolean isDisponible(){return disponible;}
 void marcarPrestado(){if(!disponible)throw new IllegalStateException("El libro ya está prestado");disponible=false;}
 void marcarDevuelto(){if(disponible)throw new IllegalStateException("El libro ya está disponible");disponible=true;}
 @Override public String toString(){return isbn+" | "+titulo+" | "+autor+" | "+(disponible?"Disponible":"Prestado");}
}
