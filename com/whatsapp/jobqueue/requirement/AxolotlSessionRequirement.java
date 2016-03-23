package com.whatsapp.jobqueue.requirement;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.auv;
import com.whatsapp.awc;
import com.whatsapp.l5;
import com.whatsapp.qm;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.v;
import org.whispersystems.at;
import org.whispersystems.jobqueue.g;
import org.whispersystems.jobqueue.requirements.d;

public final class AxolotlSessionRequirement implements g, d {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private transient awc a;
    private final String jid;

    static {
        String[] strArr = new String[3];
        String str = "na<7Cq{,7La(9y\u000emf<~Xml-vB$b1s\u0015$b1s\u0013";
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
                        i3 = 4;
                        break;
                    case at.g /*1*/:
                        i3 = 8;
                        break;
                    case at.i /*2*/:
                        i3 = 88;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 46;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "na<7Cq{,7La(9y\u000emf<~Xml-vB$b1s\u0015$b1s\u0013";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "na<7Cq{,7@k|xuK$m5gZ}";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean m766a() {
        return this.a.b(awc.e(this.jid));
    }

    public AxolotlSessionRequirement(String str) {
        this.jid = (String) auv.a((CharSequence) str);
        if (!qm.i(str)) {
            try {
                if (!l5.e(str)) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException(z[2] + str);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty(this.jid)) {
                throw new InvalidObjectException(z[1]);
            }
            try {
                if (!qm.i(this.jid)) {
                    if (!l5.e(this.jid)) {
                        return;
                    }
                }
                throw new InvalidObjectException(z[0] + this.jid);
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void a(Context context) {
        this.a = awc.a(context);
    }

    public String a() {
        return this.jid;
    }
}
