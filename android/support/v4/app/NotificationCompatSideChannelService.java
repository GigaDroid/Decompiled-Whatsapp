package android.support.v4.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.app.INotificationSideChannel.Stub;
import org.v;
import org.whispersystems.at;

public abstract class NotificationCompatSideChannelService extends Service {
    private static final String[] z;

    class NotificationSideChannelStub extends Stub {
        final NotificationCompatSideChannelService this$0;

        NotificationSideChannelStub(NotificationCompatSideChannelService notificationCompatSideChannelService, 1 1) {
            this(notificationCompatSideChannelService);
        }

        private NotificationSideChannelStub(NotificationCompatSideChannelService notificationCompatSideChannelService) {
            this.this$0 = notificationCompatSideChannelService;
        }

        public void cancelAll(String str) {
            NotificationCompatSideChannelService.access$100(this.this$0, getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                this.this$0.cancelAll(str);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void notify(String str, int i, String str2, Notification notification) {
            NotificationCompatSideChannelService.access$100(this.this$0, getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                this.this$0.notify(str, i, str2, notification);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void cancel(String str, int i, String str2) {
            NotificationCompatSideChannelService.access$100(this.this$0, getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                this.this$0.cancel(str, i, str2);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "1\u001a^bY9\u0010\u0014cC \u0004UbB~6s^r\u000f:uD\u007f\u0016=yQb\u0019;tOe\u00190\u007fOu\u00185t^s\u001c";
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
                        i3 = 80;
                        break;
                    case at.g /*1*/:
                        i3 = 116;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 54;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "p\u001dI0X?\u0000\u001aqC$\u001cUb_*\u0011^0P?\u0006\u001a`W3\u001f[wSp";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001e\u001bNyP9\u0017[d_?\u001aiyR57RqX>\u0011VCS\"\u0002SsSjToyRp";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract void cancel(String str, int i, String str2);

    public abstract void cancelAll(String str);

    public abstract void notify(String str, int i, String str2, Notification notification);

    static void access$100(NotificationCompatSideChannelService notificationCompatSideChannelService, int i, String str) {
        notificationCompatSideChannelService.checkPermission(i, str);
    }

    private void checkPermission(int i, String str) {
        boolean z = Fragment.a;
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                if (!packagesForUid[i2].equals(str)) {
                    i2++;
                    if (z) {
                        break;
                    }
                }
                return;
            } catch (SecurityException e) {
                throw e;
            }
        }
        throw new SecurityException(z[1] + i + z[2] + str);
    }

    public IBinder onBind(Intent intent) {
        try {
            if (!intent.getAction().equals(z[0])) {
                return null;
            }
            if (VERSION.SDK_INT > 19) {
                return null;
            }
            return new NotificationSideChannelStub(this, null);
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }
}
