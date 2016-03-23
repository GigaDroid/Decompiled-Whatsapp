package com.whatsapp;

import android.content.Context;
import android.database.AbstractCursor;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class tk extends AbstractCursor {
    private static final String[] b;
    private final Context a;

    public String getString(int i) {
        ArrayList g;
        int position;
        switch (i) {
            case v.m /*0*/:
                g = qa.g();
                position = getPosition();
                if (g.size() > position) {
                    return (String) g.get(position);
                }
                break;
            case at.g /*1*/:
                break;
        }
        g = qa.g();
        position = getPosition();
        if (g.size() > position) {
            return App.as.b((String) g.get(position)).a(this.a);
        }
        return "";
    }

    public long getLong(int i) {
        return 0;
    }

    static {
        String[] strArr = new String[2];
        String str = "au$";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 11;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 64;
                        break;
                    case at.o /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 127;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    b = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "e}-^";
                    obj = null;
            }
        }
    }

    public boolean isNull(int i) {
        return false;
    }

    public int getCount() {
        return qa.e();
    }

    public String[] getColumnNames() {
        return b;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public tk(Context context) {
        this.a = context;
    }

    public short getShort(int i) {
        return (short) 0;
    }

    public int getInt(int i) {
        return 0;
    }

    public double getDouble(int i) {
        return 0.0d;
    }
}
