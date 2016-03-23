package com.whatsapp;

import com.whatsapp.gcm.RegistrationIntentService;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class atw extends akc {
    private static final String[] z;

    static {
        String[] strArr = new String[17];
        String str = "1p\b";
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
                        i3 = 70;
                        break;
                    case at.g /*1*/:
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 67;
                        break;
                    default:
                        i3 = 97;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "6|\t7\u00144p";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "'e\u001al\f#f\u0019\"\u0006#:\u0018&\u0002#|\u001c&\u0005iq\u001f3\r/v\u000b7\u0004f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "'e\u001al\f#f\u0019\"\u0006#:\u0018&\u0002#|\u001c&\u0005i{\u000f4\u00144yJ";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "'e\u001al\f#f\u0019\"\u0006#:\u0018&\u0002#|\u001c&\u0005i{\u000f4\u00144yJ";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "'e\u001al\f#f\u0019\"\u0006#v\u0002\"\u000f!p\u000ec\u0014(~\u0004,\u0016(5\u001e:\u0011#5";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "4p\u0006\"\u0018";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0006fD4\t'a\u0019\"\u00116;\u0004&\u0015";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "6|\t7\u00144p";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "+f\r\"\u0005\"p\u000el\u00074z\u0007\u001c\u000f'x\u000fc\b55\u000f.\u00112lJc\u000b/qP";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "fx\u000f0\u0012'r\u000fy";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "/{\u001c*\u0012";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "'{\u000e1\u000e/qD1\u00045z\u001f1\u0002#/El\u0002)xD4\t'a\u0019\"\u00116:XrRw$\\vP~#";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "1p\b";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "4p\u0006\"\u0018";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "%z\u0007m\u0006)z\r/\u0004he\u0018,\u0002#f\u0019m\u0006'e\u001a0";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "4p\u0006\"\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Collection collection, Map map) {
        boolean z = DialogToastActivity.f;
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (co coVar : collection) {
                Collection collection2 = (Collection) hashMap.get(coVar.k.c);
                if (collection2 == null) {
                    collection2 = new ArrayList();
                    hashMap.put(coVar.k.c, collection2);
                }
                collection2.add(coVar);
                if (z) {
                    break;
                }
            }
            for (Entry entry : hashMap.entrySet()) {
                int i;
                Integer num = (Integer) map.get(entry.getKey());
                String str = (String) entry.getKey();
                Collection collection3 = (Collection) entry.getValue();
                if (num == null) {
                    i = 0;
                } else {
                    i = num.intValue();
                }
                App.a(str, collection3, i);
                if (z) {
                    return;
                }
            }
        }
    }

    atw() {
    }

    public void b(co coVar) {
        if (coVar.j != null && !App.aq && coVar.c != 8 && System.currentTimeMillis() - coVar.b > 900000) {
            App.aq = true;
            boolean q = App.q(App.z());
            if (q) {
                App.a(App.z(), App.i(App.z()) + 1);
                if (App.q(App.z()) != q) {
                    App.a(App.z());
                }
            }
        }
    }

    public void a(Collection collection, String str, Map map, boolean z) {
        boolean z2 = DialogToastActivity.f;
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (co coVar : collection) {
                Collection collection2 = (Collection) hashMap.get(coVar.k.c);
                if (collection2 == null) {
                    collection2 = new ArrayList();
                    hashMap.put(coVar.k.c, collection2);
                }
                collection2.add(coVar);
                if (z2) {
                    break;
                }
            }
            for (Entry entry : hashMap.entrySet()) {
                int i;
                Integer num = (Integer) map.get(entry.getKey());
                String str2 = (String) entry.getKey();
                Collection collection3 = (Collection) entry.getValue();
                if (num == null) {
                    i = 0;
                } else {
                    i = num.intValue();
                }
                App.a(str2, z, collection3, i);
                if (z2) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.co r16, int r17) {
        /*
        r15 = this;
        r3 = 8;
        r14 = 2;
        r13 = 6;
        r4 = 0;
        r5 = 1;
        r6 = com.whatsapp.DialogToastActivity.f;
        if (r16 == 0) goto L_0x014a;
    L_0x000a:
        r0 = r16;
        r2 = r0.c;	 Catch:{ Exception -> 0x014b }
        if (r2 == r3) goto L_0x014a;
    L_0x0010:
        r0 = r16;
        r2 = r0.c;	 Catch:{ Exception -> 0x014d }
        if (r2 != 0) goto L_0x0056;
    L_0x0016:
        r2 = new android.text.SpannableString;	 Catch:{ Exception -> 0x0153 }
        r3 = r16.c();	 Catch:{ Exception -> 0x0153 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x0153 }
        r3 = 1;
        android.text.util.Linkify.addLinks(r2, r3);	 Catch:{ Exception -> 0x0153 }
        r3 = 0;
        r7 = r2.length();	 Catch:{ Exception -> 0x0153 }
        r8 = android.text.style.URLSpan.class;
        r2 = r2.getSpans(r3, r7, r8);	 Catch:{ Exception -> 0x0153 }
        r2 = (android.text.style.URLSpan[]) r2;	 Catch:{ Exception -> 0x0153 }
        if (r2 == 0) goto L_0x0156;
    L_0x0032:
        r3 = r2.length;	 Catch:{ Exception -> 0x014f }
        if (r3 <= 0) goto L_0x0156;
    L_0x0035:
        r3 = r5;
    L_0x0036:
        if (r3 == 0) goto L_0x03c2;
    L_0x0038:
        r2 = r2.length;	 Catch:{ Exception -> 0x0153 }
    L_0x0039:
        r3 = r16.c();	 Catch:{ Exception -> 0x0153 }
        r3 = r3.length();	 Catch:{ Exception -> 0x0153 }
        if (r3 == 0) goto L_0x0056;
    L_0x0043:
        r3 = new com.whatsapp.fieldstats.ag;	 Catch:{ Exception -> 0x0153 }
        r3.<init>();	 Catch:{ Exception -> 0x0153 }
        r8 = (double) r2;	 Catch:{ Exception -> 0x0153 }
        r2 = java.lang.Double.valueOf(r8);	 Catch:{ Exception -> 0x0153 }
        r3.e = r2;	 Catch:{ Exception -> 0x0153 }
        r2 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x0153 }
        com.whatsapp.fieldstats.i.a(r2, r3);	 Catch:{ Exception -> 0x0153 }
    L_0x0056:
        r0 = r16;
        r2 = r0.k;
        r2 = r2.a;
        if (r2 != 0) goto L_0x020a;
    L_0x005e:
        r2 = java.lang.System.currentTimeMillis();
        r0 = r16;
        r8 = r0.b;
        r8 = r2 - r8;
        r0 = r16;
        r2 = r0.k;
        r7 = r2.c;
        r3 = com.whatsapp.qa.d(r7);
        r2 = com.whatsapp.App.a1;	 Catch:{ Exception -> 0x0159 }
        r0 = r16;
        r10 = r0.t;	 Catch:{ Exception -> 0x0159 }
        r2 = r2.a(r7, r10);	 Catch:{ Exception -> 0x0159 }
        if (r2 < 0) goto L_0x008a;
    L_0x007e:
        r2 = com.whatsapp.App.a1;	 Catch:{ Exception -> 0x0159 }
        r0 = r16;
        r10 = r0.t;	 Catch:{ Exception -> 0x0159 }
        r2.b(r7, r10);	 Catch:{ Exception -> 0x0159 }
        com.whatsapp.App.i(r7);	 Catch:{ Exception -> 0x0159 }
    L_0x008a:
        r2 = r3.c();	 Catch:{ Exception -> 0x015b }
        if (r2 == 0) goto L_0x0162;
    L_0x0090:
        r0 = r16;
        r2 = r0.t;	 Catch:{ Exception -> 0x015d }
        if (r2 == 0) goto L_0x015f;
    L_0x0096:
        r2 = com.whatsapp.App.as;	 Catch:{ Exception -> 0x015d }
        r0 = r16;
        r10 = r0.t;	 Catch:{ Exception -> 0x015d }
        r2 = r2.b(r10);	 Catch:{ Exception -> 0x015d }
    L_0x00a0:
        r0 = r16;
        r10 = r0.e;	 Catch:{ Exception -> 0x0165 }
        r10 = android.text.TextUtils.isEmpty(r10);	 Catch:{ Exception -> 0x0165 }
        if (r10 == 0) goto L_0x00da;
    L_0x00aa:
        r10 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0165 }
        r10.<init>();	 Catch:{ Exception -> 0x0165 }
        r11 = z;	 Catch:{ Exception -> 0x0165 }
        r12 = 10;
        r11 = r11[r12];	 Catch:{ Exception -> 0x0165 }
        r10 = r10.append(r11);	 Catch:{ Exception -> 0x0165 }
        r10 = r10.append(r7);	 Catch:{ Exception -> 0x0165 }
        r11 = z;	 Catch:{ Exception -> 0x0165 }
        r12 = 11;
        r11 = r11[r12];	 Catch:{ Exception -> 0x0165 }
        r10 = r10.append(r11);	 Catch:{ Exception -> 0x0165 }
        r0 = r16;
        r11 = r0.k;	 Catch:{ Exception -> 0x0165 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x0165 }
        r10 = r10.append(r11);	 Catch:{ Exception -> 0x0165 }
        r10 = r10.toString();	 Catch:{ Exception -> 0x0165 }
        com.whatsapp.util.Log.w(r10);	 Catch:{ Exception -> 0x0165 }
    L_0x00da:
        if (r2 == 0) goto L_0x0100;
    L_0x00dc:
        r0 = r16;
        r10 = r0.e;	 Catch:{ Exception -> 0x0167 }
        r10 = android.text.TextUtils.isEmpty(r10);	 Catch:{ Exception -> 0x0167 }
        if (r10 != 0) goto L_0x0100;
    L_0x00e6:
        r0 = r16;
        r10 = r0.e;	 Catch:{ Exception -> 0x0169 }
        r11 = r2.f;	 Catch:{ Exception -> 0x0169 }
        r10 = r10.equals(r11);	 Catch:{ Exception -> 0x0169 }
        if (r10 != 0) goto L_0x0100;
    L_0x00f2:
        r0 = r16;
        r10 = r0.e;	 Catch:{ Exception -> 0x0169 }
        r2.f = r10;	 Catch:{ Exception -> 0x0169 }
        r10 = new com.whatsapp.e6;	 Catch:{ Exception -> 0x0169 }
        r10.<init>(r15, r2);	 Catch:{ Exception -> 0x0169 }
        com.whatsapp.App.a(r10);	 Catch:{ Exception -> 0x0169 }
    L_0x0100:
        r0 = r16;
        r2 = com.whatsapp.App.a(r0, r3, r2);	 Catch:{ Exception -> 0x016b }
        if (r2 == 0) goto L_0x0117;
    L_0x0108:
        r2 = com.whatsapp.App.i(r16);	 Catch:{ Exception -> 0x016d }
        if (r2 == 0) goto L_0x0117;
    L_0x010e:
        r2 = com.whatsapp.u1.a();	 Catch:{ Exception -> 0x016d }
        r0 = r16;
        r2.a(r0);	 Catch:{ Exception -> 0x016d }
    L_0x0117:
        r2 = de.greenrobot.event.h.b();
        r10 = com.whatsapp.ana.class;
        r2 = r2.b(r10);
        r2 = (com.whatsapp.ana) r2;
        r10 = com.whatsapp.Conversation.F();
        r11 = r10.a();	 Catch:{ Exception -> 0x016f }
        if (r11 == 0) goto L_0x01b6;
    L_0x012d:
        r2 = r2.a;	 Catch:{ Exception -> 0x0171 }
        if (r2 != 0) goto L_0x01b6;
    L_0x0131:
        r2 = r10.b();	 Catch:{ Exception -> 0x0173 }
        r2 = r2.ae;	 Catch:{ Exception -> 0x0173 }
        r2 = r2.equals(r7);	 Catch:{ Exception -> 0x0173 }
        if (r2 == 0) goto L_0x01b6;
    L_0x013d:
        r0 = r16;
        r2 = r0.j;	 Catch:{ Exception -> 0x0175 }
        if (r2 == 0) goto L_0x0179;
    L_0x0143:
        r15.a(r8);	 Catch:{ Exception -> 0x0177 }
        r2 = com.whatsapp.App.aD;	 Catch:{ Exception -> 0x0177 }
        if (r2 == 0) goto L_0x0179;
    L_0x014a:
        return;
    L_0x014b:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x014d }
    L_0x014d:
        r2 = move-exception;
        throw r2;
    L_0x014f:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0151 }
    L_0x0151:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0153 }
    L_0x0153:
        r2 = move-exception;
        goto L_0x0056;
    L_0x0156:
        r3 = r4;
        goto L_0x0036;
    L_0x0159:
        r2 = move-exception;
        throw r2;
    L_0x015b:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x015d }
    L_0x015d:
        r2 = move-exception;
        throw r2;
    L_0x015f:
        r2 = 0;
        goto L_0x00a0;
    L_0x0162:
        r2 = r3;
        goto L_0x00a0;
    L_0x0165:
        r2 = move-exception;
        throw r2;
    L_0x0167:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0169 }
    L_0x0169:
        r2 = move-exception;
        throw r2;
    L_0x016b:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x016d }
    L_0x016d:
        r2 = move-exception;
        throw r2;
    L_0x016f:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0171 }
    L_0x0171:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0173 }
    L_0x0173:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0175 }
    L_0x0175:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0177 }
    L_0x0177:
        r2 = move-exception;
        throw r2;
    L_0x0179:
        r2 = 1;
        com.whatsapp.App.aD = r2;	 Catch:{ Exception -> 0x0380 }
        r2 = r3.p;	 Catch:{ Exception -> 0x0380 }
        r10 = r10.b();	 Catch:{ Exception -> 0x0380 }
        r10 = r10.aI;	 Catch:{ Exception -> 0x0380 }
        r10 = r10.p;	 Catch:{ Exception -> 0x0380 }
        r2 = r2.equals(r10);	 Catch:{ Exception -> 0x0380 }
        if (r2 == 0) goto L_0x01a4;
    L_0x018c:
        r2 = com.whatsapp.notification.ao.c();	 Catch:{ Exception -> 0x0382 }
        r2.a();	 Catch:{ Exception -> 0x0382 }
        r2 = com.whatsapp.Conversation.bz;	 Catch:{ Exception -> 0x0382 }
        if (r2 == 0) goto L_0x01a4;
    L_0x0197:
        r2 = z;	 Catch:{ Exception -> 0x0382 }
        r10 = 13;
        r2 = r2[r10];	 Catch:{ Exception -> 0x0382 }
        r2 = android.net.Uri.parse(r2);	 Catch:{ Exception -> 0x0382 }
        com.whatsapp.App.a(r2);	 Catch:{ Exception -> 0x0382 }
    L_0x01a4:
        r2 = com.whatsapp.wn.q();	 Catch:{ Exception -> 0x0384 }
        if (r2 == 0) goto L_0x0202;
    L_0x01aa:
        r2 = z;	 Catch:{ Exception -> 0x0386 }
        r10 = 12;
        r2 = r2[r10];	 Catch:{ Exception -> 0x0386 }
        r0 = r16;
        r0.J = r2;	 Catch:{ Exception -> 0x0386 }
        if (r6 == 0) goto L_0x0202;
    L_0x01b6:
        r2 = 1;
        r3.c(r2);	 Catch:{ Exception -> 0x0388 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0388 }
        r10 = 16;
        if (r2 < r10) goto L_0x01c9;
    L_0x01c0:
        r2 = com.whatsapp.notification.ao.c();	 Catch:{ Exception -> 0x0388 }
        r0 = r16;
        r2.a(r7, r0);	 Catch:{ Exception -> 0x0388 }
    L_0x01c9:
        r2 = new com.whatsapp.ak9;	 Catch:{ Exception -> 0x038a }
        r2.<init>(r15, r3);	 Catch:{ Exception -> 0x038a }
        com.whatsapp.App.a(r2);	 Catch:{ Exception -> 0x038a }
        r0 = r16;
        r2 = r0.j;	 Catch:{ Exception -> 0x038a }
        if (r2 == 0) goto L_0x01f1;
    L_0x01d7:
        r0 = r16;
        r2 = r0.c;	 Catch:{ Exception -> 0x038c }
        if (r2 != r14) goto L_0x01e3;
    L_0x01dd:
        r0 = r16;
        r2 = r0.r;	 Catch:{ Exception -> 0x038e }
        if (r2 == r5) goto L_0x01ec;
    L_0x01e3:
        r2 = 1;
        r3 = com.whatsapp.App.aD;	 Catch:{ Exception -> 0x038e }
        com.whatsapp.App.a(r2, r3);	 Catch:{ Exception -> 0x038e }
        r2 = 1;
        com.whatsapp.App.aD = r2;	 Catch:{ Exception -> 0x038e }
    L_0x01ec:
        r15.a(r8);	 Catch:{ Exception -> 0x0390 }
        if (r6 == 0) goto L_0x0202;
    L_0x01f1:
        r0 = r16;
        r2 = r0.c;	 Catch:{ Exception -> 0x0392 }
        if (r2 != r14) goto L_0x01fd;
    L_0x01f7:
        r0 = r16;
        r2 = r0.r;	 Catch:{ Exception -> 0x0394 }
        if (r2 == r5) goto L_0x0202;
    L_0x01fd:
        r2 = 1;
        r3 = 0;
        com.whatsapp.App.a(r2, r3);	 Catch:{ Exception -> 0x0394 }
    L_0x0202:
        com.whatsapp.App.n(r16);	 Catch:{ Exception -> 0x0396 }
        com.whatsapp.App.l(r16);	 Catch:{ Exception -> 0x0396 }
        if (r6 == 0) goto L_0x014a;
    L_0x020a:
        r0 = r16;
        r2 = r0.k;	 Catch:{ Exception -> 0x0398 }
        r2 = r2.a;	 Catch:{ Exception -> 0x0398 }
        if (r2 == 0) goto L_0x028e;
    L_0x0212:
        r2 = z;	 Catch:{ Exception -> 0x0398 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0398 }
        r0 = r16;
        r3 = r0.J;	 Catch:{ Exception -> 0x0398 }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x0398 }
        if (r2 == 0) goto L_0x028e;
    L_0x0222:
        r2 = com.whatsapp.App.as;
        r2 = r2.e();
        r3 = r2.p;
        r0 = r16;
        r2 = r0.k;	 Catch:{ Exception -> 0x039a }
        r2 = r2.c;	 Catch:{ Exception -> 0x039a }
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x039a }
        if (r2 == 0) goto L_0x0243;
    L_0x0236:
        r0 = r16;
        r2 = r0.k;	 Catch:{ Exception -> 0x039c }
        r2 = r2.b;	 Catch:{ Exception -> 0x039c }
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        com.whatsapp.App.a(r2, r7);	 Catch:{ Exception -> 0x039c }
        if (r6 == 0) goto L_0x027d;
    L_0x0243:
        r0 = r16;
        r2 = r0.c;	 Catch:{ Exception -> 0x039e }
        r7 = 5;
        if (r2 != r7) goto L_0x0263;
    L_0x024a:
        r0 = r16;
        r2 = r0.Q;	 Catch:{ Exception -> 0x03a0 }
        if (r2 == 0) goto L_0x0263;
    L_0x0250:
        r0 = r16;
        r2 = r0.Q;	 Catch:{ Exception -> 0x03a2 }
        r2 = r2 instanceof com.whatsapp.MediaData;	 Catch:{ Exception -> 0x03a2 }
        if (r2 == 0) goto L_0x0263;
    L_0x0258:
        r0 = r16;
        r2 = r0.Q;	 Catch:{ Exception -> 0x03a4 }
        r2 = (com.whatsapp.MediaData) r2;	 Catch:{ Exception -> 0x03a4 }
        r7 = 1;
        r2.transferred = r7;	 Catch:{ Exception -> 0x03a4 }
        if (r6 == 0) goto L_0x0276;
    L_0x0263:
        r0 = r16;
        r2 = r0.c;	 Catch:{ Exception -> 0x03a6 }
        r2 = com.whatsapp.App.b(r2);	 Catch:{ Exception -> 0x03a6 }
        if (r2 == 0) goto L_0x0276;
    L_0x026d:
        r2 = com.whatsapp.u1.a();	 Catch:{ Exception -> 0x03a6 }
        r0 = r16;
        r2.a(r0);	 Catch:{ Exception -> 0x03a6 }
    L_0x0276:
        r8 = 0;
        r0 = r16;
        com.whatsapp.App.a(r0, r4, r8);
    L_0x027d:
        r0 = r16;
        r2 = r0.k;	 Catch:{ Exception -> 0x03a8 }
        r2 = r2.b;	 Catch:{ Exception -> 0x03a8 }
        r7 = z;	 Catch:{ Exception -> 0x03a8 }
        r8 = 14;
        r7 = r7[r8];	 Catch:{ Exception -> 0x03a8 }
        com.whatsapp.App.c(r2, r3, r7);	 Catch:{ Exception -> 0x03a8 }
        if (r6 == 0) goto L_0x014a;
    L_0x028e:
        r0 = r16;
        r2 = r0.k;	 Catch:{ Exception -> 0x03aa }
        r2 = r2.a;	 Catch:{ Exception -> 0x03aa }
        if (r2 == 0) goto L_0x02c2;
    L_0x0296:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x03aa }
        r2.<init>();	 Catch:{ Exception -> 0x03aa }
        r3 = com.whatsapp.App.ad();	 Catch:{ Exception -> 0x03aa }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x03aa }
        r3 = z;	 Catch:{ Exception -> 0x03aa }
        r7 = 8;
        r3 = r3[r7];	 Catch:{ Exception -> 0x03aa }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x03aa }
        r2 = r2.toString();	 Catch:{ Exception -> 0x03aa }
        r0 = r16;
        r3 = r0.k;	 Catch:{ Exception -> 0x03aa }
        r3 = r3.c;	 Catch:{ Exception -> 0x03aa }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x03aa }
        if (r2 == 0) goto L_0x02c2;
    L_0x02bd:
        com.whatsapp.App.n(r16);	 Catch:{ Exception -> 0x03ac }
        if (r6 == 0) goto L_0x014a;
    L_0x02c2:
        com.whatsapp.App.n(r16);	 Catch:{ Exception -> 0x03ae }
        r2 = -1;
        r0 = r17;
        if (r0 != r2) goto L_0x02d8;
    L_0x02ca:
        r0 = r16;
        r2 = r0.d;	 Catch:{ Exception -> 0x03b0 }
        if (r2 == r13) goto L_0x02d8;
    L_0x02d0:
        r2 = 0;
        r6 = 0;
        r0 = r16;
        com.whatsapp.App.a(r0, r2, r6);	 Catch:{ Exception -> 0x03b0 }
    L_0x02d8:
        r2 = de.greenrobot.event.h.b();
        r3 = com.whatsapp.ana.class;
        r2 = r2.b(r3);
        r2 = (com.whatsapp.ana) r2;
        r3 = com.whatsapp.Conversation.F();
        r6 = com.whatsapp.qm.a(r16);	 Catch:{ Exception -> 0x03b2 }
        if (r6 == 0) goto L_0x0341;
    L_0x02ee:
        r6 = r3.a();	 Catch:{ Exception -> 0x03b4 }
        if (r6 == 0) goto L_0x030a;
    L_0x02f4:
        r2 = r2.a;	 Catch:{ Exception -> 0x03b6 }
        if (r2 != 0) goto L_0x030a;
    L_0x02f8:
        r2 = r3.b();	 Catch:{ Exception -> 0x03b8 }
        r2 = r2.ae;	 Catch:{ Exception -> 0x03b8 }
        r0 = r16;
        r3 = r0.k;	 Catch:{ Exception -> 0x03b8 }
        r3 = r3.c;	 Catch:{ Exception -> 0x03b8 }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x03b8 }
        if (r2 != 0) goto L_0x0341;
    L_0x030a:
        r0 = r16;
        r2 = r0.z;	 Catch:{ Exception -> 0x03b8 }
        r6 = 1;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 == 0) goto L_0x0329;
    L_0x0314:
        r0 = r16;
        r2 = r0.k;
        r2 = r2.c;
        r2 = com.whatsapp.qa.d(r2);
        r2.c(r5);
        r3 = new com.whatsapp.xs;
        r3.<init>(r15, r2);
        com.whatsapp.App.a(r3);
    L_0x0329:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x03ba }
        r3 = 16;
        if (r2 < r3) goto L_0x033e;
    L_0x032f:
        r2 = com.whatsapp.notification.ao.c();	 Catch:{ Exception -> 0x03ba }
        r0 = r16;
        r3 = r0.k;	 Catch:{ Exception -> 0x03ba }
        r3 = r3.c;	 Catch:{ Exception -> 0x03ba }
        r0 = r16;
        r2.a(r3, r0);	 Catch:{ Exception -> 0x03ba }
    L_0x033e:
        com.whatsapp.App.a(r5, r4);
    L_0x0341:
        r0 = r16;
        r2 = r0.d;	 Catch:{ Exception -> 0x03bc }
        if (r2 != r13) goto L_0x0357;
    L_0x0347:
        r0 = r16;
        r2 = r0 instanceof com.whatsapp.ax9;	 Catch:{ Exception -> 0x03be }
        if (r2 == 0) goto L_0x0357;
    L_0x034d:
        r0 = r16;
        r0 = (com.whatsapp.ax9) r0;	 Catch:{ Exception -> 0x03be }
        r2 = r0;
        r2 = r2.T;	 Catch:{ Exception -> 0x03be }
        com.whatsapp.App.b(r2);	 Catch:{ Exception -> 0x03be }
    L_0x0357:
        r0 = r16;
        r2 = r0.d;	 Catch:{ Exception -> 0x03c0 }
        if (r2 != r13) goto L_0x014a;
    L_0x035d:
        r0 = r16;
        r2 = r0.z;	 Catch:{ Exception -> 0x037e }
        r4 = 6;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x014a;
    L_0x0367:
        r0 = r16;
        r2 = r0.k;	 Catch:{ Exception -> 0x037e }
        r2 = r2.b;	 Catch:{ Exception -> 0x037e }
        r0 = r16;
        r3 = r0.k;	 Catch:{ Exception -> 0x037e }
        r3 = r3.c;	 Catch:{ Exception -> 0x037e }
        r4 = z;	 Catch:{ Exception -> 0x037e }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ Exception -> 0x037e }
        com.whatsapp.App.c(r2, r3, r4);	 Catch:{ Exception -> 0x037e }
        goto L_0x014a;
    L_0x037e:
        r2 = move-exception;
        throw r2;
    L_0x0380:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0382 }
    L_0x0382:
        r2 = move-exception;
        throw r2;
    L_0x0384:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0386 }
    L_0x0386:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0388 }
    L_0x0388:
        r2 = move-exception;
        throw r2;
    L_0x038a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x038c }
    L_0x038c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x038e }
    L_0x038e:
        r2 = move-exception;
        throw r2;
    L_0x0390:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0392 }
    L_0x0392:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0394 }
    L_0x0394:
        r2 = move-exception;
        throw r2;
    L_0x0396:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0398 }
    L_0x0398:
        r2 = move-exception;
        throw r2;
    L_0x039a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x039c }
    L_0x039c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x039e }
    L_0x039e:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03a0 }
    L_0x03a0:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03a2 }
    L_0x03a2:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03a4 }
    L_0x03a4:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03a6 }
    L_0x03a6:
        r2 = move-exception;
        throw r2;
    L_0x03a8:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03aa }
    L_0x03aa:
        r2 = move-exception;
        throw r2;
    L_0x03ac:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03ae }
    L_0x03ae:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03b0 }
    L_0x03b0:
        r2 = move-exception;
        throw r2;
    L_0x03b2:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03b4 }
    L_0x03b4:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03b6 }
    L_0x03b6:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03b8 }
    L_0x03b8:
        r2 = move-exception;
        throw r2;
    L_0x03ba:
        r2 = move-exception;
        throw r2;
    L_0x03bc:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03be }
    L_0x03be:
        r2 = move-exception;
        throw r2;
    L_0x03c0:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x037e }
    L_0x03c2:
        r2 = r4;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.atw.a(com.whatsapp.protocol.co, int):void");
    }

    public void a() {
        if (App.aK.R()) {
            App.b(new _a(this));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.whatsapp.protocol.co r7, int r8) {
        /*
        r6 = this;
        r5 = 0;
        r4 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        switch(r8) {
            case -1: goto L_0x0097;
            case 0: goto L_0x0007;
            case 1: goto L_0x0021;
            case 2: goto L_0x0007;
            case 3: goto L_0x002b;
            case 4: goto L_0x0021;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x0020:
        return;
    L_0x0021:
        r2 = 0;
        com.whatsapp.App.a(r7, r5, r2);
        com.whatsapp.App.k(r7);
        if (r1 == 0) goto L_0x0020;
    L_0x002b:
        r0 = r7.Q;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0020;
    L_0x0031:
        r2 = r0.transferred;
        if (r2 == 0) goto L_0x0020;
    L_0x0035:
        r2 = com.whatsapp.App.z();
        com.whatsapp.util.ag.a(r2, r7);
        r2 = r0.refKey;
        if (r2 != 0) goto L_0x0047;
    L_0x0040:
        r2 = r7.q;
        r0 = r0.dedupeDownload;
        com.whatsapp.App.d(r2, r0);
    L_0x0047:
        r0 = r7.c;
        r2 = 2;
        if (r0 != r2) goto L_0x0062;
    L_0x004c:
        r0 = r7.r;
        if (r0 != r4) goto L_0x0062;
    L_0x0050:
        r0 = r7.j;
        if (r0 == 0) goto L_0x005d;
    L_0x0054:
        r0 = com.whatsapp.App.aD;
        com.whatsapp.App.a(r4, r0);
        com.whatsapp.App.aD = r4;
        if (r1 == 0) goto L_0x0020;
    L_0x005d:
        com.whatsapp.App.a(r4, r5);
        if (r1 == 0) goto L_0x0020;
    L_0x0062:
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 16;
        if (r0 < r2) goto L_0x0020;
    L_0x0068:
        r0 = de.greenrobot.event.h.b();
        r2 = com.whatsapp.ana.class;
        r0 = r0.b(r2);
        r0 = (com.whatsapp.ana) r0;
        r2 = com.whatsapp.Conversation.F();
        r3 = r2.a();
        if (r3 == 0) goto L_0x0092;
    L_0x007e:
        r0 = r0.a;
        if (r0 != 0) goto L_0x0092;
    L_0x0082:
        r0 = r2.b();
        r0 = r0.ae;
        r2 = r7.k;
        r2 = r2.c;
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0095;
    L_0x0092:
        com.whatsapp.App.b(r4, r4, r4, r5);
    L_0x0095:
        if (r1 == 0) goto L_0x0020;
    L_0x0097:
        r0 = r7.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0020;
    L_0x009d:
        r0 = r7.d;
        if (r0 != 0) goto L_0x0020;
    L_0x00a1:
        r0 = z;
        r2 = 7;
        r0 = r0[r2];
        r2 = r7.J;
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0020;
    L_0x00ae:
        r0 = r7.k;
        r2 = r7.d;
        com.whatsapp.App.a(r0, r2);
        if (r1 == 0) goto L_0x0020;
    L_0x00b7:
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.atw.b(com.whatsapp.protocol.co, int):void");
    }

    private void a(long j) {
        if (!App.z && j > 900000 && App.q(App.z())) {
            RegistrationIntentService.b(App.z());
            App.H(z[16]);
            App.z = true;
        }
    }

    public void c(co coVar) {
        boolean z = DialogToastActivity.f;
        if (coVar != null) {
            App.a(z[3], coVar);
            if (!coVar.k.a) {
                App.l(coVar);
                if (!z) {
                    return;
                }
            }
            if (coVar.d == 6) {
                if (coVar instanceof ax9) {
                    App.b(((ax9) coVar).T);
                    if (!z) {
                        return;
                    }
                }
                if (coVar.z == 6) {
                    App.c(coVar.k.b, coVar.k.c, z[2]);
                    if (!z) {
                        return;
                    }
                }
                return;
            }
            if (z[1].equals(coVar.J)) {
                App.a(coVar.k.b, 200);
                App.c(coVar.k.b, App.as.e().p, z[0]);
            }
        }
    }

    public void a(co coVar, boolean z) {
        if (coVar != null) {
            App.a(z[4], coVar);
            Log.i(z[5] + z);
            App.l(coVar);
            if (!coVar.k.a && z && App.p(coVar) && App.i(coVar)) {
                u1.a().a(coVar);
            }
        }
    }
}
