package com.whatsapp.util.dns;

import com.whatsapp.a_3;
import com.whatsapp.as7;
import de.greenrobot.event.h;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.v;
import org.whispersystems.at;

public final class i {
    public static int a;
    private static volatile i c;
    private static final String[] z;
    private final HashMap b;

    static {
        String[] strArr = new String[5];
        String str = "|}y6P`v:1Uwvy7Aa2?1D|vy8^`2";
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
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 18;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 49;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "aw:1_vs+'\u0011v|*~Cwa62Df{60\u0011ts02Tv2?1C2";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "b`03P`ky:_a2+;B}~,*X}|y8P{~<:\u0011t}+~";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "zs+:R}v<:\u0011{by,Ta}5+E{}7~Ws{5;U2t6,\u0011";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "`w*1]d{79\u0011";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(String str, Iterable iterable) {
        int i = a;
        long currentTimeMillis = System.currentTimeMillis() + 3600000;
        ArrayList arrayList = new ArrayList();
        for (InetAddress dnsCacheEntrySerializable : iterable) {
            arrayList.add(new DnsCacheEntrySerializable(Long.valueOf(currentTimeMillis), dnsCacheEntrySerializable));
            if (i != 0) {
                break;
            }
        }
        synchronized (this) {
            this.b.put(str, arrayList);
        }
    }

    private List e(String str) {
        Object asList = Arrays.asList(InetAddress.getAllByName(str));
        a(str, asList);
        return asList;
    }

    private i() {
        this.b = new HashMap();
        h.b().e(this);
    }

    private synchronized List c(String str) {
        List list;
        int i = a;
        List<DnsCacheEntrySerializable> list2 = (List) this.b.get(str);
        if (list2 == null) {
            list = null;
        } else {
            List arrayList = new ArrayList();
            Collection hashSet = new HashSet();
            for (DnsCacheEntrySerializable dnsCacheEntrySerializable : list2) {
                if (dnsCacheEntrySerializable.isExpired()) {
                    hashSet.add(dnsCacheEntrySerializable);
                    if (i == 0) {
                        continue;
                        if (i != 0) {
                            break;
                        }
                    }
                }
                arrayList.add(dnsCacheEntrySerializable.inetAddress);
                continue;
                if (i != 0) {
                    break;
                }
            }
            list2.removeAll(hashSet);
            if (list2.isEmpty()) {
                this.b.remove(str);
            }
            list = arrayList;
        }
        return list;
    }

    private List a(String str) {
        List list = (List) as7.b.get(str);
        if (list == null || list.isEmpty()) {
            throw new UnknownHostException(z[0] + str);
        }
        a(str, list);
        return list;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List d(java.lang.String r7) {
        /*
        r6 = this;
        r5 = 32;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r7);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r6.c(r7);
        if (r0 == 0) goto L_0x002c;
    L_0x0021:
        r1 = r0.isEmpty();	 Catch:{ UnknownHostException -> 0x0028 }
        if (r1 != 0) goto L_0x002c;
    L_0x0027:
        return r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ UnknownHostException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = r6.e(r7);	 Catch:{ UnknownHostException -> 0x0031 }
        goto L_0x0027;
    L_0x0031:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r7);
        r1 = r1.append(r5);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        r0 = r6.b(r7);	 Catch:{ UnknownHostException -> 0x0058 }
        goto L_0x0027;
    L_0x0058:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r7);
        r2 = r2.append(r5);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        r0 = r6.a(r7);	 Catch:{ UnknownHostException -> 0x007f }
        goto L_0x0027;
    L_0x007f:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r7);
        r2 = r2.append(r5);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.dns.i.d(java.lang.String):java.util.List");
    }

    private List b(String str) {
        int i = a;
        d[] a = e.a(str, 20000);
        InetAddress[] inetAddressArr = new InetAddress[a.length];
        int i2 = 0;
        while (i2 < a.length) {
            inetAddressArr[i2] = a[i2].a;
            i2++;
            if (i != 0) {
                break;
            }
        }
        Object asList = Arrays.asList(inetAddressArr);
        a(str, asList);
        return asList;
    }

    public void onEvent(a_3 com_whatsapp_a_3) {
        synchronized (this) {
            this.b.clear();
        }
    }

    public static i a() {
        i iVar = c;
        if (iVar == null) {
            synchronized (i.class) {
                iVar = c;
                if (iVar == null) {
                    iVar = new i();
                    c = iVar;
                }
            }
        }
        return iVar;
    }
}
