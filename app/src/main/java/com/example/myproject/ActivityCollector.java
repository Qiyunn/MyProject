package com.example.myproject;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishALl(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }

    }

}
