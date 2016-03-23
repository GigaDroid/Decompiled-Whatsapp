package com.whatsapp.jobqueue.requirement;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.auv;
import com.whatsapp.awc;
import com.whatsapp.qm;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.v;
import org.whispersystems.at;
import org.whispersystems.bI;
import org.whispersystems.jobqueue.g;
import org.whispersystems.jobqueue.requirements.d;

public final class AxolotlSenderKeyRequirement implements g, d {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private transient awc a;
    private final String groupJid;

    static {
        String[] strArr = new String[4];
        String str = "9\u0019~K@\u0014\u0002u\u001e]+\u0018e\u001e^1\u001f1\\U~\u000e|ND'";
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
                        i3 = 94;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
                        break;
                    case at.o /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 48;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "9\u0019~K@\u0014\u0002u\u001eY-K\u007fQD~\n1YB1\u001ea\u001eZ7\u000f*\u001eW,\u0004dNz7\u000f,";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001e\u0018?IX?\u001fb_@.E\u007f[D";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "9\u0019~K@\u0014\u0002u\u001eY-K\u007fQD~\n1YB1\u001ea\u001eZ7\u000f*\u001eW,\u0004dNz7\u000f,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public AxolotlSenderKeyRequirement(String str) {
        this.groupJid = (String) auv.a((CharSequence) str);
        if (!qm.i(str)) {
            throw new IllegalArgumentException(z[2] + str);
        }
    }

    public void a(Context context) {
        this.a = awc.a(context);
    }

    public boolean a() {
        boolean z = ChatConnectionRequirement.a;
        try {
            boolean z2;
            if (!this.a.c().a(new bI(this.groupJid, awc.e(App.ay.jabber_id + z[3]))).a()) {
                if (qm.c(this.groupJid).g().isEmpty()) {
                    z2 = true;
                    if (z) {
                        WAAppCompatActivity.c++;
                    }
                    return z2;
                }
            }
            z2 = false;
            if (z) {
                WAAppCompatActivity.c++;
            }
            return z2;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty(this.groupJid)) {
                throw new InvalidObjectException(z[0]);
            }
            try {
                if (!qm.i(this.groupJid)) {
                    throw new InvalidObjectException(z[1] + this.groupJid);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
