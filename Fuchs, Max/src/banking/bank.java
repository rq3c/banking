package banking;
import java.util.Scanner;
public class bank extends Thread
{
	
	static Konto[] kl;
    static int max;
    static int nummer = 0;
    static String PINSave= "NOPE";
    static String Zustand = "ready";
    static String Zustand2 = "ready";
    
    
    public static void main(String[]args)
    {
    	Scanner scrun = new Scanner(System.in);
        
    	
        Zustand = "ready";
        Zustand2 = "ready";
        do {
        System.out.println("Was möchten sie tun?");
        System.out.println("1: Guthaben aufladen.");
        System.out.println("2: Guthaben abheben.");
        System.out.println("3: Guthaben anzeigen.");
        System.out.println("4: Neues Konto erstellen.");
        
        switch(scrun.nextInt()){
            case 1:{Zustand = "deposit"; Zustand2 = "KN"; break;
            } case 2:{Zustand = "withdraw"; Zustand2 = "KN"; break;
            } case 3:{Zustand = "balance";  Zustand2 = "KN"; break;
            } case 4:{ 
            	
            	System.out.println("Bitte neue Kontonummer eingeben!");
            	String KNSave = scrun.next();
            	System.out.println("Bitte neuen PIN eingeben");
            	String PSave = scrun.next();
            	
            	newKonto(KNSave, PSave, 0);
            } default:{System.out.println("Something went wrong: Answer not possible."); Zustand = "ready"; break;}
        }
        if(Zustand2 == "KN"){
        	
        	enterKontonummer();      
        }
        if(Zustand2.equals("PIN")){
        	
        	enterPIN();
        }
        if(Zustand2 == "OK")
        {
            if(Zustand.equals("deposit")){
                deposit();
            }else if(Zustand.equals("withdraw")){
            
            }else if(Zustand.equals("balance")){
            
            }else if(Zustand != "ready" || Zustand != "stop"){
                System.out.println("Sie haben einen Punkt erreicht bei dem ich selbst nicht weiß was passiert ist."); break;
            }
        }
        
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            System.out.println(e);
        }
    } while(Zustand == "ready");
    scrun.close();
    }
    

    
    public static void Kontos(int Konten)
    {
        kl= new Konto[Konten];
        max= Konten;
    }
    
    public static void newKonto(String Kontonummer, String PIN, int balance)
    {
        if(nummer <= max)  {
            kl[nummer] = new Konto(Kontonummer, PIN, balance);
            nummer++;
    }
            else {System.out.println("Keine Konten mehr frei.");}
        
    }
    
    public static Konto[]  getkl()
    {
    	return kl;
    }    
    
    public static int  getmax()
    {
    	return max;
    }  
    
    public static int  getnummer()
    {
    	return nummer;
    }  
    
    public static String  getPINSave()
    {
    	return PINSave;
    }  
    
    public static void enterKontonummer() {
    	Scanner scenterKontonummer = new Scanner(System.in);
    	System.out.println("Kartennummer eingeben:");
        do{
            for (int i = 0; i < nummer;)
        {
        if(scenterKontonummer.next() == kl[i].kontoNummer)
        {
            PINSave = kl[i].PIN;
            System.out.println("Kartennummer akzeptiert."); Zustand2 = "PIN";
            break;
        }
        else if(i < nummer-1)
        {
         i++;
        
        }
        else if(i == nummer+1){
        	System.out.println("Kartennummer falsch! Versuche es erneut oder schreibe 'Abbrechen' um zum Start zurückzukehren");
       
        }
        else if (scenterKontonummer.next().equals("Abbruch")) {
        	
        	System.out.println("Abbruch..."); Zustand2= "stop"; break;
        }
       
        }
         }while(Zustand2.equals("KN"));	
        
        
    	
    scenterKontonummer.close();			
    }
    

    
    
    public static void enterPIN() {
    	Scanner scenterPIN = new Scanner(System.in);
    	int t = 3;
        do{
        System.out.println("Pin eingeben(" + t +" Versuche übrig):");
            if(scenterPIN.next()==PINSave){
                Zustand2 = "OK";
            }
            else if(t == 0) {
            	Zustand = "stop";
            	Zustand2 = "stop";
            }
            else{
                t = t-1;
                System.out.println("Wrong Pin!");
                
            }   
        }while(t < 0 || Zustand2.equals("OK"));
        
    scenterPIN.close();
    }
    
    public static void balance(){
    
    	System.out.println("balance");   
    }
    
    public static void deposit(){
        
		System.out.println("deposit");
    }

	public static void withdraw(){
    
		System.out.println("withdraw");        
    }
  }
    
    
   