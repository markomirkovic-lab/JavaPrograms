/*
11.2 Stipendi, parte due
Al programma precedente aggiungete la seguente funzionalità: dopo l’inserimento dei dati, 
l’utente immette uno stipendio e il programma stampa unicamente quelli che hanno uno 
stipendio inferiore a quanto immesso.
Sapreste fare tutto tramite un menu con due opzioni? Una per inserire e l’altra per ricercare 
gli stipendi al di sotto di un limite.
*/

import java.util.Scanner;

public class Es11_2_Stipendi2 {

        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numeroDipendenti;
        String nome[];
        double stipendo[]; 
        double stipendioInferioreA = 0;

        int scelta;
        boolean ripeti = true;

        System.out.print("Inserisci il numero (numero intero) dei dipendenti: ");
        numeroDipendenti = input.nextInt();
        input.nextLine();
        System.out.println("La ditta ha " + numeroDipendenti + " dipendenti.");

        nome = new String[numeroDipendenti];
        stipendo = new double[numeroDipendenti];


        do {
            // Menu
            System.out.println("Programma per stipendi \n\n\n******************\n");
            System.out.println("1. Inserire dipendenti con nome e stipendio.");
            System.out.println("2. Stampa lista dipendeti con lo stipendio.");
            System.out.println("3. Stampa dipendenti con lo stipendio inferiore ad un certo importo.");
            System.out.println("0. Esci.");
            System.out.print("Scelta: ");

            if(input.hasNextInt()) {

                scelta = input.nextInt();

                switch (scelta) {

                    case 0:
                        ripeti = false;
                        break;

                    case 1:
                        for(int i = 0; i < nome.length; i++) {

                            input.nextLine();
                
                            System.out.print("Inserisci il nome del dipendente nr. " + (i+1) + ": ");
                            nome[i] = input.nextLine();

                            System.out.print("Inserisci lo stipendio del dipendente nr. " + (i+1) + ": ");
                            stipendo[i] = input.nextDouble();
                        }
                        break;
                    
                    case 2:
                        System.out.println();
                        System.out.println("Lista dipendenti e stipendi: \n****************************\n");
                        for(int i = 0; i < nome.length; i++) {

                            System.out.print("Nome e stipendio del dipendente nr. " + (i+1) + ": " + nome[i] + ", " + stipendo[i] + "\n");
                        }
                        System.out.println();
                        break;
                    
                    case 3:
                        System.out.print("Inserisci a quanto amonta lo stipendio inferiore: ");
                        stipendioInferioreA = input.nextDouble();
                        input.nextLine();

                        System.out.println("Lista dipendenti e stipendi:\ncon stipendio inferiore a: " + stipendioInferioreA +
                                           "\n**********************************\n");
                        for(int i = 0; i < nome.length; i++) {

                            if(stipendo[i] < stipendioInferioreA) {
                                System.out.print("Nome e stipendio del dipendente nr. " + (i+1) + ": " + nome[i] + ", " + stipendo[i] + "\n");
                            }
                            
                        }
                        System.out.println();
                        break;

                    default:
                        break;
                }
            }

        } while(ripeti);

        input.close();
    }
    
}
