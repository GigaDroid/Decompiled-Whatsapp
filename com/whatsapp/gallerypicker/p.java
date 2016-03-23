package com.whatsapp.gallerypicker;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.g1;
import org.v;
import org.whispersystems.at;

class p extends FragmentStatePagerAdapter implements g1 {
    private static final String[] z;
    private TextView[] a;
    final GalleryPicker b;

    static {
        String[] strArr = new String[4];
        String str = "J~A #Gu";
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
                        i3 = 35;
                        break;
                    case at.g /*1*/:
                        i3 = 16;
                        break;
                    case at.i /*2*/:
                        i3 = 34;
                        break;
                    case at.o /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "J~A #Gu";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "J~A #Gu";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "J~A #Gu";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m733a(int r6) {
        /*
        r5 = this;
        r1 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = 0;
    L_0x0003:
        r2 = r5.a;
        r2 = r2.length;
        if (r0 >= r2) goto L_0x0036;
    L_0x0008:
        r2 = r5.a;
        r2 = r2[r0];
        if (r2 == 0) goto L_0x0032;
    L_0x000e:
        if (r0 != r6) goto L_0x0022;
    L_0x0010:
        r3 = r5.b;
        r3 = r3.getResources();
        r4 = 2131623943; // 0x7f0e0007 float:1.8875052E38 double:1.05316216E-314;
        r3 = r3.getColor(r4);
        r2.setTextColor(r3);
        if (r1 == 0) goto L_0x0032;
    L_0x0022:
        r3 = r5.b;
        r3 = r3.getResources();
        r4 = 2131623992; // 0x7f0e0038 float:1.8875151E38 double:1.0531621843E-314;
        r3 = r3.getColor(r4);
        r2.setTextColor(r3);
    L_0x0032:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0003;
    L_0x0036:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.p.a(int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getPageTitle(int r5) {
        /*
        r4 = this;
        r3 = 2131232130; // 0x7f080582 float:1.808036E38 double:1.0529685787E-314;
        r2 = 2131232129; // 0x7f080581 float:1.8080359E38 double:1.0529685783E-314;
        r0 = r4.b;
        r0 = com.whatsapp.gallerypicker.GalleryPicker.a(r0);
        r1 = 5;
        if (r0 != r1) goto L_0x0016;
    L_0x000f:
        switch(r5) {
            case 0: goto L_0x002a;
            case 1: goto L_0x0035;
            default: goto L_0x0012;
        };
    L_0x0012:
        r0 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r0 == 0) goto L_0x0054;
    L_0x0016:
        r0 = r4.b;
        r0 = com.whatsapp.gallerypicker.GalleryPicker.a(r0);
        r1 = 1;
        if (r0 != r1) goto L_0x0040;
    L_0x001f:
        r0 = r4.b;
        r0 = r0.getResources();
        r0 = r0.getString(r2);
    L_0x0029:
        return r0;
    L_0x002a:
        r0 = r4.b;
        r0 = r0.getResources();
        r0 = r0.getString(r2);
        goto L_0x0029;
    L_0x0035:
        r0 = r4.b;
        r0 = r0.getResources();
        r0 = r0.getString(r3);
        goto L_0x0029;
    L_0x0040:
        r0 = r4.b;
        r0 = com.whatsapp.gallerypicker.GalleryPicker.a(r0);
        r1 = 4;
        if (r0 != r1) goto L_0x0054;
    L_0x0049:
        r0 = r4.b;
        r0 = r0.getResources();
        r0 = r0.getString(r3);
        goto L_0x0029;
    L_0x0054:
        r0 = 0;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.p.getPageTitle(int):java.lang.CharSequence");
    }

    public int getCount() {
        return GalleryPicker.a(this.b) == 5 ? 2 : 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.app.Fragment getItem(int r8) {
        /*
        r7 = this;
        r6 = 4;
        r5 = 1;
        r0 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r1 = new com.whatsapp.gallerypicker.GalleryPickerFragment;
        r1.<init>();
        r2 = new android.os.Bundle;
        r2.<init>();
        r3 = r7.b;
        r3 = com.whatsapp.gallerypicker.GalleryPicker.a(r3);
        r4 = 5;
        if (r3 != r4) goto L_0x001c;
    L_0x0017:
        switch(r8) {
            case 0: goto L_0x0042;
            case 1: goto L_0x004c;
            default: goto L_0x001a;
        };
    L_0x001a:
        if (r0 == 0) goto L_0x003e;
    L_0x001c:
        r3 = r7.b;
        r3 = com.whatsapp.gallerypicker.GalleryPicker.a(r3);
        if (r3 != r5) goto L_0x002e;
    L_0x0024:
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r2.putInt(r3, r5);
        if (r0 == 0) goto L_0x003e;
    L_0x002e:
        r0 = r7.b;
        r0 = com.whatsapp.gallerypicker.GalleryPicker.a(r0);
        if (r0 != r6) goto L_0x003e;
    L_0x0036:
        r0 = z;
        r3 = 3;
        r0 = r0[r3];
        r2.putInt(r0, r6);
    L_0x003e:
        r1.setArguments(r2);
        return r1;
    L_0x0042:
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2.putInt(r3, r5);
        if (r0 == 0) goto L_0x001a;
    L_0x004c:
        r3 = z;
        r3 = r3[r5];
        r2.putInt(r3, r6);
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.p.getItem(int):android.support.v4.app.Fragment");
    }

    public p(GalleryPicker galleryPicker, FragmentManager fragmentManager) {
        this.b = galleryPicker;
        super(fragmentManager);
        this.a = new TextView[2];
    }

    public View a(int i) {
        if (this.a[i] == null) {
            TextView textView = new TextView(this.b.getBaseContext());
            textView.setText(getPageTitle(i));
            textView.setTextColor(this.b.getResources().getColor(2131623943));
            textView.setGravity(17);
            textView.setSingleLine();
            textView.setTextSize(14.0f);
            this.a[i] = textView;
        }
        return this.a[i];
    }
}
