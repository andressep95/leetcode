# 1. Suma de Dos Números (Two Sum)

**Dificultad: Fácil**

## Código Inicial

```java
class Solucion0001 {
    public int[] twoSum(int[] nums, int target) {
        
    }
}
```

## Enunciado

Dado un arreglo de enteros `nums` y un entero `target`, devuelve *los índices de los dos números de tal manera que sumen el valor de* `target`.

Puedes asumir que cada entrada tendría **exactamente una solución**, y no puedes usar el *mismo* elemento dos veces.

Puedes devolver la respuesta en cualquier orden.

### Ejemplo 1:

```
Entrada: nums = [2,7,11,15], target = 9
Salida: [0,1]
Explicación: Como nums[0] + nums[1] == 9, devolvemos [0, 1].
```

### Ejemplo 2:

```
Entrada: nums = [3,2,4], target = 6
Salida: [1,2]
```

### Ejemplo 3:

```
Entrada: nums = [3,3], target = 6
Salida: [0,1]
```

## Restricciones:

* `2 <= nums.length <= 10^4`
* `-10^9 <= nums[i] <= 10^9`
* `-10^9 <= target <= 10^9`
* **Solo existe una respuesta válida.**

