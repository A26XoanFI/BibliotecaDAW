# BibliotecaDAW
Aplicación de consola Java 17 + Maven + JUnit 5. Gestiona libros, usuarios, préstamos y devoluciones.

## Requisitos
JDK 17 o superior y Maven 3.9 o compatible.

## Ejecutar en Lubuntu
Abre una terminal en esta carpeta y ejecuta:

```bash
mvn clean test
mvn exec:java
```

Para generar el paquete: `mvn package`.

## Estructura
- `src/main/java/com/daw/biblioteca/Libro.java`: datos de libro y disponibilidad.
- `Usuario.java`: datos de usuario.
- `Biblioteca.java`: reglas de catálogo y préstamos.
- `Main.java`: menú de consola.
- `src/test/java/...`: pruebas JUnit 5.

Los datos se guardan en memoria y se pierden al cerrar el programa.
# BibliotecaDAW
