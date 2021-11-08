package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        // TODO
    	
    	final SportSocialNetworkUserImpl<User> giovanni = new SportSocialNetworkUserImpl<>("Giovanni","Muchacha","artattack",49);
    	final SportSocialNetworkUserImpl<User> claudio = new SportSocialNetworkUserImpl<>("Claudio","Bisio","benvenutoPresidente",53);
    	final SportSocialNetworkUserImpl<User> luigi = new SportSocialNetworkUserImpl<>("Luigi","Mario","greenMario",89);
    	/*
    	 * TEST ON GIOVANNI
    	 */
    	giovanni.addSport(Sport.BASKET);
    	giovanni.addSport(Sport.BIKE);
    	giovanni.addSport(Sport.F1);
    	System.out.println("giovanni è un fan del basket:" + giovanni.hasSport(Sport.BASKET));
    	System.out.println("giovanni va spesso in bicicletta:" + giovanni.hasSport(Sport.BIKE));
    	System.out.println("giovanni NON segue la motoGP:" + !giovanni.hasSport(Sport.MOTOGP));
    	/*
    	 * TEST ON CLAUDIO
    	 */
    	claudio.addSport(Sport.MOTOGP);
    	claudio.addSport(Sport.SOCCER);
    	System.out.println("claudio NON è un fan del basket:" + !claudio.hasSport(Sport.BASKET));
    	System.out.println("claudio gioca a calcio:" + claudio.hasSport(Sport.SOCCER));
    	System.out.println("il presidente segue la motoGP:" + claudio.hasSport(Sport.MOTOGP));
    	/*
    	 * TEST ON LUIGI
    	 */
    	luigi.addSport(Sport.TENNIS);
    	luigi.addSport(Sport.VOLLEY);
    	System.out.println("luigi segue pallavolo:" + luigi.hasSport(Sport.VOLLEY));
    	System.out.println("il fratello minore è un asso a tennis:" + luigi.hasSport(Sport.TENNIS));	
    }
}
