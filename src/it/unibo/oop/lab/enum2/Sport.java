/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
import static it.unibo.oop.lab.enum2.Place.*;

public enum Sport {

    /*
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(INDOOR,9,"Basketball"),
	VOLLEY(INDOOR,9,"Volleyball"),
	TENNIS(OUTDOOR,1,"Tennis"),
	BIKE(OUTDOOR,1,"Biking"),
	F1(OUTDOOR,1,"Formula1"),
	MOTOGP(OUTDOOR,1,"MotoGP"),
	SOCCER(OUTDOOR,12,"Soccer");
	
	

    /*
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final Place place;
	private final int noTeamMembers;
	private final String actualName;
    /*
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.place = place;
		this.noTeamMembers = noTeamMembers;
		this.actualName = actualName;
	}

    /*
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public boolean isIndividualSport() {
		return this.noTeamMembers == 1;
	}
	
	public boolean isIndoorSport() {
		return this.place == INDOOR;
	}
	
	public Place getPlace() {
		return this.place;
	}
	
	public String toString() {
		return "Sport: " + this.actualName +"; Place: " + this.place + "; is the sport individual? " + this.noTeamMembers; 
	}
}
