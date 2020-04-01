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
public class Queue {

        public String jono[] = new String[100];
	
        public int size;
        public int top;  // top kuuluu oletuspakkaukseen

        public Queue() {
        		top=0;
               
                size = 0;
        }
        //  palautetaan jono-iteraattori
        public QueueIterator iterator() {
            return new QueueIterator(this);
        }
        // muodostetaan uusi alkio ja viedään se huipulle
        public void push(String aData) {
                String data = aData;
                if(size == jono.length) {
                	System.out.println("Pino on täynnä!");
                	
                } else {
                	jono[size] = data;
                	size++;
                } 
        		/*ListItem newItem = new ListItem(); // luodaan uusi lista-alkio
                newItem.setData(aData);
                newItem.setLink(top); // kytketään uusi alkio aikaisempaan huippualkioon
                top = newItem; // uusi alkio pinon 1:ksi
                size++;*/
        }
        // poistetaan alkio jonon perältä, jos jonossa ei alkioita palautetaan null
        public String pop() {
                String takeAway;
                if (size == 0) {
                	takeAway = jono[top];
                		top = size;
                		System.out.println("top: " +top);
                		System.out.println("size: " +size);
                         // pino on tyhjä
                		jono[0]=null; //nullifoidaan ensimmäisen alkion sisältö
                }
                	
                	else
                {          
                	
                		takeAway = jono[top++];
                		System.out.println("top: " +top);
                		System.out.println("size: " +size);
                		  if(size < 0){
                          	size=0;
                        	
                          }
                }
                if (size > 0) {
                 if(size == 0){
                    	top=size;
                    	size=0;
                    	
                    			
                    }
                	size--;	
                }
                      	
                return takeAway;
        }
        // palautetaan lisättyjen alkioiden lukumäärä
        public int getSize() {
                return size;
        }
        // listataan sisältö
        public void printItems() {
                int lPointer = 0;
                while (lPointer != size) {
                		if(jono[lPointer] != null) {
                            System.out.print(jono[lPointer]+", ");
                            lPointer++;
                		} else {
                			lPointer = size;
                		}

                }

        }
}
