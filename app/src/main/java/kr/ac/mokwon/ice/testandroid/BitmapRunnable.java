package kr.ac.mokwon.ice.testandroid;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class BitmapRunnable implements Runnable {
    protected ImageView ivBitmap;
    protected String sBitmapUrl;

    public BitmapRunnable(ImageView ivBitmap, String sBitmapUrl) {
        this.ivBitmap = ivBitmap;
        this.sBitmapUrl = sBitmapUrl;
    }
    @Override
    public void run() {
        try {
            final Bitmap bitmap = BitmapFactory.decodeStream((InputStream)(new URL(sBitmapUrl).getContent()));
            ivBitmap.post(new Runnable() {
                @Override
                public void run() {
                    ivBitmap.setImageBitmap(bitmap);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
