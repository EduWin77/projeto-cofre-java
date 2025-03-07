package Empresa;

public class Dolar extends moeda {
	
public Dolar(double value) {
		
		this.value = value;
}

	@Override
	public void info() {
		
		
	}

	@Override
	public double converter() {
		
		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Dolar dolarObject = (Dolar) object;
		
		
		if(this.value != dolarObject.value) {
			return false;
		}
		
		return true;
	}
}