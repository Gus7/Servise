package itschool.samsung.kolya.servise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button VibrateButton=(Button)findViewById(R.id.buttonVibrate);


        //Настраиваем слушатель нажатий на кнопку Button для вызова вибрации:
        VibrateButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                //Создаем новое намерение для запуска сервиса использования вибрации
                Intent intentVibrate =new Intent(getApplicationContext(),VibrationService.class);
                startService(intentVibrate);

            }
        });
    }
}