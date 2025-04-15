/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package watertankproject;

/**
 *
 * @author dinushi
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WaterTank waterTank = new WaterTank();
        
        WaterLevelObserver waterLevelObserver = new WaterLevelObserver();
        
        waterTank.addWaterLevelObserver(waterLevelObserver);
        
        waterLevelObserver.addWaterLevelObservable(new AlarmWindow());
        waterLevelObserver.addWaterLevelObservable(new DisplayWindow());
        waterLevelObserver.addWaterLevelObservable(new SplitterWindow());              
        waterLevelObserver.addWaterLevelObservable(new SMSSenderWindow());
    }    
}
