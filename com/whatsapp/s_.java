package com.whatsapp;

import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.net.URL;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class s_ extends sx {
    private static final String[] z;
    private String u;
    private co v;

    static {
        String[] strArr = new String[8];
        String str = "]\u0004\u0010(\nN\b\u00137\n_\u0011\u001e*\u000eNN\u00077\u0003\u0005\u000f\u001dh\u0007E\u0012\u0006";
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
                        i3 = 42;
                        break;
                    case at.g /*1*/:
                        i3 = 97;
                        break;
                    case at.i /*2*/:
                        i3 = 114;
                        break;
                    case at.o /*3*/:
                        i3 = 69;
                        break;
                    default:
                        i3 = 111;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "]\u0004\u0010(\nN\b\u00137\n_\u0011\u001e*\u000eNN\u00077\u0003\u0005\u0004\u00007\u0000XA";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "]\u0004\u0010(\nN\b\u00137\n_\u0011\u001e*\u000eNN\u0000 \u001c_\r\u00066@G\b\u00016\u0006D\u0006R.\nS\u0012R,\u0001\n\u0014\u0002)\u0000K\u0005R7\nY\u0014\u001e1";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "I\u0014\u00007\nD\u0015H";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\n\u0011\u0017+\u000bC\u000f\u0015\u007f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "]\u0004\u0010(\nN\b\u00137\n_\u0011\u001e*\u000eNN\u0017+\u000b\n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "]\u0004\u0010(\nN\b\u00137\n_\u0011\u001e*\u000eNN\u00010\fI\u0004\u00016O";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\n\u0013\u00176\u001aF\u0015H";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public s_(co coVar, co coVar2, String str) {
        super(coVar2, true, false);
        this.u = str;
        this.v = coVar;
        this.k = true;
    }

    public void a(aki com_whatsapp_aki) {
        Log.i(z[6] + this.p.k + z[4] + i.size() + z[5] + b.size() + z[1] + com_whatsapp_aki);
        super.a(com_whatsapp_aki);
        c2 c2Var = new c2();
        try {
            if (com_whatsapp_aki == aki.SUCCESS && this.e) {
                try {
                    URL url = new URL(this.f.a);
                    if (url.getHost() == null || url.getHost().length() == 0) {
                        Log.e(z[0]);
                        c2Var.c = 502;
                        App.a(this.u, c2Var, 5);
                        return;
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    Log.w(z[2] + e2.toString());
                }
                try {
                    if (this.f.a == null) {
                        Log.e(z[3]);
                        c2Var.c = 502;
                        App.a(this.u, c2Var, 5);
                        return;
                    }
                    try {
                        Log.i(z[7] + this.p.k + " " + this.f.a);
                        c2Var.c = 200;
                        c2Var.j = this.f.a;
                        this.v.q = this.f.a;
                        App.a(this.u, c2Var, 5);
                        App.aK.a(this.v, true, -1);
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (Exception e22) {
                        throw e22;
                    }
                } catch (Exception e222) {
                    throw e222;
                }
            }
            c2Var.c = 502;
            App.a(this.u, c2Var, 5);
        } catch (Exception e2222) {
            throw e2222;
        }
    }

    public void onPostExecute(Object obj) {
        a((aki) obj);
    }
}
