package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.signin.zze;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzf {
    private final Account zzOY;
    private final String zzQl;
    private final Set zzYY;
    private final int zzYZ;
    private final View zzZa;
    private final String zzZb;
    private final Set zzadc;
    private final Map zzadd;
    private final zze zzade;
    private Integer zzadf;

    public final class zza {
        public final Set zzZp;
        public final boolean zzadg;
    }

    public zzf(Account account, Set set, Map map, int i, View view, String str, String str2, zze com_google_android_gms_signin_zze) {
        boolean z = zzx.a;
        this.zzOY = account;
        this.zzYY = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.zzadd = map;
        this.zzZa = view;
        this.zzYZ = i;
        this.zzQl = str;
        this.zzZb = str2;
        this.zzade = com_google_android_gms_signin_zze;
        Set hashSet = new HashSet(this.zzYY);
        for (zza com_google_android_gms_common_internal_zzf_zza : this.zzadd.values()) {
            hashSet.addAll(com_google_android_gms_common_internal_zzf_zza.zzZp);
            if (z) {
                break;
            }
        }
        this.zzadc = Collections.unmodifiableSet(hashSet);
    }

    public Account getAccount() {
        return this.zzOY;
    }

    @Deprecated
    public String getAccountName() {
        return this.zzOY != null ? this.zzOY.name : null;
    }

    public void zza(Integer num) {
        this.zzadf = num;
    }

    public Account zzog() {
        return this.zzOY != null ? this.zzOY : new Account("<<default account>>", "com.google");
    }

    public Set zzoi() {
        return this.zzYY;
    }

    public Set zzoj() {
        return this.zzadc;
    }

    public Map zzok() {
        return this.zzadd;
    }

    public String zzol() {
        return this.zzQl;
    }

    public String zzom() {
        return this.zzZb;
    }

    public zze zzoo() {
        return this.zzade;
    }

    public Integer zzop() {
        return this.zzadf;
    }
}
