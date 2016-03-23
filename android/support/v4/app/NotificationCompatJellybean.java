package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.InboxStyle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatBase.Action;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class NotificationCompatJellybean {
    private static final Object sActionsLock;
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock;
    private static final String[] z;

    public class Builder implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions {
        public static int a;
        private static final String[] z;
        private android.app.Notification.Builder b;
        private List mActionExtrasList;
        private final Bundle mExtras;

        static {
            String[] strArr = new String[6];
            String str = "{\u001e*=\u001as\u0014`<\u0000j\u0000!=\u00014\u0005=*&s\u0014+\f\u001d{\u001e *\u0019";
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
                            i3 = 26;
                            break;
                        case at.g /*1*/:
                            i3 = 112;
                            break;
                        case at.i /*2*/:
                            i3 = 78;
                            break;
                        case at.o /*3*/:
                            i3 = 79;
                            break;
                        default:
                            i3 = 117;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "{\u001e*=\u001as\u0014`<\u0000j\u0000!=\u00014\u0003!=\u0001Q\u00157";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "{\u001e*=\u001as\u0014`<\u0000j\u0000!=\u00014\u001c!,\u0014v? #\f";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "{\u001e*=\u001as\u0014`<\u0000j\u0000!=\u00014\u0017< \u0000j;+6";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "{\u001e*=\u001as\u0014`<\u0000j\u0000!=\u00014\u0011-;\u001cu\u001e\u000b7\u0001h\u0011=";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "{\u001e*=\u001as\u0014`<\u0000j\u0000!=\u00014\u0019=\b\u0007u\u0005>\u001c\u0000w\u001d/=\f";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public Notification build() {
            int i = Action.a;
            Notification build = this.b.build();
            Bundle extras = NotificationCompatJellybean.getExtras(build);
            Bundle bundle = new Bundle(this.mExtras);
            for (String str : this.mExtras.keySet()) {
                if (extras.containsKey(str)) {
                    bundle.remove(str);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
            extras.putAll(bundle);
            SparseArray buildActionExtrasMap = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (buildActionExtrasMap != null) {
                NotificationCompatJellybean.getExtras(build).putSparseParcelableArray(z[5], buildActionExtrasMap);
            }
            return build;
        }

        public void addAction(Action action) {
            this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.b, action));
        }

        public android.app.Notification.Builder getBuilder() {
            return this.b;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(android.content.Context r9, android.app.Notification r10, java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.CharSequence r13, android.widget.RemoteViews r14, int r15, android.app.PendingIntent r16, android.app.PendingIntent r17, android.graphics.Bitmap r18, int r19, int r20, boolean r21, boolean r22, int r23, java.lang.CharSequence r24, boolean r25, android.os.Bundle r26, java.lang.String r27, boolean r28, java.lang.String r29) {
            /*
            r8 = this;
            r8.<init>();
            r4 = new java.util.ArrayList;
            r4.<init>();
            r8.mActionExtrasList = r4;
            r4 = new android.app.Notification$Builder;
            r4.<init>(r9);
            r6 = r10.when;
            r4 = r4.setWhen(r6);
            r5 = r10.icon;
            r6 = r10.iconLevel;
            r4 = r4.setSmallIcon(r5, r6);
            r5 = r10.contentView;
            r4 = r4.setContent(r5);
            r5 = r10.tickerText;
            r4 = r4.setTicker(r5, r14);
            r5 = r10.sound;
            r6 = r10.audioStreamType;
            r4 = r4.setSound(r5, r6);
            r5 = r10.vibrate;
            r4 = r4.setVibrate(r5);
            r5 = r10.ledARGB;
            r6 = r10.ledOnMS;
            r7 = r10.ledOffMS;
            r5 = r4.setLights(r5, r6, r7);
            r4 = r10.flags;
            r4 = r4 & 2;
            if (r4 == 0) goto L_0x010b;
        L_0x0047:
            r4 = 1;
        L_0x0048:
            r5 = r5.setOngoing(r4);
            r4 = r10.flags;
            r4 = r4 & 8;
            if (r4 == 0) goto L_0x010e;
        L_0x0052:
            r4 = 1;
        L_0x0053:
            r5 = r5.setOnlyAlertOnce(r4);
            r4 = r10.flags;
            r4 = r4 & 16;
            if (r4 == 0) goto L_0x0111;
        L_0x005d:
            r4 = 1;
        L_0x005e:
            r4 = r5.setAutoCancel(r4);
            r5 = r10.defaults;
            r4 = r4.setDefaults(r5);
            r4 = r4.setContentTitle(r11);
            r4 = r4.setContentText(r12);
            r0 = r24;
            r4 = r4.setSubText(r0);
            r4 = r4.setContentInfo(r13);
            r0 = r16;
            r4 = r4.setContentIntent(r0);
            r5 = r10.deleteIntent;
            r5 = r4.setDeleteIntent(r5);
            r4 = r10.flags;
            r4 = r4 & 128;
            if (r4 == 0) goto L_0x0114;
        L_0x008c:
            r4 = 1;
        L_0x008d:
            r0 = r17;
            r4 = r5.setFullScreenIntent(r0, r4);
            r0 = r18;
            r4 = r4.setLargeIcon(r0);
            r4 = r4.setNumber(r15);
            r0 = r22;
            r4 = r4.setUsesChronometer(r0);
            r0 = r23;
            r4 = r4.setPriority(r0);
            r0 = r19;
            r1 = r20;
            r2 = r21;
            r4 = r4.setProgress(r0, r1, r2);
            r8.b = r4;
            r4 = new android.os.Bundle;
            r4.<init>();
            r8.mExtras = r4;
            if (r26 == 0) goto L_0x00c5;
        L_0x00be:
            r4 = r8.mExtras;
            r0 = r26;
            r4.putAll(r0);
        L_0x00c5:
            if (r25 == 0) goto L_0x00d2;
        L_0x00c7:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 3;
            r5 = r5[r6];
            r6 = 1;
            r4.putBoolean(r5, r6);
        L_0x00d2:
            if (r27 == 0) goto L_0x00fc;
        L_0x00d4:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 4;
            r5 = r5[r6];
            r0 = r27;
            r4.putString(r5, r0);
            if (r28 == 0) goto L_0x00f1;
        L_0x00e2:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 1;
            r5 = r5[r6];
            r6 = 1;
            r4.putBoolean(r5, r6);
            r4 = android.support.v4.app.NotificationCompatBase.Action.a;
            if (r4 == 0) goto L_0x00fc;
        L_0x00f1:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 0;
            r5 = r5[r6];
            r6 = 1;
            r4.putBoolean(r5, r6);
        L_0x00fc:
            if (r29 == 0) goto L_0x010a;
        L_0x00fe:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 2;
            r5 = r5[r6];
            r0 = r29;
            r4.putString(r5, r0);
        L_0x010a:
            return;
        L_0x010b:
            r4 = 0;
            goto L_0x0048;
        L_0x010e:
            r4 = 0;
            goto L_0x0053;
        L_0x0111:
            r4 = 0;
            goto L_0x005e;
        L_0x0114:
            r4 = 0;
            goto L_0x008d;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.NotificationCompatJellybean.Builder.<init>(android.content.Context, android.app.Notification, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, int, java.lang.CharSequence, boolean, android.os.Bundle, java.lang.String, boolean, java.lang.String):void");
        }
    }

    public static void addBigPictureStyle(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        BigPictureStyle bigPicture = new BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPicture.setSummaryText(charSequence2);
        }
    }

    public static void addBigTextStyle(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        BigTextStyle bigText = new BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigText.setSummaryText(charSequence2);
        }
    }

    public static Bundle writeActionAndGetExtras(android.app.Notification.Builder builder, Action action) {
        builder.addAction(action.getIcon(), action.getTitle(), action.getActionIntent());
        Bundle bundle = new Bundle(action.getExtras());
        if (action.getRemoteInputs() != null) {
            bundle.putParcelableArray(z[12], RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()));
        }
        return bundle;
    }

    private static Bundle getBundleForAction(Action action) {
        Bundle bundle = new Bundle();
        bundle.putInt(z[10], action.getIcon());
        bundle.putCharSequence(z[9], action.getTitle());
        bundle.putParcelable(z[7], action.getActionIntent());
        bundle.putBundle(z[8], action.getExtras());
        bundle.putParcelableArray(z[11], RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()));
        return bundle;
    }

    public static ArrayList getParcelableArrayListForActions(Action[] actionArr) {
        int i = Action.a;
        if (actionArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(actionArr.length);
        int length = actionArr.length;
        int i2 = 0;
        while (i2 < length) {
            arrayList.add(getBundleForAction(actionArr[i2]));
            i2++;
            if (i != 0) {
                return arrayList;
            }
        }
        return arrayList;
    }

    public static SparseArray buildActionExtrasMap(List list) {
        int i = Action.a;
        SparseArray sparseArray = null;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Bundle bundle = (Bundle) list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i2, bundle);
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        return sparseArray;
    }

    static {
        String[] strArr = new String[13];
        String str = "ra\u000b_}d";
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
                        i3 = 23;
                        break;
                    case at.g /*1*/:
                        i3 = 25;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 45;
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
                    str = "Bw\u001eOpr9\u000bB<vz\u001cHod9\u0011Bh~\u007f\u0016N}cp\u0010C<ra\u000b_}d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Yv\u000bDz~z\u001eYuxw<Bqgx\u000b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "Yv\u000bDz~z\u001eYuxw<Bqgx\u000b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Yv\u000bDz~z\u001eYuxwQHdck\u001e^<qp\u001aAx7p\f\rrxm_Bz7m\u0006]y7[\nCx{|";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Bw\u001eOpr9\u000bB<vz\u001cHod9\u0011Bh~\u007f\u0016N}cp\u0010C<ra\u000b_}d";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "vz\u000bDsyP\u0011Yyym";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "ra\u000b_}d";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "cp\u000bAy";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "~z\u0010C";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "e|\u0012BhrP\u0011]icj";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "vw\u001b_s~}Q^igi\u0010_h9k\u001a@sc|6Clbm\f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sExtrasLock = new Object();
                    sActionsLock = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = "Yv\u000bDz~z\u001eYuxw<Bqgx\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void addInboxStyle(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList arrayList) {
        int i = Action.a;
        InboxStyle bigContentTitle = new InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
            if (i != 0) {
                return;
            }
        }
    }

    public static Bundle getExtras(Notification notification) {
        synchronized (sExtrasLock) {
            if (sExtrasFieldAccessFailed) {
                return null;
            }
            try {
                if (sExtrasField == null) {
                    Field declaredField = Notification.class.getDeclaredField(z[0]);
                    if (Bundle.class.isAssignableFrom(declaredField.getType())) {
                        declaredField.setAccessible(true);
                        sExtrasField = declaredField;
                    } else {
                        Log.e(z[3], z[5]);
                        sExtrasFieldAccessFailed = true;
                        return null;
                    }
                }
                Bundle bundle = (Bundle) sExtrasField.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    sExtrasField.set(notification, bundle);
                }
                return bundle;
            } catch (Throwable e) {
                Log.e(z[4], z[2], e);
                sExtrasFieldAccessFailed = true;
                return null;
            } catch (Throwable e2) {
                Log.e(z[1], z[6], e2);
                sExtrasFieldAccessFailed = true;
                return null;
            }
        }
    }
}
