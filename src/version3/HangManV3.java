package version3;

import java.util.Scanner;

public class HangManV3 
{
    public static void main(String[] args) 
    {
        //initiering
        String hemligtord = "programmera"; //innehåller ordet som ska gissas fram
        StringBuilder frageTeckenLista = new StringBuilder();//innehåller frågetecknen som skrivs ut
        Scanner sc = new Scanner(System.in);//används vid inmatning
        int antalLiv = 6;//antal gissningar du har
        char gissatTecken;//inmatat tecken du gissar på
        boolean check;//kollar om bokstaven finns med i hemligaordet
        boolean ordRatt = false;// flaggar true om ordet är komplett
        
        //loop för att lägga till frågetecken i listan
        for (int i = 0; i < hemligtord.length(); i++) {
            frageTeckenLista.append('?');
        }//end for
        System.out.println(frageTeckenLista.toString());//skriver ut frågeteckenlistan
               
        while (antalLiv > 0 && ordRatt == false) 
        {
            //Gissa på en bokstav
            System.out.print("Gissa på en bokstav: ");
            gissatTecken = sc.next().charAt(0);
            check = false;

            //Kollar inmatat tecken ersätter frågetecknet om det finns med
            for (int i = 0; i < hemligtord.length(); i++) {
                if(hemligtord.charAt(i) == gissatTecken){
                    frageTeckenLista.setCharAt(i, gissatTecken);
                    check = true;
                }//end if            
            }//end for   
            //kollar om du inte gissat rätt bokstav
            if(check == false){
                antalLiv--;
            }
            System.out.println("");//en ny rad        
            System.out.println("Antal liv " + antalLiv);
            System.out.println(frageTeckenLista.toString());//skriver ut frågeteckenlistan
            //kollar om ordet är rätt 
            if(hemligtord.equals(frageTeckenLista.toString())){
                ordRatt = true;//om ordet är rätt flagga för det här
            }            
        }//end while
        //kollar vad som skrivs ut vid avslutat program
        if(ordRatt == true){
            System.out.println("Bra där!");
        }else{
            System.out.println("Du det där var inte bra :(");
        }
    }//end main    
}//end class
