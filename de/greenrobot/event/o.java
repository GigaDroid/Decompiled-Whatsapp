package de.greenrobot.event;

import android.util.Log;
import com.whatsapp.arj;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class o {
    private static final Map a;
    private static final String[] z;
    private final Map b;

    o(List list) {
        this.b = new ConcurrentHashMap();
        if (list != null) {
            for (Class cls : list) {
                this.b.put(cls, cls);
            }
        }
    }

    List a(Class cls) {
        String name = cls.getName();
        synchronized (a) {
            List list = (List) a.get(name);
        }
        if (list != null) {
            return list;
        }
        List arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        Class cls2 = cls;
        while (cls2 != null) {
            String name2 = cls2.getName();
            try {
                if (!(name2.startsWith(z[8]) || name2.startsWith(z[5]))) {
                    if (!name2.startsWith(z[11])) {
                        for (Method method : cls2.getDeclaredMethods()) {
                            String name3 = method.getName();
                            if (name3.startsWith(z[0])) {
                                int modifiers = method.getModifiers();
                                if ((modifiers & 1) == 0 || (modifiers & 5192) != 0) {
                                    try {
                                        if (!this.b.containsKey(cls2)) {
                                            Log.d(h.q, z[12] + cls2 + "." + name3);
                                        }
                                    } catch (q e) {
                                        throw e;
                                    }
                                }
                                Class[] parameterTypes = method.getParameterTypes();
                                if (parameterTypes.length == 1) {
                                    n nVar;
                                    name2 = name3.substring(z[3].length());
                                    if (name2.length() == 0) {
                                        nVar = n.PostThread;
                                    } else if (name2.equals(z[10])) {
                                        nVar = n.MainThread;
                                    } else if (name2.equals(z[7])) {
                                        nVar = n.BackgroundThread;
                                    } else if (name2.equals(z[2])) {
                                        nVar = n.Async;
                                    } else {
                                        try {
                                            if (!this.b.containsKey(cls2)) {
                                                throw new q(z[1] + method);
                                            }
                                        } catch (q e2) {
                                            throw e2;
                                        }
                                    }
                                    Class cls3 = parameterTypes[0];
                                    stringBuilder.setLength(0);
                                    stringBuilder.append(name3);
                                    stringBuilder.append('>').append(cls3.getName());
                                    try {
                                        if (hashSet.add(stringBuilder.toString())) {
                                            arrayList.add(new g(method, nVar, cls3));
                                        }
                                    } catch (q e22) {
                                        throw e22;
                                    }
                                }
                                continue;
                            }
                        }
                        cls2 = cls2.getSuperclass();
                    }
                }
            } catch (q e222) {
                throw e222;
            } catch (q e2222) {
                try {
                    throw e2222;
                } catch (q e22222) {
                    throw e22222;
                }
            }
        }
        try {
            break;
            if (arrayList.isEmpty()) {
                throw new q(z[4] + cls + z[9] + z[6]);
            }
            synchronized (a) {
                a.put(name, arrayList);
            }
            return arrayList;
        } catch (q e222222) {
            throw e222222;
        }
    }

    static {
        String[] strArr = new String[13];
        String str = "\n\u0003-qr\u000b\u0019";
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
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 7;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "$\u001e\u0011it";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\n\u0003-qr\u000b\u0019";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "6\u0018\ntt\u0017\u0004\nbeE";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u000f\f\u001efoK";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\n\u0003-qr\u000b\u0019";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = "'\f\u000blp\u0017\u0002\u001dis1\u0005\u001abv\u0001";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "\u000f\f\u001ef9";
                    obj = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "E\u0005\tt7\u000b\u0002Hwb\u0007\u0001\u0001d7\b\b\u001cox\u0001\u001eHdv\t\u0001\rc7";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "(\f\u0001iC\r\u001f\rfs";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0004\u0003\fux\f\tF";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "6\u0006\u0001wg\f\u0003\u000f'z\u0000\u0019\u0000hsEE\u0006hcE\u001d\u001de{\f\u000eD'd\u0011\f\u001cntE\u0002\u001a'v\u0007\u001e\u001cuv\u0006\u0019A=7";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new HashMap();
                    return;
                default:
                    strArr2[i] = str;
                    str = ",\u0001\u0004bp\u0004\u0001Hhy \u001b\ricE\u0000\rs\u007f\n\tD't\r\b\u000bl7\u0003\u0002\u001a'c\u001c\u001d\u0007t-E";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
