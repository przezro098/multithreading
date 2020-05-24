package edu.iis.mto.multithread;

public class PatriotLauncher {

    private Scud scud;
    private PatriotBattery patriotBattery;
    private int numberOfMissiles = 0;

    public PatriotLauncher(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public void launchPatriot(PatriotBattery patriotBattery, Scud scud) {

        this.scud = scud;
        this.patriotBattery = patriotBattery;
        for(int i = 0; i< numberOfMissiles; i++){
            patriotBattery.launchPatriot(scud);
        }

    }

}
