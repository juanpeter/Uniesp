package facade;

public class Main {

	public static void main(String[] args) {
		
		EmuladorSmartphone emulador = new EmuladorSmartphone();
		
		Smartphone android = emulador.emularAndroid();
		
		System.out.println(android);
	}
}
