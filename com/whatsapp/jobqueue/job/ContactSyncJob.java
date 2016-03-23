package com.whatsapp.jobqueue.job;

import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.auv;
import com.whatsapp.contact.i;
import com.whatsapp.jobqueue.a;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.at;
import org.whispersystems.jobqueue.s;
import org.whispersystems.jobqueue.v;

public final class ContactSyncJob extends v implements a {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private transient App f;
    private final byte[] jidHash;

    static {
        String[] strArr = new String[2];
        String str = "S\u001e\u001e#\u001dJ\u001fZ\u0006\tJ\u0003Z\u0005\u0013MW\u0018\u000e\\\\\u001a\n\u001f\u0005";
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
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 119;
                        break;
                    case at.i /*2*/:
                        i3 = 122;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "Z\u0018\u0014\u001f\u001dZ\u0003%\u0018\u0005W\u0014";
                    obj = null;
            }
        }
    }

    public void n() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.jidHash == null || this.jidHash.length == 0) {
            throw new InvalidObjectException(z[0]);
        }
    }

    public void i() {
        App app = this.f;
        i.a(App.z(), this.jidHash);
    }

    public void b() {
    }

    public void a(App app) {
        this.f = app;
    }

    public ContactSyncJob(byte[] bArr) {
        super(s.f().a(z[1]).a().a(new ChatConnectionRequirement()).b());
        this.jidHash = auv.a(bArr);
    }

    public boolean a(Exception exception) {
        return false;
    }
}
