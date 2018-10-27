/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Auto-generated: 2018-08-09 10:22:12
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@JsonObject
public class City {
    @JsonField
    private long cityId;
    @JsonField
    private String counname;
    @JsonField
    private String name;
    @JsonField
    private String pname;
    @JsonField
    private String timezone;
    public void setCityId(long cityId) {
         this.cityId = cityId;
     }
     public long getCityId() {
         return cityId;
     }

    public void setCounname(String counname) {
         this.counname = counname;
     }
     public String getCounname() {
         return counname;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setPname(String pname) {
         this.pname = pname;
     }
     public String getPname() {
         return pname;
     }

    public void setTimezone(String timezone) {
         this.timezone = timezone;
     }
     public String getTimezone() {
         return timezone;
     }

}