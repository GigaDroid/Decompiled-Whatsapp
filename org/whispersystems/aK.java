package org.whispersystems;

import com.google.bJ;
import com.google.fn;
import com.google.gB;
import com.google.hh;
import com.google.i;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;

final class aK implements gB {
    private static final String[] z;

    static {
        String[] strArr = new String[22];
        String str = "\u0019\u0019M\ns&\u001e[?u<\u0005\\\u0019h";
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
                        i3 = 73;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 40;
                        break;
                    case at.o /*3*/:
                        i3 = 124;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000b\n[\u0019Q,\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0000\u000fM\u0012n \u001fQ7\u007f0";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0000\u000f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000b\n[\u0019Q,\u0012{\u0015}'\n\\\th,";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0019\u0019M7\u007f0\"L";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0004\u000e[\u000f{.\u000e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001a\u0002O\u0012s'\fc\u0019c";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001b\u000eO\u0015i=\u0019I\bs&\u0005a\u0018";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\n\u0002X\u0014\u007f;\u001fM\u0004n";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001b\n\\\u001fr,\u001fc\u0019c";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0000\u000f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\n\u0003I\u0015t\u0002\u000eQ";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001b\n\\\u001fr,\u001fc\u0019c";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0000\u000fM\u0012n \u001fQ7\u007f0";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0000\u001fM\u000e{=\u0002G\u0012";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0000\u000f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0000\u001fM\u000e{=\u0002G\u0012";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\n\u0004]\u0012n,\u0019";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001a\u0002O\u0012\u007f-;Z\u0019Q,\u0012a\u0018";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\n\u0002X\u0014\u007f;\u001fM\u0004n";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000b\n[\u0019Q,\u0012";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    aK() {
    }

    public i assignDescriptors(hh hhVar) {
        boolean z = aC.d;
        aC.a(hhVar);
        aC.a((fn) aC.k().a().get(0));
        aC.b(new bJ(aC.j(), new String[]{z[11], z[19], z[0], z[10]}));
        aC.b((fn) aC.k().a().get(1));
        aC.a(new bJ(aC.a(), new String[]{z[9], z[6], z[20], z[2], z[3], z[7]}));
        aC.e((fn) aC.k().a().get(2));
        aC.c(new bJ(aC.f(), new String[]{z[17], z[1], z[14], z[15], z[5]}));
        aC.d((fn) aC.k().a().get(3));
        aC.d(new bJ(aC.c(), new String[]{z[12], z[16], z[21]}));
        aC.c((fn) aC.k().a().get(4));
        aC.e(new bJ(aC.e(), new String[]{z[4], z[18], z[13], z[8]}));
        if (z) {
            a5.o = !a5.o;
        }
        return null;
    }
}
