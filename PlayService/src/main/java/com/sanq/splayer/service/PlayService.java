package com.sanq.splayer.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import com.sanq.splayer.main.R;
import com.sanq.splayer.utils.SLog;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 08.04.14
 * Time: 11:45
 */
public class PlayService extends Service{
    MediaPlayer player;


    @Override
    public void onCreate(){
        SLog.d("created...");
        player = MediaPlayer.create(this, R.raw.october);
        player.setLooping(false);
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        SLog.d("started...");
        return Service.START_STICKY;
    }


    @Override
    public void onDestroy() {
        player.stop();
        SLog.d("PlayService.onDestroy()");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
