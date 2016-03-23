package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings.Secure;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.util.Log;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class NotificationManagerCompat {
    private static final Impl IMPL;
    private static final int SIDE_CHANNEL_BIND_FLAGS;
    private static Set sEnabledNotificationListenerPackages;
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock;
    private static final Object sLock;
    private static SideChannelManager sSideChannelManager;
    private static final String[] z;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    interface Task {
        void send(INotificationSideChannel iNotificationSideChannel);
    }

    class CancelTask implements Task {
        private static final String[] z;
        final boolean all;
        final int id;
        final String packageName;
        final String tag;

        static {
            String[] strArr = new String[5];
            String str = "6#/E#";
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
                            i3 = 3;
                            break;
                        case at.i /*2*/:
                            i3 = 70;
                            break;
                        case at.o /*3*/:
                            i3 = 33;
                            break;
                        default:
                            i3 = 25;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "jb%Jx}f\b@t\u007f9";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "6#2@~ ";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "6#'Mu ";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "Yb(B|vW'RrA";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(z[1]);
            stringBuilder.append(z[2]).append(this.packageName);
            stringBuilder.append(z[0]).append(this.id);
            stringBuilder.append(z[3]).append(this.tag);
            stringBuilder.append(z[4]).append(this.all);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public CancelTask(String str, int i, String str2) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.all = false;
        }

        public void send(INotificationSideChannel iNotificationSideChannel) {
            if (this.all) {
                iNotificationSideChannel.cancelAll(this.packageName);
                if (!Fragment.a) {
                    return;
                }
            }
            iNotificationSideChannel.cancel(this.packageName, this.id, this.tag);
        }
    }

    interface Impl {
        void cancelNotification(NotificationManager notificationManager, String str, int i);

        int getSideChannelBindFlags();

        void postNotification(NotificationManager notificationManager, String str, int i, Notification notification);
    }

    class ImplBase implements Impl {
        public void cancelNotification(NotificationManager notificationManager, String str, int i) {
            notificationManager.cancel(i);
        }

        public void postNotification(NotificationManager notificationManager, String str, int i, Notification notification) {
            notificationManager.notify(i, notification);
        }

        public int getSideChannelBindFlags() {
            return 1;
        }

        ImplBase() {
        }
    }

    class ImplEclair extends ImplBase {
        public void cancelNotification(NotificationManager notificationManager, String str, int i) {
            NotificationManagerCompatEclair.cancelNotification(notificationManager, str, i);
        }

        public void postNotification(NotificationManager notificationManager, String str, int i, Notification notification) {
            NotificationManagerCompatEclair.postNotification(notificationManager, str, i, notification);
        }

        ImplEclair() {
        }
    }

    class ImplIceCreamSandwich extends ImplEclair {
        ImplIceCreamSandwich() {
        }

        public int getSideChannelBindFlags() {
            return 33;
        }
    }

    class NotifyTask implements Task {
        private static final String[] z;
        final int id;
        final Notification notif;
        final String packageName;
        final String tag;

        static {
            String[] strArr = new String[4];
            String str = "\u0007\u000f\u0007(\r\u0011";
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
                            i3 = 43;
                            break;
                        case at.g /*1*/:
                            i3 = 47;
                            break;
                        case at.i /*2*/:
                            i3 = 115;
                            break;
                        case at.o /*3*/:
                            i3 = 73;
                            break;
                        default:
                            i3 = arj.Theme_ratingBarStyle;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u0007\u000f\u001a-P";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "e@\u0007 \fR{\u0012:\u0001p";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "[N\u0010\"\u000bLJ=(\u0007N\u0015";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void send(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.notify(this.packageName, this.id, this.tag, this.notif);
        }

        public NotifyTask(String str, int i, String str2, Notification notification) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.notif = notification;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(z[3]);
            stringBuilder.append(z[1]).append(this.packageName);
            stringBuilder.append(z[2]).append(this.id);
            stringBuilder.append(z[0]).append(this.tag);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    class ServiceConnectedEvent {
        final ComponentName componentName;
        final IBinder iBinder;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.componentName = componentName;
            this.iBinder = iBinder;
        }
    }

    class SideChannelManager implements Callback, ServiceConnection {
        private static final String[] z;
        private Set mCachedEnabledPackages;
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map mRecordMap;

        class ListenerRecord {
            public boolean bound;
            public final ComponentName componentName;
            public int retryCount;
            public INotificationSideChannel service;
            public LinkedList taskQueue;

            public ListenerRecord(ComponentName componentName) {
                this.bound = false;
                this.taskQueue = new LinkedList();
                this.retryCount = 0;
                this.componentName = componentName;
            }
        }

        static {
            String[] strArr = new String[42];
            String str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
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
                            i3 = 3;
                            break;
                        case at.g /*1*/:
                            i3 = 96;
                            break;
                        case at.i /*2*/:
                            i3 = 49;
                            break;
                        case at.o /*3*/:
                            i3 = 122;
                            break;
                        default:
                            i3 = 21;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "#\u0012T\u000egj\u0005B";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "P\u0003Y\u001fqv\fX\u0014r#\u0012T\u000egz@W\u0015g#";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "#\u0014P\t~p@E\u00155";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "#\u0001W\u000epq@";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "#\rB";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "Q\u0005\\\u0015af%I\u0019ps\u0014X\u0015{#\u0003^\u0017xv\u000eX\u0019tw\t_\u001d5t\tE\u00125";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "S\u0012^\u0019pp\u0013X\u0014r#\u0003^\u0017el\u000eT\u0014a#";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "Q\u0005\\\u0015af@B\u001fgu\tR\u001f5k\u0001BZqj\u0005U@5";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "P\u0005_\u001e|m\u0007\u0011\u000etp\u000b\u0011";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "/@";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "#\u0011D\u001f`f\u0004\u0011\u000etp\u000bB";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseContentDescription /*19*/:
                        strArr2[i] = str;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 20;
                        i = 21;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationIcon /*20*/:
                        strArr2[i] = str;
                        i = 22;
                        strArr2 = strArr3;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 21;
                        break;
                    case arj.Toolbar_navigationContentDescription /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 22;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_logoDescription /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "G\tB\u0019zm\u000eT\u0019af\u0004\u0011\u001cgl\r\u0011\tpq\u0016X\u0019p#";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleTextColor /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "M\u000fE\u0013sj\u0003P\u000e|l\u000e|\u001b{b\u0007T\bVl\rA\u001ba";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_subtitleTextColor /*24*/:
                        strArr2[i] = str;
                        i = 26;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 25;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextAppearance /*25*/:
                        strArr2[i] = str;
                        i = 27;
                        str = "/@_\u0015a#\u0001U\u001e|m\u0007\u0011\u0016|p\u0014T\u0014pq@C\u001fvl\u0012UT";
                        obj = 26;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextColor /*26*/:
                        strArr2[i] = str;
                        i = 28;
                        str = "Q\u0005\\\u0015cj\u000eVZyj\u0013E\u001f{f\u0012\u0011\bp`\u000fC\u001e5e\u000fCZ";
                        obj = 27;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeStyle /*27*/:
                        strArr2[i] = str;
                        i = 29;
                        str = "b\u000eU\bzj\u0004\u001f\t`s\u0010^\ba-\"x4Q\\.~.\\E)r;AJ/\u007f%FJ$t%VK!\u007f4PO";
                        obj = 28;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseButtonStyle /*28*/:
                        strArr2[i] = str;
                        i = 30;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 29;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeBackground /*29*/:
                        strArr2[i] = str;
                        i = 31;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 30;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSplitBackground /*30*/:
                        strArr2[i] = str;
                        i = 32;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 31;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseDrawable /*31*/:
                        strArr2[i] = str;
                        i = 33;
                        str = "S\u0005C\u0017|p\u0013X\u0015{#\u0010C\u001fff\u000eEZzm@R\u0015xs\u000f_\u001f{w@";
                        obj = 32;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCutDrawable /*32*/:
                        strArr2[i] = str;
                        i = 34;
                        str = "B\u0004U\u0013{d@]\u0013fw\u0005_\u001fg#\u0012T\u0019zq\u0004\u0011\u001czq@";
                        obj = 33;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCopyDrawable /*33*/:
                        strArr2[i] = str;
                        i = 35;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 34;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePasteDrawable /*34*/:
                        strArr2[i] = str;
                        i = 36;
                        str = "V\u000eP\u0018yf@E\u00155a\t_\u001e5w\u000f\u0011\u0016|p\u0014T\u0014pq@";
                        obj = 35;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSelectAllDrawable /*35*/:
                        strArr2[i] = str;
                        i = 37;
                        str = "b\u000eU\bzj\u0004\u001f\t`s\u0010^\ba-\"x4Q\\.~.\\E)r;AJ/\u007f%FJ$t%VK!\u007f4PO";
                        obj = 36;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeShareDrawable /*36*/:
                        strArr2[i] = str;
                        i = 38;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 37;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeFindDrawable /*37*/:
                        strArr2[i] = str;
                        i = 39;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 38;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeWebSearchDrawable /*38*/:
                        strArr2[i] = str;
                        i = 40;
                        str = "M\u000fE\u0013sN\u0001_9zn\u0010P\u000e";
                        obj = 39;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePopupWindowStyle /*39*/:
                        strArr2[i] = str;
                        i = 41;
                        str = "@\u000f_\u0014p`\u0014T\u001e5w\u000f\u0011\tpq\u0016X\u0019p#";
                        obj = 40;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "D\tG\u0013{d@D\n5l\u000e\u0011\u001epo\tG\u001fgj\u000eVZ";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        private void handleQueueTask(Task task) {
            boolean z = Fragment.a;
            updateListenerMap();
            for (ListenerRecord listenerRecord : this.mRecordMap.values()) {
                listenerRecord.taskQueue.add(task);
                processListenerQueue(listenerRecord);
                if (z) {
                    return;
                }
            }
        }

        private void updateListenerMap() {
            boolean z = Fragment.a;
            Set enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
            if (!enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
                this.mCachedEnabledPackages = enabledListenerPackages;
                List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction(z[29]), 4);
                Set<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName) || z) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w(z[31], z[33] + componentName + z[27]);
                            if (!z) {
                                continue;
                            }
                        }
                        hashSet.add(componentName);
                        if (z) {
                            break;
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.mRecordMap.containsKey(componentName2)) {
                        if (Log.isLoggable(z[32], 3)) {
                            Log.d(z[35], z[34] + componentName2);
                        }
                        this.mRecordMap.put(componentName2, new ListenerRecord(componentName2));
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                Iterator it = this.mRecordMap.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(z[26], 3)) {
                            Log.d(z[30], z[28] + entry.getKey());
                        }
                        ensureServiceUnbound((ListenerRecord) entry.getValue());
                        it.remove();
                        continue;
                    }
                    if (z) {
                        return;
                    }
                }
            }
        }

        public void queueTask(Task task) {
            this.mHandler.obtainMessage(0, task).sendToTarget();
        }

        private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
            ListenerRecord listenerRecord = (ListenerRecord) this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.service = Stub.asInterface(iBinder);
                listenerRecord.retryCount = 0;
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceDisconnected(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                ensureServiceUnbound(listenerRecord);
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(z[39], 3)) {
                Log.d(z[40], z[41] + componentName);
            }
            this.mHandler.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case v.m /*0*/:
                    handleQueueTask((Task) message.obj);
                    return true;
                case at.g /*1*/:
                    ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                    handleServiceConnected(serviceConnectedEvent.componentName, serviceConnectedEvent.iBinder);
                    return true;
                case at.i /*2*/:
                    handleServiceDisconnected((ComponentName) message.obj);
                    return true;
                case at.o /*3*/:
                    handleRetryListenerQueue((ComponentName) message.obj);
                    return true;
                default:
                    return false;
            }
        }

        private void scheduleListenerRetry(ListenerRecord listenerRecord) {
            if (!this.mHandler.hasMessages(3, listenerRecord.componentName)) {
                listenerRecord.retryCount++;
                if (listenerRecord.retryCount > 6) {
                    Log.w(z[5], z[1] + listenerRecord.taskQueue.size() + z[4] + listenerRecord.componentName + z[7] + listenerRecord.retryCount + z[2]);
                    listenerRecord.taskQueue.clear();
                    return;
                }
                int i = (1 << (listenerRecord.retryCount - 1)) * 1000;
                if (Log.isLoggable(z[6], 3)) {
                    Log.d(z[0], z[3] + i + z[8]);
                }
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3, listenerRecord.componentName), (long) i);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean ensureServiceBound(android.support.v4.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r5) {
            /*
            r4 = this;
            r0 = r5.bound;
            if (r0 == 0) goto L_0x0006;
        L_0x0004:
            r0 = 1;
        L_0x0005:
            return r0;
        L_0x0006:
            r0 = new android.content.Intent;
            r1 = z;
            r2 = 37;
            r1 = r1[r2];
            r0.<init>(r1);
            r1 = r5.componentName;
            r0 = r0.setComponent(r1);
            r1 = r4.mContext;
            r2 = android.support.v4.app.NotificationManagerCompat.access$000();
            r0 = r1.bindService(r0, r4, r2);
            r5.bound = r0;
            r0 = r5.bound;
            if (r0 == 0) goto L_0x002e;
        L_0x0027:
            r0 = 0;
            r5.retryCount = r0;
            r0 = android.support.v4.app.Fragment.a;
            if (r0 == 0) goto L_0x0055;
        L_0x002e:
            r0 = z;
            r1 = 38;
            r0 = r0[r1];
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = z;
            r3 = 36;
            r2 = r2[r3];
            r1 = r1.append(r2);
            r2 = r5.componentName;
            r1 = r1.append(r2);
            r1 = r1.toString();
            android.util.Log.w(r0, r1);
            r0 = r4.mContext;
            r0.unbindService(r4);
        L_0x0055:
            r0 = r5.bound;
            goto L_0x0005;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.NotificationManagerCompat.SideChannelManager.ensureServiceBound(android.support.v4.app.NotificationManagerCompat$SideChannelManager$ListenerRecord):boolean");
        }

        private void processListenerQueue(ListenerRecord listenerRecord) {
            boolean z = Fragment.a;
            try {
                if (Log.isLoggable(z[18], 3)) {
                    Log.d(z[9], z[11] + listenerRecord.componentName + z[17] + listenerRecord.taskQueue.size() + z[19]);
                }
                try {
                    if (!listenerRecord.taskQueue.isEmpty()) {
                        try {
                            if (!ensureServiceBound(listenerRecord) || listenerRecord.service == null) {
                                scheduleListenerRetry(listenerRecord);
                                return;
                            }
                            do {
                                Task task = (Task) listenerRecord.taskQueue.peek();
                                if (task != null || z) {
                                    try {
                                        if (Log.isLoggable(z[13], 3)) {
                                            Log.d(z[21], z[16] + task);
                                        }
                                        task.send(listenerRecord.service);
                                        listenerRecord.taskQueue.remove();
                                    } catch (DeadObjectException e) {
                                        throw e;
                                    } catch (Throwable e2) {
                                        try {
                                            Log.w(z[20], z[10] + listenerRecord.componentName, e2);
                                            if (z) {
                                                continue;
                                            }
                                        } catch (DeadObjectException e3) {
                                            throw e3;
                                        }
                                    } catch (DeadObjectException e4) {
                                        try {
                                            if (Log.isLoggable(z[12], 3)) {
                                                Log.d(z[14], z[15] + listenerRecord.componentName);
                                            }
                                        } catch (DeadObjectException e32) {
                                            throw e32;
                                        }
                                    }
                                }
                                break;
                            } while (!z);
                            try {
                                break;
                                if (!listenerRecord.taskQueue.isEmpty()) {
                                    scheduleListenerRetry(listenerRecord);
                                }
                            } catch (DeadObjectException e322) {
                                throw e322;
                            }
                        } catch (DeadObjectException e3222) {
                            throw e3222;
                        } catch (DeadObjectException e32222) {
                            throw e32222;
                        }
                    }
                } catch (DeadObjectException e322222) {
                    throw e322222;
                }
            } catch (DeadObjectException e3222222) {
                throw e3222222;
            }
        }

        private void handleRetryListenerQueue(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                processListenerQueue(listenerRecord);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(z[23], 3)) {
                Log.d(z[22], z[24] + componentName);
            }
            this.mHandler.obtainMessage(2, componentName).sendToTarget();
        }

        public SideChannelManager(Context context) {
            this.mRecordMap = new HashMap();
            this.mCachedEnabledPackages = new HashSet();
            this.mContext = context;
            this.mHandlerThread = new HandlerThread(z[25]);
            this.mHandlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper(), this);
        }

        private void ensureServiceUnbound(ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                this.mContext.unbindService(this);
                listenerRecord.bound = false;
            }
            listenerRecord.service = null;
        }
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public void cancel(String str, int i) {
        IMPL.cancelNotification(this.mNotificationManager, str, i);
        if (VERSION.SDK_INT <= 19) {
            pushSideChannelQueue(new CancelTask(this.mContext.getPackageName(), i, str));
        }
    }

    public void notify(String str, int i, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new NotifyTask(this.mContext.getPackageName(), i, str, notification));
            IMPL.cancelNotification(this.mNotificationManager, str, i);
            if (!Fragment.a) {
                return;
            }
        }
        IMPL.postNotification(this.mNotificationManager, str, i, notification);
    }

    static {
        String[] strArr = new String[3];
        String str = "gr|KMox6JWvlwKV(ik\\qox}zJgrv\\N";
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
                        i3 = 6;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 24;
                        break;
                    case at.o /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = 34;
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
                    str = "cry[NcxGWMru~PAghqVLYpqJVcr}KQ";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sEnabledNotificationListenersLock = new Object();
                    sEnabledNotificationListenerPackages = new HashSet();
                    sLock = new Object();
                    if (VERSION.SDK_INT >= 14) {
                        IMPL = new ImplIceCreamSandwich();
                    } else if (VERSION.SDK_INT >= 5) {
                        IMPL = new ImplEclair();
                    } else {
                        IMPL = new ImplBase();
                    }
                    SIDE_CHANNEL_BIND_FLAGS = IMPL.getSideChannelBindFlags();
                    return;
                default:
                    strArr2[i] = str;
                    str = "hslPDo\u007fyMKir";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static Set getEnabledListenerPackages(Context context) {
        boolean z = Fragment.a;
        String string = Secure.getString(context.getContentResolver(), z[2]);
        if (!(string == null || string.equals(sEnabledNotificationListeners))) {
            String[] split = string.split(":");
            Set hashSet = new HashSet(split.length);
            int length = split.length;
            int i = 0;
            while (i < length) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                if (unflattenFromString != null) {
                    hashSet.add(unflattenFromString.getPackageName());
                }
                i++;
                if (z) {
                    break;
                }
            }
            synchronized (sEnabledNotificationListenersLock) {
                sEnabledNotificationListenerPackages = hashSet;
                sEnabledNotificationListeners = string;
            }
        }
        return sEnabledNotificationListenerPackages;
    }

    public void cancel(int i) {
        cancel(null, i);
    }

    public void notify(int i, Notification notification) {
        notify(null, i, notification);
    }

    static int access$000() {
        return SIDE_CHANNEL_BIND_FLAGS;
    }

    private void pushSideChannelQueue(Task task) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new SideChannelManager(this.mContext.getApplicationContext());
            }
        }
        sSideChannelManager.queueTask(task);
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) this.mContext.getSystemService(z[1]);
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras == null || !extras.getBoolean(z[0])) {
            return false;
        }
        return true;
    }
}
