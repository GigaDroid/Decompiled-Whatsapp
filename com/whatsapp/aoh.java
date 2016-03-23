package com.whatsapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

class aoh implements SensorEventListener {
    final i8 a;

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = DialogToastActivity.f;
        if (i8.p == null) {
            this.a.a(false);
            i8.b(this.a);
            if (!z) {
                return;
            }
        }
        if (i8.p != this.a) {
            i8.b(this.a);
            if (!z) {
                return;
            }
        }
        float f = sensorEvent.values[0];
        if (f >= 5.0f || f == i8.d(this.a).getMaximumRange()) {
            this.a.a(false);
            if (!z) {
                return;
            }
        }
        this.a.a(true);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    aoh(i8 i8Var) {
        this.a = i8Var;
    }
}
