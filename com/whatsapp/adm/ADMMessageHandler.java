package com.whatsapp.adm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.whatsapp.App;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.gcm.a;
import com.whatsapp.gcm.b;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    public static int b;
    private static final String[] z;
    private final b a;
    private final Context c;
    private final ADM d;

    public class Receiver extends ADMMessageReceiver {
        public Receiver() {
            super(ADMMessageHandler.class);
        }
    }

    static {
        String[] strArr = new String[19];
        String str = "\n4#:Z\n>*(S\r>0)";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 122;
                        break;
                    case at.i /*2*/:
                        i3 = 117;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 22;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0002>8Td&\u001d\u001c\bb1\u001b\u0001\u0012y-U\u0010\td,\bZ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0010?'-_\u0000?*5Y\u0017%4-W\n649Z\u0006";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0002>8Td&\u001d\u001c\bb1\u001b\u0001\u0012y-U\u0010\td,\bZ";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "7\t";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "%\u0018\u001c\u000be";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ".\u0017\u0006\u0014`";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "*\u001e";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "*\n";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "/\u000e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\"\u001e\u0018";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = " \u0015\u0018Ua+\u001b\u0001\bw3\n[\u001ar.T4?[\u000e\u001f\u0006\bw$\u001f=\u001ax'\u0016\u0010\t";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0002>8[e&\u0014\u0011\u0012x$Z\u0019\u001ab&\t\u0001[W\u00077U\ts$\u0013\u0006\u000fd\"\u000e\u001c\u0014x\n\u001eU\u000fyc-\u001d\u001ab0;\u0005\u000b63\u000f\u0006\u001360\u001f\u0007\rs1\t[";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0002>8[\u007f0Z\u0007\u001eq*\t\u0001\u001ed&\u001eU\u001ax'Z\"\u0013w7\t4\u000bfc\t\u0010\t`&\b\u0006[~\"\f\u0010[u,\b\u0007\u001eu7Z\u0007\u001eq*\t\u0001\tw7\u0013\u001a\u00156\n>U\u001dy1Z4?[m";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0002>8[d&\u000b\u0000\u001ee7\u0013\u001b\u001c61\u001f\u0007\u001eq*\t\u0001\tw7\u0013\u001a\u00158";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0002>8Td&\u001d\u001c\bb&\b\u0010\u001f9";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "c\u001b\u0005\u000b@&\b\u0006\u0012y-G";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0002>8Td&\u001d\u001c\bb&\b\u0010\u001f9-\u001f\u0002";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0002/!3S\r.<8W\u00173:5I\u0005;<7S\u0007";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ADMMessageHandler() {
        int i = b;
        super(z[12]);
        this.c = App.z();
        this.d = new ADM(this.c);
        this.a = new b(this.c);
        if (WAAppCompatActivity.c != 0) {
            b = i + 1;
        }
    }

    protected void onRegistrationError(String str) {
        if (str.equals(z[3])) {
            Log.i(z[2] + str);
            this.a.b();
            a();
            if (b == 0) {
                return;
            }
        }
        if (str.equals(z[0]) || str.equals(z[1])) {
            Log.w(z[4] + str);
            this.a.h();
        }
    }

    private void a(String str) {
        App.a(str, z[11]);
    }

    protected void onRegistered(String str) {
        if (str != null) {
            int e = this.a.e();
            Log.i(z[16] + str + z[17] + e);
            this.a.a();
            if (this.a.i() == null) {
                Log.i(z[18]);
                App.a((Context) this, 0);
            }
            this.a.a(str);
            if (e > 0) {
                this.a.a(e);
            }
            a(str);
        }
    }

    protected void onUnregistered(String str) {
        this.a.h();
    }

    protected void onMessage(Intent intent) {
        int i = b;
        Bundle extras = intent.getExtras();
        String string = extras.getString(z[8]);
        String string2 = extras.getString(z[9]);
        extras.getString(z[10]);
        a.a(this.c, string, string2, intent.getStringExtra(z[5]), intent.getStringExtra(z[7]), intent.getStringExtra(z[6]), false);
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }

    private void a() {
        if (this.d.getRegistrationId() == null) {
            this.d.startRegister();
        }
    }

    public void b(String str) {
        int i = b;
        if (this.d.getRegistrationId() == null) {
            Log.i(z[15]);
            a();
            if (i == 0) {
                return;
            }
        }
        if (str == null || !str.equals(this.d.getRegistrationId())) {
            Log.i(z[13]);
            a(this.d.getRegistrationId());
            if (i == 0) {
                return;
            }
        }
        Log.i(z[14]);
    }
}
