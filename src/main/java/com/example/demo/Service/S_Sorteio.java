package com.example.demo.Service;

import com.example.demo.Model.M_Sorteio;

import java.util.Random;

public class S_Sorteio {
    public static M_Sorteio Sorteador(int quantosNumeros, int numeroMinimo, int numeroMaximo){
        Random random = new Random();
        int resultados[] = new int[quantosNumeros];
        for(int i = 1; i < quantosNumeros; i++){
            resultados[i] = random.nextInt(numeroMaximo)-numeroMinimo;
        }
        M_Sorteio m_sorteio = new M_Sorteio(quantosNumeros, resultados);
        return m_sorteio;
    }
}