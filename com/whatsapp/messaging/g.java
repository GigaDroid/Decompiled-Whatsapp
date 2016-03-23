package com.whatsapp.messaging;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.protocol.VoipOptions;
import org.v;
import org.whispersystems.at;

public class g {
    private static final String[] z;
    public int a;
    public String b;
    public VoipOptions c;
    public String d;

    static {
        String[] strArr = new String[6];
        String str = "P\u001b\u001b}\u001dW";
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
                        i3 = 51;
                        break;
                    case at.g /*1*/:
                        i3 = 122;
                        break;
                    case at.i /*2*/:
                        i3 = 119;
                        break;
                    case at.o /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 84;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "V\u0016\u0016a'V\u001e#x9V";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "E\u0015\u001ea\u001bC\u000e\u001e~:@";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "P\u001b\u001b}\u001dW";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "@\u000e\u0016\u007f.R1\u0012h";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "@\u000e\u0016\u007f.R1\u0012h";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static g a(Message message) {
        if (message == null || message.obj == null) {
            return null;
        }
        Bundle bundle = (Bundle) message.obj;
        bundle.setClassLoader(bp.class.getClassLoader());
        g gVar = new g();
        gVar.d = ((bp) bundle.getParcelable(z[1])).a().e;
        gVar.b = bundle.getString(z[0]);
        gVar.a = bundle.getInt(z[2]);
        gVar.c = ((bj) bundle.getParcelable(z[3])).a();
        return gVar;
    }

    public static g b(Message message) {
        if (message == null || message.obj == null) {
            return null;
        }
        Bundle bundle = (Bundle) message.obj;
        bundle.setClassLoader(bp.class.getClassLoader());
        g gVar = new g();
        gVar.d = ((bp) bundle.getParcelable(z[5])).a().e;
        gVar.b = bundle.getString(z[4]);
        return gVar;
    }
}
