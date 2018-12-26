package com.eddie.moxy;

import android.os.AsyncTask;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<IMainView> {

    public void startBtn() {

        new AsyncTask<Void, Integer, Void>() {

            @Override
            protected void onProgressUpdate(Integer... values) {

                getViewState().setCount(values[0]);
            }

            @Override
            protected Void doInBackground(Void... voids) {

                for (int i = 0; i < 300; i++) {

                    publishProgress(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return null;
            }
        }.execute();
    }
}
