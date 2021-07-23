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
    public void inputNumberFrequencyRadio() {
        Radio radio = new Radio(3);
        assertEquals(3, radio.getFrequencyRadio());
    }

    @Test
    public void increaseFrequencyRadioParam() {
        Radio radio = new Radio(8);
        radio.setCurrentFrequencyRadio(5);
        radio.increaseFrequencyRadio();
        assertEquals (6, radio.getFrequencyRadio());
    }

    @Test
    public void decreaseFrequencyRadioParam() {
        Radio radio = new Radio(8);
        radio.setCurrentFrequencyRadio(0);
        radio.decreaseFrequencyRadio();
        assertEquals (8, radio.getFrequencyRadio());
    }

    @Test
    public void notChangeFrequencyMoreMaxParam() {
        Radio radio = new Radio(8);
        //radio.setCurrentFrequencyRadio(8);
        radio.setCurrentFrequencyRadio(11);
        assertEquals (8, radio.getFrequencyRadio());
    }

    @Test
    public void notChangeVolumeMoreMaxTest() {
        radio.setCurrentVolumeRadio(100);
        radio.setCurrentVolumeRadio(101);
        assertEquals (100, radio.getVolumeRadio());
    }
    @Test
    public void notChangeVolumeLessMinTest() {
        radio.setCurrentVolumeRadio(1);
        radio.setCurrentVolumeRadio(-1);
        assertEquals (1, radio.getVolumeRadio());
    }

    @Test
    public void increaseVolumeRadioTest() {
        radio.setCurrentVolumeRadio(100);
        radio.increaseVolumeRadio();
        assertEquals (100, radio.getVolumeRadio());
    }

    @Test
    public void decreaseVolumeRadioTest() {
        radio.setCurrentVolumeRadio(5);
        radio.decreaseVolumeRadio();
        assertEquals (4, radio.getVolumeRadio());
    }
}
