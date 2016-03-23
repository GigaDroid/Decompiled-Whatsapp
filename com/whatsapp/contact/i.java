package com.whatsapp.contact;

import android.content.Context;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.Voip;
import com.whatsapp.arj;
import com.whatsapp.l5;
import com.whatsapp.nf;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.bg;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class i {
    private static final Map a;
    private static final Map b;
    private static final AtomicLong c;
    public static boolean d;
    private static final ConditionVariable e;
    private static final AtomicBoolean f;
    private static final ConditionVariable g;
    private static final AtomicLong h;
    private static final ConditionVariable i;
    private static final String[] z;

    private static void a(List list, Collection collection) {
        boolean z = d;
        for (l5 l5Var : list) {
            l lVar = (l) b.get(l5Var.p);
            if (!(lVar == null || (TextUtils.equals(lVar.a, l5Var.w) && lVar.b == l5Var.r))) {
                l5Var.w = lVar.a;
                l5Var.r = lVar.b;
                if (collection != null) {
                    collection.add(l5Var);
                    continue;
                } else {
                    continue;
                }
            }
            if (z) {
                return;
            }
        }
    }

    private static long c(Context context) {
        long j = c.get();
        if (j != -1) {
            return j;
        }
        c.compareAndSet(-1, a(context, z[82], 0));
        return c.get();
    }

    public static boolean a(l5 l5Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (l5Var.l == null) {
                Log.w(z[62] + l5Var);
                return false;
            }
            Collection arrayList = new ArrayList(1);
            arrayList.add(l5Var);
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(l5Var.l.a());
            g.close();
            if (!App.a(o.INTERACTIVE_DELTA, b(z[60]), 0, true, arrayList2, null)) {
                return false;
            }
            if (g.block(64000)) {
                b((List) arrayList, null);
                i.close();
                if (!App.a(new l5[]{l5Var})) {
                    return false;
                }
                App.a(new String[]{l5Var.p});
                if (i.block(64000)) {
                    a((List) arrayList, null);
                    App.as.d(arrayList);
                    Log.i(z[59] + (System.currentTimeMillis() - currentTimeMillis));
                    return true;
                }
                Log.w(z[58]);
                return false;
            }
            Log.w(z[57]);
            return false;
        } catch (Throwable e) {
            Log.b(z[55], e);
            Log.i(z[61] + (System.currentTimeMillis() - currentTimeMillis) + z[56]);
            return false;
        }
    }

    public static j b(Context context, o oVar) {
        boolean z = false;
        long currentTimeMillis = System.currentTimeMillis();
        j a = a(context, oVar, false);
        if (oVar == o.REGISTRATION_FULL) {
            z = true;
        }
        nf.a(context, z, a, System.currentTimeMillis() - currentTimeMillis);
        return a;
    }

    public static void a(Context context, String str, int i, int i2, long j) {
        Log.e(z[87] + str + z[91] + i + z[89] + i2 + z[88] + j);
        if (j > 0) {
            long currentTimeMillis = System.currentTimeMillis() + j;
            c.set(currentTimeMillis);
            a(context, currentTimeMillis, z[90]);
        }
        g.open();
    }

    public static void a(String str) {
        b.put(str, new l(0, null));
    }

    public static void c(String str) {
    }

    public static boolean b() {
        boolean compareAndSet = f.compareAndSet(true, false);
        e.open();
        return compareAndSet;
    }

    private static e a(Context context, String str, byte[] bArr) {
        boolean z = d;
        Map a = b.a(context);
        Map c = App.as.c();
        e eVar = new e(null);
        HashSet Z = App.Z();
        if (bArr != null) {
            try {
                MessageDigest instance = MessageDigest.getInstance(z[6]);
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        }
        instance = null;
        for (Entry entry : a.entrySet()) {
            l5 l5Var;
            d dVar = (d) ((List) entry.getValue()).get(0);
            if (((List) entry.getValue()).size() > 1) {
                l5Var = (l5) c.get(entry.getKey());
            } else {
                l5Var = (l5) c.get(entry.getKey());
            }
            if (l5Var != null) {
                if (bArr != null) {
                    try {
                        if (a(l5Var, bArr, instance)) {
                            eVar.b(l5Var);
                            if (!z) {
                                continue;
                                if (z) {
                                    break;
                                }
                            }
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        throw e2;
                    } catch (NoSuchAlgorithmException e22) {
                        throw e22;
                    }
                }
                try {
                    if (l5Var.a(dVar)) {
                        try {
                            eVar.a(l5Var);
                            if (!z) {
                                continue;
                                if (z) {
                                    break;
                                }
                            }
                        } catch (NoSuchAlgorithmException e222) {
                            throw e222;
                        }
                    }
                } catch (NoSuchAlgorithmException e2222) {
                    throw e2222;
                }
                try {
                    eVar.d(l5Var);
                    if (!z) {
                        continue;
                        if (z) {
                            break;
                        }
                    }
                } catch (NoSuchAlgorithmException e22222) {
                    throw e22222;
                }
            }
            try {
                if (Z.contains(entry.getKey())) {
                    try {
                        eVar.d(new l5(dVar));
                        if (!z) {
                            continue;
                            if (z) {
                                break;
                            }
                        }
                    } catch (NoSuchAlgorithmException e222222) {
                        throw e222222;
                    }
                }
                eVar.c(new l5(dVar));
                continue;
                if (z) {
                    break;
                }
            } catch (NoSuchAlgorithmException e2222222) {
                throw e2222222;
            }
        }
        for (Entry entry2 : c.entrySet()) {
            try {
                if (!a.containsKey(entry2.getKey())) {
                    eVar.e((l5) entry2.getValue());
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (NoSuchAlgorithmException e22222222) {
                throw e22222222;
            }
        }
        l5.a(eVar.b(), str + z[14], z[13]);
        l5.a(eVar.j(), str + z[10], z[5]);
        l5.a(eVar.g(), str + z[9], z[15]);
        l5.a(eVar.e(), str + z[7], z[11]);
        l5.a(eVar.d(), str + z[12], z[8]);
        return eVar;
    }

    private static boolean a(Context context, o oVar, byte[] bArr) {
        long currentTimeMillis = System.currentTimeMillis();
        e a = a(context, z[26], bArr);
        ArrayList c = a.c();
        ArrayList h = a.h();
        try {
            if (!(c.isEmpty() && h.isEmpty())) {
                g.close();
                if (!App.a(oVar, b(z[31]), 0, true, c, h)) {
                    synchronized (App.aQ) {
                        App.aa = o.combine(App.aa, oVar);
                    }
                    return false;
                } else if (!g.block(64000)) {
                    Log.w(z[32]);
                    return false;
                }
            }
            b(a.b(), null);
            b(a.d(), null);
            i.close();
            l5[] i = a.i();
            try {
                if (i.length > 0) {
                    if (App.a(i)) {
                        App.b(Arrays.asList(i));
                        if (!i.block(64000)) {
                            Log.w(z[30]);
                            return false;
                        }
                    }
                    synchronized (App.aQ) {
                        App.aa = o.combine(App.aa, oVar);
                    }
                    return false;
                }
                a(a.b(), null);
                if (!a.b().isEmpty()) {
                    App.as.b(a.b());
                }
                if (!a.d().isEmpty()) {
                    App.as.d(a.d());
                }
                if (!a.j().isEmpty()) {
                    App.as.d(a.j());
                }
                if (!a.g().isEmpty()) {
                    App.as.c(a.g());
                }
                Log.i(z[33] + (System.currentTimeMillis() - currentTimeMillis));
                if (!a.f()) {
                    App.aB.sendEmptyMessage(1);
                }
                App.i.sendEmptyMessage(0);
                return true;
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e22) {
                throw e22;
            } catch (Exception e222) {
                throw e222;
            } catch (Exception e2222) {
                throw e2222;
            } catch (Exception e22222) {
                throw e22222;
            } catch (Throwable e3) {
                Log.b(z[27], e3);
                Log.i(z[29] + (System.currentTimeMillis() - currentTimeMillis) + z[28]);
                return false;
            }
        } catch (Exception e222222) {
            throw e222222;
        } catch (Exception e2222222) {
            throw e2222222;
        }
    }

    private static long a(Context context, String str, long j) {
        ObjectInputStream objectInputStream;
        Throwable th;
        Object obj;
        ObjectInputStream objectInputStream2 = null;
        try {
            objectInputStream = new ObjectInputStream(context.openFileInput(str));
            try {
                j = objectInputStream.readLong();
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e) {
                    }
                }
            } catch (FileNotFoundException e2) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e3) {
                    }
                }
                return j;
            } catch (StreamCorruptedException e4) {
                objectInputStream2 = objectInputStream;
                try {
                    Log.w(z[2] + str + z[1]);
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e5) {
                        }
                    }
                    return j;
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e6) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e7) {
                IOException iOException = e7;
                objectInputStream2 = objectInputStream;
                IOException iOException2 = iOException;
                Log.w(z[0] + obj + z[4] + str + z[3]);
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e8) {
                    }
                }
                return j;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                objectInputStream2 = objectInputStream;
                th = th4;
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e9) {
            objectInputStream = null;
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return j;
        } catch (StreamCorruptedException e10) {
            Log.w(z[2] + str + z[1]);
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            return j;
        } catch (IOException e11) {
            obj = e11;
            Log.w(z[0] + obj + z[4] + str + z[3]);
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            return j;
        }
        return j;
    }

    private static String b(String str) {
        return str + '_' + UUID.randomUUID().toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4, byte[] r5) {
        /*
        r1 = d;
        r0 = 0;
    L_0x0003:
        r2 = c();	 Catch:{ Exception -> 0x003a }
        if (r2 != 0) goto L_0x0010;
    L_0x0009:
        r2 = e;	 Catch:{ Exception -> 0x003a }
        r2.block();	 Catch:{ Exception -> 0x003a }
        if (r1 == 0) goto L_0x0003;
    L_0x0010:
        r1 = z;	 Catch:{ Exception -> 0x003a }
        r2 = 22;
        r1 = r1[r2];	 Catch:{ Exception -> 0x003a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x003a }
        r1 = com.whatsapp.contact.o.NOTIFICATION_DELTA;	 Catch:{ Exception -> 0x003a }
        r0 = a(r4, r1, r5);	 Catch:{ Exception -> 0x003a }
        r1 = b();	 Catch:{ Exception -> 0x0038 }
        if (r1 != 0) goto L_0x002e;
    L_0x0025:
        r1 = z;	 Catch:{ Exception -> 0x0038 }
        r2 = 16;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0038 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ Exception -> 0x0038 }
    L_0x002e:
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
    L_0x0037:
        return r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r1 = move-exception;
        r2 = z;	 Catch:{ all -> 0x005d }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ all -> 0x005d }
        com.whatsapp.util.Log.b(r2, r1);	 Catch:{ all -> 0x005d }
        r1 = b();
        if (r1 != 0) goto L_0x0053;
    L_0x004a:
        r1 = z;
        r2 = 19;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
    L_0x0053:
        r1 = z;
        r2 = 23;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        goto L_0x0037;
    L_0x005d:
        r0 = move-exception;
        r1 = b();	 Catch:{ Exception -> 0x0077 }
        if (r1 != 0) goto L_0x006d;
    L_0x0064:
        r1 = z;	 Catch:{ Exception -> 0x0077 }
        r2 = 21;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0077 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ Exception -> 0x0077 }
    L_0x006d:
        r1 = z;
        r2 = 17;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.i.a(android.content.Context, byte[]):boolean");
    }

    private static void b(List list, Collection collection) {
        boolean z = d;
        for (l5 l5Var : list) {
            boolean z2;
            bg bgVar = (bg) a.get(l5Var.l.a());
            if (bgVar == null) {
                Log.w(z[69] + l5Var.l.a());
                if (!z) {
                    continue;
                }
            }
            if (bgVar.a == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object obj = bgVar.b;
            if (!(l5Var.m == z2 && TextUtils.equals(l5Var.p, obj))) {
                l5Var.m = z2;
                l5Var.p = obj;
                if (collection != null) {
                    collection.add(l5Var);
                }
            }
            if (z) {
                return;
            }
        }
    }

    public static long b(Context context) {
        long j = h.get();
        if (j != -1) {
            return j;
        }
        h.compareAndSet(-1, a(context, z[25], 85800000));
        return h.get();
    }

    public static void a(String str, int i, n[] nVarArr) {
        boolean z = d;
        Log.i(z[68] + str + z[66] + i + z[67] + nVarArr.length);
        int length = nVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            n nVar = nVarArr[i2];
            a.put(nVar.a().c, nVar.a());
            i2++;
            if (z) {
                return;
            }
        }
    }

    public static void a(Context context) {
        c.set(0);
        a(context, 0, z[24]);
    }

    private static boolean a(l5 l5Var, byte[] bArr, MessageDigest messageDigest) {
        boolean z = d;
        String str = l5Var.p;
        messageDigest.update((str.substring(0, str.length() - z[35].length()) + z[34]).getBytes());
        byte[] digest = messageDigest.digest();
        if (digest.length < bArr.length) {
            return false;
        }
        int i = 0;
        while (i < bArr.length) {
            if (digest[i] == bArr[i]) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        if (l5Var.m) {
            return false;
        }
        return true;
    }

    public static boolean a() {
        return f.get();
    }

    private static j a(Context context, o oVar, boolean z) {
        if (!App.Q()) {
            Log.i(z[77]);
            return j.NETWORK_UNAVAILABLE;
        } else if (Voip.d()) {
            Log.i(z[79]);
            return j.DELAYED;
        } else if (z || c()) {
            try {
                long c = c(context);
                j jVar;
                if (c > System.currentTimeMillis()) {
                    Log.i(z[76] + c);
                    jVar = j.DELAYED;
                    Log.i(z[70] + a.size());
                    a.clear();
                    b.clear();
                    if (z || b()) {
                        return jVar;
                    }
                    Log.e(z[80]);
                    return jVar;
                }
                boolean a;
                int b = App.as.b();
                if (oVar.isFullSync()) {
                    a = a(context, oVar);
                } else {
                    a = a(context, oVar, null);
                }
                if (a) {
                    App.aA.a(b);
                    jVar = j.UP_TO_DATE;
                    Log.i(z[72] + a.size());
                    a.clear();
                    b.clear();
                    if (z || b()) {
                        return jVar;
                    }
                    Log.e(z[73]);
                    return jVar;
                }
                jVar = j.FAILED;
                Log.i(z[75] + a.size());
                a.clear();
                b.clear();
                if (z || b()) {
                    return jVar;
                }
                Log.e(z[74]);
                return jVar;
            } catch (Throwable th) {
                Log.i(z[81] + a.size());
                a.clear();
                b.clear();
                if (!(z || b())) {
                    Log.e(z[71]);
                }
            }
        } else {
            Log.i(z[78]);
            return j.IN_PROGRESS;
        }
    }

    public static boolean c() {
        boolean compareAndSet = f.compareAndSet(false, true);
        if (compareAndSet) {
            e.close();
        }
        return compareAndSet;
    }

    public static j c(Context context, o oVar) {
        boolean z = true;
        long currentTimeMillis = System.currentTimeMillis();
        j a = a(context, oVar, true);
        if (oVar != o.REGISTRATION_FULL) {
            z = false;
        }
        nf.a(context, z, a, System.currentTimeMillis() - currentTimeMillis);
        return a;
    }

    private static void a(Context context, long j, String str) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        Object obj;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream = new ObjectOutputStream(context.openFileOutput(str, 0));
            try {
                objectOutputStream.writeLong(j);
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e) {
                    }
                }
            } catch (FileNotFoundException e2) {
                try {
                    Log.e(z[36] + str + z[39]);
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    objectOutputStream2 = objectOutputStream;
                    th = th3;
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                IOException iOException = e5;
                objectOutputStream2 = objectOutputStream;
                IOException iOException2 = iOException;
                try {
                    Log.w(z[38] + obj + z[37] + str);
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e6) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (objectOutputStream2 != null) {
                        objectOutputStream2.close();
                    }
                    throw th;
                }
            }
        } catch (FileNotFoundException e7) {
            objectOutputStream = null;
            Log.e(z[36] + str + z[39]);
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        } catch (IOException e8) {
            obj = e8;
            Log.w(z[38] + obj + z[37] + str);
            if (objectOutputStream2 != null) {
                objectOutputStream2.close();
            }
        }
    }

    public static void a(Context context, String str, String str2, long j) {
        boolean z = d;
        Log.i(z[84] + str + z[85] + str2 + z[86] + j);
        if (j > 0) {
            h.set(j);
            a(context, j, z[83]);
        }
        HashSet Z = App.Z();
        for (Entry value : a.entrySet()) {
            bg bgVar = (bg) value.getValue();
            if (bgVar.a == 2) {
                Z.add(bgVar.c);
                continue;
            }
            if (z) {
                break;
            }
        }
        App.a(Z);
        g.open();
    }

    public static void a(String str, long j, String str2) {
        b.put(str, new l(j, str2));
    }

    static {
        String[] strArr = new String[92];
        String str = "n\u0006ibkB9XsgIi";
        boolean z = true;
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
                        i3 = 39;
                        break;
                    case at.g /*1*/:
                        i3 = 73;
                        break;
                    case at.i /*2*/:
                        i3 = 44;
                        break;
                    case at.o /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 8;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "D&^h}W=\f|aK,\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u000bi^\u007f|R;Bsf@iH\u007fnF<@n(K(_n(P(En(S A\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0007;I{lN'K:nU&A:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "R9H{|B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "j\r\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "R'OriI.I~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "R9H{|B\nCt|F*XiEF=OraI.fslo(_r";
                    z = true;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "U,Au~B";
                    z = true;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "R9H{|B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "R'OriI.I~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "R9H{|B\nCt|F*XiEF=OraI.fslo(_r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "F-H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "F-H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "U,Au~B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "T0By'T0ByWI&Xsn^\u0016M~l\b+Y}'T0ByWA%M}WF%X\u007fzB-sm`N%IE{^'OEaI\u0016\\hg@;Ii{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "T0By'T0ByWI&Xsn^\u0016M~l\b-Ctm";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "T0By'T0ByWI&Xsn^\u0016M~l\b-Ctm";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "T0By'T0ByWI&Xsn^\u0016M~l\b+Y}'T0ByWA%M}WF%X\u007fzB-sm`N%IE{^'OEaI\u0016\\hg@;Ii{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "T0By'T0ByWI&Xsn^\u0016M~l\b,^hgU";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "T0By'T0ByWI&Xsn^\u0016M~l\b+Y}'T0ByWA%M}WF%X\u007fzB-sm`N%IE{^'OEaI\u0016\\hg@;Ii{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "T0By'T0ByWI&Xsn^\u0016M~l\b:X{zS\rIv|F\u001aUtk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "T0By'T0ByWI&Xsn^\u0016M~l\b-Ctm";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "T0ByWE(OqgA/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "A<@vWT0ByWP(En";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    str = "T0By'T0ByWC,@ni\b";
                    z = true;
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    strArr2 = strArr3;
                    str = "T0By'T0ByWC,@ni\b,^hgU";
                    z = true;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0007aIhzH;\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "T0By'T0ByWC,@ni\b=Ewm\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "T0By'T0ByWC,@ni\b:X{|R:shmW%UE|N$Iu}S";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "T0ByWT HElB%X{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "T0By'T0ByWC,@ni\b:Utkx;Ijd^\u0016XseB&Yn";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "T0By'T0ByWC,@ni\b=Ewm\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "p\bs[Lc\u0016bU\\n\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "g:\u0002m`F=_{xWgB\u007f|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "A @\u007f(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0007>^s|N'K:|Hi";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "n\u0006ibkB9XsgIi";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    str = "\u0007'Cn(A&Ytl\u0007/Ch(P;EnaI.\u0002:iW9\f~aU,OngU0\ftgSi[haS(Nvm\u0018h\u0013;7";
                    z = true;
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    strArr2 = strArr3;
                    str = "T0By'T0ByWF%@5kH'X{kS:sy`F'K\u007flx+UE{S(Xo{";
                    z = true;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "T0By'T0ByWF%@5iA=IhWC J|WP XrWC+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "T0ByWT HEnR%@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "T0By'T0ByWF%@5kH'X{kS:sy`F'K\u007flx+UE}W-MnmC";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    str = "T0By'T0ByWF%@5";
                    z = true;
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    strArr2 = strArr3;
                    str = "T0By'T0ByWF%@5|N$I5";
                    z = true;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "T0By'T0ByWF%@5kH'X{kS:s{lC,H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "T0By'T0ByWF%@5mU;Ch";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "T0By'T0ByWF%@5kH'X{kS:sy`F'K\u007flx+UE{B;Z\u007fz";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "T0By'T0ByWF%@5jB/Chmx-E|nx>En`x-N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "T0By'T0ByWF%@5|N$I5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "T0By'T0ByWF%@5kH'X{kS:shmJ&Z\u007fl";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0007aIhzH;\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "T0By'T0ByWF%@5{S(Xo{x;Ijd^\u0016XseB&Yn";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "T0By'T0ByWF%@5{^'OEzB9@cWS A\u007fgR=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "T0By'T0ByWT B}dB\u0016OufS(On'B;^uz";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0007aIhzH;\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "T0By'T0ByWT B}dB\u0016OufS(On'T0ByWU,\\vqx=EwmH<X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "T0By'T0ByWT B}dB\u0016OufS(On'T=Mn}T\u0016^\u007fxK0snaJ,Co|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "T0By'T0ByWT B}dB\u0016OufS(On'S A\u007f'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "T0ByWT HE{N'Kvmx*Ct|F*X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "T0By'T0ByWT B}dB\u0016OufS(On'S A\u007f'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "T0By'T0ByWT B}dB\u0016OufS(On'I<@vWL,U:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0007:X{|R:Ii+\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "T0By'T=Mn}Td^\u007f{W&Bim\n*CwxK,X\u007f(B;^uz\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "T0By'T=Mn}Td^\u007f{W&Bim\n*CwxK,X\u007f'M Hi%T=Mn}T,_:eN:A{|D!\fpaC:\u000f'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0007 B~m_t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0007<_\u007fzT\u0016Ou}I=\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "T0By'U,_odSi_sl\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "T0By'T0ByWF%@5eN:_sf@\u0016^\u007f{W&Bim\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "T0By'T V\u007f(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "T0By'E<K5{^'OEnK(KEiK=IhmC\u0016[raK,siqI*ssfx9^uoU,_i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "T0By'T V\u007f(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "T0By'E<K5{^'OEnK(KEiK=IhmC\u0016[raK,siqI*ssfx9^uoU,_i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "T0By'E<K5{^'OEnK(KEiK=IhmC\u0016[raK,siqI*ssfx9^uoU,_i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "T0By'T V\u007f(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "T0By'T\"Ej'E(OqgA/\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "T0By'T\"Ej'I,XmgU\"sofF?MsdF+@\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "T0By'T\"Ej'F%^\u007fiC0ssfx9^uoU,_i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "T0By'T\"Ej'Q&EjWD(@v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "T0By'E<K5{^'OEnK(KEiK=IhmC\u0016[raK,siqI*ssfx9^uoU,_i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "T0By'T V\u007f(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "T0ByWE(OqgA/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "A<@vWT0ByWP(En";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "T0By'D&AjdB=I:{N-\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0007?Ih{N&B'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u0007>Ms|\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "T0By'B;^uz\u0007:E~5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0007+MycH/J'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u0007*C~m\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "T0ByWE(OqgA/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u0007 B~m_t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    z = strArr3;
                    f = new AtomicBoolean(false);
                    g = new ConditionVariable();
                    a = new HashMap();
                    e = new ConditionVariable();
                    i = new ConditionVariable();
                    b = new HashMap();
                    c = new AtomicLong(-1);
                    h = new AtomicLong(-1);
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u000bi^\u007f|R;Bsf@iH\u007fnF<@n(K(_n(P(En(S A\u007f";
                    z = false;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Integer r8, java.lang.String[] r9, java.lang.String[] r10) {
        /*
        r1 = d;
        if (r8 == 0) goto L_0x001e;
    L_0x0004:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 64;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r8);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x001e:
        if (r9 == 0) goto L_0x007a;
    L_0x0020:
        if (r10 == 0) goto L_0x007a;
    L_0x0022:
        r0 = r9.length;
        r2 = r10.length;
        if (r0 != r2) goto L_0x0050;
    L_0x0026:
        r0 = 0;
    L_0x0027:
        r2 = r9.length;
        if (r0 >= r2) goto L_0x004e;
    L_0x002a:
        r2 = r9[r0];
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x004a;
    L_0x0032:
        r2 = r10[r0];
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x004a;
    L_0x003a:
        r2 = b;
        r3 = r9[r0];
        r4 = new com.whatsapp.contact.l;
        r6 = 0;
        r5 = r10[r0];
        r4.<init>(r6, r5);
        r2.put(r3, r4);
    L_0x004a:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0027;
    L_0x004e:
        if (r1 == 0) goto L_0x007a;
    L_0x0050:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 65;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r9.length;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 63;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r10.length;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x007a:
        r0 = i;
        r0.open();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.i.a(java.lang.Integer, java.lang.String[], java.lang.String[]):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.content.Context r13, com.whatsapp.contact.o r14) {
        /*
        r7 = 1;
        r6 = 0;
        r8 = d;
        r10 = java.lang.System.currentTimeMillis();
        r0 = z;	 Catch:{ Exception -> 0x0053 }
        r1 = 49;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0053 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0053 }
        r0 = z;	 Catch:{ Exception -> 0x0053 }
        r1 = 44;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0053 }
        r1 = 0;
        r9 = a(r13, r0, r1);	 Catch:{ Exception -> 0x0053 }
        r0 = z;	 Catch:{ Exception -> 0x0053 }
        r1 = 41;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0053 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0053 }
        r0 = g;	 Catch:{ Exception -> 0x0053 }
        r0.close();	 Catch:{ Exception -> 0x0053 }
        r0 = z;	 Catch:{ Exception -> 0x0053 }
        r1 = 42;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0053 }
        r1 = b(r0);	 Catch:{ Exception -> 0x0053 }
        r2 = 0;
        r3 = 1;
        r4 = r9.a();	 Catch:{ Exception -> 0x0053 }
        r5 = 0;
        r0 = r14;
        r0 = com.whatsapp.App.a(r0, r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x0053 }
        if (r0 != 0) goto L_0x0088;
    L_0x0042:
        r1 = com.whatsapp.App.aQ;	 Catch:{ Exception -> 0x0053 }
        monitor-enter(r1);	 Catch:{ Exception -> 0x0053 }
        r0 = com.whatsapp.App.aa;	 Catch:{ all -> 0x0050 }
        r0 = com.whatsapp.contact.o.combine(r0, r14);	 Catch:{ all -> 0x0050 }
        com.whatsapp.App.aa = r0;	 Catch:{ all -> 0x0050 }
        monitor-exit(r1);	 Catch:{ all -> 0x0050 }
        r0 = r6;
    L_0x004f:
        return r0;
    L_0x0050:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0050 }
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        r1 = z;
        r2 = 47;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 45;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r2 = java.lang.System.currentTimeMillis();
        r2 = r2 - r10;
        r0 = r0.append(r2);
        r1 = z;
        r2 = 52;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r6;
        goto L_0x004f;
    L_0x0088:
        r0 = g;	 Catch:{ Exception -> 0x0053 }
        r2 = 64000; // 0xfa00 float:8.9683E-41 double:3.162E-319;
        r0 = r0.block(r2);	 Catch:{ Exception -> 0x0053 }
        if (r0 != 0) goto L_0x009e;
    L_0x0093:
        r0 = z;	 Catch:{ Exception -> 0x0053 }
        r1 = 54;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0053 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x0053 }
        r0 = r6;
        goto L_0x004f;
    L_0x009e:
        r0 = r9.b();	 Catch:{ Exception -> 0x0053 }
        r1 = 0;
        b(r0, r1);	 Catch:{ Exception -> 0x0053 }
        r0 = r9.j();	 Catch:{ Exception -> 0x0053 }
        r1 = 0;
        b(r0, r1);	 Catch:{ Exception -> 0x0053 }
        r1 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0053 }
        r1.<init>();	 Catch:{ Exception -> 0x0053 }
        r0 = r9.e();	 Catch:{ Exception -> 0x0053 }
        b(r0, r1);	 Catch:{ Exception -> 0x0053 }
        r0 = i;	 Catch:{ Exception -> 0x0053 }
        r0.close();	 Catch:{ Exception -> 0x0053 }
        r2 = r9.k();	 Catch:{ Exception -> 0x0053 }
        r0 = r2.length;	 Catch:{ Exception -> 0x00db }
        if (r0 <= 0) goto L_0x014d;
    L_0x00c6:
        r0 = com.whatsapp.App.a(r2);	 Catch:{ Exception -> 0x00db }
        if (r0 != 0) goto L_0x00e0;
    L_0x00cc:
        r1 = com.whatsapp.App.aQ;	 Catch:{ Exception -> 0x0053 }
        monitor-enter(r1);	 Catch:{ Exception -> 0x0053 }
        r0 = com.whatsapp.App.aa;	 Catch:{ all -> 0x00dd }
        r0 = com.whatsapp.contact.o.combine(r0, r14);	 Catch:{ all -> 0x00dd }
        com.whatsapp.App.aa = r0;	 Catch:{ all -> 0x00dd }
        monitor-exit(r1);	 Catch:{ all -> 0x00dd }
        r0 = r6;
        goto L_0x004f;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x00dd:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00dd }
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x00e0:
        r3 = new java.util.HashSet;	 Catch:{ Exception -> 0x0053 }
        r3.<init>();	 Catch:{ Exception -> 0x0053 }
        r0 = com.whatsapp.App.as;	 Catch:{ Exception -> 0x0053 }
        r0 = r0.h();	 Catch:{ Exception -> 0x0053 }
        r4 = r0.iterator();	 Catch:{ Exception -> 0x0053 }
    L_0x00ef:
        r0 = r4.hasNext();	 Catch:{ Exception -> 0x0053 }
        if (r0 == 0) goto L_0x010a;
    L_0x00f5:
        r0 = r4.next();	 Catch:{ Exception -> 0x0053 }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ Exception -> 0x0053 }
        r5 = r0.p;	 Catch:{ Exception -> 0x0147 }
        r5 = android.text.TextUtils.isEmpty(r5);	 Catch:{ Exception -> 0x0147 }
        if (r5 != 0) goto L_0x0108;
    L_0x0103:
        r0 = r0.p;	 Catch:{ Exception -> 0x0147 }
        r3.add(r0);	 Catch:{ Exception -> 0x0147 }
    L_0x0108:
        if (r8 == 0) goto L_0x00ef;
    L_0x010a:
        r4 = r2.length;	 Catch:{ Exception -> 0x0053 }
        r0 = r6;
    L_0x010c:
        if (r0 >= r4) goto L_0x0121;
    L_0x010e:
        r5 = r2[r0];	 Catch:{ Exception -> 0x0053 }
        r12 = r5.p;	 Catch:{ Exception -> 0x0149 }
        r12 = android.text.TextUtils.isEmpty(r12);	 Catch:{ Exception -> 0x0149 }
        if (r12 != 0) goto L_0x011d;
    L_0x0118:
        r5 = r5.p;	 Catch:{ Exception -> 0x0149 }
        r3.add(r5);	 Catch:{ Exception -> 0x0149 }
    L_0x011d:
        r0 = r0 + 1;
        if (r8 == 0) goto L_0x010c;
    L_0x0121:
        r0 = r3.size();	 Catch:{ Exception -> 0x0053 }
        r0 = new java.lang.String[r0];	 Catch:{ Exception -> 0x0053 }
        r0 = r3.toArray(r0);	 Catch:{ Exception -> 0x0053 }
        r0 = (java.lang.String[]) r0;	 Catch:{ Exception -> 0x0053 }
        com.whatsapp.App.a(r0);	 Catch:{ Exception -> 0x0053 }
        r0 = i;	 Catch:{ Exception -> 0x0053 }
        r2 = 64000; // 0xfa00 float:8.9683E-41 double:3.162E-319;
        r0 = r0.block(r2);	 Catch:{ Exception -> 0x0053 }
        if (r0 != 0) goto L_0x014b;
    L_0x013b:
        r0 = z;	 Catch:{ Exception -> 0x0053 }
        r1 = 53;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0053 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x0053 }
        r0 = r6;
        goto L_0x004f;
    L_0x0147:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x0149:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x014b:
        if (r8 == 0) goto L_0x0186;
    L_0x014d:
        r2 = new java.util.HashSet;	 Catch:{ Exception -> 0x0053 }
        r2.<init>();	 Catch:{ Exception -> 0x0053 }
        r0 = com.whatsapp.App.as;	 Catch:{ Exception -> 0x0053 }
        r0 = r0.h();	 Catch:{ Exception -> 0x0053 }
        r3 = r0.iterator();	 Catch:{ Exception -> 0x0053 }
    L_0x015c:
        r0 = r3.hasNext();	 Catch:{ Exception -> 0x0053 }
        if (r0 == 0) goto L_0x0177;
    L_0x0162:
        r0 = r3.next();	 Catch:{ Exception -> 0x0053 }
        r0 = (com.whatsapp.l5) r0;	 Catch:{ Exception -> 0x0053 }
        r4 = r0.p;	 Catch:{ Exception -> 0x0258 }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ Exception -> 0x0258 }
        if (r4 != 0) goto L_0x0175;
    L_0x0170:
        r0 = r0.p;	 Catch:{ Exception -> 0x0258 }
        r2.add(r0);	 Catch:{ Exception -> 0x0258 }
    L_0x0175:
        if (r8 == 0) goto L_0x015c;
    L_0x0177:
        r0 = r2.size();	 Catch:{ Exception -> 0x0053 }
        r0 = new java.lang.String[r0];	 Catch:{ Exception -> 0x0053 }
        r0 = r2.toArray(r0);	 Catch:{ Exception -> 0x0053 }
        r0 = (java.lang.String[]) r0;	 Catch:{ Exception -> 0x0053 }
        com.whatsapp.App.a(r0);	 Catch:{ Exception -> 0x0053 }
    L_0x0186:
        r0 = r9.b();	 Catch:{ Exception -> 0x0053 }
        r2 = 0;
        a(r0, r2);	 Catch:{ Exception -> 0x0053 }
        r0 = r9.j();	 Catch:{ Exception -> 0x0053 }
        r2 = 0;
        a(r0, r2);	 Catch:{ Exception -> 0x0053 }
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0053 }
        r0.<init>();	 Catch:{ Exception -> 0x0053 }
        r2 = r9.e();	 Catch:{ Exception -> 0x025a }
        a(r2, r0);	 Catch:{ Exception -> 0x025a }
        r2 = z;	 Catch:{ Exception -> 0x025a }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ Exception -> 0x025a }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x025a }
        r2 = r9.b();	 Catch:{ Exception -> 0x025a }
        r2 = r2.isEmpty();	 Catch:{ Exception -> 0x025a }
        if (r2 != 0) goto L_0x01be;
    L_0x01b5:
        r2 = com.whatsapp.App.as;	 Catch:{ Exception -> 0x025a }
        r3 = r9.b();	 Catch:{ Exception -> 0x025a }
        r2.b(r3);	 Catch:{ Exception -> 0x025a }
    L_0x01be:
        r2 = z;	 Catch:{ Exception -> 0x025c }
        r3 = 43;
        r2 = r2[r3];	 Catch:{ Exception -> 0x025c }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x025c }
        r2 = r9.j();	 Catch:{ Exception -> 0x025c }
        r2 = r2.isEmpty();	 Catch:{ Exception -> 0x025c }
        if (r2 != 0) goto L_0x01da;
    L_0x01d1:
        r2 = com.whatsapp.App.as;	 Catch:{ Exception -> 0x025c }
        r3 = r9.j();	 Catch:{ Exception -> 0x025c }
        r2.d(r3);	 Catch:{ Exception -> 0x025c }
    L_0x01da:
        r2 = z;	 Catch:{ Exception -> 0x025e }
        r3 = 48;
        r2 = r2[r3];	 Catch:{ Exception -> 0x025e }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x025e }
        r2 = r1.isEmpty();	 Catch:{ Exception -> 0x025e }
        if (r2 != 0) goto L_0x01ee;
    L_0x01e9:
        r2 = com.whatsapp.App.as;	 Catch:{ Exception -> 0x025e }
        r2.d(r1);	 Catch:{ Exception -> 0x025e }
    L_0x01ee:
        r2 = z;	 Catch:{ Exception -> 0x0260 }
        r3 = 40;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0260 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0260 }
        r2 = r0.isEmpty();	 Catch:{ Exception -> 0x0260 }
        if (r2 != 0) goto L_0x0202;
    L_0x01fd:
        r2 = com.whatsapp.App.as;	 Catch:{ Exception -> 0x0260 }
        r2.d(r0);	 Catch:{ Exception -> 0x0260 }
    L_0x0202:
        r0 = z;	 Catch:{ Exception -> 0x0262 }
        r2 = 51;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0262 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0262 }
        r0 = r9.g();	 Catch:{ Exception -> 0x0262 }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x0262 }
        if (r0 != 0) goto L_0x021e;
    L_0x0215:
        r0 = com.whatsapp.App.as;	 Catch:{ Exception -> 0x0262 }
        r2 = r9.g();	 Catch:{ Exception -> 0x0262 }
        r0.c(r2);	 Catch:{ Exception -> 0x0262 }
    L_0x021e:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0264 }
        r0.<init>();	 Catch:{ Exception -> 0x0264 }
        r2 = z;	 Catch:{ Exception -> 0x0264 }
        r3 = 50;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0264 }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x0264 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0264 }
        r2 = r2 - r10;
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x0264 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0264 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0264 }
        r0 = r9.f();	 Catch:{ Exception -> 0x0264 }
        if (r0 == 0) goto L_0x0249;
    L_0x0243:
        r0 = r1.isEmpty();	 Catch:{ Exception -> 0x0264 }
        if (r0 != 0) goto L_0x024f;
    L_0x0249:
        r0 = com.whatsapp.App.aB;	 Catch:{ Exception -> 0x0266 }
        r1 = 1;
        r0.sendEmptyMessage(r1);	 Catch:{ Exception -> 0x0266 }
    L_0x024f:
        r0 = com.whatsapp.App.i;	 Catch:{ Exception -> 0x0053 }
        r1 = 0;
        r0.sendEmptyMessage(r1);	 Catch:{ Exception -> 0x0053 }
        r0 = r7;
        goto L_0x004f;
    L_0x0258:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x025a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x025c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x025e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x0260:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x0262:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
    L_0x0264:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0266 }
    L_0x0266:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0053 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.i.a(android.content.Context, com.whatsapp.contact.o):boolean");
    }
}
