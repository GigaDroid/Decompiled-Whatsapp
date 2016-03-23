package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzw {

    public final class zza {
        private final Object zzIr;
        private final List zzael;

        private zza(Object obj) {
            this.zzIr = zzx.zzv(obj);
            this.zzael = new ArrayList();
        }

        zza(Object obj, 1 1) {
            this(obj);
        }

        public String toString() {
            boolean z = zzx.a;
            StringBuilder append = new StringBuilder(100).append(this.zzIr.getClass().getSimpleName()).append('{');
            int size = this.zzael.size();
            int i = 0;
            while (i < size) {
                append.append((String) this.zzael.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            return append.append('}').toString();
        }

        public zza zzg(String str, Object obj) {
            this.zzael.add(((String) zzx.zzv(str)) + "=" + String.valueOf(obj));
            return this;
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(Object[] objArr) {
        return Arrays.hashCode(objArr);
    }

    public static zza zzu(Object obj) {
        return new zza(obj, null);
    }
}
