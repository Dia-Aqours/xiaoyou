package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class WeatherEntity {

    @JsonField
    private String Msg;
    @JsonField
    private boolean Result;
    @JsonField
    private String Data;

    private WeatherData weatherData;

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }
    public String getMsg() {
        return Msg;
    }

    public void setResult(boolean Result) {
        this.Result = Result;
    }
    public boolean getResult() {
        return Result;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
    public String getData() {
        return Data;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
}