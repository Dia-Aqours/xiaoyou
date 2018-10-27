package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class BannerData {
    @JsonField
    private String banner_item_id;
    @JsonField
    private String title;
    @JsonField
    private String image_url;
    @JsonField
    private String link_url;

    public String getBanner_item_id() {
        return banner_item_id;
    }

    public void setBanner_item_id(String banner_item_id) {
        this.banner_item_id = banner_item_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    @Override
    public String toString() {
        return "BannerData{" +
                "banner_item_id='" + banner_item_id + '\'' +
                ", title='" + title + '\'' +
                ", image_url='" + image_url + '\'' +
                ", link_url='" + link_url + '\'' +
                '}';
    }
}
