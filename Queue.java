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

        public String pino[] = new String[100];
		public int index; // top näkyy oletuspakkaukseen
        public int size;
        public int top;

        public Queue() {
        		top=0;
                index = 0;
                size = 0;
        }
        //  palautetaan jono-iteraattori
        public QueueIterator iterator() {
            return new QueueIterator(this);
        }
        // muodostetaan uusi alkio ja viedään se huipulle
        public void push(String aData) {
                String data = aData;
                if(size == pino.length) {
                	System.out.println("Pino on täynnä!");
                	
                } else {
                	pino[index] = data;
                	index++;
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
                if (index == top) {
                        takeAway = pino[top]; // pino on tyhjä
                }
                else
                {               		
                		takeAway = pino[top++];
                		
                }
                if (size >0) {
                	size--;
                }else {
                	size=0;
                }
                	
                return takeAway;
        }
        // palautetaan lisättyjen alkioiden lukumäärä
        public int getSize() {
                return size;
        }
        // listataan sisältö
        public void printItems() {
                int lPointer = top;
                while (lPointer != index) {
                        System.out.print(pino[lPointer]+", ");
                        lPointer++;
                }

        }
}
