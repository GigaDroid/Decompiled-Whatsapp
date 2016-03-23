package com.google.android.gms.internal;

public abstract class zzkq {
    public static boolean a;
    private static zza zzaaX;
    private static int zzaaY;
    private static String zzaaZ;
    private static final Object zzpm;
    private Object zzNR;
    protected final String zztP;
    protected final Object zztQ;

    final class 2 extends zzkq {
        2(String str, Long l) {
            super(str, l);
        }

        protected Object zzbX(String str) {
            return zzbZ(str);
        }

        protected Long zzbZ(String str) {
            return zzkq.zznO().getLong(this.zztP, (Long) this.zztQ);
        }
    }

    final class 3 extends zzkq {
        3(String str, Integer num) {
            super(str, num);
        }

        protected Object zzbX(String str) {
            return zzca(str);
        }

        protected Integer zzca(String str) {
            return zzkq.zznO().zzb(this.zztP, (Integer) this.zztQ);
        }
    }

    final class 5 extends zzkq {
        5(String str, String str2) {
            super(str, str2);
        }

        protected Object zzbX(String str) {
            return zzcc(str);
        }

        protected String zzcc(String str) {
            return zzkq.zznO().getString(this.zztP, (String) this.zztQ);
        }
    }

    interface zza {
        Long getLong(String str, Long l);

        String getString(String str, String str2);

        Integer zzb(String str, Integer num);
    }

    static {
        zzpm = new Object();
        zzaaX = null;
        zzaaY = 0;
        zzaaZ = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    }

    protected zzkq(String str, Object obj) {
        this.zzNR = null;
        this.zztP = str;
        this.zztQ = obj;
    }

    public static boolean isInitialized() {
        return zzaaX != null;
    }

    public static zzkq zza(String str, Integer num) {
        return new 3(str, num);
    }

    public static zzkq zza(String str, Long l) {
        return new 2(str, l);
    }

    public static int zznM() {
        return zzaaY;
    }

    static zza zznO() {
        return zzaaX;
    }

    public static zzkq zzu(String str, String str2) {
        return new 5(str, str2);
    }

    public final Object get() {
        return this.zzNR != null ? this.zzNR : zzbX(this.zztP);
    }

    protected abstract Object zzbX(String str);
}
