package com.whatsapp;

import com.whatsapp.fieldstats.ab;
import com.whatsapp.fieldstats.i;
import com.whatsapp.jobqueue.job.GetPreKeyJob;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.proto.E2E.Message;
import com.whatsapp.proto.E2E.Message.Builder;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.ai;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class cl implements Runnable {
    private static final String[] z;
    private final boolean a;
    private final long b;
    private final byte[] c;
    private final boolean d;
    final t6 e;
    final boolean f;
    final co g;

    static {
        String[] strArr = new String[9];
        String str = "%bt8Q0v;&[-tq1]0su3\u001e7\u007fu0\u001e!(~tT+x tQ6s|=P%vV1M7{|1u!c&";
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
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 26;
                        break;
                    case at.i /*2*/:
                        i3 = 27;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
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
                    str = "%bt8Q0v;9_6qr:Yd";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "%bt8Q0v;&[7\u007fu0W*};";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "%bt8Q0v;&[7\u007fu0W*};";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "d{htN!t\u007f=P#:h1M7st:\u001e7nz [";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "+hr3W*{wtS!ih5Y!:z8L!{\u007f-\u001e){i?[ :\u007f1R-l~&[ !;9[7iz3[jq~-\u0003";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "%bt8Q0v;!P%xw1\u001e0u;&[7\u007fu0\u001e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u007f:v1M7{|1\u001e#uu1";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "dsv9[ sz [(c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    cl(t6 t6Var, boolean z, long j, byte[] bArr, boolean z2, boolean z3, co coVar) {
        this.e = t6Var;
        this.f = z3;
        this.g = coVar;
        this.d = z;
        this.b = j;
        this.c = bArr;
        this.a = z2;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        App.b(this.e.c);
        if (this.f) {
            Log.w(z[6] + this.e.e);
            i.a(adn.a(this.e.f), new ab());
            if (!z) {
                return;
            }
        }
        if (this.g != null) {
            Log.i(z[4] + this.e.e);
            this.g.C = this.e.a;
            if (this.d && this.g.c == null && !this.a) {
                Log.i(z[2] + this.e.e + z[5]);
                App.aK.b(this.e.e);
                adn.c(this.e.f).ai.a(new GetPreKeyJob(this.e.e.c, null));
                if (!z) {
                    return;
                }
            }
            if (this.d) {
                Log.i(z[0] + this.e.e);
                Builder newBuilder = Message.newBuilder();
                ai.a(this.g, newBuilder, false);
                long a = ((amm) h.b().b(amm.class)).a();
                org.whispersystems.jobqueue.h hVar = adn.c(this.e.f).ai;
                r17.a(new SendE2EMessageJob(newBuilder.build(), this.e.e.b, this.e.e.c, null, this.e.a, null, null, this.c, false, a + 86400000, this.b));
                if (!z) {
                    return;
                }
            }
            Log.i(z[3] + this.e.e + z[1]);
            App.a(this.g, false, this.b);
            if (!z) {
                return;
            }
        }
        Log.i(z[7] + this.e.e + z[8]);
    }
}
