package com.whatsapp.messaging;

import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.fieldstats.a;
import com.whatsapp.fieldstats.i;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.dns.DnsCacheEntrySerializable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class ck {
    private static final String[] m;
    private static final String[] z;
    private final String a;
    private final int b;
    private final InetSocketAddress c;
    private final Random d;
    private final int e;
    private final SocketFactory f;
    private final List g;
    private final SSLSocketFactory h;
    private ai i;
    private final List j;
    private int k;
    private final boolean l;

    static {
        String[] strArr = new String[8];
        String str = ">f4I5v!=\u0013a";
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
                        i3 = 30;
                        break;
                    case at.g /*1*/:
                        i3 = 78;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 65;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "S;*Xa}/5@as!/I\u0015q\u0000<T5>(0^2j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "]/7B.jn+I5l'<Z$>=6O*{:y\\ m:yI/z";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "K +I\"q)7E;{*y_5\u007f:<\f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "]/7B.jn+I5l'<Z$>/=H3{=*\f1\u007f=-\f$p*";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "S;*Xa}/5@as!/I\u0015q\u0000<T5>(0^2j";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "K +I\"q)7E;{*y_5\u007f:<\f";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    strArr = new String[16];
                    str = "{\u007fw[)\u007f:*M1n`7I50";
                    obj = 7;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = "{|w[)\u007f:*M1n`7I50";
                    obj = 8;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    str = "{}w[)\u007f:*M1n`7I50";
                    obj = 9;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    str = "{zw[)\u007f:*M1n`7I50";
                    obj = 10;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "{{w[)\u007f:*M1n`7I50";
                    obj = 11;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "{xw[)\u007f:*M1n`7I50";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "{yw[)\u007f:*M1n`7I50";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "{vw[)\u007f:*M1n`7I50";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "{ww[)\u007f:*M1n`7I50";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "{\u007fi\u00026v/-_ n>wB$j`";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "{\u007fh\u00026v/-_ n>wB$j`";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "{\u007fk\u00026v/-_ n>wB$j`";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "{\u007fj\u00026v/-_ n>wB$j`";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "{\u007fm\u00026v/-_ n>wB$j`";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "{\u007fl\u00026v/-_ n>wB$j`";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "{\u007fo\u00026v/-_ n>wB$j`";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    m = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "}!7B$}:0C/A=<]4{ :Inj< s\"q 7I\"ja";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean a() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f() {
        /*
        r4 = this;
        r0 = 0;
        r2 = com.whatsapp.messaging.co.a;
        r1 = com.whatsapp.messaging.bc.a;	 Catch:{ IllegalStateException -> 0x00b7 }
        r3 = r4.i;	 Catch:{ IllegalStateException -> 0x00b7 }
        r3 = r3.ordinal();	 Catch:{ IllegalStateException -> 0x00b7 }
        r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x00b7 }
        switch(r1) {
            case 1: goto L_0x0018;
            case 2: goto L_0x0044;
            case 3: goto L_0x004a;
            case 4: goto L_0x006e;
            case 5: goto L_0x0074;
            case 6: goto L_0x007a;
            case 7: goto L_0x0095;
            case 8: goto L_0x00af;
            default: goto L_0x0010;
        };
    L_0x0010:
        r1 = r4.i;	 Catch:{ IllegalStateException -> 0x00e7 }
        r2 = com.whatsapp.messaging.ai.END;	 Catch:{ IllegalStateException -> 0x00e7 }
        if (r1 == r2) goto L_0x0017;
    L_0x0016:
        r0 = 1;
    L_0x0017:
        return r0;
    L_0x0018:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00b9 }
        if (r1 == 0) goto L_0x0022;
    L_0x001c:
        r1 = com.whatsapp.messaging.ai.DEBUG_CHAT_HOST;	 Catch:{ IllegalStateException -> 0x00bb }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00bb }
        if (r2 == 0) goto L_0x0010;
    L_0x0022:
        r1 = r4.g;	 Catch:{ IllegalStateException -> 0x00bd }
        r1 = r1.isEmpty();	 Catch:{ IllegalStateException -> 0x00bd }
        if (r1 != 0) goto L_0x0030;
    L_0x002a:
        r1 = com.whatsapp.messaging.ai.OVERRIDES;	 Catch:{ IllegalStateException -> 0x00bf }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00bf }
        if (r2 == 0) goto L_0x0010;
    L_0x0030:
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x00c1 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalStateException -> 0x00c1 }
        if (r1 != 0) goto L_0x003e;
    L_0x0038:
        r1 = com.whatsapp.messaging.ai.IP_OVERRIDE_PORT_1;	 Catch:{ IllegalStateException -> 0x00c3 }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00c3 }
        if (r2 == 0) goto L_0x0010;
    L_0x003e:
        r1 = com.whatsapp.messaging.ai.PRIMARY;	 Catch:{ IllegalStateException -> 0x00c5 }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00c5 }
        if (r2 == 0) goto L_0x0010;
    L_0x0044:
        r1 = com.whatsapp.messaging.ai.END;	 Catch:{ IllegalStateException -> 0x00c7 }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00c7 }
        if (r2 == 0) goto L_0x0010;
    L_0x004a:
        r1 = r4.k;	 Catch:{ IllegalStateException -> 0x00c9 }
        r1 = r1 + 1;
        r4.k = r1;	 Catch:{ IllegalStateException -> 0x00c9 }
        r1 = r4.k;	 Catch:{ IllegalStateException -> 0x00c9 }
        r3 = r4.g;	 Catch:{ IllegalStateException -> 0x00c9 }
        r3 = r3.size();	 Catch:{ IllegalStateException -> 0x00c9 }
        if (r1 < r3) goto L_0x0010;
    L_0x005a:
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x00cb }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalStateException -> 0x00cb }
        if (r1 == 0) goto L_0x0068;
    L_0x0062:
        r1 = com.whatsapp.messaging.ai.PRIMARY;	 Catch:{ IllegalStateException -> 0x00cd }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00cd }
        if (r2 == 0) goto L_0x0010;
    L_0x0068:
        r1 = com.whatsapp.messaging.ai.IP_OVERRIDE_PORT_1;	 Catch:{ IllegalStateException -> 0x00cf }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00cf }
        if (r2 == 0) goto L_0x0010;
    L_0x006e:
        r1 = com.whatsapp.messaging.ai.IP_OVERRIDE_PORT_2;	 Catch:{ IllegalStateException -> 0x00d1 }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00d1 }
        if (r2 == 0) goto L_0x0010;
    L_0x0074:
        r1 = com.whatsapp.messaging.ai.PRIMARY;	 Catch:{ IllegalStateException -> 0x00d3 }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00d3 }
        if (r2 == 0) goto L_0x0010;
    L_0x007a:
        r1 = r4.j;	 Catch:{ IllegalStateException -> 0x00d5 }
        r1 = r1.isEmpty();	 Catch:{ IllegalStateException -> 0x00d5 }
        if (r1 == 0) goto L_0x008c;
    L_0x0082:
        r1 = r4.l;	 Catch:{ IllegalStateException -> 0x00d7 }
        if (r1 == 0) goto L_0x00d9;
    L_0x0086:
        r1 = com.whatsapp.messaging.ai.HTTP;	 Catch:{ IllegalStateException -> 0x00d7 }
    L_0x0088:
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00dc }
        if (r2 == 0) goto L_0x0010;
    L_0x008c:
        r1 = com.whatsapp.messaging.ai.FALLBACKS;	 Catch:{ IllegalStateException -> 0x00de }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00de }
        r1 = 0;
        r4.k = r1;	 Catch:{ IllegalStateException -> 0x00de }
        if (r2 == 0) goto L_0x0010;
    L_0x0095:
        r1 = r4.k;	 Catch:{ IllegalStateException -> 0x00e0 }
        r1 = r1 + 1;
        r4.k = r1;	 Catch:{ IllegalStateException -> 0x00e0 }
        r1 = r4.k;	 Catch:{ IllegalStateException -> 0x00e0 }
        r3 = r4.j;	 Catch:{ IllegalStateException -> 0x00e0 }
        r3 = r3.size();	 Catch:{ IllegalStateException -> 0x00e0 }
        if (r1 < r3) goto L_0x0010;
    L_0x00a5:
        r1 = r4.l;	 Catch:{ IllegalStateException -> 0x00e2 }
        if (r1 == 0) goto L_0x00e4;
    L_0x00a9:
        r1 = com.whatsapp.messaging.ai.HTTP;	 Catch:{ IllegalStateException -> 0x00e2 }
    L_0x00ab:
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00b5 }
        if (r2 == 0) goto L_0x0010;
    L_0x00af:
        r1 = com.whatsapp.messaging.ai.END;	 Catch:{ IllegalStateException -> 0x00b5 }
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00b5 }
        goto L_0x0010;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c7 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d3 }
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d7 }
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r1 = com.whatsapp.messaging.ai.END;
        goto L_0x0088;
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r1 = com.whatsapp.messaging.ai.END;
        goto L_0x00ab;
    L_0x00e7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ck.f():boolean");
    }

    public void e() {
        try {
            if (this.i == ai.HTTP) {
                i.a(App.z().getApplicationContext(), a.PSEUDO_HTTP_CONNECTION_FAILURE, Integer.valueOf(1));
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private boolean b() {
        try {
            switch (bc.a[this.i.ordinal()]) {
                case at.g /*1*/:
                    throw new IllegalStateException(z[2]);
                case at.i /*2*/:
                case at.p /*4*/:
                case at.m /*5*/:
                case Y.f /*6*/:
                case aF.u /*8*/:
                    return false;
                case at.o /*3*/:
                    return ((DnsCacheEntrySerializable) this.g.get(this.k)).secureSocket;
                case aF.v /*7*/:
                    return ((DnsCacheEntrySerializable) this.j.get(this.k)).secureSocket;
                case Y.l /*9*/:
                    throw new IllegalStateException(z[3]);
                default:
                    throw new IllegalStateException(z[4] + this.i);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
        throw e;
    }

    private ck(InetSocketAddress inetSocketAddress, String str, List list, Random random, boolean z) {
        int i;
        int i2 = co.a;
        this.i = ai.START;
        this.c = inetSocketAddress;
        this.a = str;
        this.d = random;
        this.g = new ArrayList();
        this.j = new ArrayList();
        if (list != null) {
            for (DnsCacheEntrySerializable dnsCacheEntrySerializable : list) {
                try {
                    if (dnsCacheEntrySerializable.forceOverride) {
                        this.g.add(dnsCacheEntrySerializable);
                        if (i2 == 0) {
                            continue;
                            if (i2 != 0) {
                                break;
                            }
                        }
                    }
                    this.j.add(dnsCacheEntrySerializable);
                    continue;
                    if (i2 != 0) {
                        break;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        }
        this.h = ak.a();
        this.f = SocketFactory.getDefault();
        boolean nextBoolean = random.nextBoolean();
        if (nextBoolean) {
            i = 443;
        } else {
            i = 5222;
        }
        try {
            this.b = i;
            if (nextBoolean) {
                i = 5222;
            } else {
                i = 443;
            }
            this.e = i;
            this.l = z;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private InetSocketAddress c() {
        try {
            List d;
            switch (bc.a[this.i.ordinal()]) {
                case at.g /*1*/:
                    throw new IllegalStateException(z[6]);
                case at.i /*2*/:
                    return this.c;
                case at.o /*3*/:
                    return ((DnsCacheEntrySerializable) this.g.get(this.k)).getInetSocketAddress();
                case at.p /*4*/:
                    return new InetSocketAddress(this.a, this.b);
                case at.m /*5*/:
                    return new InetSocketAddress(this.a, this.e);
                case Y.f /*6*/:
                    d = com.whatsapp.util.dns.i.a().d(m[this.d.nextInt(m.length)]);
                    try {
                        return new InetSocketAddress((InetAddress) d.get(this.d.nextInt(d.size())), this.d.nextBoolean() ? 443 : 5222);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                case aF.v /*7*/:
                    return ((DnsCacheEntrySerializable) this.j.get(this.k)).getInetSocketAddress();
                case aF.u /*8*/:
                    d = com.whatsapp.util.dns.i.a().d(m[this.d.nextInt(m.length)]);
                    return new InetSocketAddress((InetAddress) d.get(this.d.nextInt(d.size())), 80);
                case Y.l /*9*/:
                    throw new IllegalStateException(z[5]);
                default:
                    throw new IllegalStateException(z[7] + this.i);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
        throw e2;
    }

    public InputStream a(Socket socket) {
        try {
            if (this.i == ai.HTTP) {
                return new ba(socket.getInputStream());
            }
            return socket.getInputStream();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Socket a(int i) {
        try {
            if (this.i == ai.HTTP) {
                i.a(App.z().getApplicationContext(), a.PSEUDO_HTTP_CONNECTION_ATTEMPT, Integer.valueOf(1));
            }
            SocketAddress c = c();
            boolean b = b();
            Log.i(z[1] + c + z[0] + b + ')');
            Socket createSocket = this.f.createSocket();
            createSocket.connect(c, i);
            if (!b) {
                return createSocket;
            }
            createSocket = this.h.createSocket(createSocket, c.getHostName(), c.getPort(), true);
            ((SSLSocket) createSocket).startHandshake();
            return createSocket;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public OutputStream b(Socket socket) {
        try {
            return this.i == ai.HTTP ? new z(socket.getOutputStream()) : socket.getOutputStream();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void d() {
        try {
            if (this.i == ai.HTTP) {
                i.a(App.z().getApplicationContext(), a.PSEUDO_HTTP_CONNECTION_SUCCESS, Integer.valueOf(1));
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public ck(InetSocketAddress inetSocketAddress, String str, List list, Random random) {
        this(inetSocketAddress, str, list, random, a());
    }
}
