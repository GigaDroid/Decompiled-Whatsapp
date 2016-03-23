package org;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.hx;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.auv;
import com.whatsapp.proto.Wa20.ClientPayload;
import com.whatsapp.proto.Wa20.HandshakeMessage;
import com.whatsapp.proto.Wa20.HandshakeMessage.ClientFinish;
import com.whatsapp.proto.Wa20.HandshakeMessage.ClientHello;
import com.whatsapp.proto.Wa20.HandshakeMessage.ServerHello;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.whispersystems.at;

public class a3 {
    public static final byte[] b;
    private static final String[] z;
    private final ClientPayload a;
    private final g c;
    private final ak d;
    private final u e;

    private void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e.write(HandshakeMessage.newBuilder().setClientHello(ClientHello.newBuilder().setEphemeral(hx.a(bArr)).setStatic(hx.a(bArr2)).setPayload(hx.a(bArr3)).build()).build().b());
    }

    static {
        String[] strArr = new String[2];
        String str = "k`k\u001b\u0003K`n\u001aPNdv\f\u0011Dd%\u001b\u001fFr%\u0011\u001fW!f\u0010\u001eW`l\u0011PPdw\t\u0015Q!m\u001a\u001cOn$";
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
                        i3 = 35;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 5;
                        break;
                    case at.o /*3*/:
                        i3 = 127;
                        break;
                    default:
                        i3 = 112;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new byte[]{(byte) 87, (byte) 65, (byte) 2, (byte) 0};
                    return;
                default:
                    strArr2[i] = str;
                    str = "voq\r\u0005Pu`\u001bPPdw\t\u0015Q!f\u001a\u0002W";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }

    private g a(t tVar, t tVar2) {
        x xVar = new x(x.b, b);
        a(xVar.a(tVar.b));
        return a(xVar, tVar, tVar2, c());
    }

    private void a(byte[] bArr) {
        this.e.write(HandshakeMessage.newBuilder().setClientHello(ClientHello.newBuilder().setEphemeral(hx.a(bArr)).build()).build().b());
    }

    public a3(@NonNull ClientPayload clientPayload, @NonNull t tVar, @Nullable a9 a9Var, @NonNull InputStream inputStream, @NonNull OutputStream outputStream) {
        int i = g.d;
        t b = t.b();
        a(outputStream);
        this.a = (ClientPayload) auv.a((Object) clientPayload);
        this.d = new ak(inputStream);
        this.e = new u(outputStream);
        this.c = a(b, tVar, a9Var);
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }

    public ai b() {
        g gVar = this.c;
        gVar.getClass();
        return new ai(gVar, this.d);
    }

    public a9 d() {
        return this.c.f;
    }

    private void a(@NonNull OutputStream outputStream) {
        outputStream.write(b);
    }

    private g b(t tVar, t tVar2, a9 a9Var) {
        try {
            x xVar = new x(x.g, b);
            a9 a = xVar.a(a9Var.a());
            byte[] a2 = xVar.a(tVar.b);
            xVar.d(az.a(a, tVar));
            byte[] b = xVar.b(tVar2.b);
            xVar.d(az.a(a, tVar2));
            a(a2, b, xVar.b(this.a.b()));
            ServerHello c = c();
            if (c.hasStatic()) {
                throw new ao(c);
            }
            a9 c2 = xVar.c(c.getEphemeral().h());
            xVar.d(az.a(c2, tVar));
            xVar.d(az.a(c2, tVar2));
            xVar.e(c.getPayload().h());
            return xVar.a(a, true);
        } catch (ae e) {
            throw e;
        } catch (Throwable e2) {
            throw new f(e2);
        }
    }

    private ServerHello c() {
        HandshakeMessage parseFrom = HandshakeMessage.parseFrom(this.d.a());
        if (parseFrom.hasServerHello()) {
            return parseFrom.getServerHello();
        }
        throw new IOException(z[0]);
    }

    private g a(x xVar, t tVar, t tVar2, ServerHello serverHello) {
        try {
            a9 c = xVar.c(serverHello.getEphemeral().h());
            xVar.d(az.a(c, tVar.a));
            a9 a = xVar.a(serverHello.getStatic().h());
            xVar.d(az.a(a, tVar.a));
            if (a5.a(a, xVar.e(serverHello.getPayload().h()))) {
                byte[] b = xVar.b(tVar2.b);
                xVar.d(az.a(c, tVar2.a));
                a(b, xVar.b(this.a.b()));
                return xVar.a(a, true);
            }
            throw new r(this, z[1]);
        } catch (ae e) {
            throw e;
        } catch (Throwable e2) {
            throw new f(e2);
        }
    }

    private g a(t tVar, t tVar2, a9 a9Var) {
        if (a9Var != null) {
            return b(tVar, tVar2, a9Var);
        }
        try {
            return a(tVar, tVar2);
        } catch (ao e) {
            return a(tVar, tVar2, e.a());
        }
    }

    public j a() {
        g gVar = this.c;
        gVar.getClass();
        return new j(gVar, this.e);
    }

    private void a(byte[] bArr, byte[] bArr2) {
        this.e.write(HandshakeMessage.newBuilder().setClientFinish(ClientFinish.newBuilder().setStatic(hx.a(bArr)).setPayload(hx.a(bArr2)).build()).build().b());
    }

    private g a(t tVar, t tVar2, ServerHello serverHello) {
        x xVar = new x(x.a, b);
        xVar.a(tVar.b);
        return a(xVar, tVar, tVar2, serverHello);
    }
}
