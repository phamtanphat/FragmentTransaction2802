package khoapham.ptp.phamtanphat.fragmenttransaction2802;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();


    @Override
    protected int setView() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(View v) {
        Button btnReplace = v.findViewById(R.id.buttonReplaceAndroid);
        btnReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button replace android", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void initValue() {

    }

    @Override
    public void initEvent() {

    }
}
