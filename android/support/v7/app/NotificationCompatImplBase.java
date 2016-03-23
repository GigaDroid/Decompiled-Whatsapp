package android.support.v7.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.v4.app.NotificationCompatBase.Action;
import android.support.v7.appcompat.R;
import android.widget.RemoteViews;
import java.util.List;
import org.v;
import org.whispersystems.at;

class NotificationCompatImplBase {
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "\u000e\u0017wE:\u0012\u0005Bu&\u0014\u001dme\u001b\u00131l{\"\u001c\u0011w@;\u0018\u0005963\u001e\u0006jy<]Wg6=\b\u0006#y4]\u0010lc<\u0019\u0001#>?\u001c\n#36T";
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
                        i3 = 125;
                        break;
                    case at.g /*1*/:
                        i3 = 114;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000e\u0017wB;\u0010\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u000e\u0017wE&\u001c\u0000ws6";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u000e\u0017wT3\u000e\u0017";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000e\u0017wW>\r\u001ab";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000e\u0017wW>\r\u001ab";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static int getBigLayoutResource(int i) {
        if (i > 3) {
            return R.layout.notification_template_big_media;
        }
        try {
            return R.layout.notification_template_big_media_narrow;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static void overrideBigContentView(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, List list, boolean z2, PendingIntent pendingIntent) {
        try {
            notification.bigContentView = generateBigContentView(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, list, z2, pendingIntent);
            if (z2) {
                notification.flags |= 2;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static RemoteViews generateMediaActionButton(Context context, Action action) {
        try {
            Object obj;
            if (action.getActionIntent() == null) {
                obj = 1;
            } else {
                obj = null;
            }
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_media_action);
            try {
                remoteViews.setImageViewResource(R.id.action0, action.getIcon());
                if (obj == null) {
                    remoteViews.setOnClickPendingIntent(R.id.action0, action.getActionIntent());
                }
                try {
                    if (VERSION.SDK_INT >= 15) {
                        remoteViews.setContentDescription(R.id.action0, action.getTitle());
                    }
                    return remoteViews;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public static void overrideContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, List list, int[] iArr, boolean z2, PendingIntent pendingIntent) {
        try {
            notificationBuilderWithBuilderAccessor.getBuilder().setContent(generateContentView(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, list, iArr, z2, pendingIntent));
            if (z2) {
                notificationBuilderWithBuilderAccessor.getBuilder().setOngoing(true);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.widget.RemoteViews generateBigContentView(android.content.Context r16, java.lang.CharSequence r17, java.lang.CharSequence r18, java.lang.CharSequence r19, int r20, android.graphics.Bitmap r21, java.lang.CharSequence r22, boolean r23, long r24, java.util.List r26, boolean r27, android.app.PendingIntent r28) {
        /*
        r14 = android.support.v7.app.ActionBar.a;
        r2 = r26.size();
        r3 = 5;
        r15 = java.lang.Math.min(r2, r3);
        r12 = getBigLayoutResource(r15);
        r13 = 0;
        r2 = r16;
        r3 = r17;
        r4 = r18;
        r5 = r19;
        r6 = r20;
        r7 = r21;
        r8 = r22;
        r9 = r23;
        r10 = r24;
        r4 = applyStandardTemplate(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        r2 = android.support.v7.appcompat.R.id.media_actions;
        r4.removeAllViews(r2);
        if (r15 <= 0) goto L_0x0048;
    L_0x002d:
        r2 = 0;
        r3 = r2;
    L_0x002f:
        if (r3 >= r15) goto L_0x0048;
    L_0x0031:
        r0 = r26;
        r2 = r0.get(r3);
        r2 = (android.support.v4.app.NotificationCompatBase.Action) r2;
        r0 = r16;
        r2 = generateMediaActionButton(r0, r2);
        r5 = android.support.v7.appcompat.R.id.media_actions;
        r4.addView(r5, r2);
        r2 = r3 + 1;
        if (r14 == 0) goto L_0x0077;
    L_0x0048:
        if (r27 == 0) goto L_0x006d;
    L_0x004a:
        r2 = android.support.v7.appcompat.R.id.cancel_action;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3 = 0;
        r4.setViewVisibility(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = android.support.v7.appcompat.R.id.cancel_action;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = 5;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = r16.getResources();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r6 = android.support.v7.appcompat.R.integer.cancel_button_image_alpha;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = r5.getInteger(r6);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r4.setInt(r2, r3, r5);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = android.support.v7.appcompat.R.id.cancel_action;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r0 = r28;
        r4.setOnClickPendingIntent(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r14 == 0) goto L_0x0074;
    L_0x006d:
        r2 = android.support.v7.appcompat.R.id.cancel_action;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3 = 8;
        r4.setViewVisibility(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0074:
        return r4;
    L_0x0075:
        r2 = move-exception;
        throw r2;
    L_0x0077:
        r3 = r2;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.NotificationCompatImplBase.generateBigContentView(android.content.Context, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, android.graphics.Bitmap, java.lang.CharSequence, boolean, long, java.util.List, boolean, android.app.PendingIntent):android.widget.RemoteViews");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.widget.RemoteViews applyStandardTemplate(android.content.Context r12, java.lang.CharSequence r13, java.lang.CharSequence r14, java.lang.CharSequence r15, int r16, android.graphics.Bitmap r17, java.lang.CharSequence r18, boolean r19, long r20, int r22, boolean r23) {
        /*
        r9 = android.support.v7.app.ActionBar.a;
        r2 = new android.widget.RemoteViews;
        r3 = r12.getPackageName();
        r0 = r22;
        r2.<init>(r3, r0);
        r4 = 0;
        r3 = 0;
        if (r17 == 0) goto L_0x0026;
    L_0x0011:
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0123 }
        r6 = 16;
        if (r5 < r6) goto L_0x0026;
    L_0x0017:
        r5 = android.support.v7.appcompat.R.id.icon;	 Catch:{ IllegalArgumentException -> 0x0125 }
        r6 = 0;
        r2.setViewVisibility(r5, r6);	 Catch:{ IllegalArgumentException -> 0x0125 }
        r5 = android.support.v7.appcompat.R.id.icon;	 Catch:{ IllegalArgumentException -> 0x0125 }
        r0 = r17;
        r2.setImageViewBitmap(r5, r0);	 Catch:{ IllegalArgumentException -> 0x0125 }
        if (r9 == 0) goto L_0x002d;
    L_0x0026:
        r5 = android.support.v7.appcompat.R.id.icon;	 Catch:{ IllegalArgumentException -> 0x0125 }
        r6 = 8;
        r2.setViewVisibility(r5, r6);	 Catch:{ IllegalArgumentException -> 0x0125 }
    L_0x002d:
        if (r13 == 0) goto L_0x0034;
    L_0x002f:
        r5 = android.support.v7.appcompat.R.id.title;	 Catch:{ IllegalArgumentException -> 0x0127 }
        r2.setTextViewText(r5, r13);	 Catch:{ IllegalArgumentException -> 0x0127 }
    L_0x0034:
        if (r14 == 0) goto L_0x003c;
    L_0x0036:
        r4 = android.support.v7.appcompat.R.id.text;
        r2.setTextViewText(r4, r14);
        r4 = 1;
    L_0x003c:
        if (r15 == 0) goto L_0x004c;
    L_0x003e:
        r4 = android.support.v7.appcompat.R.id.info;
        r2.setTextViewText(r4, r15);
        r4 = android.support.v7.appcompat.R.id.info;
        r5 = 0;
        r2.setViewVisibility(r4, r5);
        r4 = 1;
        if (r9 == 0) goto L_0x013a;
    L_0x004c:
        if (r16 <= 0) goto L_0x0086;
    L_0x004e:
        r4 = r12.getResources();
        r5 = android.support.v7.appcompat.R.integer.status_bar_notification_info_maxnum;
        r4 = r4.getInteger(r5);
        r0 = r16;
        if (r0 <= r4) goto L_0x006d;
    L_0x005c:
        r4 = android.support.v7.appcompat.R.id.info;	 Catch:{ IllegalArgumentException -> 0x0129 }
        r5 = r12.getResources();	 Catch:{ IllegalArgumentException -> 0x0129 }
        r6 = android.support.v7.appcompat.R.string.status_bar_notification_info_overflow;	 Catch:{ IllegalArgumentException -> 0x0129 }
        r5 = r5.getString(r6);	 Catch:{ IllegalArgumentException -> 0x0129 }
        r2.setTextViewText(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0129 }
        if (r9 == 0) goto L_0x007d;
    L_0x006d:
        r4 = java.text.NumberFormat.getIntegerInstance();
        r5 = android.support.v7.appcompat.R.id.info;
        r0 = r16;
        r6 = (long) r0;
        r4 = r4.format(r6);
        r2.setTextViewText(r5, r4);
    L_0x007d:
        r4 = android.support.v7.appcompat.R.id.info;
        r5 = 0;
        r2.setViewVisibility(r4, r5);
        r4 = 1;
        if (r9 == 0) goto L_0x013a;
    L_0x0086:
        r5 = android.support.v7.appcompat.R.id.info;	 Catch:{ IllegalArgumentException -> 0x012b }
        r6 = 8;
        r2.setViewVisibility(r5, r6);	 Catch:{ IllegalArgumentException -> 0x012b }
        r8 = r4;
    L_0x008e:
        if (r18 == 0) goto L_0x00b4;
    L_0x0090:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x012d }
        r5 = 16;
        if (r4 < r5) goto L_0x00b4;
    L_0x0096:
        r4 = android.support.v7.appcompat.R.id.text;	 Catch:{ IllegalArgumentException -> 0x012d }
        r0 = r18;
        r2.setTextViewText(r4, r0);	 Catch:{ IllegalArgumentException -> 0x012d }
        if (r14 == 0) goto L_0x00ad;
    L_0x009f:
        r3 = android.support.v7.appcompat.R.id.text2;
        r2.setTextViewText(r3, r14);
        r3 = android.support.v7.appcompat.R.id.text2;
        r4 = 0;
        r2.setViewVisibility(r3, r4);
        r3 = 1;
        if (r9 == 0) goto L_0x00b4;
    L_0x00ad:
        r4 = android.support.v7.appcompat.R.id.text2;	 Catch:{ IllegalArgumentException -> 0x012f }
        r5 = 8;
        r2.setViewVisibility(r4, r5);	 Catch:{ IllegalArgumentException -> 0x012f }
    L_0x00b4:
        if (r3 == 0) goto L_0x00d8;
    L_0x00b6:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r4 = 16;
        if (r3 < r4) goto L_0x00d8;
    L_0x00bc:
        if (r23 == 0) goto L_0x00cf;
    L_0x00be:
        r3 = r12.getResources();
        r4 = android.support.v7.appcompat.R.dimen.notification_subtext_size;
        r3 = r3.getDimensionPixelSize(r4);
        r3 = (float) r3;
        r4 = android.support.v7.appcompat.R.id.text;
        r5 = 0;
        r2.setTextViewTextSize(r4, r5, r3);
    L_0x00cf:
        r3 = android.support.v7.appcompat.R.id.line1;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r2.setViewPadding(r3, r4, r5, r6, r7);
    L_0x00d8:
        r4 = 0;
        r3 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1));
        if (r3 == 0) goto L_0x011a;
    L_0x00de:
        if (r19 == 0) goto L_0x0108;
    L_0x00e0:
        r3 = android.support.v7.appcompat.R.id.chronometer;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r4 = 0;
        r2.setViewVisibility(r3, r4);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r3 = android.support.v7.appcompat.R.id.chronometer;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0133 }
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ IllegalArgumentException -> 0x0133 }
        r10 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalArgumentException -> 0x0133 }
        r6 = r6 - r10;
        r6 = r6 + r20;
        r2.setLong(r3, r4, r6);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r3 = android.support.v7.appcompat.R.id.chronometer;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0133 }
        r5 = 1;
        r2.setBoolean(r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0133 }
        if (r9 == 0) goto L_0x011a;
    L_0x0108:
        r3 = android.support.v7.appcompat.R.id.time;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r4 = 0;
        r2.setViewVisibility(r3, r4);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r3 = android.support.v7.appcompat.R.id.time;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r20;
        r2.setLong(r3, r4, r0);	 Catch:{ IllegalArgumentException -> 0x0133 }
    L_0x011a:
        r4 = android.support.v7.appcompat.R.id.line3;	 Catch:{ IllegalArgumentException -> 0x0135 }
        if (r8 == 0) goto L_0x0137;
    L_0x011e:
        r3 = 0;
    L_0x011f:
        r2.setViewVisibility(r4, r3);
        return r2;
    L_0x0123:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0125 }
    L_0x0125:
        r2 = move-exception;
        throw r2;
    L_0x0127:
        r2 = move-exception;
        throw r2;
    L_0x0129:
        r2 = move-exception;
        throw r2;
    L_0x012b:
        r2 = move-exception;
        throw r2;
    L_0x012d:
        r2 = move-exception;
        throw r2;
    L_0x012f:
        r2 = move-exception;
        throw r2;
    L_0x0131:
        r2 = move-exception;
        throw r2;
    L_0x0133:
        r2 = move-exception;
        throw r2;
    L_0x0135:
        r2 = move-exception;
        throw r2;
    L_0x0137:
        r3 = 8;
        goto L_0x011f;
    L_0x013a:
        r8 = r4;
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.NotificationCompatImplBase.applyStandardTemplate(android.content.Context, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, android.graphics.Bitmap, java.lang.CharSequence, boolean, long, int, boolean):android.widget.RemoteViews");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.widget.RemoteViews generateContentView(android.content.Context r16, java.lang.CharSequence r17, java.lang.CharSequence r18, java.lang.CharSequence r19, int r20, android.graphics.Bitmap r21, java.lang.CharSequence r22, boolean r23, long r24, java.util.List r26, int[] r27, boolean r28, android.app.PendingIntent r29) {
        /*
        r14 = android.support.v7.app.ActionBar.a;
        r12 = android.support.v7.appcompat.R.layout.notification_template_media;
        r13 = 1;
        r2 = r16;
        r3 = r17;
        r4 = r18;
        r5 = r19;
        r6 = r20;
        r7 = r21;
        r8 = r22;
        r9 = r23;
        r10 = r24;
        r5 = applyStandardTemplate(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        r6 = r26.size();
        if (r27 != 0) goto L_0x0054;
    L_0x0021:
        r2 = 0;
        r3 = r2;
    L_0x0023:
        r2 = android.support.v7.appcompat.R.id.media_actions;
        r5.removeAllViews(r2);
        if (r3 <= 0) goto L_0x0077;
    L_0x002a:
        r2 = 0;
        r4 = r2;
    L_0x002c:
        if (r4 >= r3) goto L_0x0077;
    L_0x002e:
        if (r4 < r6) goto L_0x005e;
    L_0x0030:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = 0;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ IllegalArgumentException -> 0x0052 }
        r7 = 0;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5[r7] = r4;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r4 = 1;
        r6 = r6 + -1;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5[r4] = r6;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r3 = java.lang.String.format(r3, r5);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0052 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r2 = move-exception;
        throw r2;
    L_0x0054:
        r0 = r27;
        r2 = r0.length;
        r3 = 3;
        r2 = java.lang.Math.min(r2, r3);
        r3 = r2;
        goto L_0x0023;
    L_0x005e:
        r2 = r27[r4];
        r0 = r26;
        r2 = r0.get(r2);
        r2 = (android.support.v4.app.NotificationCompatBase.Action) r2;
        r0 = r16;
        r2 = generateMediaActionButton(r0, r2);
        r7 = android.support.v7.appcompat.R.id.media_actions;
        r5.addView(r7, r2);
        r2 = r4 + 1;
        if (r14 == 0) goto L_0x00b3;
    L_0x0077:
        if (r28 == 0) goto L_0x00a3;
    L_0x0079:
        r2 = android.support.v7.appcompat.R.id.end_padder;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r3 = 8;
        r5.setViewVisibility(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r2 = android.support.v7.appcompat.R.id.cancel_action;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r3 = 0;
        r5.setViewVisibility(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r2 = android.support.v7.appcompat.R.id.cancel_action;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r0 = r29;
        r5.setOnClickPendingIntent(r2, r0);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r2 = android.support.v7.appcompat.R.id.cancel_action;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r4 = r16.getResources();	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r6 = android.support.v7.appcompat.R.integer.cancel_button_image_alpha;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r4 = r4.getInteger(r6);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r5.setInt(r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        if (r14 == 0) goto L_0x00b0;
    L_0x00a3:
        r2 = android.support.v7.appcompat.R.id.end_padder;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r3 = 0;
        r5.setViewVisibility(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r2 = android.support.v7.appcompat.R.id.cancel_action;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r3 = 8;
        r5.setViewVisibility(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00b1 }
    L_0x00b0:
        return r5;
    L_0x00b1:
        r2 = move-exception;
        throw r2;
    L_0x00b3:
        r4 = r2;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.NotificationCompatImplBase.generateContentView(android.content.Context, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, android.graphics.Bitmap, java.lang.CharSequence, boolean, long, java.util.List, int[], boolean, android.app.PendingIntent):android.widget.RemoteViews");
    }
}
