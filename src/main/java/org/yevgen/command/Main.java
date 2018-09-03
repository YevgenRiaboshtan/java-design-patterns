package org.yevgen.command;

public class Main {

    /*
    Use the Command pattern when you want to:
    • Parameterize objects by an action to perform.
    • Specify, queue, and execute requests at different times. A Command object can have a lifetime independent of the original
    request. If the receiver of a request can be represented in an address space-independent way, then you can transfer a command
    object for the request to a different process and fulfill the request there.
    • Support undo. The Command’s Execute operation can store state for reversing its effects in the command itself. The
    Command interface must have an added Un-execute operation that reverses the effects of a previous call to Execute.
    Executed commands are stored in a history list. Unlimited-level undo and redo is achieved by traversing this list backwards
    and forwards calling Un-execute and Execute, respectively.
    • Support logging changes so that they can be reapplied in case of a system crash. By augmenting the Command interface
    with load and store operations, you can keep a persistent log of changes. Recovering from a crash involves reloading logged
    commands from disk and re-executing them with the Execute operation.
    • Structure a system around high-level operations built on primitives operations. Such a structure is common in information
    systems that support transactions. A transaction encapsulates a set of changes to data. The Command pattern offers a way to
    model transactions. Commands have a common interface, letting you invoke all transactions the same way. The pattern also
    makes it easy to extend the system with new transactions.
     */
    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(10);

        EmailJob emailJob = new EmailJob();
        FileIOJob fileIOJob = new FileIOJob();
        LoggingJob loggingJob = new LoggingJob();
        SmsJob smsJob = new SmsJob();

        for (int i = 0; i < 5; i++) {
            emailJob.setEmail(new Email());
            fileIOJob.setFileIO(new FileIO());
            loggingJob.setLogging(new Logging());
            smsJob.setSms(new Sms());

            pool.addJob(emailJob);
            pool.addJob(fileIOJob);
            pool.addJob(loggingJob);
            pool.addJob(smsJob);
        }

        pool.shutdownPool();
    }
}
