/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varie;

/**
 *
 * @author gisi
 */
public class ZZZ_TestCar 
{
    public static void main(String[] args) 
    {
        Car x= new Car();
        
        x.draw();
        
        
        Car y= new Car(2, 2, true);
        y.draw();
        
        
        Car z= new Car(Car.TAMARRO_TYPE, Car.TAMARRO_WHEELS, Car.WITH_HOOK);
        z.draw();
        
        
        Car2 k= new Car2();
        
        k.setType(Car2.Type.CABRIO_TYPE);
    }
}
