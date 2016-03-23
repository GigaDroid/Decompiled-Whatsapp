package com.whatsapp.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.v;
import org.whispersystems.at;

public final class cv {
    private static final String z;
    private final Sensor a;
    private SensorEventListener b;
    private final SensorManager c;

    static {
        char[] toCharArray = "\u0012Ui|a\u0013".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 97;
                    break;
                case at.g /*1*/:
                    i2 = 48;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 15;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public cv(Context context) {
        this.c = (SensorManager) context.getSystemService(z);
        this.a = this.c.getDefaultSensor(8);
    }

    public void a(b3 b3Var) {
        if (this.b != null) {
            this.c.unregisterListener(this.b, this.a);
            this.b = null;
        }
        if (b3Var != null) {
            this.b = new a8(this, b3Var);
            this.c.registerListener(this.b, this.a, 2);
        }
    }

    static Sensor a(cv cvVar) {
        return cvVar.a;
    }
}
