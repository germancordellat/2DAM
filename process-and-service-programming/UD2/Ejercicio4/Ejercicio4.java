public class Ejercicio4 {
	
	public static class Hilo2 extends Thread {
		@Override
		public void run() {
			System.out.println("**** Informaci�n sobre el hilo princpial *****\r\n" + 
					"\r\n" + 
					"Representaci�n intrena del hilo: "+ Thread.currentThread().getId() +"\r\n" + 
					"\r\n" + 
					"Nombre del hilo: "+Thread.currentThread().getName()+"\r\n" + 
					"\r\n" + 
					"Priorodad del hilo: "+Thread.currentThread().getPriority()+"\r\n" + 
					"\r\n" + 
					"Identificador del hilo: "+Thread.currentThread().getId()+"\r\n" + 
					"\r\n" + 
					"N�mero de hilos activos: "+Thread.currentThread().activeCount()+"\r\n" + 
					"\r\n" + 
					"Estado: "+Thread.currentThread().getState()+"\n");
			
		}
	}
	public static class Hilo3 extends Thread {
		@Override
		public void run() {
			System.out.println("**** Informaci�n sobre el hilo princpial *****\r\n" + 
					"\r\n" + 
					"Representaci�n intrena del hilo: "+ Thread.currentThread().getId() +"\r\n" + 
					"\r\n" + 
					"Nombre del hilo: "+Thread.currentThread().getName()+"\r\n" + 
					"\r\n" + 
					"Priorodad del hilo: "+Thread.currentThread().getPriority()+"\r\n" + 
					"\r\n" + 
					"Identificador del hilo: "+Thread.currentThread().getId()+"\r\n" + 
					"\r\n" + 
					"N�mero de hilos activos: "+Thread.currentThread().activeCount()+"\r\n" + 
					"\r\n" + 
					"Estado: "+Thread.currentThread().getState()+"\n");
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("**** Informaci�n sobre el hilo princpial *****\r\n" + 
				"\r\n" + 
				"Representaci�n intrena del hilo: "+ Thread.currentThread().getId() +"\r\n" + 
				"\r\n" + 
				"Nombre del hilo: "+Thread.currentThread().getName()+"\r\n" + 
				"\r\n" + 
				"Priorodad del hilo: "+Thread.currentThread().getPriority()+"\r\n" + 
				"\r\n" + 
				"Identificador del hilo: "+Thread.currentThread().getId()+"\r\n" + 
				"\r\n" + 
				"N�mero de hilos activos: "+Thread.currentThread().activeCount()+"\r\n" + 
				"\r\n" + 
				"Estado: "+Thread.currentThread().getState()+"\n");
		
		Thread hilo2 = new Hilo2();
		hilo2.start();
		
		Thread hilo3 = new Hilo2();
		hilo3.start();
	}
	
}
