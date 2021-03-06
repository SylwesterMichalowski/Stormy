package com.sylwestermichalowski.stormy.wather;

import com.sylwestermichalowski.stormy.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by sylwestermichalowski on 08/11/15.
 */
public class Current
{
    private  String mIcon;
    private  long mTime;
    private  double mTemperature;
    private  double mHumidity;
    private  double mPrecipChance;
    private String mSummary;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    private  String mTimeZone;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId(){
       return Forecast.getIconId(mIcon);
    }


    public long getTime() {
        return mTime;
    }

    public  String getForrmatedTime(){
        SimpleDateFormat formmater = new SimpleDateFormat("h:mm: a");
        formmater.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        String timeString = formmater.format(new Date(getTime()* 1000));
        return  timeString;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int)Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        return (int)(Math.round(mPrecipChance * 100));
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
