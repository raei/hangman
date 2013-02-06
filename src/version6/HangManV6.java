package version6;
//Fixa den här
import java.util.Scanner;

public class HangManV6 
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
        StringBuilder felTecken = new StringBuilder();//Lista med felaktiga tecken
        
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
            gissatTecken = Character.toLowerCase(gissatTecken);
            check = false;

            //Kollar inmatat tecken ersätter frågetecknet om det finns med
            for (int i = 0; i < hemligtord.length(); i++) {
                if(hemligtord.charAt(i) == gissatTecken){
                    frageTeckenLista.setCharAt(i, gissatTecken);
                    //placerar inamtat tecken på rätt plats i frågeteckenlistan
                    check = true;//flaggar att du gissat rätt bokstav
                }//end if            
            }//end for   
            //kollar om du inte gissat rätt bokstav
            if(check == false){
                antalLiv--;
                felTecken.append(gissatTecken);//lägg till tecken som är fel                
            }
            System.out.println("");//en ny rad        
            System.out.println("Antal liv " + antalLiv);//skriver ut liv du har kvar
            System.out.println(frageTeckenLista.toString());//skriver ut frågeteckenlistan
            System.out.println("Använda tecken: " + felTecken.toString());//skriver ut felaktiga tecken
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
            System.out.println("Ordet var " + hemligtord);//skriver ut hemligtord
        }
    }//end main    
}//end class
