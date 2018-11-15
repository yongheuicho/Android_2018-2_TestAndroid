package kr.ac.mokwon.ice.testandroid;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

public class CommStateListener extends PhoneStateListener {
    public CommStateListener() {
    }

    @Override
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
    }
}
