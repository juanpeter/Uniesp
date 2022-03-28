package facade;

public class EmuladorSmartphone {

	public Smartphone emularAndroid() {
		Smartphone emulador = new Android12();
		return emulador;
	}
	
	public Smartphone emularIOS() {
		Smartphone emulador = new IOS154();
		return emulador;
	}
}
