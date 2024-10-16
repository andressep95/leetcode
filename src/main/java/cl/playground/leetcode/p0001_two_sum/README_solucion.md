# Explicación de la solución al problema Two Sum

## El problema

Imagina que tienes una lista de números y quieres encontrar dos números en esa lista que, al sumarlos, den un resultado específico. El problema "Two Sum" te pide encontrar esos dos números y devolver sus posiciones en la lista.

## La solución paso a paso

Vamos a explicar cómo funciona nuestro código:

```java
public int[] twoSum(int[] nums, int target) {
    int n = nums.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            }
        }
    }
    return new int[]{-1, -1};
}
```

### Paso 1: Preparación
- `int n = nums.length;`: Guardamos el tamaño de la lista en una variable `n` para usarla más tarde.

### Paso 2: El primer bucle
- `for (int i = 0; i < n - 1; i++)`: Este bucle recorre la lista desde el principio hasta el penúltimo número.
- `i` representa la posición del primer número que vamos a probar.

### Paso 3: El segundo bucle
- `for (int j = i + 1; j < n; j++)`: Este bucle comienza desde el número siguiente a `i` y llega hasta el final de la lista.
- `j` representa la posición del segundo número que vamos a probar.

### Paso 4: Comprobación
- `if (nums[i] + nums[j] == target)`: Aquí sumamos los números en las posiciones `i` y `j` y comprobamos si su suma es igual al objetivo (`target`).

### Paso 5: Encontramos una solución
- Si la suma es igual al objetivo, hemos encontrado nuestra respuesta.
- `return new int[]{i, j};`: Devolvemos las posiciones `i` y `j` como la solución.

### Paso 6: No hay solución
- Si terminamos todos los bucles sin encontrar una solución, significa que no hay dos números que sumen el objetivo.
- `return new int[]{-1, -1};`: Devolvemos `-1, -1` para indicar que no se encontró una solución.

## Cómo funciona en la práctica

1. El código toma el primer número de la lista.
2. Luego, lo suma con cada uno de los números que vienen después de él.
3. Si encuentra una suma que coincide con el objetivo, ¡eureka! Devuelve las posiciones de esos dos números.
4. Si no encuentra una coincidencia, pasa al siguiente número y repite el proceso.
5. Continúa así hasta que encuentra una solución o hasta que prueba todas las combinaciones posibles.

Esta solución es como buscar un tesoro probando todas las combinaciones posibles hasta encontrar la correcta. Es simple de entender, pero puede llevar tiempo si la lista de números es muy grande.