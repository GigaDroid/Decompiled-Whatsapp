package com.whatsapp;

import android.backport.util.Base64;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public final class aoy {
    private static final int[] c;
    private static final String[] z;
    private Map a;
    private final String b;
    private String d;

    public Set g() {
        boolean z = DialogToastActivity.f;
        Set hashSet = new HashSet();
        for (Entry entry : this.a.entrySet()) {
            try {
                if (!((adl) entry.getValue()).a) {
                    if (((adl) entry.getValue()).a()) {
                        continue;
                    } else {
                        hashSet.add(entry.getKey());
                        continue;
                    }
                }
                if (z) {
                    break;
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        return hashSet;
    }

    public boolean a(Hashtable hashtable, boolean z) {
        boolean z2 = DialogToastActivity.f;
        Vector vector = new Vector();
        for (String str : hashtable.keySet()) {
            try {
                if (!this.a.containsKey(str)) {
                    Log.i(z[6] + str);
                    vector.add(str);
                }
                a(str, z[5].equals(hashtable.get(str)), false);
                if (z2) {
                    break;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        Vector vector2 = new Vector();
        for (String str2 : this.a.keySet()) {
            try {
                if (!hashtable.containsKey(str2)) {
                    Log.i(z[7] + str2);
                    vector2.add(str2);
                    continue;
                }
                if (z2) {
                    break;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        Iterator it = vector2.iterator();
        while (it.hasNext()) {
            b((String) it.next());
            if (z2) {
                break;
            }
        }
        if (z) {
            ArrayList d = d();
            try {
                if (!vector.isEmpty()) {
                    String str3;
                    String str4 = this.b;
                    if (d.size() == 1) {
                        str3 = ((adl) d.get(0)).e;
                    } else {
                        str3 = null;
                    }
                    qm.a(1, qm.a(12, null, str4, str3, vector, this));
                }
                try {
                    if (!vector2.isEmpty()) {
                        qm.a(1, qm.a(13, null, this.b, null, vector2, null));
                    }
                } catch (RuntimeException e22) {
                    throw e22;
                }
            } catch (RuntimeException e222) {
                throw e222;
            } catch (RuntimeException e2222) {
                throw e2222;
            }
        }
        App.aK.a(Collections.singletonList(this));
        try {
            boolean z3;
            if (vector.isEmpty()) {
                if (vector2.isEmpty()) {
                    z3 = false;
                    if (z3) {
                        try {
                            e();
                        } catch (RuntimeException e22222) {
                            throw e22222;
                        }
                    }
                    return z3;
                }
            }
            z3 = true;
            if (z3) {
                e();
            }
            return z3;
        } catch (RuntimeException e222222) {
            throw e222222;
        } catch (RuntimeException e2222222) {
            throw e2222222;
        }
    }

    public adl b(String str) {
        adl com_whatsapp_adl = (adl) this.a.remove(str);
        if (com_whatsapp_adl != null) {
            try {
                e();
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return com_whatsapp_adl;
    }

    private void a(boolean z) {
        boolean z2 = DialogToastActivity.f;
        for (Entry value : this.a.entrySet()) {
            ((adl) value.getValue()).a = z;
            if (z2) {
                break;
            }
        }
        App.aK.a(Collections.singletonList(this));
        h.b().a(new f(h()));
    }

    public boolean c(String str) {
        adl a = a(str);
        if (a != null) {
            try {
                if (a.d) {
                    return true;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return false;
    }

    static {
        String[] strArr = new String[8];
        String str = "w.";
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
                        i3 = 20;
                        break;
                    case at.i /*2*/:
                        i3 = 7;
                        break;
                    case at.o /*3*/:
                        i3 = 69;
                        break;
                    default:
                        i3 = 87;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0001fh0'\u0016uu1>%}w$92g|\"%)aw\u000f>\") ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "j4w$%2}d,''zs\r65|:b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "j4w$%2}d,''zs6j";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "'pj,9";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "!fh0'+suj$?zdh6\"p*564`n&>6ui1m";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "!fh0'+suj$?zdh%#yh32kdf7#/wn56(`=";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new int[]{-4929717, -8154166, -36820, -11617349, -2116080, -14714132, -1011271, -16605952, -8885824, -4946066, -99201, -10890392, -22150, -8544527, -3603591, -6036789, -5881812, -1752413, -6197331, -1094833};
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0015\\Ft";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String a() {
        return this.d;
    }

    @NonNull
    public Set l() {
        return this.a.keySet();
    }

    public void j() {
        a(true);
    }

    public String toString() {
        return z[2] + this.b + '\'' + z[4] + this.a + z[3] + this.d + '\'' + '}';
    }

    @NonNull
    public Collection c() {
        return this.a.values();
    }

    public boolean f() {
        boolean z = DialogToastActivity.f;
        for (adl a : this.a.values()) {
            try {
                if (!a.a()) {
                    if (z) {
                        break;
                    }
                }
                return true;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return false;
    }

    public ArrayList d() {
        boolean z = DialogToastActivity.f;
        ArrayList arrayList = new ArrayList();
        for (adl com_whatsapp_adl : this.a.values()) {
            try {
                if (com_whatsapp_adl.d) {
                    arrayList.add(com_whatsapp_adl);
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return arrayList;
    }

    public adl a(String str, boolean z, boolean z2) {
        adl com_whatsapp_adl = (adl) this.a.get(str);
        if (com_whatsapp_adl != null) {
            try {
                com_whatsapp_adl.d = z;
                com_whatsapp_adl.b = z2;
                if (!DialogToastActivity.f) {
                    return com_whatsapp_adl;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        com_whatsapp_adl = new adl(str, z, z2, false);
        com_whatsapp_adl.c = c[this.a.size() % c.length];
        this.a.put(str, com_whatsapp_adl);
        e();
        return com_whatsapp_adl;
    }

    @Nullable
    public adl a(@NonNull String str) {
        return (adl) this.a.get(str);
    }

    @NonNull
    public String h() {
        return this.b;
    }

    public boolean m() {
        boolean z = DialogToastActivity.f;
        for (adl com_whatsapp_adl : this.a.values()) {
            try {
                if (!com_whatsapp_adl.a()) {
                    if (z) {
                        break;
                    }
                }
                return com_whatsapp_adl.d;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return false;
    }

    public int b() {
        return this.a.size();
    }

    public static String a(Collection collection) {
        boolean z = DialogToastActivity.f;
        List<String> arrayList = new ArrayList(collection);
        Collections.sort(arrayList);
        try {
            MessageDigest instance = MessageDigest.getInstance(z[1]);
            for (String bytes : arrayList) {
                instance.update(bytes.getBytes());
                if (z) {
                    break;
                }
            }
            Object obj = new byte[6];
            System.arraycopy(instance.digest(), 0, obj, 0, obj.length);
            return z[0] + Base64.encodeToString(obj, 2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public aoy(@NonNull String str) {
        this.a = new ConcurrentHashMap();
        this.b = (String) auv.a((Object) str);
    }

    private void e() {
        this.d = a(l());
    }

    public void i() {
        boolean z = DialogToastActivity.f;
        this.a = App.aK.N(this.b);
        e();
        int i = 0;
        for (adl com_whatsapp_adl : this.a.values()) {
            com_whatsapp_adl.c = c[i % c.length];
            int i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    public void k() {
        a(false);
    }
}
