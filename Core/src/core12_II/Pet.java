package core12_II;

public class Pet {

	private String petName;

	public Pet(String petName) {
		super();
		this.petName = petName;
	}

	public Pet() {
		super();
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	@Override
	public String toString() {
		return petName + " ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((petName == null) ? 0 : petName.hashCode());
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
		Pet other = (Pet) obj;
		if (petName == null) {
			if (other.petName != null)
				return false;
		} else if (!petName.equals(other.petName))
			return false;
		return true;
	}
	
	
}
