package khoapham.ptp.phamtanphat.fragmenttransaction2802;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public abstract class BaseActivity extends AppCompatActivity implements ListtenView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setView());
        initView(getView());
        initValue();
        initEvent();
    }
    protected abstract int setView();
    public View getView(){
        return getWindow().getDecorView();
    }

}
