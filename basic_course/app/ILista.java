/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author yurisbel
 */
public interface ILista <T> {
    public int Extensao();
    public T Obter(int pos) throws Exception;
    public boolean Vazia();
    public void Adicionar(T novo)throws Exception;  //en caso que el array estático este lleno
    public void Inserir(T novo, int pos)throws Exception;
    public T Extrair(int pos)throws Exception;
    public int Procurar(T dado);    
}
