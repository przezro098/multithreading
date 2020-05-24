package edu.iis.mto.multithread;

public class BetterRadar {

    private PatriotBattery patriotBattery;
    private PatriotLauncher patriotLauncher;
    private int numberOfMissiles;

    public BetterRadar(PatriotBattery battery, PatriotLauncher patriotLauncher, int numberOfMissiles) {
        this.patriotBattery = battery;
        this.patriotLauncher = patriotLauncher;
        this.numberOfMissiles = numberOfMissiles;
    }

    public void notice(Scud enemyMissile) {
        patriotLauncher.launchPatriot(patriotBattery, enemyMissile);
    }

}
