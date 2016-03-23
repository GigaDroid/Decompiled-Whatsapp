package com.whatsapp;

import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.contact.i;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class v1 implements Runnable {
    private static final String[] z;
    final kl a;
    final l5 b;

    static {
        String[] strArr = new String[3];
        String str = "xA2u\u001cxZ\u0003l\u001cuO;d\u000f4[,e\u001coK\u0003i\u0012wJ3t\tDM3o\tzM(^\ts\\9`\u00194]%o\u001eDO0s\u0018zJ%^\u0018uJ9e";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 125;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "xA2u\u001cxZ\u0003l\u001cuO;d\u000f4[,e\u001coK\u0003i\u0012wJ3t\tDM3o\tzM(^\ts\\9`\u00194]%o\u001eDO0s\u0018zJ%^\u0018uJ9e";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "xA2u\u001cxZ\u0003l\u001cuO;d\u000f4[,e\u001coK\u0003i\u0012wJ3t\tDM3o\tzM(^\ts\\9`\u00194]%o\u001eDO0s\u0018zJ%^\u0018uJ9e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        try {
            i.a(this.b);
            PerformSyncManager.a(App.z(), this.b);
            App.aB.sendEmptyMessage(1);
            if (!i.b()) {
                Log.w(z[0]);
            }
        } catch (Throwable e) {
            Log.a(e);
            if (!i.b()) {
                Log.w(z[1]);
            }
        } catch (Throwable th) {
            try {
                if (!i.b()) {
                    Log.w(z[2]);
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    v1(kl klVar, l5 l5Var) {
        this.a = klVar;
        this.b = l5Var;
    }
}
