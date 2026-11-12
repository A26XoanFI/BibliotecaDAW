# 📚 BibliotecaDAW — Sistema de Gestión de Biblioteca

![Java](https://img.shields.io/badge/Java-17-orange)
![Maven](https://img.shields.io/badge/Maven-Build_Tool-blue)
![JUnit](https://img.shields.io/badge/JUnit-5-green)
![Scrum](https://img.shields.io/badge/Metodolog%C3%ADa-Scrum-purple)
![GitHub](https://img.shields.io/badge/Control_de_versiones-GitHub-black)

## 📌 1. Descripción del proyecto

**BibliotecaDAW** es una aplicación de consola desarrollada en Java que permite gestionar una biblioteca de forma sencilla.

El programa permite registrar libros y usuarios, consultar el catálogo, buscar libros por su ISBN y gestionar préstamos y devoluciones.

Este proyecto se realiza para la asignatura **Entornos de Desarrollo**, perteneciente al Ciclo Formativo de Grado Superior en **Desarrollo de Aplicaciones Web (DAW)**.

El objetivo es aplicar los conocimientos adquiridos sobre programación orientada a objetos, gestión de proyectos con Maven, pruebas unitarias, control de versiones con Git y GitHub y metodologías ágiles de desarrollo.

## 🎯 2. Objetivos del proyecto

Los principales objetivos son:

- Desarrollar una aplicación funcional utilizando Java.
- Aplicar los principios básicos de programación orientada a objetos (POO).
- Organizar el código mediante diferentes clases.
- Utilizar Maven para gestionar y construir el proyecto.
- Crear pruebas unitarias utilizando JUnit 5.
- Utilizar Git y GitHub para el control de versiones.
- Aplicar Scrum mediante dos Sprints de una duración máxima de una semana.
- Documentar el proceso de desarrollo del software.

## 🛠️ 3. Tecnologías utilizadas

| Tecnología | Utilidad |
|---|---|
| Java 17 | Lenguaje de programación |
| Apache Maven | Gestión y construcción del proyecto |
| JUnit 5 | Pruebas unitarias |
| Git | Control de versiones |
| GitHub | Almacenamiento y documentación del proyecto |
| Scrum | Organización del trabajo en Sprints |

## ⚙️ 4. Funcionalidades de la aplicación

La aplicación dispone de las siguientes funcionalidades:

1. **Añadir libros:** registrar libros indicando su ISBN, título y autor.
2. **Listar libros:** consultar los libros registrados en la biblioteca.
3. **Buscar libros:** localizar un libro mediante su ISBN.
4. **Registrar usuarios:** añadir nuevos usuarios al sistema.
5. **Prestar libros:** realizar préstamos de libros disponibles a usuarios registrados.
6. **Devolver libros:** registrar la devolución de libros prestados.

Estas funcionalidades se implementan mediante diferentes clases Java, siguiendo los principios de programación orientada a objetos.

## 📋 5. Requisitos de usuario y casos de uso

Los requisitos de usuario describen las funcionalidades que debe ofrecer la aplicación.

| Código | Historia de usuario | Caso de uso |
|---|---|---|
| HU01 | Como bibliotecario, quiero registrar libros para ampliar el catálogo. | CU01 - Añadir libros |
| HU02 | Como bibliotecario, quiero consultar todos los libros para conocer el catálogo. | CU02 - Listar libros |
| HU03 | Como bibliotecario, quiero buscar libros por ISBN para localizarlos fácilmente. | CU03 - Buscar libros |
| HU04 | Como bibliotecario, quiero registrar usuarios para gestionar los préstamos. | CU04 - Registrar usuarios |
| HU05 | Como bibliotecario, quiero prestar libros disponibles a usuarios registrados. | CU05 - Prestar libros |
| HU06 | Como bibliotecario, quiero registrar devoluciones para actualizar la disponibilidad de los libros. | CU06 - Devolver libros |

### Criterios de aceptación

- Los libros deben tener un ISBN que permita identificarlos.
- No se deben registrar libros con un ISBN duplicado.
- El sistema debe permitir consultar los libros registrados.
- Los usuarios deben poder registrarse correctamente.
- Solo se pueden prestar libros que estén disponibles.
- No se puede prestar un libro a un usuario inexistente.
- Al devolver un libro, este debe volver a estar disponible.
- El sistema debe gestionar las operaciones incorrectas.

## 📂 6. Estructura del proyecto

El proyecto utiliza la estructura estándar de Maven:

```text
BibliotecaDAW/
│
├── pom.xml
├── README.md
├── DOCUMENTACION_SCRUM.md
│
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── daw/
    │               └── biblioteca/
    │                   ├── Main.java
    │                   ├── Libro.java
    │                   ├── Usuario.java
    │                   └── Biblioteca.java
    │
    └── test/
        └── java/
            └── com/
                └── daw/
                    └── biblioteca/
                        ├── LibroTest.java
                        ├── UsuarioTest.java
                        └── BibliotecaTest.java
```

### Explicación de las clases

| Clase | Función |
|---|---|
| `Main.java` | Punto de entrada del programa y menú de consola |
| `Libro.java` | Representa un libro y sus propiedades |
| `Usuario.java` | Representa un usuario de la biblioteca |
| `Biblioteca.java` | Gestiona libros, usuarios, préstamos y devoluciones |
| `LibroTest.java` | Comprueba el funcionamiento de la clase Libro |
| `UsuarioTest.java` | Comprueba el funcionamiento de la clase Usuario |
| `BibliotecaTest.java` | Comprueba las operaciones de la biblioteca |

## 🔄 7. ¿Qué es Scrum?

**Scrum** es un marco de trabajo ágil utilizado para desarrollar y gestionar proyectos complejos, especialmente en el ámbito del desarrollo de software.

Se basa en dividir el trabajo en períodos cortos llamados **Sprints**, durante los cuales se desarrollan funcionalidades concretas.

Scrum permite organizar las tareas, revisar el progreso, adaptarse a los cambios y mejorar continuamente el proceso de desarrollo.

### Roles de Scrum

En Scrum existen tres responsabilidades principales:

- **Product Owner:** se encarga de maximizar el valor del producto y gestionar el Product Backlog.
- **Scrum Master:** ayuda a que Scrum se aplique correctamente y a mejorar la eficacia del equipo.
- **Developers:** profesionales responsables de crear el incremento del producto durante cada Sprint.

En este proyecto académico, estas responsabilidades pueden adaptarse al trabajo individual, documentando las tareas y decisiones realizadas.

## 🚀 8. ¿Qué es un Sprint?

Un **Sprint** es un período de tiempo fijo durante el cual se trabaja para conseguir un objetivo concreto y generar un incremento funcional del producto.

En Scrum, los Sprints tienen una duración máxima de un mes.

Para este proyecto se han establecido **dos Sprints de cinco días cada uno**, cumpliendo el requisito de que ninguno supere una semana.

### Elementos principales de un Sprint

**Sprint Planning**

Reunión de planificación en la que se define el objetivo del Sprint y el trabajo necesario para alcanzarlo.

**Sprint Backlog**

Conjunto de tareas seleccionadas para realizar durante el Sprint, junto con el objetivo y el plan de trabajo.

**Daily Scrum**

Reunión diaria de un máximo de 15 minutos en la que los Developers inspeccionan el progreso hacia el objetivo del Sprint y adaptan el plan si es necesario.

**Sprint Review**

Revisión del resultado del Sprint con las personas interesadas para analizar el incremento y los siguientes pasos.

**Sprint Retrospective**

Reunión en la que el equipo reflexiona sobre cómo ha trabajado y plantea mejoras para los siguientes Sprints.

### ¿Por qué utilizamos Sprints?

- Permiten dividir el proyecto en tareas pequeñas.
- Facilitan la planificación del tiempo.
- Ayudan a detectar errores durante el desarrollo.
- Permiten comprobar el progreso de la aplicación.
- Favorecen la mejora continua.
- Facilitan la entrega progresiva de funcionalidades.

## 📅 9. Planificación del proyecto mediante Scrum

El proyecto se organiza en dos Sprints.

| Sprint | Duración | Objetivo |
|---|---|---|
| Sprint 1 | 5 días | Implementar la gestión de libros |
| Sprint 2 | 5 días | Implementar usuarios, préstamos y devoluciones |

### 🟦 Sprint 1 — Gestión de libros

**Duración:** 5 días.

**Sprint Goal:** desarrollar la estructura inicial del proyecto y las funcionalidades básicas del catálogo de libros.

**Historias de usuario incluidas:**

- HU01 — Añadir libros.
- HU02 — Listar libros.
- HU03 — Buscar libros por ISBN.

**Plan de trabajo:**

| Día | Actividad |
|---|---|
| Día 1 | Crear el proyecto Maven y configurar sus dependencias |
| Día 2 | Desarrollar la clase Libro |
| Día 3 | Implementar la gestión del catálogo en Biblioteca |
| Día 4 | Crear el menú de consola y conectar las funcionalidades |
| Día 5 | Desarrollar y ejecutar pruebas unitarias, revisar el incremento |

**Incremento esperado:**

Una primera versión funcional que permita añadir, listar y buscar libros.

**Criterios para dar el Sprint por completado:**

- El proyecto compila correctamente.
- Se pueden registrar libros.
- Se pueden listar los libros existentes.
- Se pueden buscar libros por ISBN.
- Las pruebas correspondientes se ejecutan correctamente.

### 🟩 Sprint 2 — Usuarios, préstamos y devoluciones

**Duración:** 5 días.

**Sprint Goal:** ampliar la aplicación para gestionar usuarios, préstamos y devoluciones.

**Historias de usuario incluidas:**

- HU04 — Registrar usuarios.
- HU05 — Prestar libros.
- HU06 — Devolver libros.

**Plan de trabajo:**

| Día | Actividad |
|---|---|
| Día 1 | Crear la clase Usuario |
| Día 2 | Implementar el registro de usuarios |
| Día 3 | Desarrollar la funcionalidad de préstamos |
| Día 4 | Implementar las devoluciones |
| Día 5 | Completar las pruebas unitarias y revisar el proyecto |

**Incremento esperado:**

Una aplicación de biblioteca con gestión de libros, usuarios, préstamos y devoluciones.

**Criterios para dar el Sprint por completado:**

- Se pueden registrar usuarios.
- Se pueden prestar libros disponibles.
- Se impiden préstamos incorrectos.
- Se pueden devolver libros prestados.
- Se actualiza correctamente la disponibilidad de los libros.
- Las pruebas unitarias correspondientes se ejecutan correctamente.

## 📊 10. Product Backlog

El **Product Backlog** es una lista ordenada y adaptable del trabajo necesario para mejorar el producto.

En este proyecto está formado por las seis historias de usuario.

| ID | Historia de usuario | Prioridad | Sprint |
|---|---|---|---|
| HU01 | Registrar libros | Alta | 1 |
| HU02 | Listar libros | Alta | 1 |
| HU03 | Buscar libros por ISBN | Media | 1 |
| HU04 | Registrar usuarios | Alta | 2 |
| HU05 | Prestar libros | Alta | 2 |
| HU06 | Devolver libros | Alta | 2 |

La planificación y el seguimiento detallado se documentan en `DOCUMENTACION_SCRUM.md`.

## 🧪 11. Pruebas unitarias con JUnit 5

Para comprobar el funcionamiento del programa se utilizan pruebas unitarias desarrolladas con **JUnit 5**.

Las pruebas permiten verificar que los métodos realizan correctamente sus operaciones y que el sistema gestiona diferentes situaciones de error.

### Clases de prueba

**LibroTest.java**

Comprueba las propiedades y el comportamiento de los objetos de tipo Libro.

**UsuarioTest.java**

Verifica la creación y las propiedades de los usuarios.

**BibliotecaTest.java**

Comprueba las funcionalidades principales de la biblioteca, incluyendo el registro de libros y usuarios, los préstamos y las devoluciones.

### Ejecución de las pruebas

Desde la carpeta raíz del proyecto:

```bash
mvn clean test
```

Maven compilará el proyecto y ejecutará las pruebas unitarias configuradas.

Los resultados podrán consultarse en la terminal y en los informes generados en `target/surefire-reports`.

## ▶️ 12. Instalación y ejecución

### Requisitos previos

Para ejecutar el proyecto es necesario disponer de:

- Java JDK 17.
- Apache Maven.
- Git, si se desea clonar el repositorio.
- Un entorno de desarrollo compatible con Java.

### Paso 1. Clonar el repositorio

```bash
git clone https://github.com/TU_USUARIO/BibliotecaDAW.git
```

Sustituir `TU_USUARIO` por el nombre de usuario correspondiente de GitHub.

### Paso 2. Acceder al proyecto

```bash
cd BibliotecaDAW
```

### Paso 3. Compilar el proyecto

```bash
mvn clean compile
```

### Paso 4. Ejecutar las pruebas

```bash
mvn test
```

### Paso 5. Ejecutar la aplicación

```bash
mvn exec:java
```

Este último comando utiliza la configuración del plugin de ejecución incluida en el proyecto Maven.

### Menú de la aplicación

El programa muestra un menú de consola con opciones similares a las siguientes:

```text
===== BIBLIOTECA DAW =====

1. Añadir libro
2. Listar libros
3. Buscar libro por ISBN
4. Registrar usuario
5. Prestar libro
6. Devolver libro
0. Salir

Seleccione una opción:
```

El usuario puede seleccionar una operación introduciendo su número correspondiente.

## 🌐 13. Control de versiones con Git y GitHub

Para gestionar el código fuente se utilizan Git y GitHub.

**Git** permite registrar los cambios realizados en los archivos del proyecto.

**GitHub** permite almacenar el repositorio de forma remota, consultar el historial de modificaciones y organizar tareas.

Algunos comandos utilizados son:

```bash
git init
git add .
git commit -m "Descripción del cambio"
git push origin main
```

También se pueden utilizar las herramientas de GitHub para organizar las historias de usuario mediante Issues, Milestones y Projects.

## 📈 14. Posibles mejoras futuras

Aunque el proyecto se centra en las funcionalidades básicas, se podrían incorporar nuevas características:

- Eliminar o modificar libros.
- Consultar los préstamos activos.
- Añadir fechas de préstamo y devolución.
- Crear un historial de préstamos.
- Guardar la información en una base de datos.
- Desarrollar una interfaz gráfica.
- Incorporar un sistema de autenticación de usuarios.

Estas mejoras podrían planificarse en futuros Sprints.

## 📚 15. Conclusión

El desarrollo de BibliotecaDAW permite poner en práctica diferentes conocimientos de la asignatura Entornos de Desarrollo.

A través de este proyecto se trabaja con Java, programación orientada a objetos, Maven, JUnit 5, Git, GitHub y Scrum.

La división del trabajo en dos Sprints permite organizar el desarrollo en etapas, definir objetivos concretos y establecer incrementos funcionales.

Además, la utilización de pruebas unitarias ayuda a comprobar el comportamiento del programa y detectar posibles errores.

El proyecto constituye una práctica introductoria al desarrollo organizado, documentado y verificable de aplicaciones de software.

---

### 👨‍💻 Información académica

**Proyecto:** BibliotecaDAW — Sistema de Gestión de Biblioteca  
**Ciclo formativo:** Grado Superior en Desarrollo de Aplicaciones Web (DAW)  
**Asignatura:** Entornos de Desarrollo  
**Lenguaje de programación:** Java 17  
**Herramienta de construcción:** Maven  
**Framework de pruebas:** JUnit 5  
**Metodología:** Scrum  
**Planificación:** 2 Sprints de 5 días cada uno
