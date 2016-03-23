package android.support.v7.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

class ResourcesWrapper extends Resources {
    private final Resources mResources;

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.mResources.obtainAttributes(attributeSet, iArr);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.mResources.openRawResourceFd(i);
    }

    public XmlResourceParser getXml(int i) {
        return this.mResources.getXml(i);
    }

    public int getColor(int i) {
        return this.mResources.getColor(i);
    }

    public Drawable getDrawable(int i, Theme theme) {
        return this.mResources.getDrawable(i, theme);
    }

    public String[] getStringArray(int i) {
        return this.mResources.getStringArray(i);
    }

    public CharSequence getText(int i) {
        return this.mResources.getText(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.mResources.getDisplayMetrics();
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.mResources.parseBundleExtra(str, attributeSet, bundle);
    }

    public XmlResourceParser getAnimation(int i) {
        return this.mResources.getAnimation(i);
    }

    public CharSequence[] getTextArray(int i) {
        return this.mResources.getTextArray(i);
    }

    public ResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        try {
            super.updateConfiguration(configuration, displayMetrics);
            if (this.mResources != null) {
                this.mResources.updateConfiguration(configuration, displayMetrics);
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public String getQuantityString(int i, int i2, Object[] objArr) {
        return this.mResources.getQuantityString(i, i2, objArr);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.mResources.getValue(str, typedValue, z);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.mResources.getText(i, charSequence);
    }

    public String getResourceTypeName(int i) {
        return this.mResources.getResourceTypeName(i);
    }

    public float getDimension(int i) {
        return this.mResources.getDimension(i);
    }

    public int[] getIntArray(int i) {
        return this.mResources.getIntArray(i);
    }

    public String getString(int i, Object[] objArr) {
        return this.mResources.getString(i, objArr);
    }

    public String getString(int i) {
        return this.mResources.getString(i);
    }

    public int getInteger(int i) {
        return this.mResources.getInteger(i);
    }

    public Drawable getDrawableForDensity(int i, int i2, Theme theme) {
        return this.mResources.getDrawableForDensity(i, i2, theme);
    }

    public Configuration getConfiguration() {
        return this.mResources.getConfiguration();
    }

    public InputStream openRawResource(int i) {
        return this.mResources.openRawResource(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.mResources.getFraction(i, i2, i3);
    }

    public ColorStateList getColorStateList(int i) {
        return this.mResources.getColorStateList(i);
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return this.mResources.getDrawableForDensity(i, i2);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.mResources.getValueForDensity(i, i2, typedValue, z);
    }

    public int getDimensionPixelSize(int i) {
        return this.mResources.getDimensionPixelSize(i);
    }

    public Drawable getDrawable(int i) {
        return this.mResources.getDrawable(i);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.mResources.getIdentifier(str, str2, str3);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.mResources.openRawResource(i, typedValue);
    }

    public String getResourceEntryName(int i) {
        return this.mResources.getResourceEntryName(i);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.mResources.parseBundleExtras(xmlResourceParser, bundle);
    }

    public String getResourcePackageName(int i) {
        return this.mResources.getResourcePackageName(i);
    }

    public Movie getMovie(int i) {
        return this.mResources.getMovie(i);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.mResources.obtainTypedArray(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.mResources.getLayout(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.mResources.getDimensionPixelOffset(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.mResources.getValue(i, typedValue, z);
    }

    public String getResourceName(int i) {
        return this.mResources.getResourceName(i);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.mResources.getQuantityText(i, i2);
    }

    public String getQuantityString(int i, int i2) {
        return this.mResources.getQuantityString(i, i2);
    }

    public boolean getBoolean(int i) {
        return this.mResources.getBoolean(i);
    }
}
