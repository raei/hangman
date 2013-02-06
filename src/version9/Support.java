package version9;

import java.util.Random;

public class Support {

    
    //Välkomst text
    public void welcome() {
        System.out.println("Välkommen försök klara er från hängning ");
        System.out.println("Lycka till!\n");
    }
    
    //Returnerar ett hemligtord ur en lista
    public String hamtaHemligtOrd(){        
         String[] hemligaOrdListan = {"abstract",
            "assert",
            "boolean",
            "break",
            "byte",
            "case",
            "catch",
            "char",
            "class",
            "const",
            "continue",
            "do",
            "double",
            "else",
            "enum",
            "extends",
            "final",
            "finally",
            "float",
            "for",
            "goto",
            "if",
            "implements",
            "import",
            "instanceof",
            "int",
            "interface",
            "long",
            "native",
            "new",
            "package",
            "private",
            "protected",
            "public",
            "return",
            "short",
            "static",
            "strictfp",
            "super",
            "switch",
            "synchronized",
            "this",
            "throw",
            "throws",
            "transient",
            "try",
            "void",
            "volatile",
            "while"
        }; //end hemliga ord listan arrayen       
        Random slump = new Random();//anropar random klassen som fixar slumpen
        int slumptal = slump.nextInt(hemligaOrdListan.length); //slumpar ett tal från listans storlek      
        String hemligtOrd = hemligaOrdListan[slumptal]; 
        return  hemligtOrd;
    }//end hamtaHemligtOrd 
    
    public void ritaGubbe(int antalLiv){
        
        switch (antalLiv) {
                case 5:                    
                    System.out.println("    XXXXXXXXXXXXX");
                    System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXX");  
                    break;
                case 4:              
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("    XXXXXXXXXXXXX");
                    System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXX"); 
                    break;
                case 3:
                   System.out.println("          ===============");
                    System.out.println("          || //        ");
                    System.out.println("          ||//         ");
                    System.out.println("          ||           ");
                    System.out.println("          ||           ");
                    System.out.println("          ||           ");
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("    XXXXXXXXXXXXX");
                    System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXX");  
                    break;
                case 2:
                   System.out.println("          ===============");
                    System.out.println("          || //         |");
                    System.out.println("          ||//          |");
                    System.out.println("          ||           ");
                    System.out.println("          ||           ");
                    System.out.println("          ||           ");
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("    XXXXXXXXXXXXX");
                    System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXX"); 
                    break;
                case 1:
                    System.out.println("          ===============");
                    System.out.println("          || //         |");
                    System.out.println("          ||//          |");
                    System.out.println("          ||           ( )");
                    System.out.println("          ||           ");
                    System.out.println("          ||           ");
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("    XXXXXXXXXXXXX");
                    System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXX"); 
                    break;
                case 0:
                    System.out.println("          ===============");
                    System.out.println("          || //         |");
                    System.out.println("          ||//          |");
                    System.out.println("          ||           ( )");
                    System.out.println("          ||           -|-");
                    System.out.println("          ||           / \\");
                    System.out.println("          ||");
                    System.out.println("          ||");
                    System.out.println("    XXXXXXXXXXXXX");
                    System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXX"); 
                    break;               
            }//end switch
            System.out.println("");
            
    }//end ritaGubbe
}//end class
