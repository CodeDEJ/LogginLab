import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LogginLabTest {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void thresholdExceeds() {
        Integer finalLimit = 5;

        LogginLab lab = new LogginLab();
        lab.setThreshold(finalLimit);

        for (Integer i = 1; i <= finalLimit; i++) {
            if (lab.thresholdExceeds(i)) {
                logger.log(Level.INFO, "Threshold not reached! It is " + i);
                assertTrue(lab.thresholdExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdExceeds(i));
            }
        }
    }

    @Test
    public void thresholdReached1() {
        Integer limit = 5;
        Integer threshold = 4;

        LogginLab lab = new LogginLab();
        lab.thresholdReached(limit, threshold);


        for (Integer i = limit; i < threshold + 1; i++) {
            if (i > threshold) {
                logger.log(Level.INFO, "Threshold not reached! It is " + i);
                assertTrue(lab.thresholdReached(i, threshold));
            } else if (i < threshold) {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdReached(i, threshold));

            }
        }
    }

@Test
    public void thresholdReached2() {
        Integer limit = 5;
        Integer threshold = 6;

        LogginLab lab = new LogginLab();
        lab.thresholdReached(limit, threshold);


        for (Integer i = limit; i < threshold + 1; i++) {
            if (i > threshold) {
                logger.log(Level.INFO, "Threshold not reached! It is " + i);
                assertTrue(lab.thresholdReached(i, threshold));
            } else if (i < threshold) {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdReached(i, threshold));

            }
        }
    }
}