package com.project.BP.entities;

import org.springframework.data.annotation.Id;

public class DatabaseSequence {
    @Id
    private String id;

    private long seq;

    public DatabaseSequence() {
    }

    public String getId() {
        return id;
    }

    public long getSeq() {
        return seq;
    }
}
