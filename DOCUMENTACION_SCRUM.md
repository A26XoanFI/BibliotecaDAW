# Documentación Scrum — BibliotecaDAW

## Visión
Aplicación de consola para administrar un catálogo de libros, registrar usuarios y gestionar préstamos y devoluciones.

## Roles (simulación académica)
- Product Owner: prioriza y valida requisitos.
- Scrum Master: facilita eventos y elimina impedimentos.
- Developers: implementan y prueban el incremento.

## Product Backlog
| ID | Historia de usuario | Puntos | Sprint | Criterios de aceptación |
|---|---|---:|---:|---|
| HU01/CU01 | Como bibliotecario quiero añadir libros al catálogo | 3 | 1 | ISBN, título y autor obligatorios; ISBN único |
| HU02/CU02 | Quiero listar libros para consultar el catálogo | 2 | 1 | Muestra datos y disponibilidad; informa si está vacío |
| HU03/CU03 | Quiero buscar por ISBN para localizar un libro | 2 | 1 | Muestra libro existente o informa de que no existe |
| HU04/CU04 | Quiero registrar usuarios para identificar prestatarios | 3 | 2 | ID y nombre obligatorios; ID único |
| HU05/CU05 | Quiero prestar libros a usuarios | 5 | 2 | Libro y usuario existentes; libro disponible; no admite doble préstamo |
| HU06/CU06 | Quiero devolver libros prestados | 3 | 2 | Solo devuelve préstamos activos y libera disponibilidad |

Estimación didáctica total: 18 puntos.

## Sprint 1 — Catálogo (5 días)
**Objetivo:** entregar aplicación Maven que añada, liste y busque libros.
- Día 1: planificación, estructura Maven y JUnit.
- Día 2: clase Libro y validaciones.
- Día 3: altas y búsqueda en Biblioteca.
- Día 4: listado y menú de consola.
- Día 5: pruebas, Sprint Review y Retrospective.
- Historias: HU01, HU02 y HU03 (7 puntos).
- Revisión: demostrar alta, rechazo de ISBN duplicado, listado y búsqueda.

## Sprint 2 — Usuarios y préstamos (5 días)
**Objetivo:** completar registro de usuarios, préstamos y devoluciones.
- Día 1: clase Usuario.
- Día 2: registro de usuarios.
- Día 3: préstamos y restricciones.
- Día 4: devoluciones e integración en el menú.
- Día 5: pruebas de regresión, Sprint Review y Retrospective.
- Historias: HU04, HU05 y HU06 (11 puntos).
- Revisión: demostrar registro, préstamo, rechazo de préstamo repetido y devolución.

## Eventos Scrum
Sprint Planning al inicio de cada sprint; Daily Scrum de 10–15 minutos cada día; Sprint Review y Sprint Retrospective al final de cada sprint. Si el trabajo es individual, los roles y eventos se describen como simulación académica. Registrar los resultados reales tras celebrar las reuniones.

## Definition of Done
1. Cumple criterios de aceptación.
2. Integrado en Maven y compila.
3. Incluye pruebas unitarias relevantes.
4. `mvn clean test` termina correctamente.
5. Se puede demostrar desde consola.
6. Código legible y sin errores de compilación.

## Pruebas
| Caso | Pruebas |
|---|---|
| HU01 | creaLibroDisponible, rechazaCamposVacios, noAdmiteIsbnDuplicado |
| HU02 | agregaYListaLibros |
| HU03 | buscaLibroPorIsbn |
| HU04 | creaUsuario, rechazaNombreVacio, registraUsuarioSinDuplicados |
| HU05 | prestaLibroDisponible, impidePrestarDosVeces, impidePrestamoConUsuarioInexistente, impidePrestamoConLibroInexistente |
| HU06 | devuelveLibroPrestado, impideDevolverLibroSinPrestamo |

## Limitaciones y mejoras
Los datos son volátiles; no hay persistencia, fechas de vencimiento ni autenticación. Como ampliación se propone SQLite/MySQL e historial de préstamos.
