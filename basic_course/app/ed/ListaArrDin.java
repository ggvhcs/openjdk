/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author yurisbel
 */
public class ListaArrDin <T> implements ILista<T>{
    private T[] elementos;
    private int longitude;
    
    public ListaArrDin()
    {
       elementos= (T[])new Object[100];
       longitude=0;
    }
    public ListaArrDin(int tamanho)
    {
       elementos= (T[])new Object[tamanho];
       longitude=0;
    }
    @Override
    public int Extensao() {
        return longitude;
    }

    @Override
    public T Obter(int pos) throws Exception {
        if (pos >=0 && pos < Extensao()) 
            return elementos[pos];
        else
            throw new Exception("A posição não é válida"); 
    }

    @Override
    public boolean Vazia() {
        return longitude==0;        
    }
    
    private void Acrecentar ()
    {
        T[] temp= (T[]) new Object[elementos.length*2];
        for (int i = 0; i < longitude; i++) 
            temp[i]=elementos[i];   
        elementos=temp;
    }

    @Override
    public void Adicionar(T novo) {
        if(longitude==elementos.length)
            Acrecentar();
        elementos[longitude]=novo;
        longitude++;        
    }

    @Override
    public void Inserir(T novo, int pos) throws Exception {
        if(pos >=0 && pos < Extensao())
        {
           if(longitude==elementos.length)
              Acrecentar();
           for (int i = longitude - 1; i >= pos; i--) 
               elementos[i + 1] = elementos[i];
           elementos[pos] = novo;
           longitude++;
        }
        else
           throw new Exception("Posição invaido"); 
    }

    @Override
    public T Extrair(int pos) throws Exception {
        if(pos >=0 && pos < Extensao())
        {
           T resultado=elementos[pos];
           for (int i = pos; i <=longitude-1; i++) 
               elementos[i] = elementos[i+1];
        longitude--;
        return resultado;
        }
        else
           throw new Exception("Posição invaido");
    }

    @Override
    public int Procurar(T dado) {
        for (int i = 0; i < Extensao(); i++) {
            if(elementos[i].equals(dado))
                return i;
        }
        return -1;
    }
}
