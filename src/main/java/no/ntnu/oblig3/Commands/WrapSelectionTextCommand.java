package no.ntnu.oblig3.Commands;

public class WrapSelectionTextCommand extends WrapTextCommand {
    private final String selection;

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        return text.replace(selection, getOpening() + selection + getEnd());
    }
}