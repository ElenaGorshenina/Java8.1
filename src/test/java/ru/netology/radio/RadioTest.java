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
        radio.setCurrentFrequencyRadio(7);
        radio.increaseFrequencyRadio();
        assertEquals (8, radio.getFrequencyRadio());
    }

    @Test
    public void decreaseFrequencyRadioTest() {
        radio.setCurrentFrequencyRadio(4);
        radio.decreaseFrequencyRadio();
        assertEquals (3, radio.getFrequencyRadio());
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
        radio.setCurrentVolumeRadio(6);
        radio.increaseVolumeRadio();
        assertEquals (7, radio.getVolumeRadio());
    }

    @Test
    public void decreaseVolumeRadioTest() {
        radio.setCurrentVolumeRadio(5);
        radio.decreaseVolumeRadio();
        assertEquals (4, radio.getVolumeRadio());
    }
}
