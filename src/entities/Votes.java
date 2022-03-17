package entities;

import java.util.Objects;

public class Votes {
	private String name;
	private Integer amount;
	
	public Votes() {		
	};
	
	public Votes(String name, Integer amount) {
		
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votes other = (Votes) obj;
		return Objects.equals(name, other.name);
	}
	
	

}
