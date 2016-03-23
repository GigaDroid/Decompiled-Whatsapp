package com.whatsapp.util;

import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import java.io.InputStream;
import java.io.Reader;
import org.v;
import org.whispersystems.at;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class k implements XmlPullParser {
    private static final String z;
    final String a;
    final AttributeSet b;
    final LayoutInflater c;
    final View[] d;

    static {
        char[] toCharArray = "\u001fBXW".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 122;
                    break;
                case at.g /*1*/:
                    i2 = 58;
                    break;
                case at.i /*2*/:
                    i2 = 49;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 25;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String getInputEncoding() {
        return null;
    }

    public int nextTag() {
        return 0;
    }

    public String getAttributeName(int i) {
        return null;
    }

    public int next() {
        try {
            this.d[0] = (TextView) this.c.createView(this.a, null, this.b);
        } catch (InflateException e) {
        } catch (ClassNotFoundException e2) {
        }
        throw new XmlPullParserException(z);
    }

    public void setInput(Reader reader) {
    }

    public int getEventType() {
        return 0;
    }

    public String getAttributePrefix(int i) {
        return null;
    }

    public int getNamespaceCount(int i) {
        return 0;
    }

    k(View[] viewArr, LayoutInflater layoutInflater, String str, AttributeSet attributeSet) {
        this.d = viewArr;
        this.c = layoutInflater;
        this.a = str;
        this.b = attributeSet;
    }

    public int getAttributeCount() {
        return 0;
    }

    public boolean isWhitespace() {
        return false;
    }

    public int getLineNumber() {
        return 0;
    }

    public String getAttributeNamespace(int i) {
        return null;
    }

    public String getAttributeValue(String str, String str2) {
        return null;
    }

    public String nextText() {
        return null;
    }

    public boolean getFeature(String str) {
        return false;
    }

    public void require(int i, String str, String str2) {
    }

    public int getDepth() {
        return 0;
    }

    public int nextToken() {
        return 0;
    }

    public String getAttributeValue(int i) {
        return null;
    }

    public String getNamespace() {
        return null;
    }

    public String getPositionDescription() {
        return null;
    }

    public String getNamespaceUri(int i) {
        return null;
    }

    public boolean isAttributeDefault(int i) {
        return false;
    }

    public void setFeature(String str, boolean z) {
    }

    public String getNamespace(String str) {
        return null;
    }

    public String getText() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getNamespacePrefix(int i) {
        return null;
    }

    public String getPrefix() {
        return null;
    }

    public Object getProperty(String str) {
        return null;
    }

    public void setProperty(String str, Object obj) {
    }

    public void setInput(InputStream inputStream, String str) {
    }

    public void defineEntityReplacementText(String str, String str2) {
    }

    public boolean isEmptyElementTag() {
        return false;
    }

    public char[] getTextCharacters(int[] iArr) {
        return null;
    }

    public int getColumnNumber() {
        return 0;
    }

    public String getAttributeType(int i) {
        return null;
    }
}
