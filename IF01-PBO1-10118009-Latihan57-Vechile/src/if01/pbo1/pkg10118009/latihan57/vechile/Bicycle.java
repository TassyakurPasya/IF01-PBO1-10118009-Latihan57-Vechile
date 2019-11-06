/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan57.vechile;

/**
 *
 * @author user
 */
public class Bicycle extends Vechile{
    private int myGearCount;
    public Bicycle(){
        setMyBrand("Trek Bike");
        setMyModel("7.4FX");
        setMyGearCount(23);
        System.out.println("Bicyle");
        System.out.println("Brand : "+getMyBrand());
        System.out.println("Model : "+getMyModel());
        System.out.println("Jumlah Gaer : "+getMyGearCount());
        
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}
