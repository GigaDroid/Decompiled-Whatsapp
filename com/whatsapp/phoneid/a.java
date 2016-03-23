package com.whatsapp.phoneid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import com.facebook.phoneid.d;
import com.facebook.phoneid.e;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.amm;
import com.whatsapp.auv;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import java.util.UUID;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class a implements d {
    public static boolean a;
    public static a b;
    private static final String[] z;
    private final Context c;

    static {
        String[] strArr = new String[8];
        String str = "hs$J_q\u007f\u0014PSu~8P[uk";
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
                        i3 = 24;
                        break;
                    case at.g /*1*/:
                        i3 = 27;
                        break;
                    case at.i /*2*/:
                        i3 = 75;
                        break;
                    case at.o /*3*/:
                        i3 = 36;
                        break;
                    default:
                        i3 = 58;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "~z\"H_|;?K\u001akz=A\u001ahs$J_8r/\u0004Nw;8L[j~/\u0004Jj~-AH}u(AI#;;LUv~\u0002@\u0007";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "kz=A^8u.S\u001ahs$J_8r/\u0004Nw;8L[j~/\u0004Jj~-AH}u(AI#;;LUv~\u0002@\u0007";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "{t&\nMpz?W[hk\u0014TH}}.V_vx.W";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "{t&\nMpz?W[hk\u0014TH}}.V_vx.W";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "hs$J_q\u007f\u0014M^";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "hs$J_q\u007f\u0014PSu~8P[uk";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "hs$J_q\u007f\u0014M^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public synchronized e a() {
        e b;
        boolean z = false;
        synchronized (this) {
            boolean z2 = a;
            SharedPreferences sharedPreferences = this.c.getSharedPreferences(z[5], 0);
            String string = sharedPreferences.getString(z[6], null);
            long j = sharedPreferences.getLong(z[7], Long.MIN_VALUE);
            if (string == null || j < 0) {
                b = b();
                a(b);
            } else {
                b = new e(string, j);
                if (WAAppCompatActivity.c != 0) {
                    if (!z2) {
                        z = true;
                    }
                    a = z;
                }
            }
        }
        return b;
    }

    @NonNull
    public static synchronized a a(@NonNull Context context) {
        a aVar;
        synchronized (a.class) {
            if (b == null) {
                b = new a(context);
            }
            aVar = b;
        }
        return aVar;
    }

    private a(@NonNull Context context) {
        this.c = ((Context) auv.a((Object) context)).getApplicationContext();
    }

    private e b() {
        return new e(UUID.randomUUID().toString(), ((amm) h.b().b(amm.class)).a());
    }

    public synchronized void a(@NonNull e eVar) {
        boolean z = a;
        Editor edit = this.c.getSharedPreferences(z[4], 0).edit();
        edit.putString(z[1], eVar.c);
        edit.putLong(z[0], eVar.b);
        if (!edit.commit()) {
            Log.e(z[2] + eVar);
            if (z) {
                WAAppCompatActivity.c++;
            }
        }
        Log.i(z[3] + eVar);
    }
}
