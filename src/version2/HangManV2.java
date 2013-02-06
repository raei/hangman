package version2;

import java.util.Scanner;

public class HangManV2 
{
    public static void main(String[] args) 
    {
        String hemligtord = "programmera"; //innehåller ordet som ska gissas fram
        StringBuilder frageTeckenLista = new StringBuilder();//innehåller frågetecknen som skrivs ut
        Scanner sc = new Scanner(System.in);//används vid inmatning
        int antalLiv = 6;//antal försök
        boolean check = false;//flaggar om du hittat en bokstav i hemligaordet
        char gissatTecken;//inmatat tecken
        
        //loop för att lägga till frågetecken i listan
        for (int i = 0; i < hemligtord.length(); i++) {
            frageTeckenLista.append('?');
        }//end for
        System.out.println(frageTeckenLista.toString());//skriver ut frågeteckenlistan
        
        while (antalLiv > 0) 
        {
            //Gissa på en bokstav
            System.out.print("Gissa på en bokstav: ");
            gissatTecken = sc.next().charAt(0);
            check = false;

            //Kollar inmatat tecken ersätter frågetecknet med inmatat tecken 
            for (int i = 0; i < hemligtord.length(); i++) {
                if(hemligtord.charAt(i) == gissatTecken){//jämför varje pos med inmatat tecken
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
        }//end while
        
        System.out.println("Du det där var inte bra :(");
    }//end main    
}//end class
