package main.java.hello.codeliner.java8.functional_interface.stream;

import java.util.Optional;

import main.java.hello.codeliner.java8.functional_interface.optional.Progress;

public class OnlineClass {

    private Integer id;
    private String title;
    private boolean closed;
    private Progress progress;

    public OnlineClass() {
        System.out.println("OnlineClass created");
    }

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }


    public boolean getClosed() {
        return this.closed;
    }


    public Optional<Progress> getProgressWithOptional() {
        return Optional.ofNullable(this.progress);
    }


    public Progress getProgress() {
        return this.progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", closed='" + isClosed() + "'" +
            "}";
    }
}
