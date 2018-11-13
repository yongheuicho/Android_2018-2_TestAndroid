package kr.ac.mokwon.ice.testandroid;

import android.widget.ImageView;

public class BitmapRunnable implements Runnable {
    protected ImageView ivBitmap;
    protected String sBitmapUrl;

    public BitmapRunnable(ImageView ivBitmap, String sBitmapUrl) {
        this.ivBitmap = ivBitmap;
        this.sBitmapUrl = sBitmapUrl;
    }
    @Override
    public void run() {

    }
}
