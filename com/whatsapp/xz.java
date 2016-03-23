package com.whatsapp;

import android.content.Context;
import com.whatsapp.protocol.co;

final class xz extends xo {
    final PlaceInfo n;
    final boolean o;

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    xz(Context context, co coVar, PlaceInfo placeInfo, boolean z) {
        this.n = placeInfo;
        this.o = z;
        super(context, coVar);
    }

    public Boolean a(Void[] voidArr) {
        if (!this.n.hasDetails) {
            this.n.downloadDetails();
            this.k.q = this.n.url;
            if (this.o && this.n.address != null) {
                StringBuilder stringBuilder = new StringBuilder();
                co coVar = this.k;
                coVar.A = stringBuilder.append(coVar.A).append("\n").append(this.n.address).toString();
            }
        }
        return super.a(voidArr);
    }
}
