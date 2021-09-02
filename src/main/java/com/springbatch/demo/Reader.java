package com.springbatch.demo;

import org.springframework.batch.item.ItemReader;

public class Reader implements ItemReader<String> {

    private String[] messages = {"m1", "m2", "m3"};
    private int count = 0;
    @Override
    public String read() {
        if(count < messages.length) {
            return messages[count++];
        } else {
            count = 0;
        }
        return null;
    }
}
