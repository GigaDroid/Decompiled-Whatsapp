package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.HashMap;

public final class DataHolder implements SafeParcelable {
    public static final zze CREATOR;
    public static boolean a;
    private static final zza zzabs;
    boolean mClosed;
    private final int mVersionCode;
    private final int zzWu;
    private final String[] zzabk;
    Bundle zzabl;
    private final CursorWindow[] zzabm;
    private final Bundle zzabn;
    int[] zzabo;
    int zzabp;
    private Object zzabq;
    private boolean zzabr;

    public class zza {
        private final String[] zzabk;
        private final ArrayList zzabt;
        private final String zzabu;
        private final HashMap zzabv;
        private boolean zzabw;
        private String zzabx;

        private zza(String[] strArr, String str) {
            this.zzabk = (String[]) zzx.zzv(strArr);
            this.zzabt = new ArrayList();
            this.zzabu = str;
            this.zzabv = new HashMap();
            this.zzabw = false;
            this.zzabx = null;
        }

        zza(String[] strArr, String str, 1 1) {
            this(strArr, str);
        }
    }

    final class 1 extends zza {
        1(String[] strArr, String str) {
            super(strArr, str, null);
        }
    }

    public class zzb extends RuntimeException {
        public zzb(String str) {
            super(str);
        }
    }

    static {
        CREATOR = new zze();
        zzabs = new 1(new String[0], null);
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.zzabr = true;
        this.mVersionCode = i;
        this.zzabk = strArr;
        this.zzabm = cursorWindowArr;
        this.zzWu = i2;
        this.zzabn = bundle;
    }

    private void zzh(String str, int i) {
        try {
            if (this.zzabl != null) {
                if (this.zzabl.containsKey(str)) {
                    try {
                        if (isClosed()) {
                            throw new IllegalArgumentException("Buffer is closed.");
                        }
                        if (i >= 0) {
                            try {
                                if (i < this.zzabp) {
                                    return;
                                }
                            } catch (CursorIndexOutOfBoundsException e) {
                                throw e;
                            }
                        }
                        throw new CursorIndexOutOfBoundsException(i, this.zzabp);
                    } catch (CursorIndexOutOfBoundsException e2) {
                        throw e2;
                    }
                }
            }
            throw new IllegalArgumentException("No such column: " + str);
        } catch (CursorIndexOutOfBoundsException e22) {
            throw e22;
        } catch (CursorIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    public void close() {
        boolean z = a;
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                int i = 0;
                while (i < this.zzabm.length) {
                    this.zzabm[i].close();
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    protected void finalize() {
        try {
            if (this.zzabr && this.zzabm.length > 0) {
                if (!isClosed()) {
                    String str;
                    try {
                        if (this.zzabq == null) {
                            try {
                                str = "internal object: " + toString();
                            } catch (CursorIndexOutOfBoundsException e) {
                                throw e;
                            }
                        } else {
                            str = this.zzabq.toString();
                        }
                    } catch (CursorIndexOutOfBoundsException e2) {
                        throw e2;
                    }
                    try {
                        Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (" + str + ")");
                        close();
                    } catch (Throwable th) {
                        super.finalize();
                    }
                }
            }
            super.finalize();
        } catch (CursorIndexOutOfBoundsException e22) {
            throw e22;
        } catch (CursorIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    public int getCount() {
        return this.zzabp;
    }

    public int getStatusCode() {
        return this.zzWu;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    public int zzbo(int i) {
        boolean z;
        int i2;
        int i3 = 0;
        boolean z2 = a;
        if (i >= 0) {
            try {
                if (i < this.zzabp) {
                    z = true;
                    zzx.zzY(z);
                    while (i3 < this.zzabo.length) {
                        try {
                            if (i < this.zzabo[i3]) {
                                i3--;
                                if (!z2) {
                                    break;
                                }
                            }
                            i3++;
                            if (z2) {
                                i2 = i3;
                                break;
                            }
                        } catch (CursorIndexOutOfBoundsException e) {
                            throw e;
                        } catch (CursorIndexOutOfBoundsException e2) {
                            throw e2;
                        }
                    }
                    i2 = i3;
                    return i2 != this.zzabo.length ? i2 - 1 : i2;
                }
            } catch (CursorIndexOutOfBoundsException e22) {
                throw e22;
            }
        }
        z = false;
        zzx.zzY(z);
        while (i3 < this.zzabo.length) {
            if (i < this.zzabo[i3]) {
                i3--;
                if (z2) {
                    break;
                    i2 = i3;
                    if (i2 != this.zzabo.length) {
                    }
                }
            }
            i3++;
            if (z2) {
                i2 = i3;
                break;
                if (i2 != this.zzabo.length) {
                }
            }
        }
        i2 = i3;
        try {
            if (i2 != this.zzabo.length) {
            }
        } catch (CursorIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    public int zzc(String str, int i, int i2) {
        zzh(str, i);
        return this.zzabm[i2].getInt(i, this.zzabl.getInt(str));
    }

    public String zzd(String str, int i, int i2) {
        zzh(str, i);
        return this.zzabm[i2].getString(i, this.zzabl.getInt(str));
    }

    public byte[] zzg(String str, int i, int i2) {
        zzh(str, i);
        return this.zzabm[i2].getBlob(i, this.zzabl.getInt(str));
    }

    public Bundle zznP() {
        return this.zzabn;
    }

    public void zznT() {
        int i = 0;
        boolean z = a;
        this.zzabl = new Bundle();
        int i2 = 0;
        while (i2 < this.zzabk.length) {
            this.zzabl.putInt(this.zzabk[i2], i2);
            i2++;
            if (z) {
                break;
            }
        }
        this.zzabo = new int[this.zzabm.length];
        i2 = 0;
        while (i < this.zzabm.length) {
            this.zzabo[i] = i2;
            i2 += this.zzabm[i].getNumRows() - (i2 - this.zzabm[i].getStartPosition());
            i++;
            if (z) {
                break;
            }
        }
        this.zzabp = i2;
    }

    String[] zznU() {
        return this.zzabk;
    }

    CursorWindow[] zznV() {
        return this.zzabm;
    }

    public void zzq(Object obj) {
        this.zzabq = obj;
    }
}
