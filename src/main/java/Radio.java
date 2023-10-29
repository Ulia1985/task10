public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberStation = 10;
    private int minStation = 0;
    private int maxStation = numberStation - 1;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int numberStation) {
        maxStation = numberStation - 1;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }

    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;

        }
        currentVolume = newCurrentVolume;
    }

    public void moreVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;

        } else {
            currentVolume = maxVolume;
        }
    }

    public void lessVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;

        } else {
            currentVolume = minVolume;
        }
    }
}