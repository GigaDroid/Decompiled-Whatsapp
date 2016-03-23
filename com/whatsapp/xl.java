package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class xl implements as8 {
    private static final String[] z;
    final SettingsChat a;

    static {
        String[] strArr = new String[4];
        String str = "\u000ed_]%\u0013fX\u0004/\u0015`_\u0006)\u0005uN[\"\u001cm\u0006Z8\u0012sJN)PtEH:\u001chGH.\u0011d";
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
                        i3 = 125;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 43;
                        break;
                    case at.o /*3*/:
                        i3 = 41;
                        break;
                    default:
                        i3 = 76;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000ed_]%\u0013fX\u0004/\u0015`_\u0006)\u0005uN[\"\u001cm\u0006Z8\u0012sJN)PtEH:\u001chGH.\u0011d\u0006Y)\u000flBZ?\u0014nE";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u000ed_]%\u0013fX\u0004/\u0015`_\u0006>\u0018`OF\"\u0011x\u0006L4\tdYG-\u0011,X]#\u000f`LLa\u000fdJM#\u0013mR\u0004<\u0018sF@?\u000ehDG";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000ed_]%\u0013fX\u0004/\u0015`_\u0006>\u0018`OF\"\u0011x\u0006L4\tdYG-\u0011,X]#\u000f`LLa\u000fdJM#\u0013mR";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void c() {
        RequestPermissionActivity.a(this.a, 2131231654, 2131231653);
    }

    public void a(String str) {
        Log.i(z[0]);
        this.a.showDialog(602);
    }

    public void b() {
        Log.i(z[2]);
        c();
    }

    public void a() {
        Log.i(z[3]);
        c();
    }

    public void b(String str) {
        Log.i(z[1]);
        this.a.a(2131231479, App.V() ? 2131231723 : 2131231724, new String[0]);
    }

    xl(SettingsChat settingsChat) {
        this.a = settingsChat;
    }
}
