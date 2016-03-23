package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.location.Location;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;

public class GoogleMapView extends MapView implements OnDoubleTapListener, OnGestureListener {
    private GestureDetector a;
    private int b;
    private a97 c;
    private int d;
    private GeoPoint e;

    public static GeoPoint a(Location location) {
        return new GeoPoint((int) (location.getLatitude() * 1000000.0d), (int) (location.getLongitude() * 1000000.0d));
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void a() {
        this.a = new GestureDetector(this);
        this.a.setOnDoubleTapListener(this);
    }

    public static Location a(GeoPoint geoPoint) {
        Location location = new Location("");
        location.setLatitude(((double) geoPoint.getLatitudeE6()) / 1000000.0d);
        location.setLongitude(((double) geoPoint.getLongitudeE6()) / 1000000.0d);
        return location;
    }

    public Location b() {
        return a(getMapCenter());
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public GoogleMapView(Context context) {
        super(context, context.getString(2131232325));
        this.e = new GeoPoint(0, 0);
        this.d = 0;
        this.b = 0;
        a();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.a.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public GoogleMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new GeoPoint(0, 0);
        this.d = 0;
        this.b = 0;
        a();
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public void b(GeoPoint geoPoint) {
        if (geoPoint != null) {
            try {
                getController().animateTo(geoPoint);
            } catch (Exception e) {
                try {
                    getController().setCenter(geoPoint);
                } catch (Exception e2) {
                }
            }
        }
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c != null) {
            GeoPoint mapCenter = getMapCenter();
            int latitudeSpan = getLatitudeSpan();
            int longitudeSpan = getLongitudeSpan();
            if (!this.e.equals(mapCenter) || this.d != latitudeSpan || this.b != longitudeSpan) {
                this.e = mapCenter;
                this.d = latitudeSpan;
                this.b = longitudeSpan;
                this.c.a(mapCenter, latitudeSpan, longitudeSpan);
            }
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return getController().zoomInFixing((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public int c() {
        Location a = a(getMapCenter());
        return (int) Math.min(a.distanceTo(a(getProjection().fromPixels(getWidth() / 2, 0))), a.distanceTo(a(getProjection().fromPixels(0, getHeight() / 2))));
    }

    public GoogleMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new GeoPoint(0, 0);
        this.d = 0;
        this.b = 0;
        a();
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void setMapListener(a97 com_whatsapp_a97) {
        this.c = com_whatsapp_a97;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }
}
