package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { //Estamos definindo que nossa classe aceita qualquer tipo T
	
	private List<T> list = new ArrayList<>(); //Lista do tipo "T" (Qualquer coisa)
	//A lista foi criada na classe, pois somente ela sera responsavel por ela
	
	public void addValue(T value) { //Aqui o método deve receber um metodo genérico "T" (Qualquer coisa)
		list.add(value);
	}
	
	public T first() { //Primeiro valor da lista de qualquer tipo "T"
		if(list.isEmpty()) { //Funcao para verificar se a lista está vazia
			throw new IllegalStateException("The list is empty!"); //Exception de estado ilegal, caso a lista esteja vazia
		}
		return list.get(0); //Retorna o primeiro elemento da lista
	}
	
	public void print() {
		if(!list.isEmpty()) { //Checando se a lista não esta vazia
		System.out.print("[" + list.get(0)); //Pegando e mostrando o primeiro elemento da lista
		}
		for(int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i)); //Complementando o primeiro elemento com os restantes da lista
		}
		System.out.println("]"); //Finalizando o output dos elementos
	}
}
