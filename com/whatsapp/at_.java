package com.whatsapp;

public class at_ extends Exception {
    public final int a;

    public at_(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
