package com.whatsapp.jobqueue.job;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.a25;
import com.whatsapp.auv;
import com.whatsapp.jobqueue.b;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.protocol.ct;
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

public final class SendReadReceiptJob extends v implements g {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private transient b f;
    public String jid;
    public String[] messageIds;
    public String participant;

    static {
        String[] strArr = new String[10];
        String str = "\u001e\u000fy0/\u0011\u000bss9\u0018\u0000cs8\u0018\u000fss8\u0018\rr::\t\u001d79%\u001f";
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
                        i3 = 125;
                        break;
                    case at.g /*1*/:
                        i3 = 110;
                        break;
                    case at.i /*2*/:
                        i3 = 23;
                        break;
                    case at.o /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000f\u000bt6#\r\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0018\u0016t6:\t\u0007x=j\n\u0006~?/]\u001cb=$\u0014\u0000ps9\u0018\u0000cs8\u0018\u000fss8\u0018\rr::\t\u001d79%\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u000f\u000bv7g\u000f\u000bt6#\r\u001a:";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0010\u000bd +\u001a\u000b^79]\u0003b >]\u0000x'j\u001f\u000b76'\r\u001an";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0017\u0007ss'\b\u001dcs$\u0012\u001a71/]\u000bz#>\u0004";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "FN~79G";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "FNg28\t\u0007t::\u001c\u0000cn";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "FN}:.@";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000f\u000bv7";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void n() {
    }

    public void b() {
        Log.w(z[0] + a());
        this.f.b();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jid)) {
            throw new InvalidObjectException(z[6]);
        } else if (this.messageIds == null || this.messageIds.length == 0) {
            throw new InvalidObjectException(z[5]);
        }
    }

    public void i() {
        if (App.C(this.jid)) {
            String str;
            MessageService a = this.f.a();
            a25 com_whatsapp_a25 = new a25();
            com_whatsapp_a25.b = new c3(this.jid, false, this.messageIds[0]);
            com_whatsapp_a25.a = this.participant;
            if (this.messageIds.length > 1) {
                com_whatsapp_a25.c = new String[(this.messageIds.length - 1)];
                System.arraycopy(this.messageIds, 1, com_whatsapp_a25.c, 0, com_whatsapp_a25.c.length);
            }
            ct ctVar = new ct();
            if (TextUtils.isEmpty(this.participant)) {
                str = null;
            } else {
                str = this.participant;
            }
            boolean a2 = co.a(str);
            ctVar.e = a2 ? str : this.jid;
            ctVar.a = z[2];
            ctVar.c = z[1];
            ctVar.b = this.messageIds[0];
            if (a2) {
                str = this.jid;
            }
            ctVar.d = str;
            a.a(ctVar, com.whatsapp.messaging.co.a(com_whatsapp_a25)).get();
            this.f.b();
        }
    }

    private String a() {
        return z[9] + this.jid + z[8] + this.participant + z[7] + Arrays.deepToString(this.messageIds);
    }

    public void a(Context context) {
        if (this.f == null) {
            this.f = new b(context);
        }
        this.f.c();
    }

    public SendReadReceiptJob(@NonNull String str, @Nullable String str2, @NonNull String[] strArr) {
        super(s.f().a(z[4] + str).a().a(new ChatConnectionRequirement()).b());
        this.jid = (String) auv.a((Object) str);
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        this.participant = str2;
        this.messageIds = strArr;
    }

    public boolean a(Exception exception) {
        Log.c(z[3] + a(), (Throwable) exception);
        return true;
    }
}
