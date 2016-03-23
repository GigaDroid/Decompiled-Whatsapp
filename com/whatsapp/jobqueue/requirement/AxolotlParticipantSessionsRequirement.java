package com.whatsapp.jobqueue.requirement;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.auv;
import com.whatsapp.awc;
import com.whatsapp.protocol.co;
import com.whatsapp.qm;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.v;
import org.whispersystems.at;
import org.whispersystems.jobqueue.g;
import org.whispersystems.jobqueue.requirements.d;

public class AxolotlParticipantSessionsRequirement implements g, d {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private transient boolean a;
    private transient awc b;
    private transient Collection c;
    private final String groupJid;
    private final String participantHash;

    static {
        String[] strArr = new String[6];
        String str = "r160R=x%8P(\u007f2\u0019A:y{";
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
                        i3 = 73;
                        break;
                    case at.g /*1*/:
                        i3 = 17;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 81;
                        break;
                    default:
                        i3 = 32;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ".c)$P\u0003x\"qM<b2qB,1'qG;~3!\u0000&cf3R&p\"2A:ef=I:e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ".c)$P\u0003x\"qM<b2qN&ef3Eit+!T0";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "9p4%I*x60N=Y'\"Hi|3\"Ti\u007f)%\u0000+tf4M9e?";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ".c)$P\u0003x\"qM<b2qB,1'qG;~3!\u0000&cf3R&p\"2A:ef=I:e";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "r1!#O<a\f8Dt";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Context context) {
        this.b = awc.a(context);
    }

    public boolean m769a() {
        boolean z = ChatConnectionRequirement.a;
        try {
            b();
            if (this.c == null) {
                return true;
            }
            boolean z2;
            boolean z3 = true;
            for (String str : this.c) {
                if (z3) {
                    try {
                        if (this.b.b(awc.e(str))) {
                            z2 = true;
                            if (z) {
                                break;
                            }
                            z3 = z2;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                z2 = false;
                if (z) {
                    break;
                }
                z3 = z2;
            }
            z2 = z3;
            return z2;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public Collection a() {
        boolean z = ChatConnectionRequirement.a;
        try {
            b();
            if (this.c == null) {
                return Collections.emptySet();
            }
            Collection hashSet = new HashSet();
            for (String str : b()) {
                try {
                    if (!this.b.b(awc.e(str))) {
                        hashSet.add(str);
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return hashSet;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private String c() {
        return z[1] + this.groupJid + z[0] + this.participantHash;
    }

    public Collection b() {
        try {
            if (!this.a) {
                this.c = App.aK.b(this.groupJid, this.participantHash);
                this.a = true;
            }
            return this.c;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty(this.groupJid)) {
                throw new InvalidObjectException(z[3] + c());
            }
            try {
                if (TextUtils.isEmpty(this.participantHash)) {
                    throw new InvalidObjectException(z[4] + c());
                }
                try {
                    if (!qm.i(this.groupJid)) {
                        if (!co.a(this.groupJid)) {
                            throw new InvalidObjectException(z[5] + c());
                        }
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public AxolotlParticipantSessionsRequirement(@NonNull String str, @NonNull String str2) {
        this.groupJid = (String) auv.a((CharSequence) str);
        this.participantHash = (String) auv.a((CharSequence) str2);
        if (!qm.i(str)) {
            try {
                if (!co.a(str)) {
                    throw new IllegalArgumentException(z[2] + c());
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }
}
