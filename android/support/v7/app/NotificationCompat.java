package android.support.v7.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.v4.app.NotificationCompat.BuilderExtender;
import android.support.v4.app.NotificationCompat.Style;
import android.support.v4.media.session.MediaSessionCompat.Token;

public class NotificationCompat extends android.support.v4.app.NotificationCompat {

    public class Builder extends android.support.v4.app.NotificationCompat.Builder {
        public Builder(Context context) {
            super(context);
        }

        protected BuilderExtender getExtender() {
            if (VERSION.SDK_INT >= 21) {
                return new LollipopExtender(null);
            }
            if (VERSION.SDK_INT >= 16) {
                return new JellybeanExtender(null);
            }
            if (VERSION.SDK_INT >= 14) {
                return new IceCreamSandwichExtender(null);
            }
            return super.getExtender();
        }
    }

    class IceCreamSandwichExtender extends BuilderExtender {
        private IceCreamSandwichExtender() {
        }

        public Notification build(android.support.v4.app.NotificationCompat.Builder builder, NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            NotificationCompat.access$300(notificationBuilderWithBuilderAccessor, builder);
            return notificationBuilderWithBuilderAccessor.build();
        }

        IceCreamSandwichExtender(1 1) {
            this();
        }
    }

    class JellybeanExtender extends BuilderExtender {
        public Notification build(android.support.v4.app.NotificationCompat.Builder builder, NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            NotificationCompat.access$300(notificationBuilderWithBuilderAccessor, builder);
            Notification build = notificationBuilderWithBuilderAccessor.build();
            NotificationCompat.access$400(build, builder);
            return build;
        }

        JellybeanExtender(1 1) {
            this();
        }

        private JellybeanExtender() {
        }
    }

    class LollipopExtender extends BuilderExtender {
        LollipopExtender(1 1) {
            this();
        }

        public Notification build(android.support.v4.app.NotificationCompat.Builder builder, NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            NotificationCompat.access$500(notificationBuilderWithBuilderAccessor, builder.mStyle);
            return notificationBuilderWithBuilderAccessor.build();
        }

        private LollipopExtender() {
        }
    }

    public class MediaStyle extends Style {
        int[] mActionsToShowInCompact;
        PendingIntent mCancelButtonIntent;
        boolean mShowCancelButton;
        Token mToken;

        public MediaStyle() {
            this.mActionsToShowInCompact = null;
        }
    }

    private static void addMediaStyleToBuilderIcs(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat.Builder builder) {
        if (builder.mStyle instanceof MediaStyle) {
            MediaStyle mediaStyle = (MediaStyle) builder.mStyle;
            NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor2 = notificationBuilderWithBuilderAccessor;
            NotificationCompatImplBase.overrideContentView(notificationBuilderWithBuilderAccessor2, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.mNotification.when, builder.mActions, mediaStyle.mActionsToShowInCompact, mediaStyle.mShowCancelButton, mediaStyle.mCancelButtonIntent);
        }
    }

    static void access$500(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, Style style) {
        addMediaStyleToBuilderLollipop(notificationBuilderWithBuilderAccessor, style);
    }

    static void access$400(Notification notification, android.support.v4.app.NotificationCompat.Builder builder) {
        addBigMediaStyleToBuilderJellybean(notification, builder);
    }

    private static void addMediaStyleToBuilderLollipop(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, Style style) {
        if (style instanceof MediaStyle) {
            MediaStyle mediaStyle = (MediaStyle) style;
            NotificationCompatImpl21.addMediaStyle(notificationBuilderWithBuilderAccessor, mediaStyle.mActionsToShowInCompact, mediaStyle.mToken != null ? mediaStyle.mToken.getToken() : null);
        }
    }

    static void access$300(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat.Builder builder) {
        addMediaStyleToBuilderIcs(notificationBuilderWithBuilderAccessor, builder);
    }

    private static void addBigMediaStyleToBuilderJellybean(Notification notification, android.support.v4.app.NotificationCompat.Builder builder) {
        if (builder.mStyle instanceof MediaStyle) {
            MediaStyle mediaStyle = (MediaStyle) builder.mStyle;
            Notification notification2 = notification;
            NotificationCompatImplBase.overrideBigContentView(notification2, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.mNotification.when, builder.mActions, mediaStyle.mShowCancelButton, mediaStyle.mCancelButtonIntent);
        }
    }
}
