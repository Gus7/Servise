package itschool.samsung.kolya.servise;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Vibrator;
import android.widget.Toast;

public class VibrationService extends Service {

    public static final String CHANNEL = "Vibration_SERVICE";
    public static final String INFO = "INFO";
    @Override  public void onCreate()
    {      Toast.makeText(this, "Служба создана",
            Toast.LENGTH_SHORT).show();
        // сообщение о создании службы

    }



    @Override  public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(this, "Служба запущена",Toast.LENGTH_SHORT).show();
        Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        //Указываем длительность вибрации в миллисекундах,
        //в нашем примере будет вибро-сигнал длительностью в 2 секунды
        vibrator.vibrate(2000);

        Toast.makeText(getApplicationContext(), "Вибрация активирована", Toast.LENGTH_LONG).show();
        return START_NOT_STICKY;  }
    @Override  public void onDestroy() {
        Toast.makeText(this, "Служба остановлена", Toast.LENGTH_SHORT).show();
    }
    @Override  public IBinder onBind(Intent intent) {
        return null;
    }    //поток работы с сетью


    public VibrationService() {
    }

}
