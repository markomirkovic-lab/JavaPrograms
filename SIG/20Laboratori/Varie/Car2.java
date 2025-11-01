package varie;


//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//Informazioni supplementari non richieste dal corso
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

public class Car2 
{
    public enum Type
    {
        CABRIO_TYPE, PICKUP_TYPE, TAMARRO_TYPE;
    }
    private Type type;           
    
    public enum WheelsSize
    {
        SMALL_WHEELS, BIG_WHEELS, TAMARRO_WHEELS
    }
    private WheelsSize wheelsSize;
    
    
    public enum Hook
    {
        WITH_HOOCK, WITHOUT_HOOK;
    }
    private Hook hook;       
    
    


    public Car2()
    {
        this.setType(Car2.Type.CABRIO_TYPE);
        this.setWheelsSize(Car2.WheelsSize.SMALL_WHEELS);
        this.setHook(Car2.Hook.WITHOUT_HOOK);
    }
    
    
    public Car2(Car2.Type type, Car2.WheelsSize wheelsSize, Car2.Hook hook)
    {
        this.setType(type);
        this.setWheelsSize(wheelsSize);
        this.setHook(hook);
    }
    
    
    public void setHook(Car2.Hook hook)
    {
        this.hook= hook;
    }
    
    public void setType(Type type)
    {
        this.type= type;
    }

    public void setWheelsSize(Car2.WheelsSize wheelsSize)
    {
        this.wheelsSize= wheelsSize;
    }
    
    public Car2.Hook getHook()
    {
        return this.hook;
    }

    public Car2.Type getType()
    {
        return this.type;
    }
    
    public Car2.WheelsSize getWheelsSize()
    {
        return this.wheelsSize;
    }
    
    
    
    public void draw() 
    {      
        String out="";
        
        String hookSpace="";
        String hook= "";
        if(this.getHook()==Car2.Hook.WITH_HOOCK)
        {
            hookSpace= " ";
            hook= "J";
        }
        else 
        {
            hookSpace= "";
            hook="";
        }
        
        
        if(this.getType()==Car2.Type.PICKUP_TYPE)
        {
            out+= hookSpace +"   __\n" +
                  hookSpace +"___|_\\__\n";
        }
        else if(this.getType()==Car2.Type.CABRIO_TYPE)
        {
            out+= hookSpace+"\n" + 
                  hookSpace+"____\\___\n";            
        }
        else if(this.getType()==Car2.Type.TAMARRO_TYPE)
        {
            out+= hookSpace+"*\\\n" + 
                  hookSpace+"__\\_\\___\n";            
        }
        
        
        
        if( this.getWheelsSize()==Car2.WheelsSize.BIG_WHEELS)
        {
            out+= hook+"-O----O-\n";
        }
        else if( this.getWheelsSize()==Car2.WheelsSize.SMALL_WHEELS)
        {
            out+= hook+"-o----o-\n";
        }
        else if( this.getWheelsSize()==Car2.WheelsSize.TAMARRO_WHEELS)
        {
            out+= hook+"-O----o-\n";
        }
        
        
        System.out.println(out);
    }   
}
