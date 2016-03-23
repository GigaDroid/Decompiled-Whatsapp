package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Point;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.cx;
import com.whatsapp.util.Log;
import com.whatsapp.util.u;
import java.util.HashMap;
import java.util.Iterator;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class GroupChatLiveLocationsActivity2 extends DialogToastActivity implements ConnectionCallbacks, OnConnectionFailedListener, LocationListener {
    private static final String[] z;
    private MenuItem n;
    private cx o;
    private boolean p;
    private GoogleMap q;
    private HashMap r;
    private aox s;
    private float t;
    private GoogleMapView2 u;
    private ImageView v;
    private HashMap w;

    class 2 extends GoogleMapView2 {
        final GroupChatLiveLocationsActivity2 n;

        2(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, Context context, GoogleMapOptions googleMapOptions) {
            this.n = groupChatLiveLocationsActivity2;
            super(context, googleMapOptions);
        }

        public void a(int i) {
            boolean z = DialogToastActivity.f;
            GroupChatLiveLocationsActivity2.a(this.n, true);
            switch (i) {
                case v.m /*0*/:
                    GroupChatLiveLocationsActivity2.i(this.n).setImageResource(2130837637);
                    if (!z) {
                        return;
                    }
                    break;
                case at.g /*1*/:
                    break;
                case at.i /*2*/:
                    break;
                default:
                    return;
            }
            GroupChatLiveLocationsActivity2.i(this.n).setImageResource(2130837677);
            if (!z) {
                return;
            }
            GroupChatLiveLocationsActivity2.i(this.n).setImageResource(2130837676);
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            GroupChatLiveLocationsActivity2.a(this.n, true);
            GroupChatLiveLocationsActivity2.a(this.n, null);
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        String[] strArr = new String[24];
        String str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0006\u0017|;{\u0001\rr*B\u001c\u001c";
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
                        i3 = 127;
                        break;
                    case at.g /*1*/:
                        i3 = 19;
                        break;
                    case at.i /*2*/:
                        i3 = 76;
                        break;
                    case at.o /*3*/:
                        i3 = 36;
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
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0018\u001ec\u0013P\f\u000fv";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001c|!\n\u0002\u0017r8W\u0014\u000fc\u0013T\u0007\u001au)V\u0010\u0011p)W";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u001c|!\n\u0002\u0017r8W\u0014\u000fc\u0013T\u0007\u001au)V\u0010\u0011p)W";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0018\u001ec\u0013P\f\u000fv";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001c|!\n\u0002\u0017r8W\u0014\u000fc\u0013T\u0007\u001au)V\u0010\u0011p)W";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0018\u001ec\u0013P\f\u000fv";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001c|!\n\u0002\u0017r8W\u0014\u000fc\u0013T\u0007\u001au)V\u0010\u0011p)W";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u000f\u0010|!";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0019\u001eg";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0019\u0010}";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0018a#Q\u0005\u0013|/E\u0001\u0016|\"WZ\u001ca)E\u0001\u001a";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0015z(";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "_`)H\u0010\u001cg)@";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0018a#Q\u0005\u0013|/E\u0001\u0016|\"WZ\u0012r>O\u0010\rp>A\u0014\u000bv(\u0004";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0006\u0017|;{\u0001\rr*B\u001c\u001c";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001c|!\n\u0002\u0017r8W\u0014\u000fc\u0013T\u0007\u001au)V\u0010\u0011p)W";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u000f\u0010|!";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    str = "\u001c|!\n\u0002\u0017r8W\u0014\u000fc\u0013T\u0007\u001au)V\u0010\u0011p)W";
                    obj = 18;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0018\u001ec\u0013P\f\u000fv";
                    obj = 19;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0019\u0010}";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001c|!\n\u0002\u0017r8W\u0014\u000fc\u0013T\u0007\u001au)V\u0010\u0011p)W";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0013z:A*\u0013|/E\u0001\u0016|\"{\u0019\u001eg";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001c|!\n\u0002\u0017r8W\u0014\u000fc\u0013T\u0007\u001au)V\u0010\u0011p)W";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a() {
        if (this.q == null) {
            this.q = this.u.getMap();
            if (this.q != null) {
                b();
            }
        }
    }

    public GroupChatLiveLocationsActivity2() {
        this.r = new HashMap();
        this.w = new HashMap();
        this.t = -1.0f;
        this.s = new aos(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.gms.maps.model.MarkerOptions a(java.util.Collection r27, boolean r28, int r29) {
        /*
        r26 = this;
        r7 = com.whatsapp.DialogToastActivity.f;
        r5 = r27.size();
        r0 = r26;
        r8 = r0.a(r5);
        r5 = 1107296256; // 0x42000000 float:32.0 double:5.4707704E-315;
        r6 = com.whatsapp.a4d.a();
        r6 = r6.g;
        r5 = r5 * r6;
        r9 = (int) r5;
        r5 = 1080033280; // 0x40600000 float:3.5 double:5.3360734E-315;
        r6 = com.whatsapp.a4d.a();
        r6 = r6.g;
        r5 = r5 * r6;
        r10 = (int) r5;
        r5 = r9 + r10;
        r6 = r8.x;
        r5 = r5 * r6;
        r11 = r5 + r10;
        r5 = r9 + r10;
        r6 = r8.y;
        r5 = r5 * r6;
        r12 = r5 + r10;
        r5 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;
        r6 = com.whatsapp.a4d.a();
        r6 = r6.g;
        r5 = r5 * r6;
        r5 = (int) r5;
        r6 = com.whatsapp.a4d.a();
        r6 = r6.g;
        r13 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r6 = r6 * r13;
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 / r13;
        r13 = r9 / 5;
        r14 = (int) r6;
        r13 = r13 - r14;
        r14 = new com.whatsapp.ci;
        r14.<init>();
        if (r28 == 0) goto L_0x005c;
    L_0x004f:
        r15 = 1;
        r15 = new int[r15];
        r16 = 0;
        r17 = 16842913; // 0x10100a1 float:2.369401E-38 double:8.3215047E-317;
        r15[r16] = r17;
        r14.setState(r15);
    L_0x005c:
        r14.a(r5);
        r15 = new android.graphics.Rect;
        r15.<init>();
        r14.getPadding(r15);
        r5 = 0;
        r16 = 0;
        r0 = r15.left;
        r17 = r0;
        r17 = r17 + r11;
        r0 = r15.right;
        r18 = r0;
        r17 = r17 + r18;
        r0 = r15.top;
        r18 = r0;
        r18 = r18 + r12;
        r0 = r15.bottom;
        r19 = r0;
        r18 = r18 + r19;
        r0 = r16;
        r1 = r17;
        r2 = r18;
        r14.setBounds(r5, r0, r1, r2);
        r5 = r15.left;
        r5 = r5 + r11;
        r0 = r15.right;
        r16 = r0;
        r5 = r5 + r16;
        r0 = r15.top;
        r16 = r0;
        r16 = r16 + r12;
        r0 = r15.bottom;
        r17 = r0;
        r16 = r16 + r17;
        r17 = r13 * 2;
        r0 = r17;
        r0 = (float) r0;
        r17 = r0;
        r17 = r17 + r6;
        r0 = r17;
        r0 = (int) r0;
        r17 = r0;
        r16 = r16 + r17;
        r17 = android.graphics.Bitmap.Config.ARGB_8888;
        r0 = r16;
        r1 = r17;
        r16 = android.graphics.Bitmap.createBitmap(r5, r0, r1);
        r17 = new android.graphics.Canvas;
        r0 = r17;
        r1 = r16;
        r0.<init>(r1);
        r5 = r15.left;
        r18 = r11 / 2;
        r5 = r5 + r18;
        r0 = r15.top;
        r18 = r0;
        r18 = r18 + r12;
        r0 = r15.bottom;
        r19 = r0;
        r18 = r18 + r19;
        r0 = (float) r13;
        r19 = r0;
        r19 = r19 - r6;
        r0 = r19;
        r0 = (int) r0;
        r19 = r0;
        r18 = r18 + r19;
        r19 = new android.graphics.BlurMaskFilter;
        r20 = android.graphics.BlurMaskFilter.Blur.NORMAL;
        r0 = r19;
        r1 = r20;
        r0.<init>(r6, r1);
        r20 = new android.graphics.Paint;
        r21 = 1;
        r20.<init>(r21);
        r21 = -6710887; // 0xffffffffff999999 float:NaN double:NaN;
        r20.setColor(r21);
        r21 = android.graphics.Paint.Style.FILL;
        r20.setStyle(r21);
        r0 = r20;
        r1 = r19;
        r0.setMaskFilter(r1);
        r19 = 0;
        r0 = r17;
        r1 = r19;
        r0.translate(r1, r6);
        r0 = (float) r5;
        r19 = r0;
        r0 = r18;
        r0 = (float) r0;
        r21 = r0;
        r0 = (float) r13;
        r22 = r0;
        r0 = r17;
        r1 = r19;
        r2 = r21;
        r3 = r22;
        r4 = r20;
        r0.drawCircle(r1, r2, r3, r4);
        r19 = 0;
        r6 = -r6;
        r0 = r17;
        r1 = r19;
        r0.translate(r1, r6);
        r6 = 0;
        r0 = r20;
        r0.setMaskFilter(r6);
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r20;
        r0.setStrokeWidth(r6);
        r6 = android.graphics.Paint.Style.STROKE;
        r0 = r20;
        r0.setStyle(r6);
        r6 = -1728053248; // 0xffffffff99000000 float:-6.617445E-24 double:NaN;
        r0 = r20;
        r0.setColor(r6);
        r6 = (float) r5;
        r0 = r18;
        r0 = (float) r0;
        r19 = r0;
        r0 = (float) r13;
        r21 = r0;
        r0 = r17;
        r1 = r19;
        r2 = r21;
        r3 = r20;
        r0.drawCircle(r6, r1, r2, r3);
        r6 = android.graphics.Paint.Style.FILL;
        r0 = r20;
        r0.setStyle(r6);
        r0 = r20;
        r1 = r29;
        r0.setColor(r1);
        r5 = (float) r5;
        r0 = r18;
        r6 = (float) r0;
        r0 = (float) r13;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r2 = r20;
        r0.drawCircle(r5, r6, r1, r2);
        r0 = r17;
        r14.draw(r0);
        r14 = new android.graphics.Paint;
        r14.<init>();
        r5 = 1;
        r14.setAntiAlias(r5);
        r5 = 1;
        r14.setFilterBitmap(r5);
        r5 = 1;
        r14.setDither(r5);
        r5 = 0;
        r18 = r27.iterator();
        r6 = r5;
    L_0x0199:
        r5 = r18.hasNext();
        if (r5 == 0) goto L_0x0248;
    L_0x019f:
        r5 = r18.next();
        r5 = (java.lang.String) r5;
        r19 = com.whatsapp.App.as;
        r0 = r19;
        r19 = r0.b(r5);
        r5 = r26.getResources();
        r21 = 2131427544; // 0x7f0b00d8 float:1.8476707E38 double:1.053065126E-314;
        r0 = r21;
        r5 = r5.getDimensionPixelSize(r0);
        r21 = r26.getResources();
        r22 = 2131427359; // 0x7f0b001f float:1.8476332E38 double:1.0530650347E-314;
        r21 = r21.getDimension(r22);
        r22 = 1;
        r0 = r19;
        r1 = r21;
        r2 = r22;
        r5 = r0.a(r5, r1, r2);
        if (r5 != 0) goto L_0x01d7;
    L_0x01d3:
        r5 = r19.w();
    L_0x01d7:
        r0 = r26;
        r19 = r0.a(r6, r8);
        r21 = new android.graphics.Rect;
        r0 = r15.left;
        r22 = r0;
        r22 = r22 + r10;
        r0 = r15.top;
        r23 = r0;
        r23 = r23 + r10;
        r0 = r15.left;
        r24 = r0;
        r24 = r24 + r10;
        r24 = r24 + r9;
        r0 = r15.top;
        r25 = r0;
        r25 = r25 + r10;
        r25 = r25 + r9;
        r21.<init>(r22, r23, r24, r25);
        r0 = r19;
        r0 = r0.x;
        r22 = r0;
        r23 = r10 + r9;
        r22 = r22 * r23;
        r0 = r19;
        r0 = r0.y;
        r19 = r0;
        r23 = r10 + r9;
        r19 = r19 * r23;
        r0 = r21;
        r1 = r22;
        r2 = r19;
        r0.offset(r1, r2);
        r19 = new android.graphics.Rect;
        r22 = 0;
        r23 = 0;
        r24 = r5.getWidth();
        r25 = r5.getHeight();
        r0 = r19;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r25;
        r0.<init>(r1, r2, r3, r4);
        r0 = r17;
        r1 = r19;
        r2 = r21;
        r0.drawBitmap(r5, r1, r2, r14);
        r5 = r6 + 1;
        r6 = 4;
        if (r5 < r6) goto L_0x0246;
    L_0x0244:
        if (r7 == 0) goto L_0x0248;
    L_0x0246:
        if (r7 == 0) goto L_0x02ef;
    L_0x0248:
        r5 = r27.size();
        r6 = 4;
        if (r5 <= r6) goto L_0x02d0;
    L_0x024f:
        r5 = r15.left;
        r6 = r11 / 2;
        r5 = r5 + r6;
        r5 = (float) r5;
        r6 = r15.top;
        r7 = r12 / 2;
        r6 = r6 + r7;
        r6 = (float) r6;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r20;
        r0.setStrokeWidth(r7);
        r7 = android.graphics.Paint.Style.STROKE;
        r0 = r20;
        r0.setStyle(r7);
        r7 = -1728053248; // 0xffffffff99000000 float:-6.617445E-24 double:NaN;
        r0 = r20;
        r0.setColor(r7);
        r7 = android.graphics.Paint.Style.FILL;
        r0 = r20;
        r0.setStyle(r7);
        r7 = -1;
        r0 = r20;
        r0.setColor(r7);
        r7 = r13 * 2;
        r7 = (float) r7;
        r0 = r17;
        r1 = r20;
        r0.drawCircle(r5, r6, r7, r1);
        r7 = new android.text.TextPaint;
        r8 = 1;
        r7.<init>(r8);
        r8 = r13 * 2;
        r8 = (float) r8;
        r9 = 1067869798; // 0x3fa66666 float:1.3 double:5.275977814E-315;
        r8 = r8 * r9;
        r7.setTextSize(r8);
        r8 = -16737844; // 0xffffffffff0099cc float:-1.7093974E38 double:NaN;
        r7.setColor(r8);
        r8 = android.graphics.Paint.Align.CENTER;
        r7.setTextAlign(r8);
        r8 = 1;
        r7.setFakeBoldText(r8);
        r8 = new android.graphics.Rect;
        r8.<init>();
        r9 = r27.size();
        r9 = java.lang.Integer.toString(r9);
        r10 = 0;
        r11 = r9.length();
        r7.getTextBounds(r9, r10, r11, r8);
        r9 = r27.size();
        r9 = java.lang.Integer.toString(r9);
        r8 = r8.height();
        r8 = r8 / 2;
        r8 = (float) r8;
        r6 = r6 + r8;
        r0 = r17;
        r0.drawText(r9, r5, r6, r7);
    L_0x02d0:
        r5 = new com.google.android.gms.maps.model.MarkerOptions;
        r5.<init>();
        r6 = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(r16);
        r6 = r5.icon(r6);
        r7 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r8 = r16.getHeight();
        r8 = r8 - r13;
        r8 = (float) r8;
        r9 = r16.getHeight();
        r9 = (float) r9;
        r8 = r8 / r9;
        r6.anchor(r7, r8);
        return r5;
    L_0x02ef:
        r6 = r5;
        goto L_0x0199;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity2.a(java.util.Collection, boolean, int):com.google.android.gms.maps.model.MarkerOptions");
    }

    static float a(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, float f) {
        return groupChatLiveLocationsActivity2.a(f);
    }

    static GoogleMapView2 h(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.u;
    }

    static cx c(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.o;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131820546, menu);
        this.n = menu.findItem(2131756009);
        if (!(this.n == null || this.q == null)) {
            this.n.setChecked(this.q.isTrafficEnabled());
        }
        if (App.j == 3) {
            u.b((Activity) this);
        }
        return true;
    }

    public void onConnectionSuspended(int i) {
    }

    static HashMap b(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.r;
    }

    static ImageView i(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.v;
    }

    static aox a(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.s;
    }

    static float b(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, float f) {
        groupChatLiveLocationsActivity2.t = f;
        return f;
    }

    public void onConnected(Bundle bundle) {
    }

    private void d() {
        c(true);
    }

    static cx a(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, cx cxVar) {
        groupChatLiveLocationsActivity2.o = cxVar;
        return cxVar;
    }

    static boolean a(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, boolean z) {
        groupChatLiveLocationsActivity2.p = z;
        return z;
    }

    private void f() {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131756006) {
            this.q.setMapType(1);
            getSharedPreferences(z[4], 0).edit().putInt(z[5], 1).commit();
            return true;
        } else if (menuItem.getItemId() == 2131756007) {
            this.q.setMapType(4);
            getSharedPreferences(z[1], 0).edit().putInt(z[2], 4).commit();
            return true;
        } else if (menuItem.getItemId() == 2131756008) {
            this.q.setMapType(3);
            getSharedPreferences(z[6], 0).edit().putInt(z[7], 3).commit();
            return true;
        } else if (menuItem.getItemId() == 2131756009) {
            boolean z = !this.q.isTrafficEnabled();
            this.q.setTrafficEnabled(z);
            this.n.setChecked(z);
            getSharedPreferences(z[3], 0).edit().putBoolean(z[0], z).commit();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    public void onLocationChanged(Location location) {
    }

    private Point a(int i) {
        return i < 4 ? new Point(i, 1) : new Point(2, 2);
    }

    static void e(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        groupChatLiveLocationsActivity2.d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r20 = this;
        r12 = com.whatsapp.DialogToastActivity.f;
        r0 = r20;
        r2 = r0.q;
        if (r2 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r0 = r20;
        r2 = r0.u;
        r2 = r2.getWidth();
        r0 = r20;
        r3 = r0.u;
        r3 = r3.getHeight();
        if (r2 == 0) goto L_0x0008;
    L_0x001b:
        if (r3 == 0) goto L_0x0008;
    L_0x001d:
        r0 = r20;
        r2 = r0.r;
        r2.clear();
        r0 = r20;
        r2 = r0.w;
        r2 = r2.values();
        r3 = r2.iterator();
    L_0x0030:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x0042;
    L_0x0036:
        r2 = r3.next();
        r2 = (com.google.android.gms.maps.model.Marker) r2;
        r4 = 0;
        r2.setVisible(r4);
        if (r12 == 0) goto L_0x0030;
    L_0x0042:
        r0 = r20;
        r2 = r0.q;
        r3 = r2.getProjection();
        r2 = com.whatsapp.a4d.a();
        r2 = r2.g;
        r4 = 1107296256; // 0x42000000 float:32.0 double:5.4707704E-315;
        r5 = r2 * r4;
        r2 = com.whatsapp.a4d.a();
        r2 = r2.g;
        r4 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r6 = r2 * r4;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r20;
        r2 = r0.s;
        r2 = r2.j;
        r7 = r2.iterator();
    L_0x006d:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0090;
    L_0x0073:
        r2 = r7.next();
        r2 = (com.whatsapp.protocol.cx) r2;
        r8 = new com.google.android.gms.maps.model.LatLng;
        r10 = r2.a;
        r14 = r2.b;
        r8.<init>(r10, r14);
        r8 = r3.toScreenLocation(r8);
        r9 = new android.util.Pair;
        r9.<init>(r2, r8);
        r4.add(r9);
        if (r12 == 0) goto L_0x006d;
    L_0x0090:
        r2 = new com.whatsapp.na;
        r0 = r20;
        r2.<init>(r0);
        java.util.Collections.sort(r4, r2);
        r7 = new java.util.ArrayList;
        r7.<init>();
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = r4.iterator();
        r4 = r2;
    L_0x00a6:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x0117;
    L_0x00ac:
        r2 = r8.next();
        r2 = (android.util.Pair) r2;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r3 = r2.first;
        r3 = (com.whatsapp.protocol.cx) r3;
        r3 = r3.f;
        r3 = r9.append(r3);
        r9 = " ";
        r3 = r3.append(r9);
        r3 = r3.append(r4);
        r9 = " ";
        r9 = r3.append(r9);
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r3 = r3.x;
        r3 = r9.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = (float) r4;
        r9 = r3 + r5;
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r3 = r3.x;
        r3 = (float) r3;
        r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x0105;
    L_0x00f2:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3.add(r2);
        r7.add(r3);
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r4 = r3.x;
        if (r12 == 0) goto L_0x0114;
    L_0x0105:
        r3 = r7.size();
        r3 = r3 + -1;
        r3 = r7.get(r3);
        r3 = (java.util.ArrayList) r3;
        r3.add(r2);
    L_0x0114:
        r2 = r4;
        if (r12 == 0) goto L_0x02d8;
    L_0x0117:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r7 = r7.iterator();
    L_0x0120:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x017e;
    L_0x0126:
        r2 = r7.next();
        r2 = (java.util.ArrayList) r2;
        r3 = new com.whatsapp.aat;
        r0 = r20;
        r3.<init>(r0);
        java.util.Collections.sort(r2, r3);
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = r2.iterator();
        r4 = r3;
    L_0x013d:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x017c;
    L_0x0143:
        r2 = r8.next();
        r2 = (android.util.Pair) r2;
        r3 = (float) r4;
        r9 = r3 + r6;
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r3 = r3.y;
        r3 = (float) r3;
        r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x016a;
    L_0x0157:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3.add(r2);
        r5.add(r3);
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r4 = r3.y;
        if (r12 == 0) goto L_0x0179;
    L_0x016a:
        r3 = r5.size();
        r3 = r3 + -1;
        r3 = r5.get(r3);
        r3 = (java.util.ArrayList) r3;
        r3.add(r2);
    L_0x0179:
        r2 = r4;
        if (r12 == 0) goto L_0x02d5;
    L_0x017c:
        if (r12 == 0) goto L_0x0120;
    L_0x017e:
        r13 = r5.iterator();
    L_0x0182:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0008;
    L_0x0188:
        r2 = r13.next();
        r2 = (java.util.ArrayList) r2;
        r8 = 0;
        r6 = 0;
        r3 = 0;
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r14 = new java.util.ArrayList;
        r14.<init>();
        r15 = new java.util.ArrayList;
        r15.<init>();
        r16 = r2.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r3;
    L_0x01a9:
        r3 = r16.hasNext();
        if (r3 == 0) goto L_0x01e6;
    L_0x01af:
        r3 = r16.next();
        r3 = (android.util.Pair) r3;
        r3 = r3.first;
        r3 = (com.whatsapp.protocol.cx) r3;
        r0 = r3.a;
        r18 = r0;
        r10 = r10 + r18;
        r0 = r3.b;
        r18 = r0;
        r8 = r8 + r18;
        r7 = r3.f;
        r14.add(r7);
        r15.add(r3);
        r0 = r20;
        r7 = r0.s;
        r7 = r7.i;
        r7 = r7.contains(r3);
        if (r7 == 0) goto L_0x01da;
    L_0x01d9:
        r6 = 1;
    L_0x01da:
        r0 = r3.g;
        r18 = r0;
        r7 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1));
        if (r7 >= 0) goto L_0x01e4;
    L_0x01e2:
        r4 = r3.g;
    L_0x01e4:
        if (r12 == 0) goto L_0x01a9;
    L_0x01e6:
        java.util.Collections.sort(r14);
        r3 = "";
        r16 = r14.iterator();
        r7 = r3;
    L_0x01f1:
        r3 = r16.hasNext();
        if (r3 == 0) goto L_0x02d2;
    L_0x01f7:
        r3 = r16.next();
        r3 = (java.lang.String) r3;
        r17 = new java.lang.StringBuilder;
        r17.<init>();
        r0 = r17;
        r7 = r0.append(r7);
        r17 = " ";
        r0 = r17;
        r7 = r7.append(r0);
        r3 = r7.append(r3);
        r3 = r3.toString();
        if (r12 == 0) goto L_0x02cf;
    L_0x021b:
        r16 = 1800000; // 0x1b7740 float:2.522337E-39 double:8.89318E-318;
        r4 = r4 + r16;
        r16 = java.lang.System.currentTimeMillis();
        r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1));
        if (r4 <= 0) goto L_0x02ca;
    L_0x0228:
        r4 = -1728001024; // 0xffffffff9900cc00 float:-6.658642E-24 double:NaN;
    L_0x022b:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r3 = r5.append(r3);
        r5 = " ";
        r3 = r3.append(r5);
        r5 = java.lang.Integer.toString(r4);
        r3 = r3.append(r5);
        r3 = r3.toString();
        if (r6 == 0) goto L_0x0260;
    L_0x0249:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r3 = r5.append(r3);
        r5 = z;
        r7 = 14;
        r5 = r5[r7];
        r3 = r3.append(r5);
        r3 = r3.toString();
    L_0x0260:
        r5 = new com.google.android.gms.maps.model.LatLng;
        r7 = r2.size();
        r0 = (double) r7;
        r16 = r0;
        r10 = r10 / r16;
        r2 = r2.size();
        r0 = (double) r2;
        r16 = r0;
        r8 = r8 / r16;
        r5.<init>(r10, r8);
        r0 = r20;
        r2 = r0.w;
        r2 = r2.get(r3);
        r2 = (com.google.android.gms.maps.model.Marker) r2;
        if (r2 != 0) goto L_0x02b8;
    L_0x0283:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 15;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r0 = r20;
        r2 = r0.a(r14, r6, r4);
        r0 = r20;
        r4 = r0.q;
        r2 = r2.position(r5);
        r2 = r4.addMarker(r2);
        r0 = r20;
        r4 = r0.w;
        r4.put(r3, r2);
        if (r12 == 0) goto L_0x02bf;
    L_0x02b8:
        r3 = 1;
        r2.setVisible(r3);
        r2.setPosition(r5);
    L_0x02bf:
        r0 = r20;
        r3 = r0.r;
        r3.put(r2, r15);
        if (r12 == 0) goto L_0x0182;
    L_0x02c8:
        goto L_0x0008;
    L_0x02ca:
        r4 = -1718012980; // 0xffffffff999933cc float:-1.584075E-23 double:NaN;
        goto L_0x022b;
    L_0x02cf:
        r7 = r3;
        goto L_0x01f1;
    L_0x02d2:
        r3 = r7;
        goto L_0x021b;
    L_0x02d5:
        r4 = r2;
        goto L_0x013d;
    L_0x02d8:
        r4 = r2;
        goto L_0x00a6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity2.c():void");
    }

    private void b() {
        boolean z = getSharedPreferences(z[22], 0).getBoolean(z[16], false);
        this.q.setTrafficEnabled(z);
        if (this.n != null) {
            this.n.setChecked(z);
        }
        this.q.setMapType(getSharedPreferences(z[19], 0).getInt(z[20], 1));
        this.q.setIndoorEnabled(true);
        this.q.setMyLocationEnabled(true);
        this.q.getUiSettings().setCompassEnabled(true);
        this.q.getUiSettings().setZoomControlsEnabled(false);
        this.q.getUiSettings().setMyLocationButtonEnabled(false);
        this.q.setOnMarkerClickListener(new awp(this));
        this.q.setOnCameraChangeListener(new jw(this));
        this.q.setOnMapClickListener(new adh(this));
        c();
        if (this.s.j.isEmpty()) {
            SharedPreferences sharedPreferences = getSharedPreferences(z[17], 0);
            this.q.moveCamera(CameraUpdateFactory.newLatLng(new LatLng((double) sharedPreferences.getFloat(z[23], 37.389805f), (double) sharedPreferences.getFloat(z[21], -122.08141f))));
            this.q.moveCamera(CameraUpdateFactory.zoomTo(sharedPreferences.getFloat(z[18], 17.0f) - 0.2f));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        c(false);
    }

    private float a(float f) {
        if (f <= 0.0f) {
            return 17.0f;
        }
        VisibleRegion visibleRegion = this.q.getProjection().getVisibleRegion();
        Location location = new Location("");
        location.setLatitude(visibleRegion.nearLeft.latitude);
        location.setLongitude(visibleRegion.nearLeft.longitude);
        Location location2 = new Location("");
        location2.setLatitude(visibleRegion.nearRight.latitude);
        location2.setLongitude(visibleRegion.nearRight.longitude);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return 17.0f;
        }
        double d = (double) this.q.getCameraPosition().zoom;
        float log = (float) ((Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)) + d);
        if (log > 17.0f) {
            return 17.0f;
        }
        return log;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[12]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(2130903196);
        getSupportActionBar().setTitle(a28.b(qa.d(getIntent().getStringExtra(z[13])).a((Context) this), this));
        this.s.a((Activity) this);
        MapsInitializer.initialize(this);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.mapType(1).zoomControlsEnabled(false).zoomGesturesEnabled(true).compassEnabled(true).rotateGesturesEnabled(true).tiltGesturesEnabled(true);
        this.u = new 2(this, this, googleMapOptions);
        ((ViewGroup) findViewById(2131755560)).addView(this.u);
        this.u.onCreate(bundle);
        a();
        this.v = (ImageView) findViewById(2131755690);
        this.v.setOnClickListener(new ry(this));
    }

    static void b(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, boolean z) {
        groupChatLiveLocationsActivity2.c(z);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.u.onLowMemory();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.u.onSaveInstanceState(bundle);
    }

    private void c(boolean z) {
        boolean z2 = DialogToastActivity.f;
        if (this.q != null && !this.s.j.isEmpty()) {
            if (this.u.getWidth() <= 0 || this.u.getHeight() <= 0) {
                this.u.getViewTreeObserver().addOnGlobalLayoutListener(new atx(this));
                return;
            }
            cx cxVar;
            double max;
            double d;
            Iterator it = this.s.j.iterator();
            double d2 = 90.0d;
            double d3 = -90.0d;
            double d4 = 180.0d;
            double d5 = -180.0d;
            while (it.hasNext()) {
                cxVar = (cx) it.next();
                d2 = Math.min(d2, cxVar.a);
                d3 = Math.max(d3, cxVar.a);
                d4 = Math.min(d4, cxVar.b);
                max = Math.max(d5, cxVar.b);
                if (z2) {
                    d = d2;
                    d2 = d3;
                    break;
                }
                d5 = max;
            }
            max = d5;
            d = d2;
            d2 = d3;
            if (max - d4 > 180.0d) {
                Iterator it2 = this.s.j.iterator();
                d4 = 360.0d;
                d5 = 0.0d;
                while (it2.hasNext()) {
                    cxVar = (cx) it2.next();
                    if (cxVar.b < 0.0d) {
                        d3 = cxVar.b + 360.0d;
                    } else {
                        d3 = cxVar.b;
                    }
                    d4 = Math.min(d4, d3);
                    if (cxVar.b < 0.0d) {
                        max = cxVar.b + 360.0d;
                    } else {
                        max = cxVar.b;
                    }
                    max = Math.max(d5, max);
                    if (z2) {
                        break;
                    }
                    d5 = max;
                }
                max = d5;
            }
            if (this.s.j.size() > 1) {
                d5 = ((d2 - d) / 10.0d) + d2;
                if (z) {
                    this.q.animateCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(d, d4), new LatLng(d5, max)), (int) (a4d.a().g * 64.0f)));
                    if (!z2) {
                        return;
                    }
                }
                this.q.moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(d, d4), new LatLng(d5, max)), (int) (a4d.a().g * 64.0f)));
                if (!z2) {
                    return;
                }
            }
            d5 = d2;
            if (z) {
                this.q.animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(new LatLng((d + d5) / 2.0d, (d4 + max) / 2.0d)).zoom(17.0f).build()));
                if (!z2) {
                    return;
                }
            }
            this.q.moveCamera(CameraUpdateFactory.newLatLng(new LatLng((d5 + d) / 2.0d, (max + d4) / 2.0d)));
            this.q.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
        }
    }

    static GoogleMap d(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.q;
    }

    protected void onResume() {
        super.onResume();
        this.u.onResume();
        this.u.a();
        this.s.e();
        a();
        f();
    }

    static boolean f(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.p;
    }

    protected void onDestroy() {
        super.onDestroy();
        this.u.onDestroy();
        this.s.b();
        if (this.q != null) {
            Editor edit = getSharedPreferences(z[8], 0).edit();
            CameraPosition cameraPosition = this.q.getCameraPosition();
            edit.putFloat(z[10], (float) cameraPosition.target.latitude);
            edit.putFloat(z[11], (float) cameraPosition.target.longitude);
            edit.putFloat(z[9], cameraPosition.zoom);
            edit.commit();
        }
    }

    protected void onPause() {
        super.onPause();
        this.u.onPause();
        this.u.c();
        this.s.h();
    }

    static void j(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        groupChatLiveLocationsActivity2.c();
    }

    private Point a(int i, Point point) {
        return new Point(i % point.x, i / point.x);
    }

    static float g(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.t;
    }
}
