package com.whatsapp.jobqueue.job;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.amm;
import com.whatsapp.arj;
import com.whatsapp.auv;
import com.whatsapp.awc;
import com.whatsapp.jobqueue.a;
import com.whatsapp.jobqueue.b;
import com.whatsapp.proto.E2E.Message;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.qm;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.whispersystems.jobqueue.g;
import org.whispersystems.jobqueue.v;

public final class SendE2EMessageJob extends v implements a, g {
    public static boolean g = false;
    private static final ConcurrentHashMap messagesBeingSent;
    private static final Random random;
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private final long expireTimeMs;
    private transient b f;
    private final String groupParticipantHash;
    private transient App h;
    private transient awc i;
    private final String id;
    private final boolean includeSenderKeysInMessage;
    private final String jid;
    private final Message message;
    private final long originalTimestamp;
    private final String participant;
    private final int retryCount;
    private final String webAttribute;

    private boolean a() {
        return a(this.jid, this.participant);
    }

    public boolean g() {
        try {
            if (!c()) {
                if (!super.g()) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static String c(SendE2EMessageJob sendE2EMessageJob) {
        return sendE2EMessageJob.participant;
    }

    public static boolean a(@NonNull c3 c3Var) {
        return messagesBeingSent.containsKey(c3Var);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (this.message == null) {
                throw new InvalidObjectException(z[23] + b());
            }
            try {
                if (this.id == null) {
                    throw new InvalidObjectException(z[18] + b());
                }
                try {
                    if (this.jid == null) {
                        throw new InvalidObjectException(z[15] + b());
                    }
                    try {
                        boolean z;
                        boolean a;
                        if (!qm.i(this.jid)) {
                            if (!co.a(this.jid)) {
                                z = false;
                                a = a();
                                if (this.participant != null) {
                                    if (TextUtils.isEmpty(this.participant)) {
                                        throw new InvalidObjectException(z[16] + b());
                                    }
                                }
                                if (!TextUtils.isEmpty(this.participant) || r0) {
                                    try {
                                        if (this.retryCount >= 0) {
                                            throw new InvalidObjectException(z[17] + b());
                                        }
                                        try {
                                            if (this.groupParticipantHash != null) {
                                                if (TextUtils.isEmpty(this.groupParticipantHash)) {
                                                    throw new InvalidObjectException(z[14] + b());
                                                }
                                            }
                                            try {
                                                if (this.groupParticipantHash != null || r0) {
                                                    try {
                                                        if (this.groupParticipantHash != null) {
                                                            if (this.participant != null) {
                                                                throw new InvalidObjectException(z[24] + b());
                                                            }
                                                        }
                                                        try {
                                                            if (this.includeSenderKeysInMessage || r0) {
                                                                if (a) {
                                                                    try {
                                                                        if (TextUtils.isEmpty(this.groupParticipantHash)) {
                                                                            throw new InvalidObjectException(z[21] + b());
                                                                        }
                                                                    } catch (IllegalArgumentException e) {
                                                                        throw e;
                                                                    }
                                                                }
                                                                try {
                                                                    if (this.expireTimeMs > 0) {
                                                                        throw new InvalidObjectException(z[22] + b());
                                                                    }
                                                                    messagesBeingSent.put(new c3(this.jid, true, this.id), Boolean.TRUE);
                                                                    return;
                                                                } catch (IllegalArgumentException e2) {
                                                                    throw e2;
                                                                }
                                                            }
                                                            throw new InvalidObjectException(z[25] + b());
                                                        } catch (IllegalArgumentException e22) {
                                                            throw e22;
                                                        } catch (IllegalArgumentException e222) {
                                                            throw e222;
                                                        }
                                                    } catch (IllegalArgumentException e2222) {
                                                        throw e2222;
                                                    } catch (IllegalArgumentException e22222) {
                                                        throw e22222;
                                                    }
                                                }
                                                throw new InvalidObjectException(z[20] + b());
                                            } catch (IllegalArgumentException e222222) {
                                                throw e222222;
                                            } catch (IllegalArgumentException e2222222) {
                                                throw e2222222;
                                            }
                                        } catch (IllegalArgumentException e22222222) {
                                            throw e22222222;
                                        } catch (IllegalArgumentException e222222222) {
                                            throw e222222222;
                                        }
                                    } catch (IllegalArgumentException e2222222222) {
                                        throw e2222222222;
                                    }
                                }
                                throw new InvalidObjectException(z[19] + b());
                            }
                        }
                        z = true;
                        a = a();
                        try {
                            if (this.participant != null) {
                                if (TextUtils.isEmpty(this.participant)) {
                                    throw new InvalidObjectException(z[16] + b());
                                }
                            }
                            try {
                                if (TextUtils.isEmpty(this.participant)) {
                                }
                                if (this.retryCount >= 0) {
                                    if (this.groupParticipantHash != null) {
                                        if (TextUtils.isEmpty(this.groupParticipantHash)) {
                                            throw new InvalidObjectException(z[14] + b());
                                        }
                                    }
                                    if (this.groupParticipantHash != null) {
                                    }
                                    if (this.groupParticipantHash != null) {
                                        if (this.participant != null) {
                                            throw new InvalidObjectException(z[24] + b());
                                        }
                                    }
                                    if (this.includeSenderKeysInMessage) {
                                    }
                                    if (a) {
                                        if (TextUtils.isEmpty(this.groupParticipantHash)) {
                                            throw new InvalidObjectException(z[21] + b());
                                        }
                                    }
                                    if (this.expireTimeMs > 0) {
                                        messagesBeingSent.put(new c3(this.jid, true, this.id), Boolean.TRUE);
                                        return;
                                    }
                                    throw new InvalidObjectException(z[22] + b());
                                }
                                throw new InvalidObjectException(z[17] + b());
                            } catch (IllegalArgumentException e22222222222) {
                                throw e22222222222;
                            } catch (IllegalArgumentException e222222222222) {
                                throw e222222222222;
                            }
                        } catch (IllegalArgumentException e2222222222222) {
                            throw e2222222222222;
                        } catch (IllegalArgumentException e22222222222222) {
                            throw e22222222222222;
                        }
                    } catch (IllegalArgumentException e222222222222222) {
                        throw e222222222222222;
                    } catch (IllegalArgumentException e2222222222222222) {
                        throw e2222222222222222;
                    }
                } catch (IllegalArgumentException e22222222222222222) {
                    throw e22222222222222222;
                }
            } catch (IllegalArgumentException e222222222222222222) {
                throw e222222222222222222;
            }
        } catch (IllegalArgumentException e2222222222222222222) {
            throw e2222222222222222222;
        }
    }

    public boolean a(Exception exception) {
        Log.c(z[0] + b(), (Throwable) exception);
        return true;
    }

    private static int a(int i) {
        switch (i) {
            case at.i /*2*/:
                return 0;
            case at.o /*3*/:
                return 1;
            case at.p /*4*/:
                return 2;
            default:
                throw new IllegalArgumentException(z[35] + i);
        }
    }

    public void m723b() {
        this.f.b();
        messagesBeingSent.remove(new c3(this.jid, true, this.id));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
        r19 = this;
        r16 = 0;
        r2 = r19.c();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        if (r2 == 0) goto L_0x0040;
    L_0x0008:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2.<init>();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = z;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = r19.b();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r2 = r0.f;
        r2.b();
        r2 = messagesBeingSent;
        r3 = new com.whatsapp.protocol.c3;
        r0 = r19;
        r4 = r0.jid;
        r5 = 1;
        r0 = r19;
        r6 = r0.id;
        r3.<init>(r4, r5, r6);
        r2.remove(r3);
    L_0x003f:
        return;
    L_0x0040:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2.<init>();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = z;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = r19.b();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r2 = r0.retryCount;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = 4;
        if (r2 <= r3) goto L_0x009c;
    L_0x0064:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2.<init>();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = z;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = r19.b();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r2 = r0.f;
        r2.b();
        r2 = messagesBeingSent;
        r3 = new com.whatsapp.protocol.c3;
        r0 = r19;
        r4 = r0.jid;
        r5 = 1;
        r0 = r19;
        r6 = r0.id;
        r3.<init>(r4, r5, r6);
        r2.remove(r3);
        goto L_0x003f;
    L_0x009c:
        r0 = r19;
        r2 = r0.f;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r2 = r2.a();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r3 = r0.message;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = r3.b();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = random;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r4 = r4.nextInt(r5);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = r4 + 1;
        r5 = r3.length;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r5 = r5 + r4;
        r5 = new byte[r5];	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r6 = 0;
        r7 = 0;
        r8 = r3.length;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        java.lang.System.arraycopy(r3, r6, r5, r7, r8);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = r3.length;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r6 = r5.length;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = (byte) r4;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        java.util.Arrays.fill(r5, r3, r6, r4);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3 = new com.whatsapp.protocol.c3;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r4 = r0.jid;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r6 = 1;
        r0 = r19;
        r7 = r0.id;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r3.<init>(r4, r6, r7);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r17 = new com.whatsapp.protocol.ct;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r17.<init>();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r4 = r0.jid;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r17;
        r0.e = r4;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = z;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r6 = 1;
        r4 = r4[r6];	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r17;
        r0.a = r4;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = r3.b;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r17;
        r0.b = r4;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r4 = r0.participant;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r17;
        r0.d = r4;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r18 = r19.a();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r1 = r18;
        r4 = r0.a(r1);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r14 = r4.first;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r14 = (java.util.Hashtable) r14;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r15 = r4.second;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r15 = (java.util.Vector) r15;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = com.whatsapp.awc.e;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r6 = new com.whatsapp.jobqueue.job.b;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r1 = r18;
        r6.<init>(r0, r1, r5);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r4 = r4.submit(r6);	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r13 = r4.get();	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r13 = (com.whatsapp.protocol.b1) r13;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
        r0 = r19;
        r4 = r0.originalTimestamp;	 Catch:{ Exception -> 0x017d, all -> 0x01a6 }
        r0 = r19;
        r6 = r0.retryCount;	 Catch:{ Exception -> 0x017d, all -> 0x01a6 }
        r0 = r19;
        r7 = r0.participant;	 Catch:{ Exception -> 0x017d, all -> 0x01a6 }
        r0 = r19;
        r8 = r0.groupParticipantHash;	 Catch:{ Exception -> 0x017d, all -> 0x01a6 }
        r9 = r19.d();	 Catch:{ Exception -> 0x017d, all -> 0x01a6 }
        r10 = 0;
        r11 = 0;
        r0 = r19;
        r12 = r0.webAttribute;	 Catch:{ Exception -> 0x017d, all -> 0x01a6 }
        r3 = com.whatsapp.messaging.co.a(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ Exception -> 0x017d, all -> 0x01a6 }
        r0 = r17;
        r2 = r2.a(r0, r3);	 Catch:{ Exception -> 0x017d, all -> 0x01a6 }
        r2.get();	 Catch:{ Exception -> 0x017d, all -> 0x01a6 }
        if (r18 == 0) goto L_0x015f;
    L_0x014a:
        if (r14 == 0) goto L_0x015f;
    L_0x014c:
        r2 = r14.isEmpty();	 Catch:{ Exception -> 0x017f, all -> 0x01a6 }
        if (r2 != 0) goto L_0x015f;
    L_0x0152:
        r2 = com.whatsapp.App.aK;	 Catch:{ Exception -> 0x0181, all -> 0x01a6 }
        r0 = r19;
        r3 = r0.jid;	 Catch:{ Exception -> 0x0181, all -> 0x01a6 }
        r4 = r14.keySet();	 Catch:{ Exception -> 0x0181, all -> 0x01a6 }
        r2.a(r3, r4);	 Catch:{ Exception -> 0x0181, all -> 0x01a6 }
    L_0x015f:
        r0 = r19;
        r2 = r0.f;	 Catch:{ Exception -> 0x017b }
        r2.b();	 Catch:{ Exception -> 0x017b }
        r2 = messagesBeingSent;	 Catch:{ Exception -> 0x017b }
        r3 = new com.whatsapp.protocol.c3;	 Catch:{ Exception -> 0x017b }
        r0 = r19;
        r4 = r0.jid;	 Catch:{ Exception -> 0x017b }
        r5 = 1;
        r0 = r19;
        r6 = r0.id;	 Catch:{ Exception -> 0x017b }
        r3.<init>(r4, r5, r6);	 Catch:{ Exception -> 0x017b }
        r2.remove(r3);	 Catch:{ Exception -> 0x017b }
        goto L_0x003f;
    L_0x017b:
        r2 = move-exception;
        throw r2;
    L_0x017d:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x017f, all -> 0x01a6 }
    L_0x017f:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0181, all -> 0x01a6 }
    L_0x0181:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0183, all -> 0x01a6 }
    L_0x0183:
        r2 = move-exception;
        r3 = 1;
        throw r2;	 Catch:{ all -> 0x0186 }
    L_0x0186:
        r2 = move-exception;
    L_0x0187:
        if (r3 != 0) goto L_0x01a3;
    L_0x0189:
        r0 = r19;
        r3 = r0.f;	 Catch:{ Exception -> 0x01a4 }
        r3.b();	 Catch:{ Exception -> 0x01a4 }
        r3 = messagesBeingSent;	 Catch:{ Exception -> 0x01a4 }
        r4 = new com.whatsapp.protocol.c3;	 Catch:{ Exception -> 0x01a4 }
        r0 = r19;
        r5 = r0.jid;	 Catch:{ Exception -> 0x01a4 }
        r6 = 1;
        r0 = r19;
        r7 = r0.id;	 Catch:{ Exception -> 0x01a4 }
        r4.<init>(r5, r6, r7);	 Catch:{ Exception -> 0x01a4 }
        r3.remove(r4);	 Catch:{ Exception -> 0x01a4 }
    L_0x01a3:
        throw r2;
    L_0x01a4:
        r2 = move-exception;
        throw r2;
    L_0x01a6:
        r2 = move-exception;
        r3 = r16;
        goto L_0x0187;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.i():void");
    }

    public void a(Context context) {
        try {
            this.i = awc.a(context);
            if (this.f == null) {
                this.f = new b(context);
            }
            this.f.c();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[46];
        String str = "gF\u001f=\tvW\u00136YuV\u00154\u001c\"M\u00196\u001dkP\u001bx\u001c0[\\5\u001cqM\u001d?\u001c";
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
                        i3 = 2;
                        break;
                    case at.g /*1*/:
                        i3 = 62;
                        break;
                    case at.i /*2*/:
                        i3 = 124;
                        break;
                    case at.o /*3*/:
                        i3 = 88;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    strArr2[i] = str;
                    str = "c\\\u0013*\rkP\u001bx\u001c0[\\5\u001cqM\u001d?\u001c\"M\u00196\u001d\"T\u0013:YfK\u0019x\rm\u001e\u00141\u001ej\u001e\u000e=\rpG\\;\u0016wP\b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "g\f\u0019x\u0014gM\u000f9\u001eg\u001e\u000f=\u0017f\u001e\u00167\u001b\"[\u0004(\u0010p[\u0018";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "pK\u00126\u0010lY\\=Kg\u001e\u0011=\nq_\u001b=Yq[\u0012<YhQ\u001e";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "9\u001e\f=\u000bqW\u000f,\u001clJ5<D";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "9\u001e\u00161\u001d?";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "9\u001e\f9\u000bvW\u001f1\tcP\be";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "9\u001e\u000e=\rpG?7\flJA";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "9\u001e\u000b=\u001bCJ\b*\u0010`K\b=D";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "9\u001e\u00156\u001anK\u0018=*gP\u0018=\u000bI[\u0005+0ls\u0019+\ncY\u0019e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "9\u001e\u0015<D";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "9\u001e\u001b*\u0016wN,9\u000bvW\u001f1\tcP\b\u0010\u0018qVA";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "wP\u001d:\u0015g\u001e\b7Yp[\b*\u0010gH\u0019x\tcL\b1\u001akN\u001d6\rq\u001e\u00156YeL\u0013-\t\"_\bx\rkS\u0019x\u0016d\u001e\u0011=\nq_\u001b=";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "eL\u0013-\tR_\u000e,\u0010aW\f9\u0017vv\u001d+\u0011\"]\u001d6\u0017mJ\\:\u001c\"M\u0019,YvQ\\9\u0017\"[\u0011(\r{\u001e\u000f,\u000bkP\u001b";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "hW\u0018x\u0014wM\bx\u0017mJ\\:\u001c\"P\t4\u0015";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "r_\u000e,\u0010aW\f9\u0017v\u001e\u0011-\nv\u001e\u00127\r\"\\\u0019x\rj[\\=\u0014rJ\u0005x\nvL\u00156\u001e";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "p[\b*\u0000AQ\t6\r\"]\u001d6\u0017mJ\\:\u001c\"P\u0019?\u0018vW\n=";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "kZ\\5\fqJ\\6\u0016v\u001e\u001e=YlK\u00104";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "r_\u000e,\u0010aW\f9\u0017v\u001e\u001f9\u0017lQ\bx\u001bg\u001e\u000f=\r\"W\u001ax\rj[\\(\u000bkS\u001d*\u0000\"T\u0015<YkM\\6\u0016v\u001e\u001dx\u001epQ\t(YmL\\:\u000bm_\u0018;\u0018qJ\\4\u0010qJ";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "eL\u0013-\tR_\u000e,\u0010aW\f9\u0017vv\u001d+\u0011\"]\u001d6\u0017mJ\\:\u001c\"M\u0019,YkX\\,\u0011g\u001e\f*\u0010o_\u000e!YhW\u0018x\u0010q\u001e\u00127\r\"_\\?\u000bmK\fx\u0016p\u001e\u001e*\u0016cZ\u001f9\nv\u001e\u00101\nv";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "a_\u00126\u0016v\u001e\u000f=\u0017f\u001e\u0019j\u001c\"S\u0019+\ncY\u0019x\rm\u001e\u001dx\u001epQ\t(YuW\b0\u0016wJ\\9Yr_\u000e,\u0010aW\f9\u0017v\u001e\u00149\nj";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "gF\f1\u000bgj\u00155\u001cOM\\5\fqJ\\:\u001c\"P\u00136Tl[\u001b9\rkH\u0019";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "o[\u000f+\u0018e[\\5\fqJ\\6\u0016v\u001e\u001e=YlK\u00104";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "eL\u0013-\tR_\u000e,\u0010aW\f9\u0017vv\u001d+\u0011\"]\u001d6\u0017mJ\\:\u001c\"M\u0019,YkX\\(\u0018pJ\u0015;\u0010r_\u0012,YkM\\+\u001cv";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "kP\u001f4\ff[/=\u0017f[\u000e\u0013\u001c{M564gM\u000f9\u001eg\u001e\u001f9\u0017lQ\bx\u001bg\u001e\u000f=\r\"W\u001ax\rj[\\(\u000bkS\u001d*\u0000\"T\u0015<YkM\\6\u0016v\u001e\u001dx\u001epQ\t(YmL\\:\u000bm_\u0018;\u0018qJ\\4\u0010qJ";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "wL\u0010";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "kS\u001d?\u001c";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "tW\u0018=\u0016";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "cK\u00181\u0016";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "aQ\u0012,\u0018aJ";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "fQ\u001f-\u0014gP\b";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "nQ\u001f9\rkQ\u0012";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "a_\u00126\u0016v\u001e\t+\u001c\"Y\u000e7\fr\u001e\u00196\u001apG\f,\u0010mP\\9\u0017f\u001e\u00134\u001d\"_\u00101\u001ag\u001e\u001e9\ng\u001e\u0017=\u0000\"M\u00155\fnJ\u001d6\u001cmK\u000f4\u0000";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "a_\u00126\u0016v\u001e\t+\u001c\"[\u0011(\r{\u001e\u00134\u001d\"_\u00101\u001ag\u001e\u001e9\ng\u001e\u0017=\u0000";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "wP\u000e=\u001amY\u00121\u0003gZ\\;\u0010rV\u0019*\rgF\bx\u0014gM\u000f9\u001eg\u001e\b!\tg\u0005\\,\u0000r[A";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "g\f\u0019x\u0014gM\u000f9\u001eg\u001e\u000f=\u0017f\u001e\u00167\u001b\"_\u0018<\u001cf";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "eL\u0013-\tR_\u000e,\u0010aW\f9\u0017vv\u001d+\u0011\"]\u001d6\u0017mJ\\:\u001c\"M\u0019,YkX\\,\u0011g\u001e\f*\u0010o_\u000e!YhW\u0018x\u0010q\u001e\u00127\r\"_\\?\u000bmK\fx\u0016p\u001e\u001e*\u0016cZ\u001f9\nv\u001e\u00101\nv";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "p[\b*\u0000AQ\t6\r\"]\u001d6\u0017mJ\\:\u001c\"P\u0019?\u0018vW\n=";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "eL\u0013-\tR_\u000e,\u0010aW\f9\u0017vv\u001d+\u0011\"]\u001d6\u0017mJ\\:\u001c\"M\u0019,YvQ\\9\u0017\"[\u0011(\r{\u001e\u000f,\u000bkP\u001b";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "eL\u0013-\tR_\u000e,\u0010aW\f9\u0017vv\u001d+\u0011\"]\u001d6\u0017mJ\\:\u001c\"M\u0019,YkX\\(\u0018pJ\u0015;\u0010r_\u0012,YkM\\+\u001cv";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "gF\f1\u000bgj\u00155\u001cOM\\5\fqJ\\:\u001c\"P\u00136Tl[\u001b9\rkH\u0019";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "r_\u000e,\u0010aW\f9\u0017v\u001e\u001f9\u0017lQ\bx\u001bg\u001e\u000f=\r\"W\u001ax\rj[\\(\u000bkS\u001d*\u0000\"T\u0015<YkM\\6\u0016v\u001e\u001dx\u001epQ\t(YmL\\:\u000bm_\u0018;\u0018qJ\\4\u0010qJ";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "kP\u001f4\ff[/=\u0017f[\u000e\u0013\u001c{M564gM\u000f9\u001eg\u001e\u001f9\u0017lQ\bx\u001bg\u001e\u000f=\r\"W\u001ax\rj[\\(\u000bkS\u001d*\u0000\"T\u0015<YkM\\6\u0016v\u001e\u001dx\u001epQ\t(YmL\\:\u000bm_\u0018;\u0018qJ\\4\u0010qJ";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "r_\u000e,\u0010aW\f9\u0017v\u001e\u0011-\nv\u001e\u00127\r\"\\\u0019x\rj[\\=\u0014rJ\u0005x\nvL\u00156\u001e";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "a_\u00126\u0016v\u001e\u000f=\u0017f\u001e\u0019j\u001c\"S\u0019+\ncY\u0019x\rm\u001e\u001dx\u001epQ\t(YuW\b0\u0016wJ\\9Yr_\u000e,\u0010aW\f9\u0017v\u001e\u00149\nj";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    z = strArr3;
                    messagesBeingSent = new ConcurrentHashMap();
                    random = new Random();
                    return;
                default:
                    strArr2[i] = str;
                    str = "o[\u000f+\u0018e[";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static String a(SendE2EMessageJob sendE2EMessageJob) {
        return sendE2EMessageJob.jid;
    }

    private String d() {
        try {
            if (this.message.hasImageMessage()) {
                return z[27];
            }
            try {
                if (this.message.hasContactMessage()) {
                    return z[30];
                }
                try {
                    if (this.message.hasLocationMessage()) {
                        return z[32];
                    }
                    try {
                        if (this.message.hasUrlMessage()) {
                            return z[26];
                        }
                        try {
                            if (this.message.hasDocumentMessage()) {
                                return z[31];
                            }
                            try {
                                if (this.message.hasAudioMessage()) {
                                    return z[29];
                                }
                                try {
                                    return this.message.hasVideoMessage() ? z[28] : null;
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
        r13 = this;
        r7 = 0;
        r10 = g;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 36;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r13.b();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r13.e();
        r11 = r0.iterator();
        r1 = r7;
        r2 = r7;
    L_0x002b:
        r0 = r11.hasNext();
        if (r0 == 0) goto L_0x00d3;
    L_0x0031:
        r6 = r11.next();
        r6 = (org.whispersystems.jobqueue.requirements.d) r6;
        r0 = r6 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;
        if (r0 == 0) goto L_0x004a;
    L_0x003b:
        r0 = r6;
        r0 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r0;
        r3 = r0.a();
        if (r3 != 0) goto L_0x0048;
    L_0x0044:
        r2 = r0.a();
    L_0x0048:
        if (r10 == 0) goto L_0x00d0;
    L_0x004a:
        r0 = r6 instanceof com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement;	 Catch:{ IllegalArgumentException -> 0x00c0 }
        if (r0 == 0) goto L_0x00cd;
    L_0x004e:
        r0 = r6;
        r0 = (com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r0;
        r3 = r0.a();
        if (r3 != 0) goto L_0x00ca;
    L_0x0057:
        r1 = r0.b();
        r0 = r0.a();
    L_0x005f:
        if (r10 == 0) goto L_0x00af;
    L_0x0061:
        r8 = r0;
        r9 = r1;
    L_0x0063:
        r0 = r6 instanceof com.whatsapp.jobqueue.requirement.AxolotlSenderKeyRequirement;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r0 == 0) goto L_0x0085;
    L_0x0067:
        r0 = r6;
        r0 = (com.whatsapp.jobqueue.requirement.AxolotlSenderKeyRequirement) r0;
        r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x00c4 }
        if (r0 != 0) goto L_0x0083;
    L_0x0070:
        r0 = r13.h;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r12 = r0.ai;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0 = new com.whatsapp.jobqueue.job.SendSenderKeyJob;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r1 = r13.jid;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r2 = r13.id;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r3 = 0;
        r4 = r13.expireTimeMs;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0.<init>(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r12.a(r0);	 Catch:{ IllegalArgumentException -> 0x00c4 }
    L_0x0083:
        if (r10 == 0) goto L_0x00ad;
    L_0x0085:
        r0 = r6 instanceof com.whatsapp.jobqueue.requirement.AxolotlParticipantSessionsRequirement;	 Catch:{ IllegalArgumentException -> 0x00c6 }
        if (r0 == 0) goto L_0x00ad;
    L_0x0089:
        r6 = (com.whatsapp.jobqueue.requirement.AxolotlParticipantSessionsRequirement) r6;
        r0 = r6.a();
        r1 = r0.iterator();
    L_0x0093:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x00ad;
    L_0x0099:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r2 = r13.h;
        r2 = r2.ai;
        r3 = new com.whatsapp.jobqueue.job.GetPreKeyJob;
        r3.<init>(r0, r7);
        r2.a(r3);
        if (r10 == 0) goto L_0x0093;
    L_0x00ad:
        r0 = r8;
        r1 = r9;
    L_0x00af:
        if (r10 == 0) goto L_0x00d6;
    L_0x00b1:
        if (r1 == 0) goto L_0x00bf;
    L_0x00b3:
        r2 = r13.h;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = r2.ai;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3 = new com.whatsapp.jobqueue.job.GetPreKeyJob;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3.<init>(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2.a(r3);	 Catch:{ IllegalArgumentException -> 0x00c8 }
    L_0x00bf:
        return;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r0 = r1;
        r1 = r2;
        goto L_0x005f;
    L_0x00cd:
        r8 = r1;
        r9 = r2;
        goto L_0x0063;
    L_0x00d0:
        r0 = r1;
        r1 = r2;
        goto L_0x00af;
    L_0x00d3:
        r0 = r1;
        r1 = r2;
        goto L_0x00b1;
    L_0x00d6:
        r2 = r1;
        r1 = r0;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.n():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(@android.support.annotation.NonNull java.lang.String r1, @android.support.annotation.Nullable java.lang.String r2) {
        /*
        r0 = com.whatsapp.qm.i(r1);	 Catch:{ IllegalArgumentException -> 0x0014 }
        if (r0 != 0) goto L_0x000c;
    L_0x0006:
        r0 = com.whatsapp.protocol.co.a(r1);	 Catch:{ IllegalArgumentException -> 0x0016 }
        if (r0 == 0) goto L_0x001a;
    L_0x000c:
        r0 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IllegalArgumentException -> 0x0018 }
        if (r0 == 0) goto L_0x001a;
    L_0x0012:
        r0 = 1;
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;
    L_0x001a:
        r0 = 0;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.whispersystems.jobqueue.s a(@android.support.annotation.NonNull java.lang.String r5, @android.support.annotation.Nullable java.lang.String r6, @android.support.annotation.Nullable java.lang.String r7, @android.support.annotation.Nullable byte[] r8, boolean r9) {
        /*
        r2 = g;
        r0 = android.text.TextUtils.isEmpty(r6);	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r0 == 0) goto L_0x0037;
    L_0x0008:
        r1 = r5;
    L_0x0009:
        r0 = org.whispersystems.jobqueue.s.f();
        r0 = r0.a(r1);
        r0 = r0.a();
        r3 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
        r3.<init>();
        r3 = r0.a(r3);
        r0 = a(r5, r6);
        if (r8 == 0) goto L_0x0039;
    L_0x0024:
        r4 = r8.length;	 Catch:{ IllegalArgumentException -> 0x0033 }
        if (r4 != 0) goto L_0x0039;
    L_0x0027:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0033 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0033 }
        r2 = 34;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0033 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0033 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r1 = r6;
        goto L_0x0009;
    L_0x0039:
        if (r0 == 0) goto L_0x004b;
    L_0x003b:
        if (r8 == 0) goto L_0x004b;
    L_0x003d:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0049 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0049 }
        r2 = 33;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0049 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0049 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        if (r0 == 0) goto L_0x0059;
    L_0x004d:
        if (r9 != 0) goto L_0x0059;
    L_0x004f:
        r4 = new com.whatsapp.jobqueue.requirement.AxolotlSenderKeyRequirement;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r3.a(r4);	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r2 == 0) goto L_0x007d;
    L_0x0059:
        if (r0 == 0) goto L_0x006b;
    L_0x005b:
        r4 = new com.whatsapp.jobqueue.requirement.AxolotlParticipantSessionsRequirement;	 Catch:{ IllegalArgumentException -> 0x0086 }
        r0 = com.whatsapp.auv.a(r7);	 Catch:{ IllegalArgumentException -> 0x0086 }
        r0 = (java.lang.String) r0;	 Catch:{ IllegalArgumentException -> 0x0086 }
        r4.<init>(r5, r0);	 Catch:{ IllegalArgumentException -> 0x0086 }
        r3.a(r4);	 Catch:{ IllegalArgumentException -> 0x0086 }
        if (r2 == 0) goto L_0x007d;
    L_0x006b:
        r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r3.a(r0);	 Catch:{ IllegalArgumentException -> 0x0088 }
        if (r8 == 0) goto L_0x007d;
    L_0x0075:
        r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement;	 Catch:{ IllegalArgumentException -> 0x0088 }
        r0.<init>(r1, r8);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r3.a(r0);	 Catch:{ IllegalArgumentException -> 0x0088 }
    L_0x007d:
        r0 = r3.b();
        return r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.a(java.lang.String, java.lang.String, java.lang.String, byte[], boolean):org.whispersystems.jobqueue.s");
    }

    public SendE2EMessageJob(@NonNull Message message, @NonNull String str, @NonNull String str2, @Nullable String str3, int i, @Nullable String str4, @Nullable String str5, @Nullable byte[] bArr, boolean z, long j, long j2) {
        Object obj;
        boolean a;
        boolean z2 = g;
        super(a(str2, str3, str4, bArr, z));
        this.message = (Message) auv.a((Object) message);
        this.id = (String) auv.a((CharSequence) str);
        this.jid = (String) auv.a((CharSequence) str2);
        this.participant = str3;
        this.retryCount = i;
        this.groupParticipantHash = str4;
        this.webAttribute = str5;
        this.includeSenderKeysInMessage = z;
        this.expireTimeMs = j;
        this.originalTimestamp = j2;
        if (!qm.i(str2)) {
            try {
                if (!co.a(str2)) {
                    obj = null;
                    a = a(str2, str3);
                    if (str3 != null) {
                        try {
                            if (TextUtils.isEmpty(str3)) {
                                throw new IllegalArgumentException(z[44] + b());
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    if (TextUtils.isEmpty(str3) && r2 == null) {
                        throw new IllegalArgumentException(z[42] + b());
                    } else if (i >= 0) {
                        try {
                            throw new IllegalArgumentException(z[38] + b());
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } else {
                        if (str4 != null) {
                            try {
                                if (TextUtils.isEmpty(str4)) {
                                    throw new IllegalArgumentException(z[39] + b());
                                }
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                        if (str4 == null && r2 == null) {
                            try {
                                throw new IllegalArgumentException(z[37] + b());
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            }
                        } else if (str4 == null && str3 != null) {
                            try {
                                throw new IllegalArgumentException(z[40] + b());
                            } catch (IllegalArgumentException e2222) {
                                throw e2222;
                            }
                        } else if (z || r2 != null) {
                            if (a) {
                                try {
                                    if (TextUtils.isEmpty(str4)) {
                                        throw new IllegalArgumentException(z[45] + b());
                                    }
                                } catch (IllegalArgumentException e22222) {
                                    throw e22222;
                                }
                            }
                            if (j > 0) {
                                try {
                                    throw new IllegalArgumentException(z[41] + b());
                                } catch (IllegalArgumentException e222222) {
                                    throw e222222;
                                }
                            }
                            messagesBeingSent.put(new c3(str2, true, str), Boolean.TRUE);
                            if (z2) {
                                WAAppCompatActivity.c++;
                                return;
                            }
                            return;
                        } else {
                            try {
                                throw new IllegalArgumentException(z[43] + b());
                            } catch (IllegalArgumentException e2222222) {
                                throw e2222222;
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException e22222222) {
                throw e22222222;
            }
        }
        obj = 1;
        a = a(str2, str3);
        if (str3 != null) {
            if (TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException(z[44] + b());
            }
        }
        try {
            if (TextUtils.isEmpty(str3)) {
            }
            if (i >= 0) {
                if (str4 != null) {
                    if (TextUtils.isEmpty(str4)) {
                        throw new IllegalArgumentException(z[39] + b());
                    }
                }
                if (str4 == null) {
                }
                if (str4 == null) {
                }
                if (z) {
                }
                if (a) {
                    if (TextUtils.isEmpty(str4)) {
                        throw new IllegalArgumentException(z[45] + b());
                    }
                }
                if (j > 0) {
                    messagesBeingSent.put(new c3(str2, true, str), Boolean.TRUE);
                    if (z2) {
                        WAAppCompatActivity.c++;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(z[41] + b());
            }
            throw new IllegalArgumentException(z[38] + b());
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        } catch (IllegalArgumentException e2222222222) {
            throw e2222222222;
        }
    }

    private boolean c() {
        try {
            return ((amm) h.b().b(amm.class)).a() >= this.expireTimeMs;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair a(boolean r10) {
        /*
        r9 = this;
        r8 = 0;
        r2 = 0;
        r4 = g;
        if (r10 == 0) goto L_0x00d9;
    L_0x0006:
        r0 = r9.includeSenderKeysInMessage;	 Catch:{ IllegalArgumentException -> 0x00e0 }
        if (r0 == 0) goto L_0x00d9;
    L_0x000a:
        r0 = com.whatsapp.App.aK;
        r1 = r9.jid;
        r3 = r9.groupParticipantHash;
        r5 = r0.b(r1, r3);
        if (r5 == 0) goto L_0x00b7;
    L_0x0016:
        r0 = r9.jid;
        r0 = com.whatsapp.qm.c(r0);
        r1 = r0.g();
        if (r1 == 0) goto L_0x00a7;
    L_0x0022:
        r0 = r1.isEmpty();	 Catch:{ IllegalArgumentException -> 0x00e2 }
        if (r0 != 0) goto L_0x00a7;
    L_0x0028:
        r1.retainAll(r5);
        r3 = new java.util.Hashtable;
        r3.<init>();
        r0 = com.whatsapp.awc.e;
        r6 = new com.whatsapp.jobqueue.job.a;
        r6.<init>(r9);
        r0 = r0.submit(r6);
        r0 = r0.get();
        r0 = (com.whatsapp.proto.E2E.Message) r0;
        r0 = r0.b();
        r6 = r0.length;
        r6 = r6 + 1;
        r6 = new byte[r6];
        r7 = r0.length;
        java.lang.System.arraycopy(r0, r8, r6, r8, r7);
        r0 = r0.length;
        r7 = r6.length;
        r8 = 1;
        java.util.Arrays.fill(r6, r0, r7, r8);
        r7 = r1.iterator();
    L_0x0058:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x007a;
    L_0x005e:
        r0 = r7.next();
        r0 = (java.lang.String) r0;
        r1 = com.whatsapp.awc.e;
        r8 = new com.whatsapp.jobqueue.job.c;
        r8.<init>(r9, r0, r6);
        r1 = r1.submit(r8);
        r1 = r1.get();
        r1 = (com.whatsapp.protocol.b1) r1;
        r3.put(r0, r1);
        if (r4 == 0) goto L_0x0058;
    L_0x007a:
        r0 = r9.jid;
        r0 = com.whatsapp.protocol.co.a(r0);
        if (r0 == 0) goto L_0x00a4;
    L_0x0082:
        r1 = new java.util.Vector;
        r1.<init>();
        r6 = r5.iterator();
    L_0x008b:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x00a2;
    L_0x0091:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r7 = r3.containsKey(r0);	 Catch:{ IllegalArgumentException -> 0x00e4 }
        if (r7 != 0) goto L_0x00a0;
    L_0x009d:
        r1.add(r0);	 Catch:{ IllegalArgumentException -> 0x00e4 }
    L_0x00a0:
        if (r4 == 0) goto L_0x008b;
    L_0x00a2:
        if (r4 == 0) goto L_0x00ef;
    L_0x00a4:
        r0 = r2;
    L_0x00a5:
        if (r4 == 0) goto L_0x00ed;
    L_0x00a7:
        r0 = r9.jid;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r0 = com.whatsapp.protocol.co.a(r0);	 Catch:{ IllegalArgumentException -> 0x00e6 }
        if (r0 == 0) goto L_0x00e8;
    L_0x00af:
        r0 = new java.util.Vector;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r0.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00e6 }
    L_0x00b4:
        r1 = r2;
    L_0x00b5:
        if (r4 == 0) goto L_0x00d7;
    L_0x00b7:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 13;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r9.b();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = r2;
        r1 = r2;
    L_0x00d7:
        if (r4 == 0) goto L_0x00ea;
    L_0x00d9:
        r0 = r2;
    L_0x00da:
        r1 = new android.util.Pair;
        r1.<init>(r0, r2);
        return r1;
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = move-exception;
        throw r0;
    L_0x00e8:
        r0 = r2;
        goto L_0x00b4;
    L_0x00ea:
        r2 = r0;
        r0 = r1;
        goto L_0x00da;
    L_0x00ed:
        r1 = r3;
        goto L_0x00b5;
    L_0x00ef:
        r0 = r1;
        goto L_0x00a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.a(boolean):android.util.Pair");
    }

    private String b() {
        return z[11] + this.id + z[6] + this.jid + z[7] + this.participant + z[8] + this.retryCount + z[12] + this.groupParticipantHash + z[9] + this.webAttribute + z[10] + this.includeSenderKeysInMessage + z[5] + c();
    }

    public void a(App app) {
        this.h = app;
    }

    static awc b(SendE2EMessageJob sendE2EMessageJob) {
        return sendE2EMessageJob.i;
    }

    static int b(int i) {
        return a(i);
    }
}
