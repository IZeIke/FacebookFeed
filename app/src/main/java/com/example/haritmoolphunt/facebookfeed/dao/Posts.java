
package com.example.haritmoolphunt.facebookfeed.dao;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Posts {

    @SerializedName("data")
    @Expose
    private List<FeedData> data = null;
    @SerializedName("paging")
    @Expose
    private Paging paging;

    public List<FeedData> getFeed() {
        return data;
    }

    public void setData(List<FeedData> data) {
        this.data = data;
    }

    public Paging getMoreFeed() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}
