package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void notChangeFrequencyMoreMaxTest() {
        radio.setCurrentFrequencyRadio(8);
        radio.setCurrentFrequencyRadio(11);
        assertEquals (8, radio.getFrequencyRadio());
    }
    @Test
    public void notChangeFrequencyLessMinTest() {
        radio.setCurrentFrequencyRadio(5);
        radio.setCurrentFrequencyRadio(-1);
        assertEquals (5, radio.getFrequencyRadio());
    }

    @Test
    public void increaseFrequencyRadioTest() {
        radio.setCurrentFrequencyRadio(9);
        radio.increaseFrequencyRadio();
        assertEquals (0, radio.getFrequencyRadio());
    }

    @Test
    public void decreaseFrequencyRadioTest() {
        radio.setCurrentFrequencyRadio(0);
        radio.decreaseFrequencyRadio();
        assertEquals (9, radio.getFrequencyRadio());
    }

    @Test
    public void notChangeVolumeMoreMaxTest() {
        radio.setCurrentVolumeRadio(3);
        radio.setCurrentVolumeRadio(11);
        assertEquals (3, radio.getVolumeRadio());
    }
    @Test
    public void notChangeVolumeLessMinTest() {
        radio.setCurrentVolumeRadio(1);
        radio.setCurrentVolumeRadio(-1);
        assertEquals (1, radio.getVolumeRadio());
    }

    @Test
    public void increaseVolumeRadioTest() {
        radio.setCurrentVolumeRadio(10);
        radio.increaseVolumeRadio();
        assertEquals (10, radio.getVolumeRadio());
    }

    @Test
    public void decreaseVolumeRadioTest() {
        radio.setCurrentVolumeRadio(0);
        radio.decreaseVolumeRadio();
        assertEquals (0, radio.getVolumeRadio());
    }
}
