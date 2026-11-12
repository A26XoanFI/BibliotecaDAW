package com.daw.biblioteca;
public class Usuario {
 private final String id,nombre;
 public Usuario(String id,String nombre){if(id==null||id.isBlank()||nombre==null||nombre.isBlank())throw new IllegalArgumentException("ID y nombre son obligatorios");this.id=id.trim();this.nombre=nombre.trim();}
 public String getId(){return id;} public String getNombre(){return nombre;}
 @Override public String toString(){return id+" | "+nombre;}
}
