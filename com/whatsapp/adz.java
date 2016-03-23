package com.whatsapp;

import com.whatsapp.protocol.be;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class adz implements ui {
    private static final String[] z;
    final r3 a;
    final AtomicInteger b;
    final AtomicBoolean c;

    static {
        String[] strArr = new String[8];
        String str = "R[=\u001bR_A!";
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
                        i3 = 54;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 79;
                        break;
                    case at.o /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 38;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "DK<\u000fKS";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "DK<\u000fKS";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "[G\"\u001fRO^*";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "EG5\u001f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "{c\u001cZSFB \u001bB\u0016\\*\tS[Ko\u001cIDCo\nIEZo\u001cG_B*\u001e\u0006BAo\nGD]*Zlea\u0001ZTS]?\u0015HEKtZKS]<\u001bAS\u0000$\u001f_\u000b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "PG#\u001fNW]'";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "C\\#";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Map map, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (jSONObject.has(z[2])) {
                    this.b.set(jSONObject.optInt(z[3]));
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                this.a.b.e.f = new be();
                this.a.b.e.f.c = jSONObject.optString(z[4]);
                this.a.b.e.f.a = jSONObject.optString(z[1]);
                this.a.b.e.f.d = jSONObject.optLong(z[5]);
                this.a.b.e.f.f = jSONObject.optInt(z[0]);
                this.a.b.e.f.e = jSONObject.optString(z[7]);
                this.a.b.e.e = true;
                sx.b(this.a.b.e, true);
                this.c.set(false);
            } catch (JSONException e) {
                throw e;
            } catch (JSONException e2) {
                throw e2;
            }
        } catch (Throwable e3) {
            Log.c(z[6] + this.a.b.e.p.k, e3);
        }
    }

    adz(r3 r3Var, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean) {
        this.a = r3Var;
        this.b = atomicInteger;
        this.c = atomicBoolean;
    }

    public void a(long j) {
    }
}
