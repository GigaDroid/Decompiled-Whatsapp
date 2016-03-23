package com.whatsapp.util;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

class a8 implements SensorEventListener {
    final cv a;
    final b3 b;
    private boolean c;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        if (f < 5.0f && f != cv.a(this.a).getMaximumRange()) {
            z = true;
        }
        if (z != this.c) {
            this.c = z;
            this.b.a(z);
        }
    }

    a8(cv cvVar, b3 b3Var) {
        this.a = cvVar;
        this.b = b3Var;
    }
}
