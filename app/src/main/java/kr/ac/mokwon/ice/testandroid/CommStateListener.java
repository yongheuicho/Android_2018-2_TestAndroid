package kr.ac.mokwon.ice.testandroid;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class CommStateListener extends PhoneStateListener {
    protected TelephonyManager telephonyManager;
    protected Context context;
    public int nRssi;

    public CommStateListener(TelephonyManager telephonyManager, Context context) {
        this.telephonyManager = telephonyManager;
        this.context = context;
    }

    @Override
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        int nPhoneType = telephonyManager.getPhoneType();
        if (nPhoneType == TelephonyManager.PHONE_TYPE_GSM)
            nRssi = signalStrength.getGsmSignalStrength();
        else if (nPhoneType == TelephonyManager.PHONE_TYPE_CDMA)
            nRssi = signalStrength.getCdmaDbm();
        //Toast.makeText(context, "RSSI = " + nRssi, Toast.LENGTH_SHORT).show();
    }
}
