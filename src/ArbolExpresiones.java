/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chech
 */
public class ArbolExpresiones {
    private Nodo raiz;
    
    public ArbolExpresiones(String expresion) {
        this.raiz = construirArbol(expresion);
    }
    
private Nodo construirArbol(String expresion) {
    if (expresion.matches("[0-9]+")) {
        return new Nodo(expresion);
    }
    
    int nivel = 0;
    int indiceOperador = -1;
    for (int i = 0; i < expresion.length(); i++) {
        char c = expresion.charAt(i);
        if (c == '(') {
            nivel++;
        } else if (c == '+' || c == '-' || c == '*' || c == '/') {
        if (nivel == 0 && (indiceOperador == -1 || precedencia(c) <= precedencia(expresion.charAt(indiceOperador)))) {
            indiceOperador = i;
        }
    } else if (c == ')') {
        nivel--;
    }
}

if (indiceOperador == -1) {
    return construirArbol(expresion.substring(1, expresion.length() - 1));
} else {
    Nodo nodo = new Nodo(Character.toString(expresion.charAt(indiceOperador)));
    nodo.setIzquierdo(construirArbol(expresion.substring(0, indiceOperador)));
    nodo.setDerecho(construirArbol(expresion.substring(indiceOperador + 1)));
    return nodo;
}

}

private int precedencia(char operador) {
    switch (operador) {
        case '+':
        case '-':
        return 1;
        case '*':
        case '/':
        return 2;
        default:
        return 0;
    }
}

    public void imprimirArbol() {
        imprimirArbol(this.raiz, "");
    }
    
    private void imprimirArbol(Nodo nodo, String prefijo) {
        if (nodo != null) {
            System.out.println(prefijo + nodo.getValor());
            imprimirArbol(nodo.getIzquierdo(), prefijo + "|--");
            imprimirArbol(nodo.getDerecho(), prefijo + "|--");
        }
    }
}

