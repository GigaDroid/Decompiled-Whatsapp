package com.whatsapp.fieldstats;

import android.content.Context;

public final class aq extends av {
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
    public Double n;
    public Double o;

    void updateFields(Context context) {
        i.a(context, bn.EVENT, Integer.valueOf(cx.BACKUP.getCode()));
        i.a(context, bn.BACKUP_RESTORE_RESULT, this.k);
        i.a(context, bn.BACKUP_RESTORE_IS_FULL, this.n);
        i.a(context, bn.BACKUP_RESTORE_IS_WIFI, this.m);
        i.a(context, bn.BACKUP_RESTORE_RETRY_COUNT, this.h);
        i.a(context, bn.BACKUP_RESTORE_INCLUDE_VIDEOS, this.e);
        i.a(context, bn.BACKUP_RESTORE_FINISHED_OVER_WIFI, this.o);
        i.a(context, bn.BACKUP_RESTORE_STAGE, this.b);
        if (this.f != null) {
            i.a(context, a.BACKUP_RESTORE_T, this.f);
        }
        if (this.l != null) {
            i.a(context, a.BACKUP_RESTORE_TOTAL_SIZE, this.l);
        }
        if (this.i != null) {
            i.a(context, a.BACKUP_RESTORE_CHATDB_SIZE, this.i);
        }
        if (this.c != null) {
            i.a(context, a.BACKUP_RESTORE_MEDIA_SIZE, this.c);
        }
        if (this.d != null) {
            i.a(context, a.BACKUP_RESTORE_TRANSFER_SIZE, this.d);
        }
        if (this.g != null) {
            i.a(context, a.BACKUP_RESTORE_TRANSFER_FAILED_SIZE, this.g);
        }
        if (this.a != null) {
            i.a(context, a.BACKUP_RESTORE_MEDIA_FILE_COUNT, this.a);
        }
        if (this.j != null) {
            i.a(context, a.BACKUP_RESTORE_NETWORK_REQUEST_COUNT, this.j);
        }
        i.a(context, bn.EVENT);
    }
}
