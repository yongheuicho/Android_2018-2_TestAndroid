package kr.ac.mokwon.ice.testandroid;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class PhoneCallService extends Service {
    public PhoneCallService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        return null;
    }
}
