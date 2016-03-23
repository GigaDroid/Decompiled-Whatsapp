package com.whatsapp.memory.dump;

import com.whatsapp.WAAppCompatActivity;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class a implements g {
    private final long a;
    private long b;
    private final DataInputStream c;

    public boolean d() {
        return this.b < this.a;
    }

    public long a() {
        return this.a - this.b;
    }

    public void g() {
        this.c.close();
    }

    public long c() {
        this.b += 8;
        return this.c.readLong();
    }

    public a(File file) {
        int i = r.c;
        this.b = 0;
        this.a = file.length();
        this.c = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }

    public int f() {
        int readInt = this.c.readInt();
        this.b += 4;
        return readInt;
    }

    public void a(long j) {
        a(new byte[((int) (j - this.b))]);
    }

    public void a(byte[] bArr) {
        this.c.read(bArr);
        this.b += (long) bArr.length;
    }

    public long e() {
        return this.b;
    }

    public short b() {
        short readShort = this.c.readShort();
        this.b += 2;
        return readShort;
    }

    public byte h() {
        byte readByte = this.c.readByte();
        this.b++;
        return readByte;
    }
}
