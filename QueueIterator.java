/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueIterator;

/**
 *
 * @author kamaj
 */
interface Iterator {
    boolean hasNext();
    String next();
    
}

public class QueueIterator implements Iterator {
	private int i =0;
	private int  current;
    private Queue container; // container on tietorakenne, jota iteroidaan

    QueueIterator (Queue c) { // konstruktori on "package visible"
        container = c;
        current = container.size;
    }
    // palautetaan tieto siitä, löytyyko rakenteesta seuraava alkio
    // hmm... palautetaan tieto siitä, osoittaako nykypositio (current) alkiota vai ei.
    public boolean hasNext() {
        if (current < 0)
            return false;
        else
        	current--;
            return true;
    }
    // palautetaan nykyinen (lista-alkio) ja siirretään nykypositiota pykälä eteenpäin
    public String next() {
    	i = container.top;
        String oldCurrent = container.jono[i];
        i++;
    	 return oldCurrent; 
       
    }

}
