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
public class Skateboard extends Vechile{
    private double myBoardLenght;
    public Skateboard(){
        setMyBrand("Ally Skate");
        setMyModel("Rocket");
        setMyBoardLenght(54.5);
        System.out.println("Skateboard");
        System.out.println("Brand : "+getMyBrand());
        System.out.println("Model : "+getMyModel());
        System.out.println("Panjangannya Board : "+getMyBoardLenght());
    }

    public double getMyBoardLenght() {
        return myBoardLenght;
    }

    public void setMyBoardLenght(double myBoardLenght) {
        this.myBoardLenght = myBoardLenght;
    }
    
}
