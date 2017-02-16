package net.vanheesch.dea.BeerDrinkerCompetition;

import java.util.ArrayList;

public class Party {
	
	public static void main(String[] args) {
		
		// Initialize new Grolsch keg with 50l
		Keg grolsch = new Keg(50000);
		
		
		ArrayList<BeerDrinker> drinkers = new ArrayList<BeerDrinker>();
		
		drinkers.add(new BeerDrinker("Meron", grolsch));
		drinkers.add(new BeerDrinker("Robin", grolsch));
		drinkers.add(new BeerDrinker("Koen", grolsch));
		drinkers.add(new BeerDrinker("Leon", grolsch));
		drinkers.add(new BeerDrinker("Anne", grolsch));
		
		for(BeerDrinker drinker : drinkers){
			new Thread(drinker).start();
		}
		
	}
	

}
