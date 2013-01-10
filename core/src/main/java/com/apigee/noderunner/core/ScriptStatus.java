package com.apigee.noderunner.core;

/**
 * This object is returned from the execution of a script, and indicates successful or failed completion.
 */

public class ScriptStatus
{
    public static final int EXCEPTION_CODE = 1;
    private final int exitCode;
    private Throwable cause;

    public static final ScriptStatus OK        = new ScriptStatus(0);
    public static final ScriptStatus CANCELLED = new ScriptStatus(0);
    public static final ScriptStatus EXCEPTION = new ScriptStatus(EXCEPTION_CODE);

    public ScriptStatus(int exitCode)
    {
        this.exitCode = exitCode;
    }

    public ScriptStatus(Throwable cause)
    {
        this.exitCode = EXCEPTION_CODE;
        this.cause = cause;
    }

    public int getExitCode()
    {
        return exitCode;
    }

    public Throwable getCause()
    {
        return cause;
    }

    public void setCause(Throwable cause)
    {
        this.cause = cause;
    }

    public boolean hasCause()
    {
        return cause != null;
    }
}