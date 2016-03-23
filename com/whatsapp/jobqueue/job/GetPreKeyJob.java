package com.whatsapp.jobqueue.job;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.whatsapp.arj;
import com.whatsapp.auv;
import com.whatsapp.awc;
import com.whatsapp.jobqueue.b;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.l5;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.co;
import com.whatsapp.qm;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.whispersystems.jobqueue.g;
import org.whispersystems.jobqueue.s;
import org.whispersystems.jobqueue.v;

public final class GetPreKeyJob extends v implements g {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private transient awc f;
    private transient b g;
    private final String jid;
    private final byte[] oldAliceBaseKey;

    static {
        String[] strArr = new String[13];
        String str = "<\u0000\u0010S\u001c-\u0011\u001cXL.\u0010\u001aZ\ty\n\u0006X\u00020\u0016\u0014\u0016\u000b<\fSF\u001e<X\u0018S\u0015y\u0012\u001cT";
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
                    case org.v.m /*0*/:
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = 120;
                        break;
                    case at.i /*2*/:
                        i3 = 115;
                        break;
                    case at.o /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    strArr2[i] = str;
                    str = "6\u0014\u0017w\u00000\u001b\u0016t\r*\u001d8S\u0015y\u0015\u0006E\u0018y\u001d\u001aB\u0004<\nST\ty\u0016\u0006Z\u0000y\u0017\u0001\u0016\u00026\u0016^S\u0001)\f\n";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "3\u0011\u0017\u0016\u0001,\u000b\u0007\u0016\u000e<X\u0012XL0\u0016\u0017_\u001a0\u001c\u0006W\u0000y\u0012\u001aRWy\u0012\u001aRQ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "*\f\u0012D\u00180\u0016\u0014\u0016\u000b<\fSF\u001e<X\u0018S\u0015y\u0012\u001cT";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "<\u0000\u001aB\u00057\u001fSQ\t-X\u0003D\ty\u0013\u0016OL3\u0017\u0011\u0016\t8\n\u001fOL;\u001d\u0010W\u001f<X\u001cZ\by\u0019\u001f_\u000f<X\u0011W\u001f<X\u0018S\u0015y\u0010\u0012EL8\u0014\u0001S\r=\u0001SU\u00048\u0016\u0014S\b";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "bX\u001cZ\b\u0018\u0014\u001aU\t\u001b\u0019\u0000S'<\u0001]X\u00055GN";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "bX\u0003S\u001e*\u0011\u0000B\t7\f:RQ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "bX\u0019_\bd";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "3\u0011\u0017\u0016\u0001,\u000b\u0007\u0016\u000e<X\u0012XL0\u0016\u0017_\u001a0\u001c\u0006W\u0000y\u0012\u001aRWy\u0012\u001aRQ";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "3\u0011\u0017\u0016\u0001,\u000b\u0007\u0016\u00026\fST\ty\u001d\u001eF\u0018 ";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "6\u0014\u0017w\u00000\u001b\u0016t\r*\u001d8S\u0015y\u0015\u0006E\u0018y\u001d\u001aB\u0004<\nST\ty\u0016\u0006Z\u0000y\u0017\u0001\u0016\u00026\u0016^S\u0001)\f\n";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ":\u0019\u001dU\t5\u001d\u0017\u0016\u000b<\fSF\u001e<X\u0018S\u0015y\u0012\u001cT";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ">\u001d\u0007\u0016\u001c+\u001dS]\t X\u0019Y\u000ey\u0019\u0017R\t=";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void i() {
        Log.i(z[4] + a());
        if (this.oldAliceBaseKey != null) {
            try {
                if (!Arrays.equals(this.f.a(awc.e(this.jid)).a().j(), this.oldAliceBaseKey)) {
                    Log.i(z[5] + a());
                    this.g.b();
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        MessageService a = this.g.a();
        String u = a.u();
        a.a(u, co.a(u, new String[]{this.jid})).get();
        this.g.b();
    }

    private String a() {
        try {
            return z[8] + this.jid + z[6] + (this.oldAliceBaseKey == null) + z[7] + c();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(Context context) {
        try {
            this.f = awc.a(context);
            if (this.g == null) {
                this.g = new b(context);
            }
            this.g.c();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void b() {
        Log.w(z[12] + a());
        this.g.b();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty(this.jid)) {
                throw new InvalidObjectException(z[10]);
            }
            try {
                if (this.oldAliceBaseKey != null) {
                    if (this.oldAliceBaseKey.length == 0) {
                        throw new InvalidObjectException(z[11]);
                    }
                }
                try {
                    if (!qm.i(this.jid)) {
                        if (!l5.e(this.jid)) {
                            return;
                        }
                    }
                    throw new InvalidObjectException(z[9] + this.jid);
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public GetPreKeyJob(@NonNull String str, @Nullable byte[] bArr) {
        super(s.f().a(str).a().a(new ChatConnectionRequirement()).b());
        this.jid = (String) auv.a((Object) str);
        this.oldAliceBaseKey = bArr;
        if (bArr != null) {
            try {
                if (bArr.length == 0) {
                    throw new IllegalArgumentException(z[2]);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (!qm.i(str)) {
                if (!l5.e(str)) {
                    return;
                }
            }
            throw new IllegalArgumentException(z[3] + str);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public boolean a(Exception exception) {
        Log.c(z[0] + a(), (Throwable) exception);
        return true;
    }

    public void n() {
        Log.i(z[1] + a());
    }
}
