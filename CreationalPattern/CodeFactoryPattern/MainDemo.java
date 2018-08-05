/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author Nik
 */
public class MainDemo {
    public static void main(String [] agrs){
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shapeC = shapeFactory.getShape("Circle");
        shapeC.draw();
        
        Shape shapeR = shapeFactory.getShape("Rectangle");
        shapeR.draw();
        
        Shape shapeS = shapeFactory.getShape("Square");
        shapeS.draw();
    }
    
}
