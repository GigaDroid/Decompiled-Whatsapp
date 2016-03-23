package com.whatsapp.fieldstats;

import android.content.Context;

public final class b9 extends av {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    public Double i;
    public Double j;
    public Double k;
    public Double l;
    public Double m;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.RESTORE.getCode()));
        i.a(context, bn.BACKUP_RESTORE_RESULT, this.i);
        i.a(context, bn.BACKUP_RESTORE_IS_FULL, this.g);
        i.a(context, bn.BACKUP_RESTORE_IS_WIFI, this.d);
        i.a(context, bn.BACKUP_RESTORE_RETRY_COUNT, this.m);
        i.a(context, bn.BACKUP_RESTORE_INCLUDE_VIDEOS, this.k);
        if (this.e != null) {
            i.a(context, a.BACKUP_RESTORE_T, this.e);
        }
        if (this.j != null) {
            i.a(context, a.BACKUP_RESTORE_TOTAL_SIZE, this.j);
        }
        if (this.h != null) {
            i.a(context, a.BACKUP_RESTORE_CHATDB_SIZE, this.h);
        }
        if (this.c != null) {
            i.a(context, a.BACKUP_RESTORE_MEDIA_SIZE, this.c);
        }
        if (this.l != null) {
            i.a(context, a.BACKUP_RESTORE_TRANSFER_SIZE, this.l);
        }
        if (this.a != null) {
            i.a(context, a.BACKUP_RESTORE_TRANSFER_FAILED_SIZE, this.a);
        }
        if (this.b != null) {
            i.a(context, a.BACKUP_RESTORE_MEDIA_FILE_COUNT, this.b);
        }
        if (this.f != null) {
            i.a(context, a.BACKUP_RESTORE_NETWORK_REQUEST_COUNT, this.f);
        }
        i.a(context, bn.EVENT);
    }
}
