package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.a3;
import com.whatsapp.util.bb;
import com.whatsapp.util.bq;
import com.whatsapp.util.u;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class LocationPicker2 extends DialogToastActivity implements ConnectionCallbacks, OnConnectionFailedListener, LocationListener {
    private static final LocationRequest U;
    private static final String[] bb;
    private Location A;
    private Bitmap B;
    private float C;
    private Bitmap D;
    private PlaceInfo E;
    private bb F;
    private Handler G;
    private long H;
    private GoogleMapView2 I;
    private View J;
    private boolean K;
    private al2 L;
    private ProgressBar M;
    private TextView N;
    private boolean O;
    private ProgressBar P;
    private Handler Q;
    private boolean R;
    private HandlerThread S;
    private int T;
    private aq V;
    private boolean W;
    private View X;
    private float Y;
    private ListView Z;
    private k1 aa;
    private Runnable ab;
    private BitmapDescriptor ac;
    private TextView ad;
    private View ae;
    private BitmapDescriptor n;
    private ImageView o;
    private View p;
    private View q;
    private boolean r;
    private cr s;
    private View t;
    private String u;
    private PlaceInfo v;
    private View w;
    private GoogleApiClient x;
    private anu y;
    private GoogleMap z;

    class 3 extends GoogleMapView2 {
        final LocationPicker2 n;

        public void a(int i) {
            boolean z = DialogToastActivity.f;
            switch (i) {
                case v.m /*0*/:
                    LocationPicker2.x(this.n).setImageResource(2130837637);
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
            LocationPicker2.x(this.n).setImageResource(2130837677);
            if (!z) {
                return;
            }
            LocationPicker2.x(this.n).setImageResource(2130837676);
        }

        3(LocationPicker2 locationPicker2, Context context, GoogleMapOptions googleMapOptions) {
            this.n = locationPicker2;
            super(context, googleMapOptions);
        }
    }

    static void a(LocationPicker2 locationPicker2, a5 a5Var, int i) {
        locationPicker2.a(a5Var, i);
    }

    static Location a(LocationPicker2 locationPicker2, Location location) {
        locationPicker2.A = location;
        return location;
    }

    static PlaceInfo a(LocationPicker2 locationPicker2, PlaceInfo placeInfo) {
        locationPicker2.v = placeInfo;
        return placeInfo;
    }

    static String s(LocationPicker2 locationPicker2) {
        return locationPicker2.u;
    }

    static GoogleMapView2 p(LocationPicker2 locationPicker2) {
        return locationPicker2.I;
    }

    static Handler B(LocationPicker2 locationPicker2) {
        return locationPicker2.Q;
    }

    static PlaceInfo h(LocationPicker2 locationPicker2) {
        return locationPicker2.v;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.I.onLowMemory();
    }

    static void e(LocationPicker2 locationPicker2) {
        locationPicker2.j();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(bb[22]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (!WhatsAppLibLoader.a(null)) {
            Log.i(bb[14]);
            finish();
        } else if (App.ay == null) {
            finish();
        } else {
            int i;
            k1.e();
            this.x = new Builder(this).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
            this.u = getIntent().getStringExtra(bb[18]);
            if (bundle != null) {
                this.aa = (k1) bundle.getSerializable(bb[15]);
                bundle.remove(bb[21]);
            }
            setContentView(aam.a(getLayoutInflater(), 2130903210, null, false));
            this.t = findViewById(2131755725);
            this.q = findViewById(2131755730);
            this.q.setOnClickListener(new jb(this));
            this.X = findViewById(2131755731);
            this.p = findViewById(2131755726);
            this.J = findViewById(2131755728);
            this.J.setOnClickListener(new bl(this));
            this.ae = findViewById(2131755737);
            MapsInitializer.initialize(this);
            this.D = BitmapFactory.decodeResource(getResources(), 2130839621);
            this.ac = BitmapDescriptorFactory.fromBitmap(this.D);
            this.B = BitmapFactory.decodeResource(getResources(), 2130839623);
            this.n = BitmapDescriptorFactory.fromBitmap(this.B);
            GoogleMapOptions googleMapOptions = new GoogleMapOptions();
            googleMapOptions.mapType(1).mapToolbarEnabled(false).zoomControlsEnabled(false).zoomGesturesEnabled(true).compassEnabled(false).rotateGesturesEnabled(true).tiltGesturesEnabled(true);
            this.I = new 3(this, this, googleMapOptions);
            ((ViewGroup) findViewById(2131755560)).addView(this.I);
            this.I.onCreate(bundle);
            i();
            this.G = new Handler(Looper.getMainLooper());
            this.ab = new cq(this);
            if (this.aa == null) {
                this.G.postDelayed(this.ab, 15000);
            }
            this.ad = (TextView) findViewById(2131755736);
            View findViewById = findViewById(2131755734);
            findViewById.setOnClickListener(new gh(this));
            this.s = new cr(this);
            this.Z = (ListView) findViewById(2131755738);
            View inflate = View.inflate(this, 2130903211, null);
            this.N = (TextView) inflate.findViewById(2131755744);
            this.N.setMovementMethod(LinkMovementMethod.getInstance());
            this.Z.setFooterDividersEnabled(true);
            this.Z.addFooterView(inflate, null, true);
            View inflate2 = View.inflate(this, 2130903212, null);
            this.w = inflate2.findViewById(2131755745);
            this.w.setVisibility(8);
            this.Z.addFooterView(inflate2, null, false);
            this.Z.setAdapter(this.s);
            l();
            this.Z.setOnItemClickListener(new al_(this));
            this.V = new aq(this, null);
            this.Z.setOnScrollListener(this.V);
            this.M = (ProgressBar) findViewById(2131755580);
            ProgressBar progressBar = this.M;
            if (this.aa == null) {
                i = 0;
            } else {
                i = 8;
            }
            progressBar.setVisibility(i);
            this.P = (ProgressBar) findViewById(2131755732);
            if (App.am == 3) {
                findViewById.setOnLongClickListener(new a__(this));
            }
            if (bundle == null) {
                LocationManager locationManager = (LocationManager) getSystemService(bb[19]);
                if (!(locationManager.isProviderEnabled(bb[17]) || locationManager.isProviderEnabled(bb[16]))) {
                    showDialog(2);
                }
            }
            ImageView imageView = (ImageView) findViewById(2131755733);
            imageView.setOnClickListener(new aur(this, imageView));
            this.o = (ImageView) findViewById(2131755690);
            this.o.setOnClickListener(new ax3(this));
            File file = new File(App.z().getCacheDir(), bb[23]);
            file.mkdirs();
            this.F = new a3(file).a((int) (a4d.a().g * 48.0f)).a();
            this.S = new HandlerThread(bb[20]);
            this.S.start();
            this.Q = new Handler(this.S.getLooper());
            OnClickListener yhVar = new yh(this);
            findViewById(2131755659).setOnClickListener(yhVar);
            View findViewById2 = findViewById(2131755742);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(yhVar);
            }
            j();
        }
    }

    static ProgressBar w(LocationPicker2 locationPicker2) {
        return locationPicker2.M;
    }

    static bb k(LocationPicker2 locationPicker2) {
        return locationPicker2.F;
    }

    static BitmapDescriptor v(LocationPicker2 locationPicker2) {
        return locationPicker2.n;
    }

    private void b() {
        boolean z = DialogToastActivity.f;
        this.z.clear();
        for (PlaceInfo placeInfo : this.aa.p()) {
            MarkerOptions position = new MarkerOptions().position(new LatLng(placeInfo.lat, placeInfo.lon));
            if (!TextUtils.isEmpty(placeInfo.name)) {
                position.title(placeInfo.name);
            }
            if (!TextUtils.isEmpty(placeInfo.vicinity)) {
                position.snippet(placeInfo.vicinity);
            }
            position.icon(this.ac);
            position.anchor(0.5f, 0.5f);
            placeInfo.tag = this.z.addMarker(position);
            if (z) {
                break;
            }
        }
        new MarkerOptions().position(this.z.getCameraPosition().target).title(getString(2131231868));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(@android.support.annotation.NonNull android.view.MotionEvent r11) {
        /*
        r10 = this;
        r8 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r6 = 0;
        r5 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r10.K;
        if (r1 == 0) goto L_0x0011;
    L_0x000a:
        r1 = r11.getAction();
        switch(r1) {
            case 0: goto L_0x0016;
            case 1: goto L_0x008a;
            case 2: goto L_0x0028;
            case 3: goto L_0x008a;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = super.dispatchTouchEvent(r11);
        return r0;
    L_0x0016:
        r1 = r10.r;
        if (r1 != 0) goto L_0x0011;
    L_0x001a:
        r1 = r11.getX();
        r10.Y = r1;
        r1 = r11.getY();
        r10.C = r1;
        if (r0 == 0) goto L_0x0011;
    L_0x0028:
        r1 = r10.r;
        if (r1 != 0) goto L_0x0011;
    L_0x002c:
        r1 = r11.getX();
        r2 = r11.getY();
        r3 = r10.Y;
        r3 = r1 - r3;
        r4 = r10.Y;
        r1 = r1 - r4;
        r1 = r1 * r3;
        r3 = r10.C;
        r3 = r2 - r3;
        r4 = r10.C;
        r2 = r2 - r4;
        r2 = r2 * r3;
        r1 = r1 + r2;
        r2 = com.whatsapp.a4d.a();
        r2 = r2.g;
        r3 = 1086324736; // 0x40c00000 float:6.0 double:5.367157323E-315;
        r2 = r2 * r3;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x0088;
    L_0x0052:
        r1 = 1;
        r10.r = r1;
        r1 = r10.X;
        r1.setVisibility(r6);
        r1 = new android.view.animation.TranslateAnimation;
        r2 = r10.X;
        r2 = r2.getHeight();
        r2 = (float) r2;
        r1.<init>(r5, r5, r2, r5);
        r2 = new android.view.animation.DecelerateInterpolator;
        r2.<init>();
        r1.setInterpolator(r2);
        r1.setDuration(r8);
        r2 = r10.q;
        r2.startAnimation(r1);
        r2 = r10.J;
        r2 = r2.getVisibility();
        if (r2 != 0) goto L_0x0083;
    L_0x007e:
        r2 = r10.J;
        r2.startAnimation(r1);
    L_0x0083:
        r1 = r10.t;
        r1.setVisibility(r6);
    L_0x0088:
        if (r0 == 0) goto L_0x0011;
    L_0x008a:
        r10.Y = r5;
        r10.C = r5;
        r0 = r10.r;
        if (r0 == 0) goto L_0x0011;
    L_0x0092:
        r10.r = r6;
        r0 = r10.X;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = new android.view.animation.TranslateAnimation;
        r1 = r10.X;
        r1 = r1.getHeight();
        r1 = -r1;
        r1 = (float) r1;
        r0.<init>(r5, r5, r1, r5);
        r1 = new android.view.animation.DecelerateInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
        r0.setDuration(r8);
        r1 = r10.q;
        r1.startAnimation(r0);
        r1 = r10.J;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x0011;
    L_0x00c0:
        r1 = r10.J;
        r1.startAnimation(r0);
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationPicker2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    static anu g(LocationPicker2 locationPicker2) {
        return locationPicker2.y;
    }

    static boolean o(LocationPicker2 locationPicker2) {
        return locationPicker2.K;
    }

    static aq u(LocationPicker2 locationPicker2) {
        return locationPicker2.V;
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    static PlaceInfo d(LocationPicker2 locationPicker2) {
        return locationPicker2.E;
    }

    private void a() {
        this.N.setVisibility(8);
        this.w.setVisibility(8);
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case at.i /*2*/:
                return new AlertDialog.Builder(this).setTitle(2131231271).setMessage(2131231270).setCancelable(true).setPositiveButton(2131231580, new a9r(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static View z(LocationPicker2 locationPicker2) {
        return locationPicker2.t;
    }

    static k1 r(LocationPicker2 locationPicker2) {
        return locationPicker2.aa;
    }

    protected void onResume() {
        super.onResume();
        if (App.u((Context) this) != this.W) {
            invalidateOptionsMenu();
            if (!(this.W || this.z == null)) {
                this.z.setMyLocationEnabled(true);
            }
        }
        j();
        this.I.onResume();
        this.I.a();
        i();
        this.x.connect();
        this.H = System.currentTimeMillis();
    }

    static k1 a(LocationPicker2 locationPicker2, k1 k1Var) {
        locationPicker2.aa = k1Var;
        return k1Var;
    }

    static boolean a(LocationPicker2 locationPicker2, boolean z) {
        locationPicker2.O = z;
        return z;
    }

    static anu a(LocationPicker2 locationPicker2, anu com_whatsapp_anu) {
        locationPicker2.y = com_whatsapp_anu;
        return com_whatsapp_anu;
    }

    static void a(LocationPicker2 locationPicker2, a5 a5Var) {
        locationPicker2.a(a5Var);
    }

    public void onNewIntent(Intent intent) {
        if (bb[13].equals(intent.getAction())) {
            a(c(), Math.max(d(), 1500), intent.getStringExtra(bb[12]), true);
        }
    }

    static void m(LocationPicker2 locationPicker2) {
        locationPicker2.l();
    }

    public LocationPicker2() {
        this.T = -1;
        this.O = true;
        this.E = new PlaceInfo();
    }

    static Location b(LocationPicker2 locationPicker2) {
        return locationPicker2.A;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231845).setIcon(2130839445), 2);
        MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131231737).setIcon(2130839443), 1);
        if (App.j == 3) {
            u.b((Activity) this);
        }
        return true;
    }

    private void j() {
        boolean z = DialogToastActivity.f;
        View findViewById = findViewById(2131755741);
        if (App.u((Context) this)) {
            findViewById(2131755740).setVisibility(8);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            findViewById(2131755734).setVisibility(0);
            if (this.K) {
                this.ae.setVisibility(8);
                if (!z) {
                    return;
                }
            }
            this.o.setVisibility(0);
            this.ae.setVisibility(0);
            if (!z) {
                return;
            }
        }
        findViewById(2131755734).setVisibility(8);
        this.ae.setVisibility(8);
        this.o.setVisibility(8);
        if (this.K) {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            findViewById(2131755740).setVisibility(8);
            if (!z) {
                return;
            }
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        findViewById(2131755740).setVisibility(0);
    }

    static View j(LocationPicker2 locationPicker2) {
        return locationPicker2.ae;
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.I.onSaveInstanceState(bundle);
        bundle.putSerializable(bb[6], this.aa);
        super.onSaveInstanceState(bundle);
    }

    static void y(LocationPicker2 locationPicker2) {
        locationPicker2.k();
    }

    static cr f(LocationPicker2 locationPicker2) {
        return locationPicker2.s;
    }

    static ProgressBar a(LocationPicker2 locationPicker2) {
        return locationPicker2.P;
    }

    public boolean onSearchRequested() {
        String str;
        this.O = false;
        ViewGroup viewGroup = (ViewGroup) findViewById(2131755557);
        if (viewGroup != null) {
            viewGroup.setLayoutParams(new LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
        }
        if (this.aa == null) {
            str = null;
        } else {
            str = this.aa.g();
        }
        startSearch(str, true, null, false);
        return true;
    }

    private void f() {
        this.z.setTrafficEnabled(false);
        this.z.setIndoorEnabled(true);
        if (App.u((Context) this)) {
            this.z.setMyLocationEnabled(true);
        }
        this.z.getUiSettings().setMyLocationButtonEnabled(false);
        this.z.setOnMarkerClickListener(new cd(this));
        this.z.setOnInfoWindowClickListener(new ev(this));
        this.z.setOnMapClickListener(new a4g(this));
        this.z.setOnCameraChangeListener(new kk(this));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131427516);
        this.z.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (this.aa != null) {
            b();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        SharedPreferences sharedPreferences = getSharedPreferences(bb[7], 0);
        this.z.moveCamera(CameraUpdateFactory.newLatLng(new LatLng((double) sharedPreferences.getFloat(bb[10], 37.389805f), (double) sharedPreferences.getFloat(bb[9], -122.08141f))));
        this.z.moveCamera(CameraUpdateFactory.zoomTo(sharedPreferences.getFloat(bb[8], 18.0f) - 0.2f));
    }

    static Bitmap n(LocationPicker2 locationPicker2) {
        return locationPicker2.B;
    }

    private Location c() {
        LatLng latLng = this.z.getCameraPosition().target;
        Location location = new Location("");
        location.setLatitude(latLng.latitude);
        location.setLongitude(latLng.longitude);
        return location;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                onSearchRequested();
                return true;
            case at.g /*1*/:
                this.O = false;
                a(c(), d(), null, false);
                return true;
            case 16908332:
                a(a5.CANCEL);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    static ImageView x(LocationPicker2 locationPicker2) {
        return locationPicker2.o;
    }

    static void a(LocationPicker2 locationPicker2, Location location, int i, String str, boolean z) {
        locationPicker2.a(location, i, str, z);
    }

    static View c(LocationPicker2 locationPicker2) {
        return locationPicker2.J;
    }

    private void l() {
        String str = null;
        if (!(this.aa == null || this.aa.k())) {
            if (this.aa.b() == 3) {
                str = getString(2131231405, new Object[]{bb[11]});
            } else {
                str = this.aa.s();
            }
        }
        this.w.setVisibility(8);
        if (str != null) {
            this.N.setText(Html.fromHtml(str));
            this.N.setVisibility(0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.N.setVisibility(8);
    }

    public void onConnected(Bundle bundle) {
        if (App.h(this, bb[5]) != 0) {
            Log.i(bb[4]);
            return;
        }
        LocationServices.FusedLocationApi.requestLocationUpdates(this.x, U, this);
        this.A = LocationServices.FusedLocationApi.getLastLocation(this.x);
    }

    private void a(Location location, int i, String str, boolean z) {
        this.G.removeCallbacks(this.ab);
        this.M.setVisibility(0);
        if (this.ae.getVisibility() != 0) {
            this.P.setVisibility(0);
        }
        findViewById(2131755739).setVisibility(8);
        if (this.z != null) {
            this.z.clear();
        }
        this.v = null;
        a();
        this.aa = new k1();
        this.V.a(false);
        this.s.notifyDataSetChanged();
        this.L = new al2(this, location, i, str, z);
        bq.a(this.L, new Void[0]);
    }

    static {
        String[] strArr = new String[24];
        String str = "r=`U5^9nD1u<nI\u000fm:o";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 85;
                        break;
                    case at.i /*2*/:
                        i3 = 1;
                        break;
                    case at.o /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 80;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "r=`U5^9nD1u<nI\u000fm4u";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "r=`U5^9nD1u<nI\u000f{:nJ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "m:bF$h:o\b h6jB\".:o\b3n;oB3u0e\b d'lN#r<nI\u000fe0oN5e";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "`;eU?h1/W5s8hT#h:o\t\u0011B\u0016Dt\u0003^\u0013Hi\u0015^\u0019Nd\u0011U\u001cNi";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "q9`D5r";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "b:l\t'i4uT1q%^W\"d3dU5o6dT";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "r=`U5^9nD1u<nI\u000f{:nJ";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "r=`U5^9nD1u<nI\u000fm:o";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "r=`U5^9nD1u<nI\u000fm4u";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "=4!O\"d3<\u00008u!qTj.zgH%s&pR1s0/D?lz&\u00196n sT!t4sBl.4?";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "p dU)";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "`;eU?h1/N>u0oS~`6uN?o{Rb\u0011S\u0016I";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "`7nU$h;f\u00074t0!S?!;`S9w0!K9c'`U9d&!J9r&hI7";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "q9`D5r";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "o0uP?s>";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "f%r";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "k<e";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "m:bF$h:o";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "F0nd?e0";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "q9`D5r";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "m:bF$h:oW9b>dU\u007fb'dF$d";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "Q9`D5r";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    bb = strArr3;
                    U = LocationRequest.create().setInterval(5000).setFastestInterval(16).setPriority(100);
                    return;
                default:
                    strArr2[i] = str;
                    str = "b:l\t'i4uT1q%^W\"d3dU5o6dT";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static BitmapDescriptor A(LocationPicker2 locationPicker2) {
        return locationPicker2.ac;
    }

    static Location l(LocationPicker2 locationPicker2) {
        return locationPicker2.c();
    }

    static ListView q(LocationPicker2 locationPicker2) {
        return locationPicker2.Z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLocationChanged(android.location.Location r12) {
        /*
        r11 = this;
        r10 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        if (r12 == 0) goto L_0x00c6;
    L_0x0008:
        r0 = r11.A;
        if (r0 != 0) goto L_0x002b;
    L_0x000c:
        r0 = r11.z;
        if (r0 == 0) goto L_0x002b;
    L_0x0010:
        r0 = r11.I;
        r0.setLocationMode(r1);
        r0 = r11.z;
        r4 = new com.google.android.gms.maps.model.LatLng;
        r6 = r12.getLatitude();
        r8 = r12.getLongitude();
        r4.<init>(r6, r8);
        r4 = com.google.android.gms.maps.CameraUpdateFactory.newLatLng(r4);
        r0.moveCamera(r4);
    L_0x002b:
        r11.A = r12;
        r0 = r12.hasAccuracy();
        if (r0 == 0) goto L_0x003e;
    L_0x0033:
        r0 = r12.getAccuracy();
        r0 = (int) r0;
        r0 = java.lang.Math.max(r1, r0);
        if (r3 == 0) goto L_0x003f;
    L_0x003e:
        r0 = -1;
    L_0x003f:
        r4 = r11.T;
        if (r0 == r4) goto L_0x006f;
    L_0x0043:
        r11.T = r0;
        if (r0 <= 0) goto L_0x0068;
    L_0x0047:
        r4 = r11.ad;
        r4.setVisibility(r2);
        r4 = r11.ad;
        r5 = com.whatsapp.App.az;
        r6 = 2131296283; // 0x7f09001b float:1.8210478E38 double:1.0530002745E-314;
        r5 = r5.a(r6, r0);
        r6 = new java.lang.Object[r1];
        r0 = java.lang.Integer.valueOf(r0);
        r6[r2] = r0;
        r0 = java.lang.String.format(r5, r6);
        r4.setText(r0);
        if (r3 == 0) goto L_0x006f;
    L_0x0068:
        r0 = r11.ad;
        r3 = 8;
        r0.setVisibility(r3);
    L_0x006f:
        r0 = r11.aa;
        if (r0 == 0) goto L_0x00c7;
    L_0x0073:
        r0 = r11.aa;
        r0 = r0.a();
        if (r0 == 0) goto L_0x00c7;
    L_0x007b:
        r0 = r11.O;
        if (r0 == 0) goto L_0x00c7;
    L_0x007f:
        r0 = r12.getAccuracy();
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x00c7;
    L_0x0087:
        r0 = r11.aa;
        r0 = r0.a();
        r0 = r0.distanceTo(r12);
        r3 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c7;
    L_0x0097:
        r11.O = r2;
        r0 = r1;
    L_0x009a:
        r11.A = r12;
        r1 = r11.aa;
        if (r1 == 0) goto L_0x00a2;
    L_0x00a0:
        if (r0 == 0) goto L_0x00c6;
    L_0x00a2:
        r1 = r12.getAccuracy();
        r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r1 >= 0) goto L_0x00ba;
    L_0x00aa:
        r2 = r12.getTime();
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = r2 + r4;
        r4 = java.lang.System.currentTimeMillis();
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 > 0) goto L_0x00be;
    L_0x00ba:
        r1 = r11.R;
        if (r1 == 0) goto L_0x00c6;
    L_0x00be:
        r1 = new com.whatsapp.a30;
        r1.<init>(r11, r0);
        r11.runOnUiThread(r1);
    L_0x00c6:
        return;
    L_0x00c7:
        r0 = r2;
        goto L_0x009a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationPicker2.onLocationChanged(android.location.Location):void");
    }

    protected void onPause() {
        this.I.onPause();
        this.I.c();
        if (this.x != null && this.x.isConnected()) {
            this.x.disconnect();
        }
        this.W = App.u((Context) this);
        super.onPause();
    }

    static GoogleMap t(LocationPicker2 locationPicker2) {
        return locationPicker2.z;
    }

    private int d() {
        Location c = c();
        VisibleRegion visibleRegion = this.z.getProjection().getVisibleRegion();
        Location location = new Location("");
        location.setLatitude((visibleRegion.nearLeft.latitude + visibleRegion.nearRight.latitude) / 2.0d);
        location.setLongitude((visibleRegion.nearLeft.longitude + visibleRegion.nearRight.longitude) / 2.0d);
        return (int) c.distanceTo(location);
    }

    static int C(LocationPicker2 locationPicker2) {
        return locationPicker2.d();
    }

    protected void onDestroy() {
        this.I.onDestroy();
        if (this.G != null) {
            this.G.removeCallbacks(this.ab);
        }
        if (this.L != null) {
            this.L.cancel(true);
            this.L = null;
        }
        if (this.z != null) {
            Editor edit = getSharedPreferences(bb[1], 0).edit();
            CameraPosition cameraPosition = this.z.getCameraPosition();
            edit.putFloat(bb[2], (float) cameraPosition.target.latitude);
            edit.putFloat(bb[0], (float) cameraPosition.target.longitude);
            edit.putFloat(bb[3], cameraPosition.zoom);
            edit.commit();
        }
        this.F.b();
        this.S.quit();
        super.onDestroy();
    }

    static boolean b(LocationPicker2 locationPicker2, boolean z) {
        locationPicker2.R = z;
        return z;
    }

    public void onBackPressed() {
        a(a5.CANCEL);
        super.onBackPressed();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(0).setVisible(App.u(App.z()));
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.fieldstats.a5 r15, int r16) {
        /*
        r14 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r12 = 0;
        r2 = r14.H;
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0019;
    L_0x000c:
        r2 = 0;
        r4 = java.lang.System.currentTimeMillis();
        r6 = r14.H;
        r4 = r4 - r6;
        r12 = java.lang.Math.max(r2, r4);
    L_0x0019:
        r1 = r14.aa;
        if (r1 != 0) goto L_0x0021;
    L_0x001d:
        r5 = com.whatsapp.fieldstats.b1.DID_NOT_REQUEST;
        if (r0 == 0) goto L_0x0040;
    L_0x0021:
        r1 = r14.aa;
        r1 = r1.b();
        if (r1 != 0) goto L_0x002d;
    L_0x0029:
        r5 = com.whatsapp.fieldstats.b1.CANCEL;
        if (r0 == 0) goto L_0x0040;
    L_0x002d:
        r1 = com.whatsapp.arl.a;
        r2 = r14.aa;
        r2 = r2.f();
        r2 = r2.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x0081;
            case 2: goto L_0x0085;
            case 3: goto L_0x0089;
            case 4: goto L_0x008d;
            case 5: goto L_0x0091;
            default: goto L_0x003e;
        };
    L_0x003e:
        r5 = com.whatsapp.fieldstats.b1.OK;
    L_0x0040:
        r0 = r14.aa;
        if (r0 == 0) goto L_0x004c;
    L_0x0044:
        r0 = r14.aa;
        r0 = r0.b();
        if (r0 != 0) goto L_0x0096;
    L_0x004c:
        r0 = com.whatsapp.k1.j();
    L_0x0050:
        r2 = com.whatsapp.k1.c(r0);
        r0 = com.whatsapp.k1.c();
        r3 = com.whatsapp.k1.c(r0);
        r0 = r14.aa;
        if (r0 != 0) goto L_0x009d;
    L_0x0060:
        r6 = 0;
    L_0x0061:
        r0 = r14.ae;
        r0 = r0.getVisibility();
        if (r0 == 0) goto L_0x00a4;
    L_0x0069:
        r7 = 1;
    L_0x006a:
        r0 = r14.aa;
        if (r0 != 0) goto L_0x00a6;
    L_0x006e:
        r8 = 0;
    L_0x006f:
        r0 = r14.aa;
        if (r0 != 0) goto L_0x00ad;
    L_0x0073:
        r9 = 0;
    L_0x0074:
        r0 = r14.aa;
        if (r0 != 0) goto L_0x00b6;
    L_0x0078:
        r10 = 0;
    L_0x0079:
        r1 = r14;
        r4 = r15;
        r11 = r16;
        com.whatsapp.nf.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        return;
    L_0x0081:
        r5 = com.whatsapp.fieldstats.b1.OK;
        if (r0 == 0) goto L_0x0040;
    L_0x0085:
        r5 = com.whatsapp.fieldstats.b1.FAILED_COMMUNICATION;
        if (r0 == 0) goto L_0x0040;
    L_0x0089:
        r5 = com.whatsapp.fieldstats.b1.FAILED_OUT_OF_QUOTA;
        if (r0 == 0) goto L_0x0040;
    L_0x008d:
        r5 = com.whatsapp.fieldstats.b1.FAILED_OTHER;
        if (r0 == 0) goto L_0x0040;
    L_0x0091:
        r5 = com.whatsapp.fieldstats.b1.CANCEL;
        if (r0 == 0) goto L_0x0040;
    L_0x0095:
        goto L_0x003e;
    L_0x0096:
        r0 = r14.aa;
        r0 = r0.b();
        goto L_0x0050;
    L_0x009d:
        r0 = r14.aa;
        r6 = r0.n();
        goto L_0x0061;
    L_0x00a4:
        r7 = 0;
        goto L_0x006a;
    L_0x00a6:
        r0 = r14.aa;
        r8 = r0.g();
        goto L_0x006f;
    L_0x00ad:
        r0 = r14.aa;
        r0 = r0.h();
        r9 = r0 + 1;
        goto L_0x0074;
    L_0x00b6:
        r0 = r14.aa;
        r10 = r0.o();
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationPicker2.a(com.whatsapp.fieldstats.a5, int):void");
    }

    static void i(LocationPicker2 locationPicker2) {
        locationPicker2.b();
    }

    private void i() {
        if (this.z == null) {
            this.z = this.I.getMap();
            if (this.z != null) {
                f();
            }
        }
    }

    static boolean c(LocationPicker2 locationPicker2, boolean z) {
        locationPicker2.K = z;
        return z;
    }

    private void a(a5 a5Var) {
        a(a5Var, 0);
    }

    private void k() {
        this.N.setVisibility(8);
        this.w.setVisibility(0);
    }

    public void onConnectionSuspended(int i) {
    }
}
