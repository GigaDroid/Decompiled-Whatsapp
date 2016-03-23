package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.fieldstats.a0;
import com.whatsapp.fieldstats.a6;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.ah;
import com.whatsapp.fieldstats.b8;
import com.whatsapp.fieldstats.ck;
import com.whatsapp.fieldstats.cw;
import com.whatsapp.fieldstats.d;
import com.whatsapp.fieldstats.i;
import com.whatsapp.protocol.co;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class wo {
    public static void b(co coVar, long j) {
        double d = 0.0d;
        if (coVar != null) {
            av ahVar = new ah();
            ahVar.c = Double.valueOf((double) j);
            ahVar.d = Double.valueOf(b(coVar));
            ahVar.k = Double.valueOf(c(coVar));
            if (ahVar.k.doubleValue() == ((double) d.INDIVIDUAL.getCode())) {
                Boolean a = a(coVar);
                if (a != null) {
                    double d2;
                    if (a.booleanValue()) {
                        d2 = 1.0d;
                    } else {
                        d2 = 0.0d;
                    }
                    ahVar.a = Double.valueOf(d2);
                }
            }
            if (!TextUtils.isEmpty(coVar.a)) {
                d = 1.0d;
            }
            ahVar.e = Double.valueOf(d);
            i.a(App.z(), ahVar);
        }
    }

    private static Boolean a(co coVar) {
        if (App.ay == null || App.ay.cc == null || coVar.k == null || coVar.k.c == null) {
            return null;
        }
        return Boolean.valueOf(!coVar.k.c.startsWith(App.ay.cc));
    }

    public static void a(co coVar, long j) {
        double d = 1.0d;
        if (coVar != null) {
            av agVar = new ag();
            agVar.d = Double.valueOf((double) j);
            agVar.a = Double.valueOf(b(coVar));
            agVar.c = Double.valueOf(c(coVar));
            if (agVar.c.doubleValue() == ((double) d.INDIVIDUAL.getCode()) || agVar.c.doubleValue() == ((double) d.BROADCAST.getCode())) {
                Boolean a = a(coVar);
                if (a != null) {
                    double d2;
                    if (a.booleanValue()) {
                        d2 = 1.0d;
                    } else {
                        d2 = 0.0d;
                    }
                    agVar.f = Double.valueOf(d2);
                }
            }
            if (coVar.j == null) {
                d = 0.0d;
            }
            agVar.g = Double.valueOf(d);
            i.a(App.z(), agVar);
        }
    }

    private static b8 a(aqs com_whatsapp_aqs, MediaData mediaData) {
        switch (aqw.a[com_whatsapp_aqs.ordinal()]) {
            case at.g /*1*/:
                return mediaData.dedupeDownload ? b8.DEDUPED : b8.OK;
            case at.i /*2*/:
                return b8.ERROR_INSUFFICIENT_SPACE;
            case at.o /*3*/:
                return b8.ERROR_DNS;
            case at.p /*4*/:
                return b8.ERROR_TIMEOUT;
            case at.m /*5*/:
                return b8.ERROR_TOO_OLD;
            case Y.f /*6*/:
                return b8.ERROR_CANNOT_RESUME;
            case aF.v /*7*/:
                return b8.ERROR_HASH_MISMATCH;
            case aF.u /*8*/:
                return b8.ERROR_INVALID_URL;
            case Y.l /*9*/:
                return b8.ERROR_OUTPUT_STREAM;
            case Y.t /*10*/:
                return b8.ERROR_INVALID_MEDIA;
            case Y.j /*11*/:
                return b8.ERROR_CANCEL;
            default:
                return b8.ERROR_UNKNOWN;
        }
    }

    private static double b(co coVar) {
        switch (coVar.c) {
            case at.g /*1*/:
                return (double) cw.PHOTO.getCode();
            case at.i /*2*/:
                if (coVar.r == 1) {
                    return (double) cw.PTT.getCode();
                }
                return (double) cw.AUDIO.getCode();
            case at.o /*3*/:
                return (double) cw.VIDEO.getCode();
            case at.p /*4*/:
                return (double) cw.CONTACT.getCode();
            case at.m /*5*/:
                return (double) cw.LOCATION.getCode();
            case Y.l /*9*/:
                return (double) cw.DOCUMENT.getCode();
            default:
                if (App.h(coVar)) {
                    return (double) cw.URL.getCode();
                }
                return (double) cw.NONE.getCode();
        }
    }

    private static double c(co coVar) {
        if (coVar.x) {
            return (double) d.BROADCAST.getCode();
        }
        return qm.i(coVar.k.c) ? (double) d.GROUP.getCode() : (double) d.INDIVIDUAL.getCode();
    }

    public static void a(co coVar, ck ckVar, long j, boolean z) {
        double d;
        double d2 = 1.0d;
        av a6Var = new a6();
        boolean z2 = ((MediaData) coVar.Q).forward;
        a6Var.g = Double.valueOf(b(coVar));
        if (z2) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        a6Var.f = Double.valueOf(d);
        a6Var.a = Double.valueOf((double) ckVar.getCode());
        a6Var.b = Double.valueOf((double) coVar.z);
        a6Var.c = Double.valueOf((double) j);
        if (!z) {
            d2 = 0.0d;
        }
        a6Var.h = Double.valueOf(d2);
        i.a(App.z(), a6Var);
    }

    public static void a(co coVar, ta taVar, boolean z) {
        av a0Var = new a0();
        b8 a = a(taVar.d, (MediaData) coVar.Q);
        long b = taVar.b();
        a0Var.g = Double.valueOf(b(coVar));
        a0Var.e = Double.valueOf((double) a.getCode());
        a0Var.a = Double.valueOf((double) coVar.z);
        if (b > 0) {
            a0Var.f = Double.valueOf((double) b);
        }
        a0Var.b = Double.valueOf(z ? 1.0d : 0.0d);
        i.a(App.z(), a0Var);
    }
}
