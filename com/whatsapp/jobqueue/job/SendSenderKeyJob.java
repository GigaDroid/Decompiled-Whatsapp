package com.whatsapp.jobqueue.job;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.auv;
import com.whatsapp.awc;
import com.whatsapp.jobqueue.a;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.qm;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.whispersystems.jobqueue.g;
import org.whispersystems.jobqueue.s;
import org.whispersystems.jobqueue.v;

public final class SendSenderKeyJob extends v implements a, g {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private final long expireTimeMs;
    private transient awc f;
    private transient App g;
    private final String groupJid;
    private final String groupMessageId;
    private final int retryCount;

    static {
        String[] strArr = new String[14];
        String str = "hS\u001249yB\u001e?izC\u0018=,-X\u0014?-dE\u0016q:hE\u00154;-@\u0014(";
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
                        i3 = 13;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 113;
                        break;
                    case at.o /*3*/:
                        i3 = 81;
                        break;
                    default:
                        i3 = 73;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    strArr2[i] = str;
                    str = "hS\u00018;h\u007f\u0018<,@XQ<<~_Q3,-E\u001e?dcN\u00160=d]\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "jY\u001e$9GB\u0015q$xX\u0005q+h\u000b\u0010q.\u007fD\u0004!igB\u0015";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u007fN\u0005#0ND\u0004?=-F\u0004\"=-E\u001e%ioNQ?,jJ\u00058?h";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "6\u000b\u00014;~B\u0002%,c_85t";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "6\u000b\u00034=\u007fR2><c_L";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "jY\u001e$9GB\u0015l";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "6\u000b\u0016#&x[<4:~J\u00164\u0000i\u0016";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u007fN\u0005#0ND\u0004?=-F\u0004\"=-E\u001e%ioNQ?,jJ\u00058?h";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "jY\u001e$9GB\u0015q$xX\u0005q+h\u000b\u0010q.\u007fD\u0004!igB\u0015";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "hS\u00018;h\u007f\u0018<,@XQ<<~_Q3,-E\u001e?dcN\u00160=d]\u0014";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "jY\u001e$9GB\u0015q$xX\u0005q'b_Q3,-N\u001c!=t";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "jY\u001e$9@N\u0002\"(jN85i`^\u0002%icD\u0005q+h\u000b\u0014<9yR";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "~_\u0010#=dE\u0016q:hE\u0015q:hE\u00154;-@\u0014(igD\u0013";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b() {
    }

