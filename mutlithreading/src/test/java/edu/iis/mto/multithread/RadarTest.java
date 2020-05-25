package edu.iis.mto.multithread;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RadarTest {

    private Scud scud;
    private PatriotBattery patriotBattery;
    private int missiles = 0;

    @BeforeEach public void initialization() {
        patriotBattery = mock(PatriotBattery.class);
        scud = new Scud();

    }

    @RepeatedTest(value = 20) public void checkIfBatteryWillLaunchSinglePatriotOnSingleEnemyMissileTest() {
        missiles = 1;
        PatriotLauncher launchPatriotic = new PatriotLauncher(missiles);
        BetterRadar radar = new BetterRadar(patriotBattery, launchPatriotic, missiles);
        radar.notice(scud);
        verify(patriotBattery).launchPatriot(scud);
    }

}
