package ejercicio11;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	private static final int PORT = 9876;

	private static Socket socket = null;
	private static ObjectOutputStream objetOutputStream = null;
	private static ObjectInputStream objetInputStream = null;

	private static Scanner scanner = new Scanner(System.in);
	
	private static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
	
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
		InetAddress host = InetAddress.getLocalHost();
		socket = new Socket(host.getHostName(), PORT);
		
		objetOutputStream = new ObjectOutputStream(socket.getOutputStream());
		
		String msg = null;
		do {
			msg = scanner.nextLine();
		} while(!isNumeric(msg));

		objetOutputStream.writeObject(msg);
		
		objetInputStream = new ObjectInputStream(socket.getInputStream());
		String message = (String) objetInputStream.readObject();
		System.out.println("(CLIENTE) Mensaje recibido: " + message);
		
		objetInputStream.close();
		objetOutputStream.close();
		Thread.sleep(100);
	}
}
