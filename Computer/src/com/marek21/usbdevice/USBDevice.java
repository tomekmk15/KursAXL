package com.marek21.usbdevice;

public interface USBDevice {

    boolean connect();
    boolean disconnect();
    String getName();
}
