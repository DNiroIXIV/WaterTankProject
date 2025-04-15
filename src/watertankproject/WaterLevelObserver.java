/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watertankproject;

import java.util.ArrayList;

/**
 *
 * @author dinushi
 */
public class WaterLevelObserver implements WaterLevelObserverInterface{

    private final ArrayList<WaterLevelObservable> observableList = new ArrayList<>();
    private int waterLevel;

    public void addWaterLevelObservable(WaterLevelObservable waterLevelObservable) {
        observableList.add(waterLevelObservable);
        waterLevelObservable.update(waterLevel);
    }

    @Override
    public void setWaterLevel(int waterLevel) {
        if (this.waterLevel != waterLevel) {
            this.waterLevel = waterLevel;
            notifyObservers();
        }
    }

    public void notifyObservers() {
        for (WaterLevelObservable waterLevelObservable : observableList) {
            waterLevelObservable.update(waterLevel);
        }
    }
    
    public void removeWaterLevelObservable(WaterLevelObservable waterLevelObservable){
        observableList.remove(waterLevelObservable);
    }
}
