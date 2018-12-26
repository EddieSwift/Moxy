package com.eddie.moxy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class MainActivity extends MvpAppCompatActivity implements IMainView, View.OnClickListener {

    private TextView resultTxt;
    private Button startBtn;

    @InjectPresenter
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTxt = findViewById(R.id.resultTxt);
        startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(this);
    }

    @Override
    public void setCount(int count) {

        resultTxt.setText(String.valueOf(count));
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.startBtn) {

            presenter.startBtn();
        }

    }
}
