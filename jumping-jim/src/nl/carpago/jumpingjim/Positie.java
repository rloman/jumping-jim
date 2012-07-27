package nl.carpago.jumpingjim;

public class Positie {
	
	private int xCoord;
	private int yCoord;
	
	public Positie(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
	}
	
	public int getXCoord() {
		return xCoord;
	}
	public int getYCoord() {
		return yCoord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + xCoord;
		result = prime * result + yCoord;
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
		Positie other = (Positie) obj;
		if (xCoord != other.xCoord)
			return false;
		if (yCoord != other.yCoord)
			return false;
		return true;
	}
	
	public String toString() {
		return "("+this.getXCoord()+", "+this.getYCoord()+")";
	}
	
	
	
	
	
	
	
	

}
