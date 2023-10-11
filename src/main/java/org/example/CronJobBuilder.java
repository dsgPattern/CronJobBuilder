package org.example;

public class CronJobBuilder {
    private String _identifier;
    private IntervalType _intervalType;
    private int _interval;
    private int _duration;
    private String _executionOutput;

    public CronJobBuilder addIdentifier(String identifier)
    {
        _identifier = identifier;
        return this;
    }

    public CronJobBuilder widthInterval(IntervalType intervalType, int interval)
    {
        _intervalType = intervalType;
        _interval = interval;
        return this;
    }

    public CronJobBuilder widthDuration(int duration)
    {
        _duration=duration;
        return this;
    }

    public CronJobBuilder addExecutionOutput(String executionOutput)
    {
        _executionOutput = executionOutput;
        return this;
    }

    public CronJob build()
    {
        return new CronJob(_identifier,
                _intervalType,
                _interval,
                _duration,
                _executionOutput);
    }
}
