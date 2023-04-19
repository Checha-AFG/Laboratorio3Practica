/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chech
 */
public class Nodo {
    private String valor;
    private Nodo izquierdo;
    private Nodo derecho;
    
    public Nodo(String valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    public String getValor() {
        return this.valor;
    }
    
    public void setIzquierdo(Nodo nodo) {
        this.izquierdo = nodo;
    }
    
    public Nodo getIzquierdo() {
        return this.izquierdo;
    }
    
    public void setDerecho(Nodo nodo) {
        this.derecho = nodo;
    }
    
    public Nodo getDerecho() {
        return this.derecho;
    }
}

