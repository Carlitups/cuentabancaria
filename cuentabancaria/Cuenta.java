package cuentabancaria;

public class Cuenta {
	private static long numcuenta = 100002;
	private long numeroCuenta;
	private String dni;
	private double saldo;
	private double interes;
	
	public Cuenta() {
		
	}
	  public Cuenta(String dni,
			double saldo, double interes) {
		this.numeroCuenta = Cuenta.numcuenta++;
		Cuenta.numcuenta = Cuenta.numcuenta ++;
		this.dni = dni;
		this.saldo = saldo;
		this.interes = interes;
	} 

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	public void actualizarSaldo() {
		setSaldo(getSaldo() - (getSaldo() * 
				((getInteres() / 365)/100)));
	}
	public void ingresar(double cantidad) {
		setSaldo(getSaldo() + cantidad);
	}
	public void retirar(double cantidad) {
		setSaldo(getSaldo() - cantidad);
	}
	public void datosCuenta() {
		System.out.println("numeroCuenta: " + getNumeroCuenta());
		System.out.println("dni: " + getDni());
		System.out.println("saldo: " + getSaldo());
		System.out.println("interes: " + getInteres());
	}
	
	
	
	
}
