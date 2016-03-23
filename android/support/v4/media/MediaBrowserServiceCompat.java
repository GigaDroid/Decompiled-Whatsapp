package android.support.v4.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.media.IMediaBrowserServiceCompat.Stub;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.whatsapp.arj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import org.v;
import org.whispersystems.at;

public abstract class MediaBrowserServiceCompat extends Service {
    public static int a;
    private static final String[] z;
    private ServiceBinder mBinder;
    private final ArrayMap mConnections;
    private final Handler mHandler;
    Token mSession;

    class 1 implements Runnable {
        private static final String[] z;
        final MediaBrowserServiceCompat this$0;
        final Token val$token;

        static {
            String[] strArr = new String[3];
            String str = "P\u001eZKxp\u0005]Js3\u0017[W=";
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
                            i3 = 19;
                            break;
                        case at.g /*1*/:
                            i3 = 113;
                            break;
                        case at.i /*2*/:
                            i3 = 52;
                            break;
                        case at.o /*3*/:
                            i3 = 37;
                            break;
                        default:
                            i3 = 29;
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
                        str = "^\u0014PL|Q\u0003[Rnv\u0003g@oe\u0018W@^|\u001cDDi";
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "3\u0018G\u0005s|QXJst\u0014F\u0005kr\u001d]A3";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void run() {
            int i = MediaBrowserServiceCompat.a;
            for (IBinder iBinder : MediaBrowserServiceCompat.access$100(this.this$0).keySet()) {
                ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.access$100(this.this$0).get(iBinder);
                try {
                    connectionRecord.callbacks.onConnect(connectionRecord.root.getRootId(), this.val$token, connectionRecord.root.getExtras());
                    continue;
                } catch (RemoteException e) {
                    Log.w(z[2], z[0] + connectionRecord.pkg + z[1]);
                    MediaBrowserServiceCompat.access$100(this.this$0).remove(iBinder);
                    continue;
                }
                if (i != 0) {
                    return;
                }
            }
        }
    }

    public class Result {
        private static final String z;
        private Object mDebug;
        private boolean mDetachCalled;
        private boolean mSendResultCalled;
        final MediaBrowserServiceCompat this$0;

