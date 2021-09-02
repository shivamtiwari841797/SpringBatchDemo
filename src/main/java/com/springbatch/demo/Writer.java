package com.springbatch.demo;


import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class Writer implements ItemWriter<String> {
    @Override
    public void write(List<? extends String> list) {
        for(String msg : list) {
            System.out.println(msg);
        }
    }
}
