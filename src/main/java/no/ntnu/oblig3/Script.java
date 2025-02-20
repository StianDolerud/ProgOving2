package no.ntnu.oblig3;

import no.ntnu.oblig3.Commands.TextCommand;
import java.util.List;

public class Script implements TextCommand {
    private final List<TextCommand> commands;

    public Script(List<TextCommand> commands) {
        this.commands = commands;
    }

    @Override
    public String execute(String text) {
        for (TextCommand command : commands) {
            text = command.execute(text);
        }
        return text;
    }
}