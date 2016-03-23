package com.whatsapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import org.v;
import org.whispersystems.at;

class aar extends AsyncTask {
    private static final String[] z;
    final VoiceService a;
    final boolean b;
    private final l5 c;
    final int d;
    private final int e;

    static {
        String[] strArr = new String[2];
        String str = "vF\u001c4jkS";
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
                        i3 = 30;
                        break;
                    case at.g /*1*/:
                        i3 = 35;
                        break;
                    case at.i /*2*/:
                        i3 = 125;
                        break;
                    case at.o /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 25;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "lF\u001b\"|mK\">vjJ\u001b9z\u007fW\u0014?w";
                    obj = null;
            }
        }
    }

    protected Bitmap a(Void[] voidArr) {
        return this.c.a(this.e, (float) this.d, true);
    }

    protected void a(Bitmap bitmap) {
        Intent intent = new Intent(z[1], null, this.a, VoiceService.class);
        intent.putExtra(z[0], this.b);
        this.a.startService(intent);
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    public aar(VoiceService voiceService, l5 l5Var, int i, int i2, boolean z) {
        this.a = voiceService;
        this.d = i2;
        this.b = z;
        this.c = l5Var;
        this.e = i;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
