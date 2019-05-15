package com.example.mhaidersaleem.tufadminpanel;

/**
 * Created by M.HAiDER Saleem on 17/08/2018.
 */

public class add_articles  {
    String name;
    String path;
    String description;
    String key;
    String price;

    public add_articles(String ke,String na,String pa,String des,String pri)
    {
        description=des;
        path=pa;
        key= ke;
        price=pri;
        name= na;
    }


    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getDescription() {
        return description;
    }

    public String getKey() {
        return key;
    }

    public String getPrice() {
        return price;
    }

}
