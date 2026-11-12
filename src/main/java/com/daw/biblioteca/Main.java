package com.daw.biblioteca;
import java.util.Scanner;
public class Main {
 public static void main(String[] args){Biblioteca b=new Biblioteca();Scanner sc=new Scanner(System.in);boolean seguir=true;
 while(seguir){System.out.println("\n=== BIBLIOTECA DAW ===\n1. Añadir libro\n2. Listar libros\n3. Buscar libro por ISBN\n4. Registrar usuario\n5. Prestar libro\n6. Devolver libro\n0. Salir");String op=pedir(sc,"Opción: ");try{switch(op){
 case "1"->{Libro l=new Libro(pedir(sc,"ISBN: "),pedir(sc,"Título: "),pedir(sc,"Autor: "));System.out.println(b.agregarLibro(l)?"Libro añadido":"Ya existe ese ISBN");}
 case "2"->{if(b.listarLibros().isEmpty())System.out.println("No hay libros");else b.listarLibros().forEach(System.out::println);}
 case "3"->{Libro l=b.buscarLibro(pedir(sc,"ISBN: "));System.out.println(l==null?"Libro no encontrado":l);}
 case "4"->{Usuario u=new Usuario(pedir(sc,"ID: "),pedir(sc,"Nombre: "));System.out.println(b.registrarUsuario(u)?"Usuario registrado":"Ya existe ese ID");}
 case "5"->{String isbn=pedir(sc,"ISBN: "),id=pedir(sc,"ID de usuario: ");System.out.println(b.prestarLibro(isbn,id)?"Préstamo realizado":"No se puede prestar: comprueba libro, usuario y disponibilidad");}
 case "6"->{String isbn=pedir(sc,"ISBN: ");String id=pedir(sc,"ID de usuario que devuelve: ");System.out.println(b.devolverLibro(isbn,id)?"Libro devuelto":"No hay préstamo activo para ese ISBN y ese usuario");}
 case "0"->{seguir=false;System.out.println("Hasta pronto");}default->System.out.println("Opción no válida");}}
 catch(IllegalArgumentException e){System.out.println("Error: "+e.getMessage());}}
 }
 private static String pedir(Scanner sc,String msg){System.out.print(msg);return sc.nextLine().trim();}
}
