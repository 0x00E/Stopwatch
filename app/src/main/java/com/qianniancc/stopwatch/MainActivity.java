package com.qianniancc.stopwatch;

import android.app.*;
import android.widget.*;
import android.os.*;
import com.qianniancc.stopwatch.*;
import android.view.View.*;
import android.view.*;
import android.util.*;/**
 * Chronometer 定时器
 * 
 * @author chenling0418
 * 
 */


public class MainActivity extends Activity
{

    private Chronometer chronometer;
    private Button start;
    private Button stop;
    private Button reset;
	
	
{
	System.out.println(1111111111);
}

    @Override
    public void onCreate(Bundle savedInstanceState)
	{
	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		

        chronometer =  findViewById(R.id.chronometer);
        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);
        reset = findViewById(R.id.reset);
		
		 start.setOnClickListener(new OnClickListener(){
				
			public void onClick(View v)
				{
					
					onStart(v);

				}
			});

        stop.setOnClickListener(new OnClickListener(){
                public void onClick(View v)
				{
                    onStop(v);

                }
            });

        reset.setOnClickListener(new OnClickListener(){
                public void onClick(View v)
				{
                    onReset(v);

                }
            });

//      chronometer.setFormat("%s"); // 00：00


    }

    /**
     * 开始计时
     * @param view
     */
	
    public void onStart(View view)
	{
        chronometer.setBase(SystemClock.elapsedRealtime()); 
        chronometer.start();  


    }

    /**
     * 停止计时
     * @param view
     */
    public void onStop(View view)
	{
        chronometer.stop();  
        Log.i("slack", chronometer.getText().toString());

    }

    /**
     * 将计时器清零
     * @param view
     */
    public void onReset(View view)
	{
        chronometer.setBase(SystemClock.elapsedRealtime()); 
        
    }

}
