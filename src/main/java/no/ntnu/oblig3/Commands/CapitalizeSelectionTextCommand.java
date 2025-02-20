package no.ntnu.oblig3.Commands;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
    private final String selection;

    public CapitalizeSelectionTextCommand(String selection) {
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        if (text == null || text.isEmpty() || !text.contains(selection)) {
            return text;
        }
        String capitalizedSelection = new CapitalizeTextCommand().execute(selection);
        return text.replace(selection, capitalizedSelection);
    }
}