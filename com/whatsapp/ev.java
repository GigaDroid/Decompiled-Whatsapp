package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import org.v;
import org.whispersystems.at;

class ev implements OnInfoWindowClickListener {
    private static final String z;
    final LocationPicker2 a;

    static {
        char[] toCharArray = "w-\u0013#L".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 7;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 114;
                    break;
                case at.o /*3*/:
                    i2 = 64;
                    break;
                default:
                    i2 = 41;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInfoWindowClick(com.google.android.gms.maps.model.Marker r6) {
        /*
        r5 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r1 = 0;
        r0 = r6.getId();
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r0 = r5.a;
        r0 = com.whatsapp.LocationPicker2.r(r0);
        r0 = r0.p();
        r3 = r0.iterator();
    L_0x0018:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0060;
    L_0x001e:
        r0 = r3.next();
        r0 = (com.whatsapp.PlaceInfo) r0;
        r4 = r0.tag;
        r4 = r6.equals(r4);
        if (r4 == 0) goto L_0x0018;
    L_0x002c:
        if (r0 == 0) goto L_0x0009;
    L_0x002e:
        r1 = r5.a;
        r1 = com.whatsapp.LocationPicker2.s(r1);
        if (r1 == 0) goto L_0x0043;
    L_0x0036:
        r1 = r5.a;
        r3 = r5.a;
        r3 = com.whatsapp.LocationPicker2.s(r3);
        com.whatsapp.App.a(r1, r3, r0);
        if (r2 == 0) goto L_0x0053;
    L_0x0043:
        r1 = new android.content.Intent;
        r1.<init>();
        r2 = z;
        r1.putExtra(r2, r0);
        r0 = r5.a;
        r2 = -1;
        r0.setResult(r2, r1);
    L_0x0053:
        r0 = r5.a;
        r1 = com.whatsapp.fieldstats.a5.PLACE;
        com.whatsapp.LocationPicker2.a(r0, r1);
        r0 = r5.a;
        r0.finish();
        goto L_0x0009;
    L_0x0060:
        r0 = r1;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ev.onInfoWindowClick(com.google.android.gms.maps.model.Marker):void");
    }

    ev(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
