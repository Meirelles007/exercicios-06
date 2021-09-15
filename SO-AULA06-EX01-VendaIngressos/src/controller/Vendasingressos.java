package controller;
import java.util.concurrent.Semaphore;

public class Vendasingressos extends  Thread{
		private int comprador;
		private int ingressos;
		private Semaphore semaphore;
		
	public Vendasingressos(int comprador, int ingressos, Semaphore semaphore) {
		this.comprador= comprador;
		this.ingressos =ingressos;
		this.semaphore = semaphore;
	}
	
	public void run() {

		comprador = login(comprador);
		comprador = processousuario(comprador);
		
	}

	private int login(int comprador) {

		int tempo = (int)((Math.random() * 2000) + 50);
		System.out.println(tempo);
		int aux = 0;
		try {
			sleep(tempo);
			if(tempo>3000) {
				System.err.println(comprador + " ==>Timeout");
			}else {
				aux = comprador;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return aux;
	}
	
	private int processousuario(int comprador) {
		int tempo = (int)((Math.random() * 3000) + 1000);
		int aux=0;
		System.err.println(tempo);
		try {
			sleep(tempo);
			if(tempo>5500) {
				System.err.println(comprador + "Timeout");
			}else {
				aux = comprador;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return aux;
	}
}
