package com.whatsapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import com.whatsapp.preference.WaDialogPreference;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.Timer;
import java.util.TimerTask;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SettingsNetworkUsage extends DialogToastPreferenceActivity {
    private static final String[] z;
    private TimerTask i;
    private Handler j;
    private Timer k;

    static {
        String[] strArr = new String[22];
        String str = "\u0017M/P#\u000bC\u0004R?\u0018O>x>\u001c[>S";
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
                        i3 = 121;
                        break;
                    case at.g /*1*/:
                        i3 = 40;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 76;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x!\u001c[(F+\u001c[\u0004U)\u001aM2Q)\u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x!\u001cL2F\u0013\u001bQ/B?&Z>D)\u0010^>C";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001eG4@ \u001cw?U%\u000fM\u0004S#\rI7x.\u0000\\>T\u0013\u000bM8B%\u000fM?";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x>\u0016I6N\"\u001ew9^8\u001c[\u0004T)\u0017\\";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x!\u001c[(F+\u001cw9^8\u001c[\u0004T)\u0017\\";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x8\u0016\\:K\u0013\u001bQ/B?&Z>D)\u0010^>C";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x:\u0016A+x/\u0018D7x.\u0000\\>T\u0013\nM5S";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x>\u001c[>S";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x!\u001cL2F\u0013\u001bQ/B?&[>I8";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x:\u0016A+x/\u0018D7x.\u0000\\>T\u0013\u000bM8B%\u000fM?";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x>\u0016I6N\"\u001ew9^8\u001c[\u0004U)\u001aM2Q)\u001d";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x:\u0016A+x/\u0018D7T\u0013\u000bM8B%\u000fM?";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x8\u0016\\:K\u0013\u001bQ/B?&[>I8";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x:\u0016A+x/\u0018D7T\u0013\nM5S";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001eG4@ \u001cw?U%\u000fM\u0004S#\rI7x.\u0000\\>T\u0013\u000bM8B%\u000fM?";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001eG4@ \u001cw?U%\u000fM\u0004S#\rI7x.\u0000\\>T\u0013\nM5S";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x>\u001c[>S";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x!\u001c[(F+\u001c[\u0004T)\u0017\\";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0017M/P#\u000bC\u0004R?\u0018O>x!\u001c[(F+\u001cw9^8\u001c[\u0004U)\u001aM2Q)\u001d";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001eG4@ \u001cw?U%\u000fM\u0004S#\rI7x.\u0000\\>T\u0013\nM5S";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000bM=U)\n@vI)\r_4U'T](F+\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public SettingsNetworkUsage() {
        this.k = new Timer(z[1]);
    }

    private void a(String str, int i, Object[] objArr) {
        Preference findPreference = findPreference(str);
        if (findPreference != null) {
            findPreference.setSummary(String.format(getString(i), objArr));
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.k.cancel();
    }

    static Handler a(SettingsNetworkUsage settingsNetworkUsage) {
        return settingsNetworkUsage.j;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(2131099662);
        ((WaDialogPreference) findPreference(z[0])).a(new ld(this));
        this.j = new Handler(Looper.myLooper());
    }

    private void a(String str, int i, long j) {
        Preference findPreference = findPreference(str);
        if (findPreference != null) {
            findPreference.setSummary(String.format(App.az.a(i, (int) j), new Object[]{Long.valueOf(j)}));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r11 = this;
        r7 = 2131296299; // 0x7f09002b float:1.821051E38 double:1.0530002824E-314;
        r6 = 2131296298; // 0x7f09002a float:1.8210509E38 double:1.053000282E-314;
        r10 = 2131231526; // 0x7f080326 float:1.8079136E38 double:1.0529682803E-314;
        r9 = 1;
        r8 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = com.whatsapp.amd.d;
        if (r1 == 0) goto L_0x013a;
    L_0x0011:
        r2 = z;
        r3 = 19;
        r2 = r2[r3];
        r4 = r1.getTotalMessagesSent();
        r11.a(r2, r6, r4);
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r4 = r1.getTotalMessagesReceived();
        r11.a(r2, r6, r4);
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r4 = r1.getMediaBytesSent();
        r11.a(r2, r4);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r4 = r1.getMediaBytesReceived();
        r11.a(r2, r4);
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r4 = r1.getMessageBytesSent();
        r11.a(r2, r4);
        r2 = z;
        r3 = 20;
        r2 = r2[r3];
        r4 = r1.getMessageBytesReceived();
        r11.a(r2, r4);
        r2 = z;
        r3 = 15;
        r2 = r2[r3];
        r4 = r1.getOutgoingVoipCalls();
        r11.a(r2, r7, r4);
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        r4 = r1.getIncomingVoipCalls();
        r11.a(r2, r7, r4);
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r4 = r1.getVoipBytesSent();
        r11.a(r2, r4);
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r4 = r1.getVoipBytesReceived();
        r11.a(r2, r4);
        r2 = r1.getTotalBytesSentToGoogleDrive();
        r4 = r1.getTotalBytesReceivedFromGoogleDrive();
        r6 = com.whatsapp.gdrive.GoogleDriveService.z();
        if (r6 != 0) goto L_0x00aa;
    L_0x009e:
        r6 = 0;
        r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r6 > 0) goto L_0x00aa;
    L_0x00a4:
        r6 = 0;
        r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x00bd;
    L_0x00aa:
        r6 = z;
        r7 = 17;
        r6 = r6[r7];
        r11.a(r6, r2);
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r11.a(r2, r4);
        if (r0 == 0) goto L_0x00d7;
    L_0x00bd:
        r2 = r11.getPreferenceScreen();
        r3 = z;
        r4 = 21;
        r3 = r3[r4];
        r11.a(r2, r3);
        r2 = r11.getPreferenceScreen();
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        r11.a(r2, r3);
    L_0x00d7:
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r4 = r1.getRoamingBytesSent();
        r11.a(r2, r4);
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r4 = r1.getRoamingBytesReceived();
        r11.a(r2, r4);
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r4 = r1.getTotalBytesSent();
        r11.a(r2, r4);
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r4 = r1.getTotalBytesReceived();
        r11.a(r2, r4);
        r2 = r1.getLastReset();
        r4 = -9223372036854775808;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 == 0) goto L_0x0126;
    L_0x0113:
        r1 = z;
        r4 = 18;
        r1 = r1[r4];
        r4 = new java.lang.Object[r9];
        r2 = com.whatsapp.util.cs.l(r11, r2);
        r4[r8] = r2;
        r11.a(r1, r10, r4);
        if (r0 == 0) goto L_0x013a;
    L_0x0126:
        r0 = z;
        r1 = 9;
        r0 = r0[r1];
        r1 = new java.lang.Object[r9];
        r2 = 2131231542; // 0x7f080336 float:1.8079168E38 double:1.052968288E-314;
        r2 = r11.getString(r2);
        r1[r8] = r2;
        r11.a(r0, r10, r1);
    L_0x013a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsNetworkUsage.a():void");
    }

    protected void onResume() {
        super.onResume();
        this.i = new ap(this);
        this.k.scheduleAtFixedRate(this.i, 0, 1000);
    }

    private void a(PreferenceScreen preferenceScreen, String str) {
        if (preferenceScreen != null && str != null) {
            Preference findPreference = findPreference(str);
            if (findPreference != null) {
                preferenceScreen.removePreference(findPreference);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r9, long r10) {
        /*
        r8 = this;
        r6 = 4652218415073722368; // 0x4090000000000000 float:0.0 double:1024.0;
        r1 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r2 = (double) r10;
        r0 = r1;
    L_0x0007:
        r5 = 3;
        if (r0 >= r5) goto L_0x0013;
    L_0x000a:
        r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x0013;
    L_0x000e:
        r2 = r2 / r6;
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0007;
    L_0x0013:
        switch(r0) {
            case 0: goto L_0x0024;
            case 1: goto L_0x002b;
            case 2: goto L_0x0030;
            case 3: goto L_0x0035;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r1;
    L_0x0017:
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r2 = java.lang.Double.valueOf(r2);
        r4[r1] = r2;
        r8.a(r9, r0, r4);
    L_0x0023:
        return;
    L_0x0024:
        r0 = 2131296297; // 0x7f090029 float:1.8210507E38 double:1.0530002815E-314;
        r8.a(r9, r0, r10);
        goto L_0x0023;
    L_0x002b:
        r0 = 2131231521; // 0x7f080321 float:1.8079125E38 double:1.052968278E-314;
        if (r4 == 0) goto L_0x0017;
    L_0x0030:
        r0 = 2131231523; // 0x7f080323 float:1.807913E38 double:1.052968279E-314;
        if (r4 == 0) goto L_0x0017;
    L_0x0035:
        r0 = 2131231520; // 0x7f080320 float:1.8079123E38 double:1.0529682774E-314;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsNetworkUsage.a(java.lang.String, long):void");
    }

    static void b(SettingsNetworkUsage settingsNetworkUsage) {
        settingsNetworkUsage.a();
    }

    protected void onPause() {
        super.onPause();
        this.i.cancel();
    }
}
