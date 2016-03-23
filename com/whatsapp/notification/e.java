package com.whatsapp.notification;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class e implements SensorEventListener {
    private static final String z;
    final PopupNotification a;

    static {
        char[] toCharArray = "n\u000eP[[p\u000eTGMw\u0002AZBq\u000f\u000f^Yq\u0019ICBj\u0018\u001a".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 97;
                    break;
                case at.i /*2*/:
                    i2 = 32;
                    break;
                case at.o /*3*/:
                    i2 = 46;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    e(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        PopupNotification.a(this.a, sensorEvent.values[0]);
        Log.i(z + PopupNotification.i(this.a));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
