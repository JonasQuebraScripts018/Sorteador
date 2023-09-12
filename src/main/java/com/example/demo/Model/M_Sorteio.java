package com.example.demo.Model;

public class M_Sorteio {
    private int numeros;
    private int numeroMaximo;
    private int numeroMinimo;
    private int[] resultados;

    public M_Sorteio(int numeros, int[] resultados) {
        this.numeros = numeros;
        this.resultados = resultados;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public int getNumeroMaximo() {
        return numeroMaximo;
    }

    public void setNumeroMaximo(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }

    public int getNumeroMinimo() {
        return numeroMinimo;
    }

    public void setNumeroMinimo(int numeroMinimo) {
        this.numeroMinimo = numeroMinimo;
    }

    public int[] getResultados() {
        return resultados;
    }

    public void setResultados(int[] resultados) {
    }
}
