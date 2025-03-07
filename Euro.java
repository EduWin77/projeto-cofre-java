package Empresa;

public class Euro extends moeda {

public Euro(double value) {
		
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
		
		Euro euroObject = (Euro) object;
		
		
		if(this.value != euroObject.value) {
			return false;
		}
		
		return true;

	}	
	
	
	
}
