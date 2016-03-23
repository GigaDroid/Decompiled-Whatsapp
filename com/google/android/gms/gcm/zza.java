package com.google.android.gms.gcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;

class zza {
    static zza zzazH;
    private Context mContext;

    class zza extends IllegalArgumentException {
        final zza zzazI;

        private zza(zza com_google_android_gms_gcm_zza, String str) {
            this.zzazI = com_google_android_gms_gcm_zza;
            super(str);
        }

        zza(zza com_google_android_gms_gcm_zza, String str, 1 1) {
            this(com_google_android_gms_gcm_zza, str);
        }
    }

    private zza(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void zza(String str, Notification notification) {
        try {
            if (Log.isLoggable("GcmNotification", 3)) {
                Log.d("GcmNotification", "Showing notification");
            }
            NotificationManager notificationManager = (NotificationManager) this.mContext.getSystemService("notification");
            if (TextUtils.isEmpty(str)) {
                str = "GCM-Notification:" + SystemClock.uptimeMillis();
            }
            notificationManager.notify(str, 0, notification);
        } catch (zza e) {
            throw e;
        }
    }

    static synchronized zza zzay(Context context) {
        zza com_google_android_gms_gcm_zza;
        synchronized (zza.class) {
            try {
                if (zzazH == null) {
                    zzazH = new zza(context);
                }
                com_google_android_gms_gcm_zza = zzazH;
            } catch (zza e) {
                throw e;
            }
        }
        return com_google_android_gms_gcm_zza;
    }

    static String zzb(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String zzc(android.os.Bundle r10, java.lang.String r11) {
        /*
        r9 = this;
        r1 = 0;
        r2 = com.google.android.gms.gcm.zzb.zza.a;
        r0 = zzb(r10, r11);
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x000e }
        if (r3 != 0) goto L_0x0010;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r11);
        r3 = "_loc_key";
        r0 = r0.append(r3);
        r0 = r0.toString();
        r3 = zzb(r10, r0);
        r0 = android.text.TextUtils.isEmpty(r3);	 Catch:{ JSONException -> 0x0030 }
        if (r0 == 0) goto L_0x0032;
    L_0x002e:
        r0 = r1;
        goto L_0x000d;
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = r9.mContext;
        r4 = r0.getResources();
        r0 = "string";
        r5 = r9.mContext;
        r5 = r5.getPackageName();
        r5 = r4.getIdentifier(r3, r0, r5);
        if (r5 != 0) goto L_0x0080;
    L_0x0047:
        r0 = new com.google.android.gms.gcm.zza$zza;	 Catch:{ JSONException -> 0x007e }
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x007e }
        r1.<init>();	 Catch:{ JSONException -> 0x007e }
        r2 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x007e }
        r2.<init>();	 Catch:{ JSONException -> 0x007e }
        r2 = r2.append(r11);	 Catch:{ JSONException -> 0x007e }
        r4 = "_loc_key";
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x007e }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x007e }
        r2 = r9.zzdk(r2);	 Catch:{ JSONException -> 0x007e }
        r1 = r1.append(r2);	 Catch:{ JSONException -> 0x007e }
        r2 = " resource not found: ";
        r1 = r1.append(r2);	 Catch:{ JSONException -> 0x007e }
        r1 = r1.append(r3);	 Catch:{ JSONException -> 0x007e }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x007e }
        r2 = 0;
        r0.<init>(r9, r1, r2);	 Catch:{ JSONException -> 0x007e }
        throw r0;	 Catch:{ JSONException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r11);
        r6 = "_loc_args";
        r0 = r0.append(r6);
        r0 = r0.toString();
        r0 = zzb(r10, r0);
        r6 = android.text.TextUtils.isEmpty(r0);	 Catch:{ JSONException -> 0x00a4 }
        if (r6 == 0) goto L_0x00a6;
    L_0x009e:
        r0 = r4.getString(r5);	 Catch:{ JSONException -> 0x00a4 }
        goto L_0x000d;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r6 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x00c5 }
        r6.<init>(r0);	 Catch:{ JSONException -> 0x00c5 }
        r0 = r6.length();
        r7 = new java.lang.String[r0];
        r0 = 0;
    L_0x00b2:
        r8 = r7.length;
        if (r0 >= r8) goto L_0x00bf;
    L_0x00b5:
        r8 = r6.opt(r0);
        r7[r0] = r8;
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x00b2;
    L_0x00bf:
        r0 = r4.getString(r5, r7);	 Catch:{ MissingFormatArgumentException -> 0x0103 }
        goto L_0x000d;
    L_0x00c5:
        r2 = move-exception;
        r2 = new com.google.android.gms.gcm.zza$zza;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Malformed ";
        r3 = r3.append(r4);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4 = r4.append(r11);
        r5 = "_loc_args";
        r4 = r4.append(r5);
        r4 = r4.toString();
        r4 = r9.zzdk(r4);
        r3 = r3.append(r4);
        r4 = ": ";
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r0 = r0.toString();
        r2.<init>(r9, r0, r1);
        throw r2;
    L_0x0103:
        r0 = move-exception;
        r2 = new com.google.android.gms.gcm.zza$zza;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Missing format argument for ";
        r4 = r4.append(r5);
        r3 = r4.append(r3);
        r4 = ": ";
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r0 = r0.toString();
        r2.<init>(r9, r0, r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.zza.zzc(android.os.Bundle, java.lang.String):java.lang.String");
    }

    private String zzdk(String str) {
        return str.substring("gcm.n.".length());
    }

    private int zzdl(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                throw new zza(this, "Missing icon", null);
            }
            Resources resources = this.mContext.getResources();
            int identifier = resources.getIdentifier(str, "drawable", this.mContext.getPackageName());
            if (identifier == 0) {
                identifier = resources.getIdentifier(str, "mipmap", this.mContext.getPackageName());
                if (identifier == 0) {
                    throw new zza(this, "Icon resource not found: " + str, null);
                }
            }
            return identifier;
        } catch (zza e) {
            throw e;
        }
    }

    private Uri zzdm(String str) {
        Uri uri = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    if ("default".equals(str)) {
                        uri = RingtoneManager.getDefaultUri(2);
                    } else {
                        throw new zza(this, "Invalid sound: " + str, null);
                    }
                } catch (zza e) {
                    throw e;
                }
            }
            return uri;
        } catch (zza e2) {
            throw e2;
        }
    }

    static boolean zzu(Bundle bundle) {
        try {
            return zzb(bundle, "gcm.n.icon") != null;
        } catch (zza e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.app.Notification zzw(android.os.Bundle r11) {
        /*
        r10 = this;
        r9 = 0;
        r2 = com.google.android.gms.gcm.zzb.zza.a;
        r0 = "gcm.n.title";
        r3 = r10.zzc(r11, r0);
        r0 = android.text.TextUtils.isEmpty(r3);	 Catch:{ zza -> 0x001a }
        if (r0 == 0) goto L_0x001c;
    L_0x0010:
        r0 = new com.google.android.gms.gcm.zza$zza;	 Catch:{ zza -> 0x001a }
        r1 = "Missing title";
        r2 = 0;
        r0.<init>(r10, r1, r2);	 Catch:{ zza -> 0x001a }
        throw r0;	 Catch:{ zza -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r0 = "gcm.n.body";
        r4 = r10.zzc(r11, r0);
        r0 = "gcm.n.icon";
        r0 = zzb(r11, r0);
        r5 = r10.zzdl(r0);
        r0 = "gcm.n.sound";
        r0 = zzb(r11, r0);
        r6 = r10.zzdm(r0);
        r0 = r10.zzx(r11);
        r1 = android.os.Build.VERSION.SDK_INT;
        r7 = 11;
        if (r1 < r7) goto L_0x0091;
    L_0x0043:
        r1 = new android.app.Notification$Builder;
        r7 = r10.mContext;
        r1.<init>(r7);
        r7 = 1;
        r1 = r1.setAutoCancel(r7);
        r1 = r1.setSmallIcon(r5);
        r1 = r1.setContentTitle(r3);
        r7 = r1.setContentText(r4);
        r1 = android.os.Build.VERSION.SDK_INT;
        r8 = 21;
        if (r1 < r8) goto L_0x0075;
    L_0x0061:
        r1 = "gcm.n.color";
        r1 = zzb(r11, r1);
        r8 = android.text.TextUtils.isEmpty(r1);	 Catch:{ zza -> 0x00bc }
        if (r8 != 0) goto L_0x0075;
    L_0x006e:
        r1 = android.graphics.Color.parseColor(r1);	 Catch:{ zza -> 0x00bc }
        r7.setColor(r1);	 Catch:{ zza -> 0x00bc }
    L_0x0075:
        if (r6 == 0) goto L_0x007a;
    L_0x0077:
        r7.setSound(r6);	 Catch:{ zza -> 0x00be }
    L_0x007a:
        if (r0 == 0) goto L_0x007f;
    L_0x007c:
        r7.setContentIntent(r0);	 Catch:{ zza -> 0x00c0 }
    L_0x007f:
        r1 = android.os.Build.VERSION.SDK_INT;
        r8 = 16;
        if (r1 < r8) goto L_0x008b;
    L_0x0085:
        r1 = r7.build();
        if (r2 == 0) goto L_0x008f;
    L_0x008b:
        r1 = r7.getNotification();
    L_0x008f:
        if (r2 == 0) goto L_0x00c4;
    L_0x0091:
        r1 = new android.app.Notification;
        r1.<init>();
        r2 = r1.flags;	 Catch:{ zza -> 0x00c2 }
        r2 = r2 | 16;
        r1.flags = r2;	 Catch:{ zza -> 0x00c2 }
        r1.icon = r5;	 Catch:{ zza -> 0x00c2 }
        if (r6 == 0) goto L_0x00a2;
    L_0x00a0:
        r1.sound = r6;	 Catch:{ zza -> 0x00c2 }
    L_0x00a2:
        if (r0 != 0) goto L_0x00b5;
    L_0x00a4:
        r0 = new android.content.Intent;
        r0.<init>();
        r2 = "com.google.example.invalidpackage";
        r0.setPackage(r2);
        r2 = r10.mContext;
        r0 = android.app.PendingIntent.getBroadcast(r2, r9, r0, r9);
    L_0x00b5:
        r2 = r10.mContext;
        r1.setLatestEventInfo(r2, r3, r4, r0);
        r0 = r1;
    L_0x00bb:
        return r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = r1;
        goto L_0x00bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.zza.zzw(android.os.Bundle):android.app.Notification");
    }

    private PendingIntent zzx(Bundle bundle) {
        boolean z = com.google.android.gms.gcm.zzb.zza.a;
        Object zzb = zzb(bundle, "gcm.n.click_action");
        try {
            if (TextUtils.isEmpty(zzb)) {
                return null;
            }
            Intent intent = new Intent(zzb);
            intent.setPackage(this.mContext.getPackageName());
            intent.setFlags(268435456);
            intent.putExtras(bundle);
            for (String str : bundle.keySet()) {
                try {
                    if (!str.startsWith("gcm.n.")) {
                        if (!str.startsWith("gcm.notification.")) {
                            continue;
                            if (z) {
                                break;
                            }
                        }
                    }
                    intent.removeExtra(str);
                    continue;
                    if (z) {
                        break;
                    }
                } catch (zza e) {
                    throw e;
                } catch (zza e2) {
                    throw e2;
                }
            }
            return PendingIntent.getActivity(this.mContext, 0, intent, 1073741824);
        } catch (zza e22) {
            throw e22;
        }
    }

    boolean zzv(Bundle bundle) {
        try {
            zza(zzb(bundle, "gcm.n.tag"), zzw(bundle));
            return true;
        } catch (zza e) {
            Log.w("GcmNotification", "Failed to show notification: " + e.getMessage());
            return false;
        }
    }
}
