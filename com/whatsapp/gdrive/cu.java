package com.whatsapp.gdrive;

import com.whatsapp.a_3;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

class cu {
    private static final String z;
    final fi a;

    static {
        char[] toCharArray = "!&\u0003#S#o\u0010:Li!\u001e$K#!\u0005#S/6\bgF.#\u001f-@\"".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 70;
                    break;
                case at.g /*1*/:
                    i2 = 66;
                    break;
                case at.i /*2*/:
                    i2 = 113;
                    break;
                case at.o /*3*/:
                    i2 = 74;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    cu(fi fiVar) {
        this.a = fiVar;
        h.b().e(this);
    }

    public void onEventBackgroundThread(a_3 com_whatsapp_a_3) {
        this.a.c.disconnect();
        try {
            this.a.close();
        } catch (Throwable e) {
            Log.b(z, e);
        }
    }
}