        static {
            char[] toCharArray = "q7)@Mg!2Hk*{gG~n>\"@?v%.Gz\"4(V%\"".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 2;
                        break;
                    case at.g /*1*/:
                        i2 = 82;
                        break;
                    case at.i /*2*/:
                        i2 = 71;
                        break;
                    case at.o /*3*/:
                        i2 = 36;
                        break;
                    default:
                        i2 = 31;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public void sendResult(Object obj) {
            try {
                if (this.mSendResultCalled) {
                    throw new IllegalStateException(z + this.mDebug);
                }
                this.mSendResultCalled = true;
                onResultSent(obj);
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        Result(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj) {
            this.this$0 = mediaBrowserServiceCompat;
            this.mDebug = obj;
        }

        void onResultSent(Object obj) {
        }

        boolean isDone() {
            try {
                if (!this.mDetachCalled) {
                    if (!this.mSendResultCalled) {
                        return false;
                    }
                }
                return true;
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    class 3 extends Result {
        private static final String[] z;
        final MediaBrowserServiceCompat this$0;
        final ConnectionRecord val$connection;
        final String val$parentId;

        static {
            String[] strArr = new String[4];
            String str = "ye\u0003GBTcODEvk\u000eOhRm\u0003OY_jG\u0002\u000b\\e\u0006GN^$\tDY\u001am\u000b\u0016";
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
                            i3 = 58;
                            break;
                        case at.g /*1*/:
                            i3 = 4;
                            break;
                        case at.i /*2*/:
                            i3 = 111;
                            break;
                        case at.o /*3*/:
                            i3 = 43;
                            break;
                        default:
                            i3 = 43;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u001at\u000eH@[c\n\u0016";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "Uj#DJ^G\u0007BG^v\nE\u000bIa\u0001_\u000bTq\u0003G\u000bVm\u001c_\u000b\\k\u001d\u000bB^$";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "wa\u000bBJxv\u0000\\X_v<NYLm\fNhUi\u001fJ_";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        void onResultSent(List list) {
            if (list == null) {
                try {
                    throw new IllegalStateException(z[3] + this.val$parentId);
                } catch (RemoteException e) {
                    throw e;
                }
            }
            try {
                if (MediaBrowserServiceCompat.access$100(this.this$0).get(this.val$connection.callbacks.asBinder()) == this.val$connection) {
                    try {
                        this.val$connection.callbacks.onLoadChildren(this.val$parentId, list);
                    } catch (RemoteException e2) {
                        Log.w(z[1], z[0] + this.val$parentId + z[2] + this.val$connection.pkg);
                    }
                }
            } catch (RemoteException e3) {
                throw e3;
            }
        }

        void onResultSent(Object obj) {
            onResultSent((List) obj);
        }

        3(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, String str, ConnectionRecord connectionRecord) {
            this.this$0 = mediaBrowserServiceCompat;
            this.val$parentId = str;
            this.val$connection = connectionRecord;
            super(mediaBrowserServiceCompat, obj);
        }
    }

    class 4 extends Result {
        private static final String z;
        final MediaBrowserServiceCompat this$0;
        final ResultReceiver val$receiver;

        static {
            char[] toCharArray = "1\u0012((\u0005\u0003\u001e8$\t".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 92;
                        break;
                    case at.g /*1*/:
                        i2 = 119;
                        break;
                    case at.i /*2*/:
                        i2 = 76;
                        break;
                    case at.o /*3*/:
                        i2 = 65;
                        break;
                    default:
                        i2 = 100;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        void onResultSent(MediaItem mediaItem) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(z, mediaItem);
            this.val$receiver.send(0, bundle);
        }

        void onResultSent(Object obj) {
            onResultSent((MediaItem) obj);
        }

        4(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            this.this$0 = mediaBrowserServiceCompat;
            this.val$receiver = resultReceiver;
            super(mediaBrowserServiceCompat, obj);
        }
    }

    public final class BrowserRoot {
        private final Bundle mExtras;
        private final String mRootId;

        public String getRootId() {
            return this.mRootId;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }
    }

    class ConnectionRecord {
        IMediaBrowserServiceCompatCallbacks callbacks;
        String pkg;
        BrowserRoot root;
        Bundle rootHints;
        HashSet subscriptions;
        final MediaBrowserServiceCompat this$0;

        private ConnectionRecord(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.this$0 = mediaBrowserServiceCompat;
            this.subscriptions = new HashSet();
        }

        ConnectionRecord(MediaBrowserServiceCompat mediaBrowserServiceCompat, 1 1) {
            this(mediaBrowserServiceCompat);
        }
    }

    class ServiceBinder extends Stub {
        private static final String[] z;
        final MediaBrowserServiceCompat this$0;

        class 1 implements Runnable {
            private static final String[] z;
            final ServiceBinder this$1;
            final IMediaBrowserServiceCompatCallbacks val$callbacks;
            final String val$pkg;
            final Bundle val$rootHints;
            final int val$uid;

            static {
                String[] strArr = new String[7];
                String str = "j;\"\u0000\u0012e,)\u001e\u0000B,\u0015\f\u0001Q7%\f0H36\b\u0007";
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
                                i3 = 39;
                                break;
                            case at.g /*1*/:
                                i3 = 94;
                                break;
                            case at.i /*2*/:
                                i3 = 70;
                                break;
                            case at.o /*3*/:
                                i3 = arj.Theme_radioButtonStyle;
                                break;
                            default:
                                i3 = 115;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case v.m /*0*/:
                            strArr2[i] = str;
                            str = "d?*\u0005\u001aI9f\u0006\u001dd1(\u0007\u0016D*n@SA?/\u0005\u0016Cpf-\u0001H.6\u0000\u001d@~%\u0005\u001aB02GSW5!T";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case at.g /*1*/:
                            strArr2[i] = str;
                            str = "\u000784\u0006\u001e\u0007-#\u001b\u0005N=#I";
                            i = 3;
                            strArr2 = strArr3;
                            obj = 2;
                            break;
                        case at.i /*2*/:
                            strArr2[i] = str;
                            str = "j;\"\u0000\u0012e,)\u001e\u0000B,\u0015\f\u0001Q7%\f0H36\b\u0007";
                            i = 4;
                            strArr2 = strArr3;
                            obj = 3;
                            break;
                        case at.o /*3*/:
                            strArr2[i] = str;
                            i = 5;
                            strArr2 = strArr3;
                            str = "d?*\u0005\u001aI9f\u0006\u001dd1(\u0007\u0016D*\u0000\b\u001aK;\"AZ\u00078'\u0000\u001fB:hI:@0)\u001b\u001aI9hI\u0003L9{";
                            obj = 4;
                            break;
                        case at.p /*4*/:
                            strArr2[i] = str;
                            i = 6;
                            str = "j;\"\u0000\u0012e,)\u001e\u0000B,\u0015\f\u0001Q7%\f0H36\b\u0007";
                            obj = 5;
                            strArr2 = strArr3;
                            break;
                        case at.m /*5*/:
                            strArr2[i] = str;
                            z = strArr3;
                            return;
                        default:
                            strArr2[i] = str;
                            str = "i1f\u001b\u001cH*f\u000f\u001cU~%\u0005\u001aB02I";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            1(ServiceBinder serviceBinder, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks, String str, Bundle bundle, int i) {
                this.this$1 = serviceBinder;
                this.val$callbacks = iMediaBrowserServiceCompatCallbacks;
                this.val$pkg = str;
                this.val$rootHints = bundle;
                this.val$uid = i;
            }

            public void run() {
                IBinder asBinder = this.val$callbacks.asBinder();
                MediaBrowserServiceCompat.access$100(this.this$1.this$0).remove(asBinder);
                ConnectionRecord connectionRecord = new ConnectionRecord(this.this$1.this$0, null);
                connectionRecord.pkg = this.val$pkg;
                connectionRecord.rootHints = this.val$rootHints;
                connectionRecord.callbacks = this.val$callbacks;
                connectionRecord.root = this.this$1.this$0.onGetRoot(this.val$pkg, this.val$uid, this.val$rootHints);
                if (connectionRecord.root == null) {
                    Log.i(z[0], z[1] + this.val$pkg + z[3] + getClass().getName());
                    try {
                        this.val$callbacks.onConnectFailed();
                        return;
                    } catch (RemoteException e) {
                        Log.w(z[4], z[5] + this.val$pkg);
                        if (MediaBrowserServiceCompat.a == 0) {
                            return;
                        }
                    }
                }
                try {
                    MediaBrowserServiceCompat.access$100(this.this$1.this$0).put(asBinder, connectionRecord);
                    if (this.this$1.this$0.mSession != null) {
                        this.val$callbacks.onConnect(connectionRecord.root.getRootId(), this.this$1.this$0.mSession, connectionRecord.root.getExtras());
                    }
                } catch (RemoteException e2) {
                    Log.w(z[6], z[2] + this.val$pkg);
                    MediaBrowserServiceCompat.access$100(this.this$1.this$0).remove(asBinder);
                }
            }
        }

        class 2 implements Runnable {
            final ServiceBinder this$1;
            final IMediaBrowserServiceCompatCallbacks val$callbacks;

            public void run() {
                if (((ConnectionRecord) MediaBrowserServiceCompat.access$100(this.this$1.this$0).remove(this.val$callbacks.asBinder())) == null) {
                }
            }

            2(ServiceBinder serviceBinder, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks) {
                this.this$1 = serviceBinder;
                this.val$callbacks = iMediaBrowserServiceCompatCallbacks;
            }
        }

        class 3 implements Runnable {
            private static final String[] z;
            final ServiceBinder this$1;
            final IMediaBrowserServiceCompatCallbacks val$callbacks;
            final String val$id;

            static {
                String[] strArr = new String[2];
                String str = "[r|zAXe{[]JbqFZ\u001apw[\u0014YwtEV[us\t@Rwl\t]Ix?]\u0014Hs\u007f@GNsjLP\u001a\u007f|\u0014";
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
                                i3 = 58;
                                break;
                            case at.g /*1*/:
                                i3 = 22;
                                break;
                            case at.i /*2*/:
                                i3 = 24;
                                break;
                            case at.o /*3*/:
                                i3 = 41;
                                break;
                            default:
                                i3 = 52;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case v.m /*0*/:
                            strArr2[i] = str;
                            z = strArr3;
                            return;
                        default:
                            strArr2[i] = str;
                            i = 1;
                            strArr2 = strArr3;
                            str = "ws|@Uxdw^G_dKLFL\u007f{LwU{hH@";
                            obj = null;
                    }
                }
            }

            3(ServiceBinder serviceBinder, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks, String str) {
                this.this$1 = serviceBinder;
                this.val$callbacks = iMediaBrowserServiceCompatCallbacks;
                this.val$id = str;
            }

            public void run() {
                ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.access$100(this.this$1.this$0).get(this.val$callbacks.asBinder());
                if (connectionRecord == null) {
                    Log.w(z[1], z[0] + this.val$id);
                } else {
                    MediaBrowserServiceCompat.access$400(this.this$1.this$0, this.val$id, connectionRecord);
                }
            }
        }

        class 4 implements Runnable {
            private static final String[] z;
            final ServiceBinder this$1;
            final IMediaBrowserServiceCompatCallbacks val$callbacks;
            final String val$id;

            static {
                String[] strArr = new String[5];
                String str = "\"Q2Yej\u00063C&lI.\u0010uwD)StkD?T";
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
                                i3 = 2;
                                break;
                            case at.g /*1*/:
                                i3 = 38;
                                break;
                            case at.i /*2*/:
                                i3 = 90;
                                break;
                            case at.o /*3*/:
                                i3 = 48;
                                break;
                            default:
                                i3 = 6;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case v.m /*0*/:
                            strArr2[i] = str;
                            str = "pC7_pgu/RuaT3@rkI4\u0010ecJ6Ub\"@5B&";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case at.g /*1*/:
                            strArr2[i] = str;
                            str = "OC>Yg@T5GugT\tUttO9UEmK*Qr";
                            i = 3;
                            strArr2 = strArr3;
                            obj = 2;
                            break;
                        case at.i /*2*/:
                            strArr2[i] = str;
                            i = 4;
                            strArr2 = strArr3;
                            str = "pC7_pgu/RuaT3@rkI4\u0010`mTzSgnJ8Qei\u0006.Xgv\u00063Ch%RzBceO)DcpC>\u0010of\u001b";
                            obj = 3;
                            break;
                        case at.o /*3*/:
                            strArr2[i] = str;
                            z = strArr3;
                            return;
                        default:
                            strArr2[i] = str;
                            str = "OC>Yg@T5GugT\tUttO9UEmK*Qr";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            4(ServiceBinder serviceBinder, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks, String str) {
                this.this$1 = serviceBinder;
                this.val$callbacks = iMediaBrowserServiceCompatCallbacks;
                this.val$id = str;
            }

            public void run() {
                ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.access$100(this.this$1.this$0).get(this.val$callbacks.asBinder());
                if (connectionRecord == null) {
                    Log.w(z[1], z[4] + this.val$id);
                } else if (!connectionRecord.subscriptions.remove(this.val$id)) {
                    Log.w(z[3], z[2] + this.val$id + z[0]);
                }
            }
        }

        class 5 implements Runnable {
            final ServiceBinder this$1;
            final String val$mediaId;
            final ResultReceiver val$receiver;

            public void run() {
                MediaBrowserServiceCompat.access$500(this.this$1.this$0, this.val$mediaId, this.val$receiver);
            }

            5(ServiceBinder serviceBinder, String str, ResultReceiver resultReceiver) {
                this.this$1 = serviceBinder;
                this.val$mediaId = str;
                this.val$receiver = resultReceiver;
            }
        }

        static {
            String[] strArr = new String[2];
            String str = "ZJ=%DmNq;Ln\u000b3'VgJ*-M0\u000b+'A7";
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
                            i3 = 10;
                            break;
                        case at.g /*1*/:
                            i3 = 43;
                            break;
                        case at.i /*2*/:
                            i3 = 94;
                            break;
                        case at.o /*3*/:
                            i3 = 78;
                            break;
                        default:
                            i3 = 37;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "*[?-NkL;s";
                        obj = null;
                }
            }
        }

        public void getMediaItem(String str, ResultReceiver resultReceiver) {
            try {
                if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                    MediaBrowserServiceCompat.access$300(this.this$0).post(new 5(this, str, resultReceiver));
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }

        public void addSubscription(String str, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks) {
            MediaBrowserServiceCompat.access$300(this.this$0).post(new 3(this, iMediaBrowserServiceCompatCallbacks, str));
        }

        ServiceBinder(MediaBrowserServiceCompat mediaBrowserServiceCompat, 1 1) {
            this(mediaBrowserServiceCompat);
        }

        private ServiceBinder(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.this$0 = mediaBrowserServiceCompat;
        }

        public void disconnect(IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks) {
            MediaBrowserServiceCompat.access$300(this.this$0).post(new 2(this, iMediaBrowserServiceCompatCallbacks));
        }

        public void connect(String str, Bundle bundle, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks) {
            int callingUid = Binder.getCallingUid();
            try {
                if (MediaBrowserServiceCompat.access$000(this.this$0, str, callingUid)) {
                    MediaBrowserServiceCompat.access$300(this.this$0).post(new 1(this, iMediaBrowserServiceCompatCallbacks, str, bundle, callingUid));
                    return;
                }
                throw new IllegalArgumentException(z[0] + callingUid + z[1] + str);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public void removeSubscription(String str, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks) {
            MediaBrowserServiceCompat.access$300(this.this$0).post(new 4(this, iMediaBrowserServiceCompatCallbacks, str));
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "{;;%Ss1q:Y~<>y^h:($Y4\u0018:3U{\u0017-8Ki0-\u0004Yh#64YY:2']n";
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
                        i3 = 85;
                        break;
                    case at.i /*2*/:
                        i3 = 95;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ":<;j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "u;\u00138]~\u001c+2Q:8*$H:6>;P:1:#]y=w~\u001cu'\u007f$Yt1\r2Oo9+\u007f\u0015:7:1Sh0\u007f%Yn -9Ut2\u007f1Shu63\u0001";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "u;\u00138]~\u00167>P~':9\u001cw ,#\u001cy43;\u001c~0+6_r}vwShu,2R~\u0007:$Iv!w~\u001cx098N\u007fu-2Ho'1>R}u98N:%>4W{2:j";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static boolean access$000(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i) {
        return mediaBrowserServiceCompat.isValidPackage(str, i);
    }

    @Nullable
    public abstract BrowserRoot onGetRoot(@NonNull String str, int i, @Nullable Bundle bundle);

    public abstract void onLoadChildren(@NonNull String str, @NonNull Result result);

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public MediaBrowserServiceCompat() {
        this.mConnections = new ArrayMap();
        this.mHandler = new Handler();
    }

    static ArrayMap access$100(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        return mediaBrowserServiceCompat.mConnections;
    }

    private boolean isValidPackage(String str, int i) {
        int i2 = a;
        if (str == null) {
            return false;
        }
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i3 = 0;
        while (i3 < length) {
            try {
                if (packagesForUid[i3].equals(str)) {
                    return true;
                }
                i3++;
                if (i2 != 0) {
                    return false;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return false;
    }

    public void onLoadItem(String str, Result result) {
        result.sendResult(null);
    }

    private void addSubscription(String str, ConnectionRecord connectionRecord) {
        connectionRecord.subscriptions.add(str);
        performLoadChildren(str, connectionRecord);
    }

    static Handler access$300(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        return mediaBrowserServiceCompat.mHandler;
    }

    static void access$500(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, ResultReceiver resultReceiver) {
        mediaBrowserServiceCompat.performLoadItem(str, resultReceiver);
    }

    public void onCreate() {
        super.onCreate();
        this.mBinder = new ServiceBinder(this, null);
    }

    private void performLoadItem(String str, ResultReceiver resultReceiver) {
        Result 4 = new 4(this, str, resultReceiver);
        try {
            onLoadItem(str, 4);
            if (!4.isDone()) {
                throw new IllegalStateException(z[3] + str);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static void access$400(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, ConnectionRecord connectionRecord) {
        mediaBrowserServiceCompat.addSubscription(str, connectionRecord);
    }

    private void performLoadChildren(String str, ConnectionRecord connectionRecord) {
        Result 3 = new 3(this, str, str, connectionRecord);
        try {
            onLoadChildren(str, 3);
            if (!3.isDone()) {
                throw new IllegalStateException(z[1] + connectionRecord.pkg + z[2] + str);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public IBinder onBind(Intent intent) {
        try {
            if (z[0].equals(intent.getAction())) {
                return this.mBinder;
            }
            return null;
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
