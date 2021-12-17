package com.lumi.findcallsinc;

import android.content.Context;
import android.util.Log;

import java.util.Date;

public class CallReceiver extends PhonecallReceiver{
    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start)
    {
        //
        log("onIncomingCallReceived");
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start)
    {
        //
        log("onIncomingCallAnswered");
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {
        log("onIncomingCallEnded");
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start) {
        log("onOutgoingCallStarted");
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {
        log("onOutgoingCallEnded");
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start) {
        log("onMissedCall");
    }

    public void log(String msg){
        Log.d("TAG==>", "log: "+msg);
    }
}
