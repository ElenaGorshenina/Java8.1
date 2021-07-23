package ru.netology.radio;

public class Radio {
    private int currentFrequencyRadio;
    private int minFrequencyRadio = 0;
    private int maxFrequencyRadio = 9;
    private int currentVolumeRadio;
    private int minVolumeRadio = 0;
    private int maxVolumeRadio = 100;

    public Radio(){}

    public Radio(int currentFrequencyRadio) {
        this.currentFrequencyRadio = currentFrequencyRadio;
        maxFrequencyRadio = currentFrequencyRadio;
    }

    public void setCurrentFrequencyRadio(int currentFrequencyRadio) {
        if (currentFrequencyRadio < minFrequencyRadio) {
            return;
        }
        if (currentFrequencyRadio > maxFrequencyRadio) {
            return;
        }
        this.currentFrequencyRadio = currentFrequencyRadio;
    }

    public int getFrequencyRadio() {
        return currentFrequencyRadio;
    }

    public void increaseFrequencyRadio() {
        if (currentFrequencyRadio >= maxFrequencyRadio) {
            currentFrequencyRadio = minFrequencyRadio;
        } else {
            currentFrequencyRadio += 1;
        }
    }

    public void decreaseFrequencyRadio() {
        if (currentFrequencyRadio <= minFrequencyRadio) {
            currentFrequencyRadio = maxFrequencyRadio;
        } else {
            currentFrequencyRadio -= 1;
        }
    }

    public void setCurrentVolumeRadio(int currentVolumeRadio) {
        if (currentVolumeRadio < minVolumeRadio) {
            return;
        }
        if (currentVolumeRadio > maxVolumeRadio) {
            return;
        }
        this.currentVolumeRadio = currentVolumeRadio;
    }

    public int getVolumeRadio() {
        return currentVolumeRadio;
    }

    public void increaseVolumeRadio() {
        if (currentVolumeRadio < maxVolumeRadio) {
            currentVolumeRadio += 1;
        }
    }

    public void decreaseVolumeRadio() {
        if (currentVolumeRadio > minVolumeRadio) {
            currentVolumeRadio -= 1;
        }
    }
}
