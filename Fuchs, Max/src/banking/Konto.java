package banking;

public class Konto
{
	String kontoNummer;
    String PIN;
    int balance;
    public Konto(String k, String PIN)
    {
        kontoNummer = k;
        this.PIN = PIN;
        balance = 0;
    }
    public Konto(String k, String PIN, int balance)
    {
        kontoNummer = k;
        this.PIN = PIN;
        this.balance = balance;
    }
    
    public String getkontoNummer()
    {
        return kontoNummer;
    }
    
    public String getPIN()
    {
        return PIN;
    }
    
    public int getbalance()
    {
        return balance;
    }
}