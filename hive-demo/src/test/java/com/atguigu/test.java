package com.atguigu;

import org.json.JSONArray;

public class test {

    public static void main(String[] args) {

        JSONArray jsonArray = new JSONArray("[{\"a\":\"a1\"},{\"b\":\"b1\"},{\"c\":\"c1\"}]");

        for (int i = 0; i < jsonArray.length(); i++) {
            System.out.println(jsonArray.getString(i));
        }

    }
}
