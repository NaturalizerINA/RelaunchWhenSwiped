package mukminullah.com.relaunchwhenswiped;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by user on 10-Oct-17.
 */

public class MyService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        PackageManager pm = getPackageManager();
        Intent i = pm.getLaunchIntentForPackage("mukminullah.com.relaunchwhenswiped");
        i.putExtra("run_transparent","yes");
        startActivity(i);
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
}
