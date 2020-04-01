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
public class Menu {
//main alkaa-----------------------------------------------------------------------------
        public static void main(String[] args) {

                        printMenu();

        }
//main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
        private static void printMenu() {
                char select;
                Queue s = new Queue(); // jono-olio
                String data; // Jonon data-kenttä
                do {

                        System.out.println("\n\t\t\t1. Alkion lisääminen.");
                        System.out.println("\t\t\t2. Alkion poistaminen.");
                        System.out.println("\t\t\t3. Jonon sisältö.");
                        System.out.println("\t\t\t4. Alkioiden lukumäärä.");
                        System.out.println("\t\t\t5. Jonon sisältö iteraattorilla selattuna.");
                        System.out.println("\t\t\t6. lopetus ");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            System.out.println("Anna alkion sisältö (merkkijono)");
                            data = new String(Lue.rivi());
                            s.push(data);
                            break;
                        case '2':
                            String item = s.pop();
                            if (item == null)
                                System.out.println("Pino on tyhjä");
                            else
                                System.out.println("Poistettu alkio: "+item);
                            break;
                        case '3':
                            s.printItems();
                            break;
                        case '4':
                            System.out.println("Lukumäärä = "+s.getSize());
                            break;
                        case '5':
                            QueueIterator itr = s.iterator();
                            int i=0;
                            while (itr.hasNext())
                            	while(itr.next(i) != null) {
                                System.out.println(itr.next(i));
                                i++;
                            	}
                            
                            break;
                        case '6':
                            break;
                        }
                }
                while (select != '6');
        }
//printMenu loppuu ----------------------------------------------------------------
}