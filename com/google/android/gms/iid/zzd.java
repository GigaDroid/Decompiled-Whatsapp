package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.content.ContextCompat;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.iid.zzb.zza;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class zzd {
    Context context;
    SharedPreferences zzaBs;

    public zzd(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    public zzd(Context context, String str) {
        this.context = context;
        this.zzaBs = context.getSharedPreferences(str, 4);
        zzdp(str + "-no-backup");
    }

    private void zzdp(String str) {
        File file = new File(new ContextCompat().getNoBackupFilesDir(this.context), str);
        try {
            if (!file.exists()) {
                try {
                    if (file.createNewFile() && !isEmpty()) {
                        Log.i("InstanceID/Store", "App restored, clearing state");
                        InstanceIDListenerService.zza(this.context, this);
                    }
                } catch (IOException e) {
                    throw e;
                } catch (IOException e2) {
                    throw e2;
                } catch (IOException e22) {
                    try {
                        if (Log.isLoggable("InstanceID/Store", 3)) {
                            Log.d("InstanceID/Store", "Error creating file in no backup dir: " + e22.getMessage());
                        }
                    } catch (IOException e222) {
                        throw e222;
                    }
                }
            }
        } catch (IOException e2222) {
            throw e2222;
        }
    }

    private String zzf(String str, String str2, String str3) {
        return str + "|T|" + str2 + "|" + str3;
    }

    synchronized String get(String str) {
        return this.zzaBs.getString(str, null);
    }

    synchronized String get(String str, String str2) {
        return this.zzaBs.getString(str + "|S|" + str2, null);
    }

    boolean isEmpty() {
        return this.zzaBs.getAll().isEmpty();
    }

    synchronized void zza(Editor editor, String str, String str2, String str3) {
        editor.putString(str + "|S|" + str2, str3);
    }

    public synchronized void zza(String str, String str2, String str3, String str4, String str5) {
        String zzf = zzf(str, str2, str3);
        Editor edit = this.zzaBs.edit();
        edit.putString(zzf, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    public synchronized void zzdq(String str) {
        int i = MessengerCompat.a;
        Editor edit = this.zzaBs.edit();
        for (String str2 : this.zzaBs.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        edit.commit();
    }

    public KeyPair zzdr(String str) {
        return zzdu(str);
    }

    void zzds(String str) {
        zzdq(str + "|");
    }

    public void zzdt(String str) {
        zzdq(str + "|T|");
    }

    KeyPair zzdu(String str) {
        Object e;
        String str2 = get(str, "|P|");
        String str3 = get(str, "|K|");
        if (str3 == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str2, 8);
            byte[] decode2 = Base64.decode(str3, 8);
            KeyFactory instance = KeyFactory.getInstance("RSA");
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
        } catch (InvalidKeySpecException e2) {
            e = e2;
            Log.w("InstanceID/Store", "Invalid key stored " + e);
            InstanceIDListenerService.zza(this.context, this);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            Log.w("InstanceID/Store", "Invalid key stored " + e);
            InstanceIDListenerService.zza(this.context, this);
            return null;
        }
    }

    synchronized KeyPair zze(String str, long j) {
        KeyPair zzvx;
        int i = MessengerCompat.a;
        zzvx = zza.zzvx();
        Editor edit = this.zzaBs.edit();
        zza(edit, str, "|P|", InstanceID.zzm(zzvx.getPublic().getEncoded()));
        zza(edit, str, "|K|", InstanceID.zzm(zzvx.getPrivate().getEncoded()));
        zza(edit, str, "cre", Long.toString(j));
        edit.commit();
        if (zza.a) {
            MessengerCompat.a = i + 1;
        }
        return zzvx;
    }

    public synchronized String zzg(String str, String str2, String str3) {
        return this.zzaBs.getString(zzf(str, str2, str3), null);
    }

    public synchronized void zzvF() {
        this.zzaBs.edit().clear().commit();
    }
}
