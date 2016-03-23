package com.whatsapp.messaging;

import android.os.HandlerThread;
import android.os.Message;
import com.whatsapp.protocol.b6;
import com.whatsapp.protocol.by;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import org.whispersystems.at;

final class v extends HandlerThread {
    private static final String[] z;
    private final bt a;
    private final o b;
    private final LinkedList c;
    private boolean d;
    private by e;

    static {
        String[] strArr = new String[3];
        String str = "R%QHiw\u0003PNid3";
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
                    case org.v.m /*0*/:
                        i3 = 5;
                        break;
                    case at.g /*1*/:
                        i3 = 87;
                        break;
                    case at.i /*2*/:
                        i3 = 56;
                        break;
                    case at.o /*3*/:
                        i3 = 60;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "p9SRcr9\u0018u#Jw]N~j%\u0018K~l#QRk%#W\u001cxm2\u0018_dd#\u0018_ck9]_xl8V";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "q%QYh%#W\u001c{w>LY,q8W\u001c`d%_Y,j1\u0018],g\"^ZiwwLS,q?]\u001com6L\u001coj9VYoq>WR";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a() {
        this.d = true;
    }

    static void a(v vVar, by byVar) {
        vVar.a(byVar);
    }

    private void a(Message message) {
        a();
        message.getTarget().sendMessageAtFrontOfQueue(Message.obtain(message));
        this.b.a(this.e);
    }

    static void b(v vVar) {
        vVar.a();
    }

    protected void onLooperPrepared() {
        this.b.a(new w(this));
    }

    static o c(v vVar) {
        return vVar.b;
    }

    public v(o oVar) {
        super(z[0]);
        this.c = new LinkedList();
        this.a = new bt(this, null);
        this.d = true;
        this.b = oVar;
    }

    private void b(Message message) {
        if (this.d) {
            if (!co.b(message)) {
                try {
                    this.c.add(Message.obtain(message));
                } catch (b6 e) {
                    throw e;
                }
            }
            if (co.a == 0) {
                return;
            }
        }
        try {
            co.a(this.a, message);
        } catch (Throwable e2) {
            Log.b(z[1], e2);
        } catch (Throwable e22) {
            Log.b(z[2], e22);
            a(message);
        }
    }

    static by a(v vVar) {
        return vVar.e;
    }

    private void a(by byVar) {
        int i = co.a;
        this.e = byVar;
        this.d = false;
        while (!this.d && !this.c.isEmpty()) {
            b((Message) this.c.remove());
            if (i != 0) {
                return;
            }
        }
    }

    static void a(v vVar, Message message) {
        vVar.b(message);
    }
}
