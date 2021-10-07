package com.example.rxjava;

import androidx.appcompat.app.AppCompatActivity;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.AsyncSubject;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;

import android.os.Bundle;
import android.util.Log;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity ";
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*************************************************
         * This Section for applying on RX java
         * Observables are two types
         * Hot And Cold
         * in this code we will test Cold observables
         * first sync RX Java dependencies
         *Create Cold Teacher
         * count from 0 to 4
         * every one second counter ++
         *
         */
        // remove the comment to test
        /*
        Observable<Long> coldTeacher = Observable.intervalRange(0, 5, 0, 1, TimeUnit.SECONDS);
        coldTeacher.subscribe(i -> Log.d(TAG, "Student No 1 : " + i));
        sleep(3000);
        coldTeacher.subscribe(i -> Log.d(TAG, "Student No 2 : " + i));
        */
        /****************************************************************************************/
        /*************************************************
         * This Section for applying on RX java
         * Observables are two types
         * Hot And Cold
         * in this code we will test Hot  observables
         * first sync RX Java dependencies
         *Create Cold Teacher
         * convert Cold Teacher to connectable
         * count from 0 to 4
         * every one second counter ++
         *
         */
        //remove the comment to test the connectable observable
        /*
        ConnectableObservable<Long> hotTeacher = ConnectableObservable.intervalRange(0, 5, 0, 1, TimeUnit.SECONDS).publish();
        hotTeacher.connect();
        hotTeacher.subscribe(i -> Log.d(TAG, "Student No 1 : " + i));
        sleep(3000);
        hotTeacher.subscribe(i -> Log.d(TAG, "Student No 2 : " + i));
*/
        /****************************************************************************************/
        /*************************************************
         * This Section for applying on RX java
         * Observables are two types
         * Hot And Cold
         * in this code we will test PublishSubject
         * first sync RX Java dependencies
         *Create Hot Teacher
         * count from 0 to 4
         * every one second counter ++
         *
         */
        //remove the comment to test the connectable observable
        /*
        PublishSubject<String> subject = PublishSubject.create();
        subject.subscribe(i -> Log.d(TAG, "Student No 1 " + i));
        subject.onNext("A");
        sleep(1000);
        subject.onNext("B");
        sleep(1000);
        subject.onNext("C");
        sleep(1000);
        subject.onNext("D");
        sleep(1000);
        subject.subscribe(i -> Log.d(TAG, "Student No 2 " + i));
        subject.onNext("E");
        sleep(1000);
        subject.onNext("F");
        sleep(1000);
         */
        /****************************************************************************************/
        /*************************************************
         * This Section for applying on RX java
         * Observables are two types
         * Hot And Cold
         * This is a hot observable
         * in this code we will test BehaviourSubject
         * first sync RX Java dependencies
         *Create Hot Teacher
         * count from 0 to 4
         * every one second counter ++
         *
         */
        //remove the comment to test the connectable observable
        /*
        BehaviorSubject<String> subject = BehaviorSubject.create();
        subject.subscribe(i -> Log.d(TAG, "Student No 1 " + i));
        subject.onNext("A");
        sleep(1000);
        subject.onNext("B");
        sleep(1000);
        subject.onNext("C");
        sleep(1000);
        subject.onNext("D");
        sleep(1000);
        subject.subscribe(i -> Log.d(TAG, "Student No 2 " + i));
        subject.onNext("E");
        sleep(1000);
        subject.onNext("F");
        sleep(1000);
         */
        /****************************************************************************************/
        /*************************************************
         * This Section for applying on RX java
         * Observables are two types
         * Hot And Cold
         * This is a hot observable
         * in this code we will test ReplaySubject
         * first sync RX Java dependencies
         *Create Hot Teacher
         * count from 0 to 4
         * every one second counter ++
         *
         */
        //remove the comment to test the connectable observable
    /*
        ReplaySubject<String> subject = ReplaySubject.create();
        subject.subscribe(i -> Log.d(TAG, "Student No 1 " + i));
        subject.onNext("A");
        sleep(1000);
        subject.onNext("B");
        sleep(1000);
        subject.onNext("C");
        sleep(1000);
        subject.onNext("D");
        sleep(1000);
        subject.subscribe(i -> Log.d(TAG, "Student No 2 " + i));
        subject.onNext("E");
        sleep(1000);
        subject.onNext("F");
        sleep(1000);
     */
        /****************************************************************************************/
        /*************************************************
         * This Section for applying on RX java
         * Observables are two types
         * Hot And Cold
         * This is a hot observable
         * in this code we will test AsyncSubject
         * first sync RX Java dependencies
         *Create Hot Teacher
         * count from 0 to 4
         * every one second counter ++
         *
         */
        //remove the comment to test the connectable observable
        AsyncSubject<String> subject = AsyncSubject.create();
        subject.subscribe(i -> Log.d(TAG, "Student No 1 " + i));
        subject.onNext("A");
        sleep(1000);
        subject.onNext("B");
        sleep(1000);
        subject.onNext("C");
        sleep(1000);
        subject.onNext("D");
        sleep(1000);
        subject.subscribe(i -> Log.d(TAG, "Student No 2 " + i));
        subject.onNext("E");
        sleep(1000);
        subject.onNext("F");
        sleep(1000);
    }
    public void sleep(int time)
    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}