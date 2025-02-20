package no.ntnu.oblig3.Commands;

public class WrapLinesTextCommand extends WrapTextCommand {
    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    @Override
    public String execute(String text) {
        String[] lines = text.split("\n");
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            result.append(getOpening()).append(line).append(getEnd()).append("\n");
        }
        return result.toString().trim();
    }
}