    public SendSenderKeyJob(String str, String str2, int i, long j) {
        super(s.f().a(str).a().a(new ChatConnectionRequirement()).b());
        this.groupJid = (String) auv.a((CharSequence) str);
        this.groupMessageId = (String) auv.a((CharSequence) str2);
        this.retryCount = i;
        this.expireTimeMs = j;
        if (!qm.i(str)) {
            throw new IllegalArgumentException(z[3] + a());
        } else if (i < 0) {
            try {
                throw new IllegalArgumentException(z[4] + a());
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (j <= 0) {
            try {
                throw new IllegalArgumentException(z[2] + a());
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty(this.groupJid)) {
                throw new InvalidObjectException(z[12] + a());
            }
            try {
                if (TextUtils.isEmpty(this.groupMessageId)) {
                    throw new InvalidObjectException(z[13] + a());
                }
                try {
                    if (qm.i(this.groupJid)) {
                        try {
                            if (this.retryCount < 0) {
                                throw new InvalidObjectException(z[9] + a());
                            }
                            try {
                                if (this.expireTimeMs < 0) {
                                    throw new InvalidObjectException(z[11] + a());
                                }
                                return;
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    throw new InvalidObjectException(z[10] + a());
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    static awc a(SendSenderKeyJob sendSenderKeyJob) {
        return sendSenderKeyJob.f;
    }

    public boolean a(Exception exception) {
        Log.c(z[0] + a(), (Throwable) exception);
        return true;
    }

    public void a(App app) {
        this.g = app;
    }

    public void a(Context context) {
        this.f = awc.a(context);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
        r20 = this;
        r16 = com.whatsapp.jobqueue.job.SendE2EMessageJob.g;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r20.a();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.App.aK;
        r3 = new com.whatsapp.protocol.c3;
        r0 = r20;
        r4 = r0.groupJid;
        r5 = 1;
        r0 = r20;
        r6 = r0.groupMessageId;
        r3.<init>(r4, r5, r6);
        r3 = r2.a(r3);
        r0 = r20;
        r2 = r0.groupJid;
        r17 = com.whatsapp.qm.c(r2);
        if (r3 == 0) goto L_0x00d1;
    L_0x003d:
        r2 = r3.c;	 Catch:{ IllegalArgumentException -> 0x00cd }
        if (r2 != 0) goto L_0x00d1;
    L_0x0041:
        r2 = r17.a();	 Catch:{ IllegalArgumentException -> 0x00cf }
        r4 = r3.g;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r2 = r2.equals(r4);	 Catch:{ IllegalArgumentException -> 0x00cf }
        if (r2 == 0) goto L_0x00d1;
    L_0x004d:
        r2 = 1;
    L_0x004e:
        r4 = com.whatsapp.awc.e;
        r5 = new com.whatsapp.jobqueue.job.e;
        r0 = r20;
        r5.<init>(r0, r2, r3);
        r2 = r4.submit(r5);
        r3 = r2.get();
        r3 = (com.whatsapp.proto.E2E.Message) r3;
        r4 = r17.g();
        r0 = r20;
        r6 = r0.expireTimeMs;
        r8 = 0;
        r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r2 <= 0) goto L_0x0075;
    L_0x006f:
        r0 = r20;
        r12 = r0.expireTimeMs;
        if (r16 == 0) goto L_0x008a;
    L_0x0075:
        r2 = de.greenrobot.event.h.b();
        r5 = com.whatsapp.amm.class;
        r2 = r2.b(r5);
        r2 = (com.whatsapp.amm) r2;
        r6 = r2.a();
        r8 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r12 = r6 + r8;
    L_0x008a:
        r18 = r4.iterator();
    L_0x008e:
        r2 = r18.hasNext();
        if (r2 == 0) goto L_0x00c0;
    L_0x0094:
        r6 = r18.next();
        r6 = (java.lang.String) r6;
        r0 = r20;
        r2 = r0.g;
        r0 = r2.ai;
        r19 = r0;
        r2 = new com.whatsapp.jobqueue.job.SendE2EMessageJob;
        r0 = r20;
        r4 = r0.groupMessageId;
        r0 = r20;
        r5 = r0.groupJid;
        r0 = r20;
        r7 = r0.retryCount;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r14 = 0;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14);
        r0 = r19;
        r0.a(r2);
        if (r16 == 0) goto L_0x008e;
    L_0x00c0:
        r17.j();	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = com.whatsapp.WAAppCompatActivity.c;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        if (r2 == 0) goto L_0x00cc;
    L_0x00c7:
        if (r16 == 0) goto L_0x00d8;
    L_0x00c9:
        r2 = 0;
    L_0x00ca:
        com.whatsapp.jobqueue.job.SendE2EMessageJob.g = r2;
    L_0x00cc:
        return;
    L_0x00cd:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00cf }
    L_0x00cf:
        r2 = move-exception;
        throw r2;
    L_0x00d1:
        r2 = 0;
        goto L_0x004e;
    L_0x00d4:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00d6 }
    L_0x00d6:
        r2 = move-exception;
        throw r2;
    L_0x00d8:
        r2 = 1;
        goto L_0x00ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendSenderKeyJob.i():void");
    }

    private String a() {
        return z[7] + this.groupJid + z[8] + this.groupMessageId + z[6] + this.retryCount + z[5] + c();
    }

    static String b(SendSenderKeyJob sendSenderKeyJob) {
        return sendSenderKeyJob.groupJid;
    }

    public void n() {
    }
}
