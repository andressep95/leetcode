# 9. Número Palíndromo (Palindrome Number)

**Dificultad: Fácil**

## Código Inicial

```java
class Solucion0009 {
    public boolean isPalindrome(int x) {
        
    }
}
```

## Enunciado

Dado un entero `x`, devuelve `true` *si* `x` *es un*
***palíndromo***
*, y* `false` *en caso contrario*.

### Ejemplo 1:

```
Entrada: x = 121
Salida: true
Explicación: 121 se lee como 121 de izquierda a derecha y de derecha a izquierda.
```

### Ejemplo 2:

```
Entrada: x = -121
Salida: false
Explicación: De izquierda a derecha, se lee -121. De derecha a izquierda, se convierte en 121-. Por lo tanto, no es un palíndromo.
```

### Ejemplo 3:

```
Entrada: x = 10
Salida: false
Explicación: Se lee 01 de derecha a izquierda. Por lo tanto, no es un palíndromo.
```

## Restricciones:

* `-2^31 <= x <= 2^31 - 1`

## Seguimiento:

¿Podrías resolver el problema sin convertir el entero a una cadena?