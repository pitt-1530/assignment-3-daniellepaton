package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class PlaylistRecommenderTest {

    //tests for classifyEnergy
    @Test
    public void testClassifyEnergyHigh() {
        List<Integer> bpms = Arrays.asList(140, 150, 160);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyMedium() {
        List<Integer> bpms = Arrays.asList(100, 120, 130);
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testClassifyEnergyLow() {
        List<Integer> bpms = Arrays.asList(80, 90, 95);
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(bpms));
    }


    //tests for isValidTrackTitle
    @Test
    public void testIsValidTrackTitleValid() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("My Song Title"));
    }

    
    //tests for normalizeVolume
    @Test
    public void testNormalizeVolumeInRange() {
        assertEquals(50, PlaylistRecommender.normalizeVolume(50));
    }
}
