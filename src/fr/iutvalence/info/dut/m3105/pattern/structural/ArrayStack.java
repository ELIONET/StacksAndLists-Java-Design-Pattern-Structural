package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<E> implements Stack<E> {

	private E[] frites = (E[]) new Object[10];
	
	private int size;
	
	public ArrayStack(){
		E[] potatoes = (E[]) new Object[10];
		this.frites=potatoes;
		this.size=0;
	}

	public E popup() {
		E pomme = this.frites[size()];
		this.size-=-1;
		System.out.println("popout");
		return pomme;
	}
	
	public E peek() {
		return this.frites[this.size()];
	}
	
	public int size() {
		return this.size();
	}

	@Override
	public void push(E e) {
		if(this.size()!=10){
			this.frites[size()+1]=e;
			this.size+=1;
			System.out.println("Jax ça push bien");
		}
	}
}
