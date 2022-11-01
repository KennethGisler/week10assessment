package myProject.beans;

import javax.persistence.Embeddable;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Nov 1, 2022
 */
@Embeddable
public class Stats {
	private int movement,strength, toughness, attacks, ballisticsSkill, weaponsSkill, leadership, wounds ,save;
	
	//constructors
	public Stats() {
		super();
	}
	public Stats(int move,int str, int tou, int att, int bs, int ws, int ld, int w,int sv) {
		this.movement = move;
		this.strength = str;
		this.toughness = tou;
		this.attacks = att;
		this.ballisticsSkill = bs;
		this.weaponsSkill = ws;
		this.leadership = ld;
		this.wounds = w;
		this.save = sv;
	}
	
	//getters
	public int getStrength() {
		return strength;
	}
	public int getToughness() {
		return toughness;
	}
	public int getAttacks() {
		return attacks;
	}
	public int getBallisticsSkill() {
		return ballisticsSkill;
	}
	public int getWeaponsSkill() {
		return weaponsSkill;
	}
	public int getLeadership() {
		return leadership;
	}
	public int getWounds() {
		return wounds;
	}
	public int getMovement() {
		return this.movement;
	}
	public int getSave() {
		return this.save;
	}
	
	//setters
	public void setMovement(int move) {
		this.movement = move;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setToughness(int toughness) {
		this.toughness = toughness;
	}
	public void setAttacks(int attacks) {
		this.attacks = attacks;
	}
	public void setBallisticsSkill(int ballisticsSkill) {
		this.ballisticsSkill = ballisticsSkill;
	}
	public void setWeaponsSkill(int weaponsSkill) {
		this.weaponsSkill = weaponsSkill;
	}
	public void setLeadership(int leaderShip) {
		this.leadership = leaderShip;
	}
	public void setWounds(int wounds) {
		this.wounds = wounds;
	}
	public void setSave(int sv) {
		this.save = sv;
	}
	
	//methods
	@Override
	public String toString() {
		return "[M:" + movement +"\"][WS:" + weaponsSkill+"+][BS:" + ballisticsSkill + "+][S:" + strength + "][T:" + toughness + 
				"][W:" + wounds +"][A:" + attacks + "][Ld:" + leadership + "][Sv" + save +"+]";
	}
	
}
