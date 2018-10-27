/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.Date;

/**
 * Auto-generated: 2018-08-09 10:22:12
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@JsonObject
public class Condition {
    @JsonField
    private String condition;
    @JsonField
    private String humidity;
    @JsonField
    private String icon;
    @JsonField
    private String temp;
    @JsonField
    private Date updatetime;
    @JsonField
    private String windDir;
    @JsonField
    private String windLevel;
    public void setCondition(String condition) {
         this.condition = condition;
     }
     public String getCondition() {
         return condition;
     }

    public void setHumidity(String humidity) {
         this.humidity = humidity;
     }
     public String getHumidity() {
         return humidity;
     }

    public void setIcon(String icon) {
         this.icon = icon;
     }
     public String getIcon() {
         return icon;
     }

    public void setTemp(String temp) {
         this.temp = temp;
     }
     public String getTemp() {
         return temp;
     }

    public void setUpdatetime(Date updatetime) {
         this.updatetime = updatetime;
     }
     public Date getUpdatetime() {
         return updatetime;
     }

    public void setWindDir(String windDir) {
         this.windDir = windDir;
     }
     public String getWindDir() {
         return windDir;
     }

    public void setWindLevel(String windLevel) {
         this.windLevel = windLevel;
     }
     public String getWindLevel() {
         return windLevel;
     }

}