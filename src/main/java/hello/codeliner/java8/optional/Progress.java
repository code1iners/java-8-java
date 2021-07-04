package main.java.hello.codeliner.java8.optional;

import java.time.Duration;

public class Progress {
    private Duration duration;
    private boolean finished;

    public Duration getDuration() {
        return this.duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public boolean getFinished() {
        return this.finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "{" +
            " duration='" + getDuration() + "'" +
            ", finished='" + isFinished() + "'" +
            "}";
    }    
}
