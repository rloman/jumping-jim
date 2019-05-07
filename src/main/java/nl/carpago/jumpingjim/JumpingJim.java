package nl.carpago.jumpingjim;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class JumpingJim {
	
	private Bord bord = new Bord();
	private List <Positie> oplossing;// = new LinkedList<Positie>();
	
	public void zoekPad() {
		Positie start = new Positie(0,0);
		this.oplossing = dfs(start, new HashSet<Positie>());
	}
	
	private List<Positie> dfs(Positie vanaf, Set<Positie> bezocht) {
		List <Positie> result = new LinkedList<Positie>();
		
		result.add(vanaf);
		bezocht.add(vanaf);
		
		if(this.bord.isGoal(vanaf)) {
			
			return result;
		}
		Set <Positie> buurknopen = bord.getBuurknopen(vanaf);
		for(Positie buurknoop : buurknopen) {
			if(!bezocht.contains(buurknoop)) {
				List<Positie> l = dfs(buurknoop, bezocht);
				if(goalIsReached(l)) {
					result.addAll(l);
					
					return result;
				}
			}
			
		}
		
		return new LinkedList<Positie>();
	}
	
	
	private boolean goalIsReached(List<Positie> knopen) {
		return !knopen.isEmpty();
	}
	
	public void drukOplossingAf() {
		for(Positie pos : this.oplossing) {
			System.out.println(pos);
		}
	}

}
