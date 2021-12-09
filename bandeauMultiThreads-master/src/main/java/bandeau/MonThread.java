/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.List;

/**
 *
 * @author labitbol
 */
public class MonThread extends Thread {
    
    private Bandeau bandeau = new Bandeau();
    private List<ScenarioElement> mesElements;
    
    public MonThread (Bandeau bandeau, List<ScenarioElement> mesElements) {
        this.bandeau = bandeau;
        this.mesElements = mesElements;
    }
    

    
    public void run() {
        for (ScenarioElement element : mesElements) {
            for (int repeats = 0; repeats < element.repeats; repeats++) {
                element.effect.playOn(bandeau);            
            }
        }
    }
    

    
    

}

