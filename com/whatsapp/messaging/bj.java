package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions;

final class bj implements Parcelable {
    public static final Creator CREATOR;
    private final c5 a;
    private final am b;
    private final ac c;
    private final u d;
    private final y e;
    private final ci f;
    private final ae g;
    private final b_ h;
    private final ay i;
    private final b8 j;
    private final VoipOptions k;
    private final aq l;
    private final s m;
    private final bo n;

    bj(VoipOptions voipOptions) {
        u uVar;
        s sVar;
        c5 c5Var;
        bo boVar;
        ae aeVar;
        ay ayVar;
        ac acVar;
        b_ b_Var;
        am amVar;
        y yVar;
        ci ciVar;
        b8 b8Var;
        aq aqVar = null;
        this.k = voipOptions;
        if (voipOptions.aec != null) {
            uVar = new u(voipOptions.aec, null);
        } else {
            uVar = null;
        }
        this.d = uVar;
        if (voipOptions.agc != null) {
            sVar = new s(voipOptions.agc, null);
        } else {
            sVar = null;
        }
        this.m = sVar;
        if (voipOptions.audioRestrict != null) {
            c5Var = new c5(voipOptions.audioRestrict, null);
        } else {
            c5Var = null;
        }
        this.a = c5Var;
        if (voipOptions.decode != null) {
            boVar = new bo(voipOptions.decode, null);
        } else {
            boVar = null;
        }
        this.n = boVar;
        if (voipOptions.encode != null) {
            aeVar = new ae(voipOptions.encode, null);
        } else {
            aeVar = null;
        }
        this.g = aeVar;
        if (voipOptions.miscellaneous != null) {
            ayVar = new ay(voipOptions.miscellaneous, null);
        } else {
            ayVar = null;
        }
        this.i = ayVar;
        if (voipOptions.noiseSuppression != null) {
            acVar = new ac(voipOptions.noiseSuppression, null);
        } else {
            acVar = null;
        }
        this.c = acVar;
        if (voipOptions.abTest != null) {
            b_Var = new b_(voipOptions.abTest, null);
        } else {
            b_Var = null;
        }
        this.h = b_Var;
        if (voipOptions.rateControl != null) {
            amVar = new am(voipOptions.rateControl, null);
        } else {
            amVar = null;
        }
        this.b = amVar;
        if (voipOptions.resend != null) {
            yVar = new y(voipOptions.resend, null);
        } else {
            yVar = null;
        }
        this.e = yVar;
        if (voipOptions.bwe != null) {
            ciVar = new ci(voipOptions.bwe, null);
        } else {
            ciVar = null;
        }
        this.f = ciVar;
        if (voipOptions.re != null) {
            b8Var = new b8(voipOptions.re, null);
        } else {
            b8Var = null;
        }
        this.j = b8Var;
        if (voipOptions.client != null) {
            aqVar = new aq(voipOptions.client, null);
        }
        this.l = aqVar;
    }

    public VoipOptions a() {
        return this.k;
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new bq();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.d);
        parcel.writeValue(this.m);
        parcel.writeValue(this.a);
        parcel.writeValue(this.n);
        parcel.writeValue(this.g);
        parcel.writeValue(this.i);
        parcel.writeValue(this.c);
        parcel.writeValue(this.h);
        parcel.writeValue(this.b);
        parcel.writeValue(this.e);
        parcel.writeValue(this.f);
        parcel.writeValue(this.j);
        parcel.writeValue(this.l);
    }

    bj(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    private bj(Parcel parcel) {
        this.d = (u) parcel.readValue(u.class.getClassLoader());
        this.m = (s) parcel.readValue(s.class.getClassLoader());
        this.a = (c5) parcel.readValue(c5.class.getClassLoader());
        this.n = (bo) parcel.readValue(bo.class.getClassLoader());
        this.g = (ae) parcel.readValue(ae.class.getClassLoader());
        this.i = (ay) parcel.readValue(ay.class.getClassLoader());
        this.c = (ac) parcel.readValue(ac.class.getClassLoader());
        this.h = (b_) parcel.readValue(b_.class.getClassLoader());
        this.b = (am) parcel.readValue(am.class.getClassLoader());
        this.e = (y) parcel.readValue(y.class.getClassLoader());
        this.f = (ci) parcel.readValue(ci.class.getClassLoader());
        this.j = (b8) parcel.readValue(b8.class.getClassLoader());
        this.l = (aq) parcel.readValue(aq.class.getClassLoader());
        this.k = new VoipOptions(this.d != null ? this.d.a() : null, this.g != null ? this.g.a() : null, this.n != null ? this.n.a() : null, this.i != null ? this.i.a() : null, this.m != null ? this.m.a() : null, this.a != null ? this.a.a() : null, this.c != null ? this.c.a() : null, this.h != null ? this.h.a() : null, this.l != null ? this.l.a() : null, this.b != null ? this.b.a() : null, this.e != null ? this.e.a() : null, this.f != null ? this.f.a() : null, this.j != null ? this.j.a() : null);
    }
}
