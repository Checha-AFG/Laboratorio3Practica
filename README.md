# Practica de creacion de arboles
Este programa en Java permite al usuario ingresar una expresión aritmética y construir un árbol de expresiones correspondiente. El árbol de expresiones se imprime de forma gráfica.

## Uso del programa
Para utilizar el programa, se debe seguir los siguientes pasos:

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en un entorno de desarrollo Java, como Eclipse o NetBeans.
3. Ejecutar el programa.
4. Ingresar una expresión aritmética cuando se lo solicite.
5. El programa construirá un árbol de expresiones correspondiente a la expresión ingresada y lo imprimirá de forma gráfica.
## Formato de salida
Cada " |-- " en la salida indica el nivel del nodo en el árbol generado. El primer " |-- " indica el nodo izquierdo, mientras que el segundo " |-- " indica el nodo derecho. Una intercalación de " |-- " de mayor y menor nivel indica la presencia de nodos hoja en esa parte del recorrido. De esta forma, se obtiene una representación gráfica clara del árbol de expresiones correspondiente a la expresión ingresada.

## Ejemplo de salida
A continuación se muestra un ejemplo de la salida del programa para la expresión aritmética "3+4*5":

![image](https://user-images.githubusercontent.com/99372151/232964756-4f024856-cef8-472c-b02f-d16f34030ca5.png)

En este ejemplo el nodo "+" hace la función de raíz, este a su vez tiene dos nodos hijos, "3", que es un nodo hoja, y "*" que es un nodo subraiz, debido a que le derivan los nodos hoja "4" y "5"

Los hijos de cada nodo se representan directamente debajo de su nodo padre, por eso se usa " |-- " como indicador de jerarquia

![image](https://user-images.githubusercontent.com/99372151/232965260-56709a50-9743-457d-a19d-6b50f9c516fa.png)

En este ejemplo, tanto el nodo "-" como el nodo "*" tienen hijos, y sus hijos se muestran abajo de cada padre

