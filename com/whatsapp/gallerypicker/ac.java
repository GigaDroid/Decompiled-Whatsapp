package com.whatsapp.gallerypicker;

import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView.OnItemLongClickListener;
import org.v;
import org.whispersystems.at;

class ac implements OnItemLongClickListener {
    private static final String[] z;
    final AppCompatActivity a;
    final MediaPickerFragment b;

    static {
        String[] strArr = new String[2];
        String str = "$/\u0018y\\9#\u001f{X;,\u000eqZ$/\u0012d\u0012 >\u0019}Q&$\u001bsQ )\u0017?\u001d9%\u000fyI %\u0012*";
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
                        i3 = 73;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 124;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 61;
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
                    str = "i)\u0013eS=p";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onItemLongClick(android.widget.AdapterView r6, android.view.View r7, int r8, long r9) {
        /*
        r5 = this;
        r4 = 1;
        r0 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r1 = r5.b;
        r1 = r1.f;
        r1 = r1.a(r8);
        if (r1 == 0) goto L_0x0043;
    L_0x000d:
        r2 = r5.b;
        r2 = com.whatsapp.gallerypicker.MediaPickerFragment.a(r2);
        if (r2 == 0) goto L_0x001c;
    L_0x0015:
        r2 = r5.b;
        com.whatsapp.gallerypicker.MediaPickerFragment.a(r2, r1);
        if (r0 == 0) goto L_0x006c;
    L_0x001c:
        r2 = r5.b;
        r2 = com.whatsapp.gallerypicker.MediaPickerFragment.b(r2);
        r1 = r1.c();
        r2.add(r1);
        r1 = r5.b;
        r2 = r5.a;
        r3 = r5.b;
        r3 = com.whatsapp.gallerypicker.MediaPickerFragment.d(r3);
        r2 = r2.startSupportActionMode(r3);
        com.whatsapp.gallerypicker.MediaPickerFragment.a(r1, r2);
        r1 = r5.b;
        r1 = r1.k;
        r1.notifyDataSetChanged();
        if (r0 == 0) goto L_0x006c;
    L_0x0043:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r1 = z;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = r5.b;
        r1 = r1.p;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x006c:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ac.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
    }

    ac(MediaPickerFragment mediaPickerFragment, AppCompatActivity appCompatActivity) {
        this.b = mediaPickerFragment;
        this.a = appCompatActivity;
    }
}
