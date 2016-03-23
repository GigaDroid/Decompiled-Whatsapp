package com.whatsapp.gallerypicker;

import android.os.AsyncTask;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class bs extends AsyncTask {
    private static final String z;
    final boolean a;
    int b;
    final boolean c;
    final MediaGalleryFragmentBase d;

    static {
        char[] toCharArray = "z+)>Up/!;Qe7+%Up#(9@u/>2\u001bv\"!wVb-&2@dn,$G~)#2P".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 23;
                    break;
                case at.g /*1*/:
                    i2 = 78;
                    break;
                case at.i /*2*/:
                    i2 = 77;
                    break;
                case at.o /*3*/:
                    i2 = 87;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    bs(MediaGalleryFragmentBase mediaGalleryFragmentBase, boolean z, boolean z2) {
        this.d = mediaGalleryFragmentBase;
        this.a = z;
        this.c = z2;
    }

    protected void a(Void voidR) {
        this.d.k.notifyDataSetChanged();
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected Void a(Void[] voidArr) {
        int i = MediaGalleryFragmentBase.e;
        e b = this.d.b(!this.a);
        int e = b.e();
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Object obj = null;
        while (i2 < e && (!isCancelled() || i != 0)) {
            f a = b.a(i2);
            if (a == null && i == 0) {
                break;
            }
            if (i2 == MediaGalleryFragmentBase.f(this.d) - 1 && obj != null) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                a7 a7Var = new a7(obj);
                a7Var.b = e;
                uptimeMillis = SystemClock.uptimeMillis();
                MediaGalleryFragmentBase.a(this.d, new a2(this, e, arrayList2, a7Var));
            }
            a7 a2 = MediaGalleryFragmentBase.d(this.d).a(a.e());
            if (obj == null || !obj.equals(a2)) {
                if (obj != null) {
                    arrayList.add(obj);
                }
                a2.b = 0;
                obj = a2;
            }
            r0.b++;
            if (!arrayList.isEmpty() && 1000 + r2 < SystemClock.uptimeMillis()) {
                uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList.clear();
                MediaGalleryFragmentBase.a(this.d, new b9(this, e, arrayList3));
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        if (!(obj == null || isCancelled())) {
            arrayList.add(obj);
        }
        MediaGalleryFragmentBase.a(this.d, new bx(this, arrayList, e));
        b.a();
        Log.i(z);
        return null;
    }
}
