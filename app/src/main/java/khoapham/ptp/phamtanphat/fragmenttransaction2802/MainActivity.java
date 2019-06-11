package khoapham.ptp.phamtanphat.fragmenttransaction2802;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity  {

    FragmentManager fragmentManager = getSupportFragmentManager();
    Button btnReplaceAndroid,btnReplaceios, btnAddAndroid,btnAddios,btnRemoveAndroid,btnRemoveios,btnPopbackstach,btnAttach,btnDetach;

    @Override
    protected int setView() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(View v) {
        btnReplaceAndroid = v.findViewById(R.id.buttonReplaceAndroid);
        btnReplaceios = v.findViewById(R.id.buttonReplaceios);
        btnAddAndroid = v.findViewById(R.id.buttonAddAndroid);
        btnAddios = v.findViewById(R.id.buttonAddios);
        btnPopbackstach = v.findViewById(R.id.buttonPopBackStack);
        btnAttach = v.findViewById(R.id.buttonAttach);
        btnDetach = v.findViewById(R.id.buttonDetach);
        btnRemoveAndroid = v.findViewById(R.id.buttonRemoveAndroid);
        btnRemoveios = v.findViewById(R.id.buttonRemoveios);
    }

    @Override
    public void initValue() {

    }

    @Override
    public void initEvent() {
        btnAddAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addAndroid();
            }
        });
        btnAddios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addIos();
            }
        });
        btnReplaceAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceAndroid();
            }
        });
        btnReplaceios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceIos();
            }
        });
        btnRemoveAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeAndroid();
            }
        });
        btnRemoveios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeios();
            }
        });
    }

    public void addAndroid(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        fragmentTransaction.add(R.id.relativelayout,androidFragment,"fragmentandroid");
        fragmentTransaction.commit();
    }
    public void addIos(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        IosFragment iosFragment = new IosFragment();
        fragmentTransaction.add(R.id.relativelayout,iosFragment,"fragmentanios");
        fragmentTransaction.commit();
    }
    public void replaceAndroid(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        fragmentTransaction.replace(R.id.relativelayout,androidFragment,"fragmentandroid");
        fragmentTransaction.commit();
    }
    public void replaceIos() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        IosFragment iosFragment = new IosFragment();
        fragmentTransaction.replace(R.id.relativelayout,iosFragment,"fragmentanios");
        fragmentTransaction.commit();
    }
    public void removeAndroid(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AndroidFragment androidFragment = (AndroidFragment) fragmentManager.findFragmentByTag("fragmentandroid");
        if (androidFragment!= null){
            fragmentTransaction.remove(androidFragment);
            fragmentTransaction.commit();
        }

    }
    public void removeios(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        IosFragment iosFragment = (IosFragment) fragmentManager.findFragmentByTag("fragmentanios");
        if (iosFragment!= null){
            fragmentTransaction.remove(iosFragment);
            fragmentTransaction.commit();
        }

    }
}
