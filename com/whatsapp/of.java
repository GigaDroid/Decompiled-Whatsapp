package com.whatsapp;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

class of extends SimpleOnGestureListener {
    final GalleryView a;

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        try {
            if (Math.abs(motionEvent.getY() - motionEvent2.getY()) > 250.0f) {
                return false;
            }
            try {
                if (motionEvent.getX() - motionEvent2.getX() <= 120.0f || Math.abs(f) <= 200.0f) {
                    try {
                        if (motionEvent2.getX() - motionEvent.getX() <= 120.0f || Math.abs(f) <= 200.0f) {
                            return false;
                        }
                        if (GalleryView.a(this.a) == 1) {
                            return false;
                        }
                        try {
                            if (GalleryView.b(this.a) <= 0) {
                                return false;
                            }
                            this.a.a(GalleryView.b(this.a) - 1);
                            return true;
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Exception e22) {
                        throw e22;
                    }
                } else if (GalleryView.a(this.a) == 1) {
                    return false;
                } else {
                    try {
                        if (GalleryView.b(this.a) >= this.a.getChildCount() - 1) {
                            return false;
                        }
                        this.a.a(GalleryView.b(this.a) + 1);
                        return true;
                    } catch (Exception e222) {
                        throw e222;
                    }
                }
            } catch (Exception e2222) {
                throw e2222;
            } catch (Exception e22222) {
                throw e22222;
            }
        } catch (Exception e3) {
            return false;
        }
    }

    of(GalleryView galleryView) {
        this.a = galleryView;
    }
}
