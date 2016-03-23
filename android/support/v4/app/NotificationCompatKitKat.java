package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatBase.Action;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

class NotificationCompatKitKat {

    public class Builder implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions {
        public static boolean a;
        private static final String[] z;
        private android.app.Notification.Builder b;
        private List mActionExtrasList;
        private Bundle mExtras;

        static {
            String[] strArr = new String[7];
            String str = "0dA++8n\u000b*1!zJ+0\u007ffJ:%=EK5=";
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
                            i3 = 81;
                            break;
                        case at.g /*1*/:
                            i3 = 10;
                            break;
                        case at.i /*2*/:
                            i3 = 37;
                            break;
                        case at.o /*3*/:
                            i3 = 89;
                            break;
                        default:
                            i3 = 68;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "0dA++8n\u000b*1!zJ+0\u007f\u007fV<\u00178n@\u001a,0dK<(";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "0dA++8n\u000b)!>zI<";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "0dA++8n\u000b*1!zJ+0\u007fyJ+0\u001ao\\";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "0dA++8n\u000b*1!zJ+0\u007fmW61!A@ ";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "0dA++8n\u000b*1!zJ+0\u007fkF-->d`!0#kV";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "0dA++8n\u000b*1!zJ+0\u007fcV\u001e6>\u007fU\n1<gD+=";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void addAction(Action action) {
            this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.b, action));
        }

        public android.app.Notification.Builder getBuilder() {
            return this.b;
        }

        public Notification build() {
            SparseArray buildActionExtrasMap = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (buildActionExtrasMap != null) {
                this.mExtras.putSparseParcelableArray(z[6], buildActionExtrasMap);
            }
            this.b.setExtras(this.mExtras);
            return this.b.build();
        }

        public Builder(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList arrayList, Bundle bundle, String str, boolean z5, String str2) {
            int i5 = Action.a;
            this.mActionExtrasList = new ArrayList();
            this.b = new android.app.Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
            this.mExtras = new Bundle();
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            if (!(arrayList == null || arrayList.isEmpty())) {
                this.mExtras.putStringArray(z[3], (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            if (z4) {
                this.mExtras.putBoolean(z[0], true);
            }
            if (str != null) {
                this.mExtras.putString(z[5], str);
                if (z5) {
                    this.mExtras.putBoolean(z[1], true);
                    if (i5 != 0) {
                        RemoteInput.a++;
                    }
                }
                this.mExtras.putBoolean(z[2], true);
            }
            if (str2 != null) {
                this.mExtras.putString(z[4], str2);
            }
        }
    }

    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }
}
