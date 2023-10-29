import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.nextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreviousStationBeforeMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextmoreVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);

        radio.moreVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextlessVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);

        radio.lessVolume();

        int expected = 97;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.moreVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LessVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.lessVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(115);

        radio.moreVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-4);

        radio.lessVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}