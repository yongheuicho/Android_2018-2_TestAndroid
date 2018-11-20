package kr.ac.mokwon.ice.testandroid;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

public class PhoneCallService extends Service {
    protected PhoneCallReceiver phoneCallReceiver;

    public PhoneCallService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int nResult = super.onStartCommand(intent, flags, startId);
        phoneCallReceiver = new PhoneCallReceiver();
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_NEW_OUTGOING_CALL);
        registerReceiver(phoneCallReceiver, intentFilter);
        return nResult;
    }

    @Override
    public void onDestroy() {
        unregisterReceiver(phoneCallReceiver);
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
