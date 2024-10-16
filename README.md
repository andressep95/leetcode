# Ejercicios de LeetCode en Java

Este repositorio contiene soluciones a diversos problemas de LeetCode implementadas en Java. El objetivo es proporcionar un recurso para aprender y practicar algoritmos y estructuras de datos, así como prepararse para entrevistas técnicas.

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

```
leetcode-exercises/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── cl/
│   │           └── playground/
│   │               └── leetcode/
│   │                   ├── p0001_two_sum/
│   │                   │   ├── README_problema.md
│   │                   │   ├── README_solucion.md
│   │                   │   └── Solution.java
│   │                   └── ... (más paquetes para otros problemas)
│   └── test/
│       └── java/
│           └── cl/
│               └── playground/
│                   └── leetcode/
│                       ├── p0001_two_sum/
│                       │   └── SolutionTest.java
│                       └── ... (más pruebas para otros problemas)
├── pom.xml
└── README.md
```

Cada problema de LeetCode tiene su propio paquete con la siguiente convención de nomenclatura:
`pXXXX_nombre_del_problema`, donde XXXX es el número del problema en LeetCode.

## Lista de Problemas Resueltos
| #    | Título | Dificultad | Solución | Test | Explicación |
|------|--------|------------|----------|------|-------------|
| 0001 | [Two Sum](./src/main/java/cl/playground/leetcode/p0001_two_sum/README_problema.md) | Fácil | [Java](./src/main/java/cl/playground/leetcode/p0001_two_sum/Solucion0001.java) | [Test](./src/test/java/cl/playground/leetcode/p0001_two_sum/Solucion0001Test.java) | [Explicación](./src/main/java/cl/playground/leetcode/p0001_two_sum/README_solucion.md) |
| 0009 | [Palindrome Number](./src/main/java/cl/playground/leetcode/p0009_palindrome_number/README_problema.md) | Fácil | [Java](./src/main/java/cl/playground/leetcode/p0009_palindrome_number/Solucion0009.java) | [Test](./src/test/java/cl/playground/leetcode/p0009_palindrome_number/Solucion0009Test.java) | [Explicación](./src/main/java/cl/playground/leetcode/p0009_palindrome_number/README_solucion.md) |

## Cómo usar este repositorio

1. Clona el repositorio:
   ```
   git clone https://github.com/andressep95/leetcode-exercises.git
   ```

2. Navega al directorio del proyecto:
   ```
   cd leetcode-exercises
   ```

3. Compila el proyecto usando Maven:
   ```
   mvn compile
   ```

4. Ejecuta las pruebas:
   ```
   mvn test
   ```

## Cómo contribuir

Las contribuciones son bienvenidas. Si deseas agregar una nueva solución o mejorar una existente, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama con un nombre descriptivo: `git checkout -b add-solution-xxxx`
3. Implementa tu solución siguiendo la estructura del proyecto:
    - Crea un nuevo paquete en `src/main/java/cl/playground/leetcode/` si el problema no existe.
    - Añade `README_problema.md`, `README_solucion.md`, y `Solution.java` en el paquete.
    - Crea las pruebas correspondientes en `src/test/java/cl/playground/leetcode/`.
4. Asegúrate de que todas las pruebas pasen: `mvn test`
5. Actualiza la tabla de problemas resueltos en este README.
6. Haz commit de tus cambios: `git commit -am 'Añadir solución para el problema XXXX'`
7. Haz push a tu rama: `git push origin add-solution-xxxx`
8. Crea un Pull Request desde tu fork hacia este repositorio.

## Requisitos

- Java 11 o superior
- Maven 3.6 o superior

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

¿Encontraste este repositorio útil? ¡No dudes en darle una estrella! ⭐

Si tienes alguna pregunta o sugerencia, no dudes en abrir un issue o contactarme directamente.

Happy coding! 👨‍💻👩‍💻
