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
        WaterLevelObservable waterLevelObservable = new WaterLevelObservable();
        
        waterLevelObservable.addWaterLevelObserver(new AlarmWindow());
        waterLevelObservable.addWaterLevelObserver(new DisplayWindow());
        waterLevelObservable.addWaterLevelObserver(new SplitterWindow());
        waterLevelObservable.addWaterLevelObserver(new SMSSender());
        
        new WaterTank(waterLevelObservable);
    }    
}
