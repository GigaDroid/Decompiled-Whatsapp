package com.whatsapp.gallerypicker;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class bt {
    private static final String[] z;
    public final int a;
    public final int b;
    public final f c;
    public final String d;
    final GalleryPickerFragment e;
    public final String f;

    static {
        String[] strArr = new String[14];
        String str = "4mBJ}-iWf";
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
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = 12;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 21;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "3e^";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ";yY~q-E^";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "4mBJb0h_zK*e@p";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ".eTq{.XSax<";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ")~_c}<{";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "3e^";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "4mBJ}-iWf";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ")~_c}<{";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "4mBJb0h_zK*e@p";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "8b^g{0h\u0014|z-iTa:8oN|{7\"l\\Q\u000e";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "0bYya=iexq=e[";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "4mBJ}-iWf";
                    obj = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ";yY~q-E^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public bt(GalleryPickerFragment galleryPickerFragment, int i, int i2, String str, String str2, f fVar, int i3) {
        this.e = galleryPickerFragment;
        this.b = i;
        this.f = str;
        this.d = str2;
        this.c = fVar;
        this.a = i3;
    }

    public String b() {
        return this.b + "-" + this.f + "-" + GalleryPickerFragment.c(this.e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.app.Activity r11, android.view.View r12) {
        /*
        r10 = this;
        r6 = 6;
        r9 = 0;
        r8 = 1;
        r1 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = r10.b;
        if (r0 == r6) goto L_0x0026;
    L_0x0009:
        r0 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        r2 = r10.a();
        if (r2 == 0) goto L_0x003a;
    L_0x0011:
        r0 = r0.buildUpon();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r3 = r10.f;
        r0 = r0.appendQueryParameter(r2, r3);
        r0 = r0.build();
        if (r1 == 0) goto L_0x003a;
    L_0x0026:
        r0 = com.whatsapp.gallerypicker.k.i;
        r0 = r0.buildUpon();
        r2 = z;
        r2 = r2[r8];
        r3 = r10.f;
        r0 = r0.appendQueryParameter(r2, r3);
        r0 = r0.build();
    L_0x003a:
        r2 = r10.e;
        r2 = r2.getActivity();
        r2 = r2.getIntent();
        r3 = new android.content.Intent;
        r4 = z;
        r5 = 11;
        r4 = r4[r5];
        r3.<init>(r4, r0);
        r0 = z;
        r4 = 5;
        r0 = r0[r4];
        r4 = r10.d;
        r3.putExtra(r0, r4);
        r0 = z;
        r4 = 12;
        r0 = r0[r4];
        r4 = r10.c();
        r5 = r10.e;
        r5 = com.whatsapp.gallerypicker.GalleryPickerFragment.c(r5);
        r4 = r4 & r5;
        r3.putExtra(r0, r4);
        r0 = z;
        r0 = r0[r6];
        r4 = z;
        r5 = 9;
        r4 = r4[r5];
        r4 = r2.getBooleanExtra(r4, r8);
        r3.putExtra(r0, r4);
        r0 = z;
        r4 = 2;
        r0 = r0[r4];
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r4 = r2.getStringExtra(r4);
        r3.putExtra(r0, r4);
        r0 = z;
        r4 = 10;
        r0 = r0[r4];
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = r2.getLongExtra(r4, r6);
        r3.putExtra(r0, r4);
        r0 = r10.c();
        r4 = r10.e;
        r4 = com.whatsapp.gallerypicker.GalleryPickerFragment.c(r4);
        r0 = r0 & r4;
        if (r0 != r8) goto L_0x00cb;
    L_0x00b3:
        r0 = z;
        r4 = 13;
        r0 = r0[r4];
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = r2.getIntExtra(r4, r5);
        r3.putExtra(r0, r2);
        if (r1 == 0) goto L_0x00d2;
    L_0x00cb:
        r0 = z;
        r0 = r0[r9];
        r3.putExtra(r0, r8);
    L_0x00d2:
        r0 = com.whatsapp.gallerypicker.MediaPicker.class;
        r3.setClass(r11, r0);
        r0 = r10.e;
        r0 = r0.getActivity();
        r1 = new android.support.v4.util.Pair[r9];
        r0 = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(r0, r1);
        r0 = r0.toBundle();
        android.support.v4.app.ActivityCompat.startActivityForResult(r11, r3, r9, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.bt.a(android.app.Activity, android.view.View):void");
    }

    public int d() {
        switch (this.b) {
            case v.m /*0*/:
            case at.i /*2*/:
                return 2130839405;
            case at.g /*1*/:
            case at.o /*3*/:
            case at.p /*4*/:
                return 2130839407;
            case Y.f /*6*/:
                return 2130839408;
            default:
                return 2130839406;
        }
    }

    public int c() {
        switch (this.b) {
            case v.m /*0*/:
            case at.i /*2*/:
                return 1;
            case at.g /*1*/:
            case at.o /*3*/:
                return 4;
            default:
                return 5;
        }
    }

    public boolean a() {
        return this.b >= 2;
    }
}
