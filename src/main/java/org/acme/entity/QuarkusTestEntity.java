package org.acme.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("quarkus_test")
public class QuarkusTestEntity {
    private int id;
    private String test;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "QuarkusTestEntity{" +
                "id=" + id +
                ", test='" + test + '\'' +
                '}';
    }
}
