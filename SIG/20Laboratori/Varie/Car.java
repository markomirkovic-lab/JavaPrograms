package varie;

public class Car 
{
    private int type;           
    public final static int CABRIO_TYPE=1;
    public final static int PICKUP_TYPE=2;
    public final static int TAMARRO_TYPE=3;
    
    private int wheelsSize;
    public final static int SMALL_WHEELS=1;
    public final static int BIG_WHEELS=2;
    public final static int TAMARRO_WHEELS=3;
    
    private boolean hook;       //true gancio, false senza gancio
    public final static boolean WITHOUT_HOOK= false;
    public final static boolean WITH_HOOK= true;
    


    public Car()
    {
        this.setType(CABRIO_TYPE);
        this.setWheelsSize(SMALL_WHEELS);
        this.setHook(WITHOUT_HOOK);
    }
    
    public Car(int type, int wheelsSize, boolean hook)
    {
        this.setType(type);
        this.setWheelsSize(wheelsSize);
        this.setHook(hook);
    }
    
    
    public void setHook(boolean hook)
    {
        this.hook= hook;
    }
    
    public void setType(int type)
    {
        if(type!=CABRIO_TYPE && type!=PICKUP_TYPE && type!=TAMARRO_TYPE) this.type= CABRIO_TYPE;
        else this.type= type;
    }

    public void setWheelsSize(int wheelsSize)
    {
        if(wheelsSize!=SMALL_WHEELS && wheelsSize!=BIG_WHEELS && wheelsSize!=TAMARRO_WHEELS) this.wheelsSize= SMALL_WHEELS;
        else this.wheelsSize= wheelsSize;
    }
    
    public boolean getHook()
    {
        return this.hook;
    }

    public int getType()
    {
        return this.type;
    }
    
    public int getWheelsSize()
    {
        return this.wheelsSize;
    }
    
    public void draw() 
    {      
        String out="";
        
        String hookSpace="";
        String hook= "";
        if(this.getHook())
        {
            hookSpace= " ";
            hook= "J";
        }
        else 
        {
            hookSpace= "";
            hook="";
        }
        
        
        if(this.getType()==PICKUP_TYPE)
        {
            out+= hookSpace +"   __\n" +
                  hookSpace +"___|_\\__\n";
        }
        else if(this.getType()==CABRIO_TYPE)
        {
            out+= hookSpace+"\n" + 
                  hookSpace+"____\\___\n";            
        }
        else if(this.getType()==TAMARRO_TYPE)
        {
            out+= hookSpace+"*\\\n" + 
                  hookSpace+"__\\_\\___\n";            
        }
        
        
        
        if( this.getWheelsSize()==BIG_WHEELS)
        {
            out+= hook+"-O----O-\n";
        }
        else if( this.getWheelsSize()==SMALL_WHEELS)
        {
            out+= hook+"-o----o-\n";
        }
        else if( this.getWheelsSize()==TAMARRO_WHEELS)
        {
            out+= hook+"-O----o-\n";
        }
        
        
        System.out.println(out);
    }
    /*

La classe deve esportare due costruttori:

Inoltre deve esportare il metodo public void draw() che stampa la rappresentazione grafica della macchina nei modo seguenti:

                 ruote		 ruote		 ruote		 ruote
                 piccole	 grandi		 piccole	 grandi
						 + traino	 + traino
                    __   	    __   	    __   	    __   
                 ___|_\__	 ___|_\__	 ___|_\__	 ___|_\__
Pickup           -o----o-	 -O----O-	J-o----o-	J-O----O-

                 ____\___	 ____\___	 ____\___	 ____\___
Cabrio           -o----o-	 -O----O-	J-o----o-	J-O----O-

    
    */
}
