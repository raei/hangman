
package version1;

import java.util.Scanner;

public class HangManV1 
{
    public static void main(String[] args) 
    {
        String hemligtord = "programmera"; //innehåller ordet som ska gissas fram
        StringBuilder frageTeckenLista = new StringBuilder();//innehåller frågetecknen som skrivs ut
        Scanner sc = new Scanner(System.in);//används vid inmatning
        
        //loop för att lägga till frågetecken i listan
        for (int i = 0; i < hemligtord.length(); i++) {
            frageTeckenLista.append('?');
        }//end for
        System.out.println(frageTeckenLista.toString());//skriver ut frågeteckenlistan
        
        //Gissa på en bokstav
        System.out.print("Gissa på en bokstav: ");
        char gissatTecken = sc.next().charAt(0);
        
        //Kollar inmatat tecken ersätter frågetecknet om det finns med
        for (int i = 0; i < hemligtord.length(); i++) {
            if(hemligtord.charAt(i) == gissatTecken){
                frageTeckenLista.setCharAt(i, gissatTecken);
            }//end if
        }//end for        
        System.out.println("");//en ny rad        
        System.out.println(frageTeckenLista.toString());//skriver ut frågeteckenlistan          
    }//end main    
}//end class
