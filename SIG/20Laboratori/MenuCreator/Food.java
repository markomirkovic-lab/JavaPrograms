package menucreator;

public class Food 
{
    private String nome;    //= "NO NAME";
    private double prezzo;  //=5.0;
    
    
    public Food()
    {
        try
        {
            this.setNome("NO NAME");
            this.setPrezzo(5.0);
        }
        catch(Exception e)
        {
            
        }
    }
    
    public Food(String nome, double prezzo) throws Exception
    {
        this.setNome(nome);
        this.setPrezzo(prezzo);
    }
    
    public void setNome(String nome) throws Exception
    {
        if(nome.trim().length()>50) throw new Exception("Nome non valido " + nome);
        this.nome= nome.trim();
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setPrezzo(double prezzo) throws Exception
    {
        if(prezzo<0) throw new Exception("Prezzo non valido " + prezzo);
        this.prezzo= prezzo;
    }

    public double getPrezzo()
    {
        return this.prezzo;
    }    
    
}
