

public class Dogs implements Comparable<Dogs> {
	private String veisle;
	private int amzius;
	private String vardas;
	

	public Dogs(String veisle, int amzius, String vardas) {
		super();
		this.veisle = veisle;
		this.amzius = amzius;
		this.vardas = vardas;		
	}

	public String getVeisle() {
		return veisle;
	}

	public void setVeisle(String veisle) {
		this.veisle = veisle;
	}

	public int getAmzius() {
		return amzius;
	}

	public void setAmzius(int amzius) {
		this.amzius = amzius;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	
	@Override
	public String toString() {
		
		return "Dogs [veisle=" + veisle + ", amzius=" + amzius + ", vardas=" + vardas  + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amzius;
		result = prime * result + ((vardas == null) ? 0 : vardas.hashCode());
		result = prime * result + ((veisle == null) ? 0 : veisle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dogs other = (Dogs) obj;
		if (amzius != other.amzius)
			return false;
		if (vardas == null) {
			if (other.vardas != null)
				return false;
		} else if (!vardas.equals(other.vardas))
			return false;
		if (veisle == null) {
			if (other.veisle != null)
				return false;
		} else if (!veisle.equals(other.veisle))
			return false;
		return true;
	}
	@Override
	public int compareTo(Dogs o) {
		if(this.amzius-o.amzius==0){
		return this.vardas.compareTo(o.getVardas());}
		else{
			return this.getAmzius() - o.getAmzius();
	}
	}	
}	

