package nl.carpago.jumpingjim;

import java.util.HashSet;
import java.util.Set;

public class Bord {
	
	private final int SIZE = 7;
	private final int GOAL = 0;
	
	private int[][] bord = 
		{
			{3,6,4,3,2,4,3},
			{2,1,2,3,2,5,2},
			{2,3,4,3,4,2,3},
			{2,4,4,3,4,2,2},
			{4,5,1,3,2,5,4},
			{4,3,2,2,4,5,6},
			{2,5,2,5,6,1,GOAL}
		};
	
	public Set<Positie> getNeighbours(Positie vanaf) {
		Set<Positie> result = new HashSet<Positie>();
		
		int x = vanaf.getXCoord();
		int y = vanaf.getYCoord();
		int v = bord[x][y];
		
		if(x+v < SIZE) {
			result.add(new Positie(x+v,y));
		}
		if(x-v >=0) {
			result.add(new Positie(x-v,y));
		}
		if(y+v < SIZE) {
			result.add(new Positie(x,y+v));
		}
		if(y-v >= 0) {
			result.add(new Positie(x,y-v));
		}
		
		return result;
	}
	
	public boolean isGoal(Positie pos) {
		return this.bord[pos.getXCoord()][pos.getYCoord()] == GOAL;
	}
}
