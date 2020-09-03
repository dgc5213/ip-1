package duke.command;

import duke.util.Storage;
import duke.util.TaskList;
import duke.util.Ui;

/**
 * Responsible for executing a bye command.
 */
public class ByeCommand extends Command {
    /**
     * Constructs a ByeCommand.
     */
    public ByeCommand() {
        super(false);
    }

    /**
     * Executes a bye command and returns a response.
     *
     * @param tasks Contains the current tasks.
     * @param ui Responsible for displaying information to the user.
     * @param storage Reads and stores data into memory.
     * @return Bye message.
     */
    @Override
    public String executeWithResponse(TaskList tasks, Ui ui, Storage storage) {
        return "Bye. Hope to see you again soon!";
    }

    @Override
    public String toString() {
        return "bye";
    }
}
