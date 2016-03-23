package com.whatsapp.jobqueue.requirement;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.auv;
import com.whatsapp.awc;
import com.whatsapp.l5;
import com.whatsapp.qm;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.v;
import org.whispersystems.at;
import org.whispersystems.jobqueue.g;
import org.whispersystems.jobqueue.requirements.d;

public class AxolotlDifferentAliceBaseKeyRequirement implements g, d {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private transient awc a;
    private final String jid;
    private final byte[] oldAliceBaseKey;

    static {
        String[] strArr = new String[4];
        String str = ">\b\u001a^S!\u0012\n^\\1A\u001f\u0010\u001e=\u000f\u001a\u0017H=\u0005\u000b\u001fRt\u000b\u0017\u001a\u0005t\u000b\u0017\u001a\u0003";
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
                        i3 = 84;
                        break;
                    case at.g /*1*/:
                        i3 = 97;
                        break;
                    case at.i /*2*/:
                        i3 = 126;
                        break;
                    case at.o /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 62;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ">\b\u001a^S!\u0012\n^\\1A\u001f\u0010\u001e=\u000f\u001a\u0017H=\u0005\u000b\u001fRt\u000b\u0017\u001a\u0005t\u000b\u0017\u001a\u0003";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ";\r\u001a?R=\u0002\u001b<_'\u00045\u001bGt\f\u000b\rJt\u000f\u0011\n\u001e6\u0004^\u001bS$\u0015\u0007";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ">\b\u001a^S!\u0012\n^P;\u0015^\u001c[t\u0004\u0013\u000eJ-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String b() {
        return this.jid;
    }

    public byte[] m768a() {
        return this.oldAliceBaseKey;
    }

    public void a(@NonNull Context context) {
        this.a = awc.a(context);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty(this.jid)) {
                throw new InvalidObjectException(z[1]);
            }
            try {
                if (this.oldAliceBaseKey != null) {
                    if (this.oldAliceBaseKey.length != 0) {
                        try {
                            if (!qm.i(this.jid)) {
                                if (!l5.e(this.jid)) {
                                    return;
                                }
                            }
                            throw new InvalidObjectException(z[2] + this.jid);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                }
                throw new InvalidObjectException(z[3]);
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public AxolotlDifferentAliceBaseKeyRequirement(String str, byte[] bArr) {
        this.jid = (String) auv.a((CharSequence) str);
        this.oldAliceBaseKey = auv.a(bArr);
        if (!qm.i(str)) {
            try {
                if (!l5.e(str)) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException(z[0] + str);
    }

    public boolean a() {
        boolean z = false;
        boolean z2 = ChatConnectionRequirement.a;
        try {
            boolean z3 = !Arrays.equals(this.oldAliceBaseKey, this.a.a(awc.e(this.jid)).a().j());
            try {
                if (WAAppCompatActivity.c != 0) {
                    if (!z2) {
                        z = true;
                    }
                    ChatConnectionRequirement.a = z;
                }
                return z3;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
