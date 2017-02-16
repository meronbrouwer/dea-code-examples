package net.vanheesch.dea.BeerDrinkerCompetition;

public class Keg {
	
	private final int capacityInMl;
	private int remainingCapacityInMl;

	public Keg(int capacityInMl) {
		this.capacityInMl = capacityInMl;
		this.remainingCapacityInMl = capacityInMl;
	}

	public int getRemainingVolume() {
		return this.remainingCapacityInMl;
	}
	
	public synchronized int tap(int volumeInMl){
		if(volumeInMl > this.remainingCapacityInMl){
			volumeInMl = this.remainingCapacityInMl;
		}
		
		this.remainingCapacityInMl -= volumeInMl;
		return volumeInMl;
	}

	public int getCapacityInMl() {
		return capacityInMl;
	}

}
