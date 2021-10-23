package ru.otus;

public class ClassForTest {
    private final long id;
    private String name;
    private long scores;

    public ClassForTest(long id, String name, long scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    public ClassForTest(ClassForTest another) {
        this.id = another.id;
        this.name = another.name;
        this.scores = another.scores;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getScores() {
        return scores;
    }

    public void setScores(long scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + scores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassForTest classForTest = (ClassForTest) o;

        return (this.id == classForTest.id);
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
