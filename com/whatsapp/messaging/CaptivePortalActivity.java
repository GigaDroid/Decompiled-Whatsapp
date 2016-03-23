package com.whatsapp.messaging;

import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.support.annotation.NonNull;
import com.whatsapp.App;
import com.whatsapp.WAActivity;
import com.whatsapp.awx;
import com.whatsapp.azx;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.v;
import org.whispersystems.at;

public class CaptivePortalActivity extends WAActivity {
    private static aj a;
    private static final String[] z;

    public static String a(WifiInfo wifiInfo) {
        if (wifiInfo == null) {
            return null;
        }
        String ssid = wifiInfo.getSSID();
        if (ssid == null || ssid.length() < 2) {
            return ssid;
        }
        if (ssid.startsWith("\"") || ssid.startsWith("'")) {
            return (ssid.endsWith("\"") || ssid.endsWith("'")) ? ssid.substring(1, ssid.length() - 1) : ssid;
        } else {
            return ssid;
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "8\u0002\b\ru-\u0006X\ts)\u0017\u0019\u0015<:\u0000\f\u0010j2\u0017\u0001Y\u007f)\u0006\u0019\ry?C\u001e\u0016n{";
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
                        i3 = 91;
                        break;
                    case at.g /*1*/:
                        i3 = 99;
                        break;
                    case at.i /*2*/:
                        i3 = 120;
                        break;
                    case at.o /*3*/:
                        i3 = 121;
                        break;
                    default:
                        i3 = 28;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "8\u0002\b\ru-\u0006X\ts)\u0017\u0019\u0015&{";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "8\u0002\b\ru-\u0006X\ts)\u0017\u0019\u0015";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new aj(null);
                    return;
                default:
                    strArr2[i] = str;
                    str = ",\n\u001e\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onResume() {
        super.onResume();
        awx.a.sendEmptyMessageDelayed(1, 3000);
    }

    public static boolean a(@NonNull NetworkInfo networkInfo) {
        Throwable th;
        try {
            if (networkInfo.getType() != 1) {
                return false;
            }
            HttpURLConnection httpURLConnection = null;
            HttpURLConnection httpURLConnection2;
            try {
                httpURLConnection2 = (HttpURLConnection) new URL(azx.c).openConnection();
                try {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setConnectTimeout(10000);
                    httpURLConnection2.setReadTimeout(10000);
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.getInputStream();
                    if (httpURLConnection2.getResponseCode() == 204) {
                        if (httpURLConnection2 != null) {
                            try {
                                httpURLConnection2.disconnect();
                            } catch (IOException e) {
                                throw e;
                            }
                        }
                        return false;
                    }
                    App.v(z[3]);
                    Log.i(z[2] + networkInfo);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                    return true;
                } catch (IOException e3) {
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    httpURLConnection = httpURLConnection2;
                    th = th2;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (IOException e222) {
                            throw e222;
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                httpURLConnection2 = null;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
        r12 = this;
        r1 = 0;
        r11 = 8;
        r2 = -1;
        r10 = 1;
        r9 = 0;
        super.onCreate(r13);
        r12.requestWindowFeature(r10);
        r0 = android.os.Build.VERSION.SDK_INT;
        r3 = 11;
        if (r0 < r3) goto L_0x0015;
    L_0x0012:
        r12.setFinishOnTouchOutside(r9);
    L_0x0015:
        r0 = z;
        r0 = r0[r10];
        r0 = r12.getSystemService(r0);
        r0 = (android.net.wifi.WifiManager) r0;
        r6 = r0.getConnectionInfo();
        if (r6 == 0) goto L_0x00d3;
    L_0x0025:
        r0 = r6.getNetworkId();
        r5 = r0;
    L_0x002a:
        if (r6 == 0) goto L_0x00d6;
    L_0x002c:
        r0 = a(r6);
        r4 = r0;
    L_0x0031:
        r0 = r12.getLayoutInflater();
        r3 = 2130903304; // 0x7f030108 float:1.7413422E38 double:1.052806117E-314;
        r0 = com.whatsapp.aam.a(r0, r3, r1);
        r12.setContentView(r0);
        r0 = r12.getWindow();
        r1 = -2;
        r0.setLayout(r2, r1);
        r0 = 2131755997; // 0x7f1003dd float:1.914289E38 double:1.0532274034E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = 2131755996; // 0x7f1003dc float:1.9142887E38 double:1.053227403E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.Button) r1;
        r2 = 2131755998; // 0x7f1003de float:1.9142891E38 double:1.053227404E-314;
        r2 = r12.findViewById(r2);
        r2 = (android.widget.Button) r2;
        r3 = 2131755995; // 0x7f1003db float:1.9142885E38 double:1.0532274024E-314;
        r3 = r12.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r7 = 2131755999; // 0x7f1003df float:1.9142893E38 double:1.0532274044E-314;
        r7 = r12.findViewById(r7);
        r8 = new com.whatsapp.messaging.l;
        r8.<init>(r12);
        r0.setOnClickListener(r8);
        if (r6 == 0) goto L_0x009c;
    L_0x007c:
        r0 = 2131231155; // 0x7f0801b3 float:1.8078383E38 double:1.052968097E-314;
        r6 = new java.lang.Object[r10];
        r6[r9] = r4;
        r0 = r12.getString(r0, r6);
        r1.setText(r0);
        r0 = 2131232295; // 0x7f080627 float:1.8080695E38 double:1.0529686603E-314;
        r6 = new java.lang.Object[r10];
        r6[r9] = r4;
        r0 = r12.getString(r0, r6);
        r3.setText(r0);
        r0 = com.whatsapp.messaging.co.a;
        if (r0 == 0) goto L_0x00aa;
    L_0x009c:
        r1.setVisibility(r11);
        if (r7 == 0) goto L_0x00a4;
    L_0x00a1:
        r7.setVisibility(r11);
    L_0x00a4:
        r0 = 2131232294; // 0x7f080626 float:1.8080693E38 double:1.05296866E-314;
        r3.setText(r0);
    L_0x00aa:
        r0 = new com.whatsapp.messaging.bx;
        r0.<init>(r12);
        r2.setOnClickListener(r0);
        r0 = new com.whatsapp.messaging.bw;
        r0.<init>(r12, r5, r4);
        r1.setOnClickListener(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r9];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return;
    L_0x00d3:
        r5 = r2;
        goto L_0x002a;
    L_0x00d6:
        r4 = r1;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.CaptivePortalActivity.onCreate(android.os.Bundle):void");
    }

    protected void onPause() {
        super.onPause();
        awx.a.removeMessages(1);
        App.H();
    }
}
