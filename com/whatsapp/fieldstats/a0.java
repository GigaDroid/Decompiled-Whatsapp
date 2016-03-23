package com.whatsapp.fieldstats;

import android.content.Context;

public final class a0 extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.MEDIA_DOWNLOAD.getCode()));
        i.a(context, bn.MEDIA_TYPE, this.g);
        i.a(context, bn.MEDIA_DOWNLOAD_RESULT, this.e);
        i.a(context, bn.RETRY_COUNT, this.d);
        i.a(context, bn.MEDIA_USED_CDN, this.b);
        i.a(context, bn.E2E_MEDIA_ENCRYPTION, this.c);
        if (this.f != null) {
            i.a(context, a.MEDIA_DOWNLOAD_T, this.f);
        }
        if (this.a != null) {
            i.a(context, a.MEDIA_SIZE, this.a);
        }
        i.a(context, bn.EVENT);
    }
}
