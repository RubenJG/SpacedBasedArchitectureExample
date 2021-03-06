package com.rubenjg.pu.counter.dto;

/**
 * Counter DTO
 *
 * @author Rubén Jiménez
 */
public class CounterDto {

    private long id;
    private String name;
    private long count;

    public CounterDto() {
    }

    public CounterDto(long id, String name, long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CounterDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
