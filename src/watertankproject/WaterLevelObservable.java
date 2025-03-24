/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watertankproject;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author dinushi
 */
public class WaterLevelObservable {

    private ArrayList<WaterLevelObserver> observerList = new ArrayList<>();
    private int waterLevel;

    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver) {
        observerList.add(waterLevelObserver);
    }

    public void setWaterLevel(int waterLevel) {
        if (this.waterLevel != waterLevel) {
            this.waterLevel = waterLevel;
            notifyObservers();
        }
    }

    public void notifyObservers() {
        for (WaterLevelObserver waterLevelObserver : observerList) {
            waterLevelObserver.update(waterLevel);
        }
    }
}
