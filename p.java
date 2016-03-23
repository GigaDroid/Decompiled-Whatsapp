import android.backport.util.Base64;
import android.content.Context;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.u0;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class p {
    private static final HashSet b;
    private static final HashSet e;
    private static final String[] z;
    private StringBuilder a;
    private String c;
    private int d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.content.Context r6, c r7, int r8) {
        /*
        r5 = this;
        r0 = q.h;
        r1 = z;
        r2 = 11;
        r1 = r1[r2];
        r1 = r7.e;
        r1 = r5.b(r1);
        if (r1 != 0) goto L_0x00bd;
    L_0x0010:
        r1 = r7.f;
        if (r1 != 0) goto L_0x0081;
    L_0x0014:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r7);
        r1 = r1.toString();
        com.whatsapp.util.Log.v(r1);
        r1 = r5.d;
        r1 = r1 + 1;
        r5.d = r1;
        r1 = r5.a;
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.d;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.e;
        r1 = r1.append(r2);
        r2 = r5.c;
        r1.append(r2);
        r1 = r5.a;
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.d;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.b;
        r1 = r1.append(r2);
        r2 = r5.c;
        r1.append(r2);
        if (r0 == 0) goto L_0x00bd;
    L_0x0081:
        r1 = r7.f;
        r1 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabelResource(r1);
        r1 = r6.getString(r1);
        r2 = 1;
        if (r8 != r2) goto L_0x009b;
    L_0x008e:
        r2 = r5.a;
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2.append(r3);
        if (r0 == 0) goto L_0x00a5;
    L_0x009b:
        r0 = r5.a;
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r0.append(r2);
    L_0x00a5:
        r0 = r5.a;
        r0 = r0.append(r1);
        r1 = ":";
        r0 = r0.append(r1);
        r1 = r7.e;
        r0 = r0.append(r1);
        r1 = r5.c;
        r0.append(r1);
    L_0x00bd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b(android.content.Context, c, int):void");
    }

    private void a(String str) {
        if (str != null) {
            this.a.append(z[18]).append(str);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(android.content.Context r9, q r10, int r11) {
        /*
        r8 = this;
        r2 = 1;
        r1 = 0;
        r3 = q.h;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r8.a = r0;
        r0 = r10.j;
        if (r0 == 0) goto L_0x001c;
    L_0x000f:
        r0 = r10.j;
        r0 = r0.e;
        if (r0 != 0) goto L_0x001c;
    L_0x0015:
        r0 = r10.j;
        r4 = "";
        r0.e = r4;
    L_0x001c:
        if (r11 != r2) goto L_0x0025;
    L_0x001e:
        r0 = "\n";
        r8.c = r0;
        if (r3 == 0) goto L_0x003b;
    L_0x0025:
        r0 = 2;
        if (r11 != r0) goto L_0x002f;
    L_0x0028:
        r0 = "\n";
        r8.c = r0;
        if (r3 == 0) goto L_0x003b;
    L_0x002f:
        r0 = new d;
        r1 = z;
        r2 = 41;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x003b:
        r0 = r8.a;
        r4 = z;
        r5 = 39;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r8.c;
        r0.append(r4);
        if (r11 != r2) goto L_0x0061;
    L_0x004e:
        r0 = r8.a;
        r4 = z;
        r5 = 47;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r8.c;
        r0.append(r4);
        if (r3 == 0) goto L_0x0072;
    L_0x0061:
        r0 = r8.a;
        r4 = z;
        r5 = 45;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r8.c;
        r0.append(r4);
    L_0x0072:
        r0 = r10.j;
        if (r0 == 0) goto L_0x007b;
    L_0x0076:
        r0 = r10.j;
        r8.a(r0);
    L_0x007b:
        r0 = r10.g;
        if (r0 == 0) goto L_0x00b8;
    L_0x007f:
        r0 = r10.g;
        r4 = z;
        r5 = 51;
        r4 = r4[r5];
        r0 = r0.containsKey(r4);
        if (r0 == 0) goto L_0x00b8;
    L_0x008d:
        r0 = r8.a;
        r4 = z;
        r5 = 46;
        r4 = r4[r5];
        r4 = r0.append(r4);
        r0 = r10.g;
        r5 = z;
        r6 = 40;
        r5 = r5[r6];
        r0 = r0.get(r5);
        r0 = (java.util.List) r0;
        r0 = r0.get(r1);
        r0 = (m) r0;
        r0 = r0.c;
        r0 = r4.append(r0);
        r4 = r8.c;
        r0.append(r4);
    L_0x00b8:
        r0 = r10.j;
        if (r0 == 0) goto L_0x00fa;
    L_0x00bc:
        r0 = r10.j;
        r0 = r0.d;
        if (r0 == 0) goto L_0x00db;
    L_0x00c2:
        r0 = r8.a;
        r4 = z;
        r5 = 37;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r10.j;
        r4 = r4.d;
        r0 = r0.append(r4);
        r4 = r8.c;
        r0.append(r4);
    L_0x00db:
        r0 = r10.j;
        r0 = r0.b;
        if (r0 == 0) goto L_0x00fa;
    L_0x00e1:
        r0 = r8.a;
        r4 = z;
        r5 = 50;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r10.j;
        r4 = r4.b;
        r0 = r0.append(r4);
        r4 = r8.c;
        r0.append(r4);
    L_0x00fa:
        r0 = r10.i;
        if (r0 == 0) goto L_0x0148;
    L_0x00fe:
        r0 = r10.i;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0148;
    L_0x0106:
        r0 = r10.i;
        r0 = r0.get(r1);
        r0 = (o) r0;
        r4 = r0.c;
        r0 = r10.i;
        r0 = r0.get(r1);
        r0 = (o) r0;
        r0 = r0.a;
        if (r4 == 0) goto L_0x0131;
    L_0x011c:
        r5 = r8.a;
        r6 = z;
        r7 = 48;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r4 = r5.append(r4);
        r5 = r8.c;
        r4.append(r5);
    L_0x0131:
        if (r0 == 0) goto L_0x0148;
    L_0x0133:
        r4 = r8.a;
        r5 = z;
        r6 = 42;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r4.append(r0);
        r4 = r8.c;
        r0.append(r4);
    L_0x0148:
        r0 = r10.m;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x017f;
    L_0x0150:
        r0 = r10.m;
        r0 = r0.get(r1);
        r0 = (java.lang.String) r0;
        r0 = r8.b(r0);
        if (r0 != 0) goto L_0x017f;
    L_0x015e:
        r0 = r8.a;
        r4 = z;
        r5 = 44;
        r4 = r4[r5];
        r4 = r0.append(r4);
        r0 = r10.m;
        r0 = r0.get(r1);
        r0 = (java.lang.String) r0;
        r0 = r8.a(r0, r11);
        r0 = r4.append(r0);
        r4 = r8.c;
        r0.append(r4);
    L_0x017f:
        r0 = r10.k;
        if (r0 == 0) goto L_0x0188;
    L_0x0183:
        r0 = r10.k;
        r8.b(r9, r0, r11);
    L_0x0188:
        r0 = r10.l;
        if (r0 == 0) goto L_0x0191;
    L_0x018c:
        r0 = r10.l;
        r8.a(r9, r0, r11);
    L_0x0191:
        r0 = r10.g;
        if (r0 == 0) goto L_0x01ce;
    L_0x0195:
        r0 = r10.g;
        r4 = z;
        r5 = 52;
        r4 = r4[r5];
        r0 = r0.containsKey(r4);
        if (r0 == 0) goto L_0x01ce;
    L_0x01a3:
        r0 = r8.a;
        r4 = z;
        r5 = 49;
        r4 = r4[r5];
        r4 = r0.append(r4);
        r0 = r10.g;
        r5 = z;
        r6 = 38;
        r5 = r5[r6];
        r0 = r0.get(r5);
        r0 = (java.util.List) r0;
        r0 = r0.get(r1);
        r0 = (m) r0;
        r0 = r0.c;
        r0 = r4.append(r0);
        r4 = r8.c;
        r0.append(r4);
    L_0x01ce:
        r8.a(r10);
        r0 = r10.e;
        if (r0 == 0) goto L_0x01dc;
    L_0x01d5:
        r0 = r10.e;
        r4 = r10.a;
        r8.a(r0, r4, r11);
    L_0x01dc:
        r0 = r8.a;
        r4 = z;
        r5 = 43;
        r4 = r4[r5];
        r0.append(r4);
        r0 = r8.a;
        r4 = r0.toString();
        r0 = com.whatsapp.WAAppCompatActivity.c;
        if (r0 == 0) goto L_0x01f6;
    L_0x01f1:
        if (r3 == 0) goto L_0x01f7;
    L_0x01f3:
        r0 = r1;
    L_0x01f4:
        q.h = r0;
    L_0x01f6:
        return r4;
    L_0x01f7:
        r0 = r2;
        goto L_0x01f4;
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a(android.content.Context, q, int):java.lang.String");
    }

    public p() {
        this.d = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(q r8) {
        /*
        r7 = this;
        r6 = 0;
        r2 = q.h;
        r0 = r8.g;
        if (r0 == 0) goto L_0x008c;
    L_0x0007:
        r0 = r8.g;
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x0011:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x008c;
    L_0x0017:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r1 = q.b;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x008a;
    L_0x0025:
        r1 = r8.g;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r6);
        r1 = (m) r1;
        r4 = r7.a;
        r0 = r4.append(r0);
        r4 = ";";
        r0.append(r4);
        r0 = r1.d;
        if (r0 == 0) goto L_0x006b;
    L_0x0043:
        r0 = r1.d;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x006b;
    L_0x004b:
        r0 = r7.a;
        r4 = z;
        r5 = 20;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r1.d;
        r4 = r4.toArray();
        r4 = r4[r6];
        r0 = r0.append(r4);
        r4 = ":";
        r0.append(r4);
        if (r2 == 0) goto L_0x007d;
    L_0x006b:
        r0 = r7.a;
        r4 = z;
        r5 = 19;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = ":";
        r0.append(r4);
    L_0x007d:
        r0 = r7.a;
        r1 = r1.c;
        r0 = r0.append(r1);
        r1 = r7.c;
        r0.append(r1);
    L_0x008a:
        if (r2 == 0) goto L_0x0011;
    L_0x008c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a(q):void");
    }

    private boolean b(String str) {
        if (str == null || str.trim().equals("")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r8, int r9) {
        /*
        r7 = this;
        r0 = 0;
        r6 = 2;
        r5 = 1;
        r4 = 0;
        r1 = q.h;
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r2 = r8.endsWith(r2);
        if (r2 == 0) goto L_0x001d;
    L_0x0011:
        r2 = r8.length();
        r2 = r2 + -2;
        r8 = r8.substring(r4, r2);
        if (r1 == 0) goto L_0x0033;
    L_0x001d:
        r2 = "\n";
        r2 = r8.endsWith(r2);
        if (r2 == 0) goto L_0x0032;
    L_0x0026:
        r2 = r8.length();
        r2 = r2 + -1;
        r8 = r8.substring(r4, r2);
        if (r1 == 0) goto L_0x0033;
    L_0x0032:
        return r0;
    L_0x0033:
        r1 = z;
        r1 = r1[r6];
        r2 = "\n";
        r1 = r8.replaceAll(r1, r2);
        if (r9 != r5) goto L_0x004c;
    L_0x0040:
        r0 = "\n";
        r2 = z;
        r2 = r2[r5];
        r0 = r1.replaceAll(r0, r2);
        goto L_0x0032;
    L_0x004c:
        if (r9 != r6) goto L_0x0032;
    L_0x004e:
        r0 = "\n";
        r2 = z;
        r2 = r2[r4];
        r0 = r1.replaceAll(r0, r2);
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a(java.lang.String, int):java.lang.String");
    }

    private HashMap a(List list) {
        boolean z = q.h;
        HashMap hashMap = new HashMap();
        for (g gVar : list) {
            if (hashMap.containsKey(gVar.c)) {
                g.a((g) hashMap.get(gVar.c), gVar);
                if (!z) {
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            hashMap.put(gVar.c, gVar);
            continue;
            if (z) {
                break;
            }
        }
        return hashMap;
    }

    static {
        String[] strArr = new String[82];
        String str = "T\u001a";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 94;
                        break;
                    case at.g /*1*/:
                        i4 = 58;
                        break;
                    case at.i /*2*/:
                        i4 = 47;
                        break;
                    case at.o /*3*/:
                        i4 = 32;
                        break;
                    default:
                        i4 = arj.Theme_buttonStyleSmall;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "S0";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "S0";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "pb\u0002a'\u0012[ME\td";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "7NJM";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u001bwni)envp c";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "?J_E\u000b:mne\b?SCs\u0011,\u0000";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "7NJM";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u001bwni)e";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "p\u007fba,\u0012\u0001[Y\u0015;\u0007fn1\u001bhae1d";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0017t{e7\u0010\u007f{";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\n\u007fc\u001b";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "7NJM";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "pnjl";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\n\u007fc\u001b\u0011'JJ\u001d";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "7NJM";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "pb\u0002a'\u0012[ME\td";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "eMNI\u0001c";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "*C_EX\u0016ube";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "*C_EX";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "p{kr^*C_EX";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "pb\u0002a'\u0012[ME\td";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "7NJM";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "(YNR\u0001=UBP\n-_]\u000f\u0004.JJN\u0001)[_O\u0016*[CS\u0011,\u001aIA\f2_K\u0000\t1UDU\u0015\u001dUZN\u0011,CnB\u0007,xVn\u00043_";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "(YNR\u0001=UBP\n-_]\u000f\u0004.JJN\u0001)[_O\u0016*[CS\u0011,\u001aIA\f2_K\u0000\t1UDU\u0015\u001dUZN\u0011,CnB\u0007,xVn\u00043_";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "pb\u0002a'\u001f~}\u001a";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "?J_E\u000b:mnp\n-NNL6*H\u0015";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "7NJM";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "p{kr_e\u0001";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "7NJM";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "pb\u0002a'\u001f~}\u001a";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "7NJM";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "?J_E\u000b:mnp\n-NNL6*H\u000fA\u0001:HpD\u0004*[\u000fI\u0016~tzl)";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "7NJM";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "d\u0001\u0014";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\u000er`t*exns h\u000e\u0015";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\u0006\u0017\u007fh*\u0010\u007f{i&s|fr6\n\u0017aa(\u001b\u0000";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "\u001c~ny";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "\u001c\u007fhi+dlla7\u001a";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\u0010slk+\u001fwj";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "~LJR\u00167UA\u0000\u000b1N\u000fM\u0004*YG\u00003\u001bh|i*\u0010eyc$\f~\u001d\u0011E1H\u000fv \fifo+\u0001lla7\u001a\t\u001f\u000e";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "\ns{l d";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "\u001btk\u001a3\u001d{}d";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "\u0010u{e_";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "\b\u007f}s,\u0011t\u0015\u0013Kn";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "\u0010slk+\u001fwj\u001a";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\b\u007f}s,\u0011t\u0015\u0012Ko";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "\u0011hh\u001a";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\u001c~ny^([CU\u0000c^NT\u0000d";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\u0006\u0017\u007fh*\u0010\u007f{i&svns1stnm d";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\u0010slk+\u001fwj";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "\u001c~ny";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "\u0010\u0000";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "\u0018t\u0015";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "(YNR\u0001qTNM\u0000d";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "\u000eh`d,\u0019c";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "\u0013ih";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "\u001fuc";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "\u000euxe7\rrnr ";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "\u001cx|";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "\u0017ikn";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "\u0017xbm$\u0017v";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "\u000ehjf";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "\u0013yfm$\u0017v";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "\u001d{}";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "\u001bm`r)\u001a";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "\bufc ";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "\u0013uke(";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "\u0018{w";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "\u0006\u000e\u001f\u0010";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "\tu}k";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "\u001fj\u007fl \u0012sak";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "\u0017t{e7\u0010\u007f{";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "\u001fn{m$\u0017v";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "\u0016ube";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "\u001ds|";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "\u001d\u007fcl";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "\bske*";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "\u001d\u007fcl";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "\u000e{he7";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "\nvw";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    e = new HashSet(Arrays.asList(new String[]{z[77], z[58], z[72], z[74], z[76], z[66], z[73], z[62], z[64], z[59], z[56], z[81], z[70]}));
                    b = new HashSet(Arrays.asList(new String[]{z[63], z[71], z[75], z[67], z[69], z[57], z[79], z[80], z[60], z[68], z[65], z[61], z[78]}));
                    return;
                default:
                    strArr2[i2] = str;
                    str = "S0\u000f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private void a(Context context, c cVar, int i) {
        boolean z = q.h;
        try {
            this.d++;
            if (cVar.a != null) {
                Log.v(z[27] + cVar);
                if (cVar.f == 0) {
                    this.a.append(z[23]).append(this.d).append(z[29]).append(cVar.a.b()).append(this.c);
                    this.a.append(z[32]).append(this.d).append(z[26]);
                    if (cVar.a.d != null) {
                        try {
                            this.a.append(u0.d(cVar.a.d).toLowerCase());
                        } catch (Throwable e) {
                            Log.b(z[24], e);
                        }
                    }
                    this.a.append(this.c);
                    this.a.append(z[30]).append(this.d).append(z[22]).append(cVar.b).append(this.c);
                    if (!z) {
                        return;
                    }
                }
                this.a.append(z[34]).append(this.d).append(z[21]).append(context.getString(StructuredPostal.getTypeLabelResource(cVar.f))).append(z[35]).append(cVar.a.b()).append(this.c);
                this.a.append(z[28]).append(this.d).append(z[31]);
                if (cVar.a.d != null) {
                    try {
                        this.a.append(u0.d(cVar.a.d).toLowerCase());
                    } catch (Throwable e2) {
                        Log.b(z[25], e2);
                    }
                }
                try {
                    this.a.append(this.c);
                    if (!z) {
                        return;
                    }
                } catch (IOException e3) {
                    throw e3;
                }
            }
            Log.e(z[33]);
        } catch (IOException e32) {
            throw e32;
        } catch (IOException e322) {
            throw e322;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.content.Context r8, java.util.List r9, int r10) {
        /*
        r7 = this;
        r2 = q.h;
        r0 = r7.a(r9);
        r0 = r0.values();
        r3 = r0.iterator();
    L_0x000e:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00e5;
    L_0x0014:
        r0 = r3.next();
        r0 = (g) r0;
        r1 = r0.c;
        r1 = r7.b(r1);
        if (r1 != 0) goto L_0x00e3;
    L_0x0022:
        r1 = r0.a;
        if (r1 != 0) goto L_0x0089;
    L_0x0026:
        r1 = r7.d;
        r1 = r1 + 1;
        r7.d = r1;
        r1 = r7.a;
        r4 = z;
        r5 = 13;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r4 = r7.d;
        r1 = r1.append(r4);
        r4 = z;
        r5 = 14;
        r4 = r4[r5];
        r1.append(r4);
        r1 = r0.b;
        r7.a(r1);
        r1 = r7.a;
        r4 = ":";
        r1 = r1.append(r4);
        r4 = r0.c;
        r1 = r1.append(r4);
        r4 = r7.c;
        r1.append(r4);
        r1 = r7.a;
        r4 = z;
        r5 = 16;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r4 = r7.d;
        r1 = r1.append(r4);
        r4 = z;
        r5 = 17;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r4 = r0.d;
        r1 = r1.append(r4);
        r4 = r7.c;
        r1.append(r4);
        if (r2 == 0) goto L_0x00e3;
    L_0x0089:
        r1 = r0.a;
        r1 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r1);
        r1 = r8.getString(r1);
        r4 = 2;
        if (r10 != r4) goto L_0x00aa;
    L_0x0096:
        r4 = ";";
        r4 = r1.indexOf(r4);
        r5 = -1;
        if (r4 == r5) goto L_0x00aa;
    L_0x00a0:
        r4 = ";";
        r5 = ",";
        r1 = r1.replace(r4, r5);
    L_0x00aa:
        r4 = 1;
        if (r10 != r4) goto L_0x00ba;
    L_0x00ad:
        r4 = r7.a;
        r5 = z;
        r6 = 12;
        r5 = r5[r6];
        r4.append(r5);
        if (r2 == 0) goto L_0x00c5;
    L_0x00ba:
        r4 = r7.a;
        r5 = z;
        r6 = 15;
        r5 = r5[r6];
        r4.append(r5);
    L_0x00c5:
        r4 = r7.a;
        r4.append(r1);
        r1 = r0.b;
        r7.a(r1);
        r1 = r7.a;
        r4 = ":";
        r1 = r1.append(r4);
        r0 = r0.c;
        r0 = r1.append(r0);
        r1 = r7.c;
        r0.append(r1);
    L_0x00e3:
        if (r2 == 0) goto L_0x000e;
    L_0x00e5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b(android.content.Context, java.util.List, int):void");
    }

    private void a(byte[] bArr, String str, int i) {
        this.a.append(z[36]).append(Base64.encodeToString(bArr, 2)).append(this.c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(j r5) {
        /*
        r4 = this;
        r0 = q.h;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 55;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r1 = r1.toString();
        com.whatsapp.util.Log.v(r1);
        r1 = r4.a;
        r2 = z;
        r3 = 53;
        r2 = r2[r3];
        r1.append(r2);
        r1 = r5.h;
        if (r1 == 0) goto L_0x003b;
    L_0x002b:
        r1 = r4.a;
        r2 = r5.h;
        r1 = r1.append(r2);
        r2 = ";";
        r1.append(r2);
        if (r0 == 0) goto L_0x0043;
    L_0x003b:
        r1 = r4.a;
        r2 = ";";
        r1.append(r2);
    L_0x0043:
        r1 = r5.g;
        if (r1 == 0) goto L_0x0057;
    L_0x0047:
        r1 = r4.a;
        r2 = r5.g;
        r1 = r1.append(r2);
        r2 = ";";
        r1.append(r2);
        if (r0 == 0) goto L_0x005f;
    L_0x0057:
        r1 = r4.a;
        r2 = ";";
        r1.append(r2);
    L_0x005f:
        r1 = r5.c;
        if (r1 == 0) goto L_0x0073;
    L_0x0063:
        r1 = r4.a;
        r2 = r5.c;
        r1 = r1.append(r2);
        r2 = ";";
        r1.append(r2);
        if (r0 == 0) goto L_0x007b;
    L_0x0073:
        r1 = r4.a;
        r2 = ";";
        r1.append(r2);
    L_0x007b:
        r1 = r5.f;
        if (r1 == 0) goto L_0x008f;
    L_0x007f:
        r1 = r4.a;
        r2 = r5.f;
        r1 = r1.append(r2);
        r2 = ";";
        r1.append(r2);
        if (r0 == 0) goto L_0x0097;
    L_0x008f:
        r0 = r4.a;
        r1 = ";";
        r0.append(r1);
    L_0x0097:
        r0 = r5.a;
        if (r0 == 0) goto L_0x00a2;
    L_0x009b:
        r0 = r4.a;
        r1 = r5.a;
        r0.append(r1);
    L_0x00a2:
        r0 = r4.a;
        r1 = r4.c;
        r0.append(r1);
        r0 = r4.a;
        r1 = z;
        r2 = 54;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r5.e;
        r0 = r0.append(r1);
        r1 = r4.c;
        r0.append(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a(j):void");
    }

    private void a(Context context, List list, int i) {
        boolean z = q.h;
        for (c cVar : list) {
            if (cVar.c == Email.class) {
                b(context, cVar, i);
                if (!z) {
                    continue;
                    if (z) {
                        return;
                    }
                }
            }
            if (cVar.c == StructuredPostal.class) {
                a(context, cVar, i);
                continue;
            } else {
                continue;
            }
            if (z) {
                return;
            }
        }
    }
}
