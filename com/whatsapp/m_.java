package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Projection;

public class m_ extends MyLocationOverlay {
    private Drawable a;
    private Point b;
    private Paint c;
    private Handler d;
    private Drawable e;
    private Drawable f;
    private Point g;

    static Drawable a(m_ m_Var, Drawable drawable) {
        m_Var.a = drawable;
        return drawable;
    }

    static Drawable a(m_ m_Var) {
        return m_Var.e;
    }

    public m_(Context context, MapView mapView) {
        super(context, mapView);
        this.b = new Point();
        this.g = new Point();
        this.e = context.getResources().getDrawable(2130839619);
        this.f = context.getResources().getDrawable(2130839620);
        this.a = this.e;
        this.c = new Paint();
        this.c.setAntiAlias(true);
        this.c.setStrokeWidth(2.0f);
        this.d = new go(this, Looper.getMainLooper(), mapView);
        this.d.sendEmptyMessageDelayed(0, 500);
    }

    protected void drawMyLocation(Canvas canvas, MapView mapView, Location location, GeoPoint geoPoint, long j) {
        int intrinsicWidth = this.a.getIntrinsicWidth();
        int intrinsicHeight = this.a.getIntrinsicHeight();
        Projection projection = mapView.getProjection();
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        float accuracy = location.getAccuracy();
        float[] fArr = new float[1];
        Location.distanceBetween(latitude, longitude, latitude, longitude + 1.0d, fArr);
        projection.toPixels(new GeoPoint((int) (latitude * 1000000.0d), (int) ((longitude - ((double) (accuracy / fArr[0]))) * 1000000.0d)), this.g);
        projection.toPixels(geoPoint, this.b);
        int i = this.b.x - this.g.x;
        this.c.setColor(-10066177);
        this.c.setStyle(Style.STROKE);
        canvas.drawCircle((float) this.b.x, (float) this.b.y, (float) i, this.c);
        this.c.setColor(409364223);
        this.c.setStyle(Style.FILL);
        canvas.drawCircle((float) this.b.x, (float) this.b.y, (float) i, this.c);
        this.a.setBounds(this.b.x - (intrinsicWidth / 2), this.b.y - (intrinsicHeight / 2), this.b.x + (intrinsicWidth / 2), this.b.y + (intrinsicHeight / 2));
        this.a.draw(canvas);
    }

    public void disableMyLocation() {
        super.disableMyLocation();
        this.d.removeMessages(0);
    }

    static Drawable c(m_ m_Var) {
        return m_Var.a;
    }

    static Drawable b(m_ m_Var) {
        return m_Var.f;
    }
}
