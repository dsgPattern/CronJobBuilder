package org.example;

public class CronJob {
    private final String _identifier;
    private final IntervalType _intervalType;
    private final int _interval;
    private final int _duration;
    private final String _executionOutput;

    public CronJob(String identifier,
                   IntervalType intervalType,
                   int interval,
                   int duration,
                   String output)
    {
        _duration =duration;
        _identifier = identifier;
        _intervalType = intervalType;
        _interval = interval;
        _executionOutput = output;
    }

    public void Execute()
    {
        System.out.println("Job with ID: " + _identifier +
                " is running each " + _interval + " " + _intervalType.name() +
                " and has a duration of " + _duration);
        System.out.println(_executionOutput);
    }
}
