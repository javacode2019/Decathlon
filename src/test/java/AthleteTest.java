import model.Athlete;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AthleteTest {

    @Test
    public void getTotalPointsTest() {

        Athlete a = new Athlete();
        a.setRunning100mScore("12.61");
        a.setLongJumpScore("5.00");
        a.setShortPutScore("9.22");
        a.setHighJumpScore("1.50");
        a.setRunning400mScore("60.39");
        a.setHurdlesScore("16.43");
        a.setDiscusThrowScore("21.60");
        a.setPoleVaultScore("2.60");
        a.setJavelinThrowScore("35.81");
        a.setRunning1500mScore(325.72);

        assertEquals(4200, a.getTotalPoints(), 0.1);
    }

    @Test
    public void setNameTest() {

        Athlete a = new Athlete();
        a.setName("Siim Susi");

        assertEquals("Siim Susi", a.getName());
    }

    @Test
    public void setRunning100mScoreTest() {

        Athlete a = new Athlete();
        a.setRunning100mScore("12.61");

        assertEquals(536, a.getRunning100mScore(), 0.1);
    }

    @Test
    public void setLongJumpScoreTest() {

        Athlete a = new Athlete();
        a.setLongJumpScore("5.0");

        assertEquals(382, a.getLongJumpScore(), 0.1);
    }

    @Test
    public void setShortPutScoreTest() {

        Athlete a = new Athlete();
        a.setShortPutScore("9.22");

        assertEquals(439, a.getShortPutScore(), 0.1);
    }

    @Test
    public void setHighJumpScoreTest() {

        Athlete a = new Athlete();
        a.setHighJumpScore("1.5");

        assertEquals(389, a.getHighJumpScore(), 0.1);
    }

    @Test
    public void setRunning400mScoreTest() {

        Athlete a = new Athlete();
        a.setRunning400mScore("60.39");

        assertEquals(400, a.getRunning400mScore(), 0.1);
    }

    @Test
    public void setHurdlesScoreTest() {

        Athlete a = new Athlete();
        a.setHurdlesScore("16.43");

        assertEquals(685, a.getHurdlesScore(), 0.1);
    }

    @Test
    public void setDiscusThrowScoreTest() {

        Athlete a = new Athlete();
        a.setDiscusThrowScore("21.6");

        assertEquals(302, a.getDiscusThrowScore(), 0.1);
    }

    @Test
    public void setPoleVaultScoreTest() {

        Athlete a = new Athlete();
        a.setPoleVaultScore("2.6");

        assertEquals(264, a.getPoleVaultScore(), 0.1);
    }

    @Test
    public void setJavelinThrowScoreTest() {

        Athlete a = new Athlete();
        a.setJavelinThrowScore("35.81");

        assertEquals(382, a.getJavelinThrowScore(), 0.1);
    }

    @Test
    public void setRunning1500mScoreTest() {

        Athlete a = new Athlete();
        a.setRunning1500mScore(325.72);

        assertEquals(421, a.getRunning1500mScore(), 0.1);
    }

}