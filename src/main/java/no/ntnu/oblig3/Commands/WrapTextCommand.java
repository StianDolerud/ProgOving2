package no.ntnu.oblig3.Commands;

public class WrapTextCommand implements TextCommand {
    private final String opening, end;

    public WrapTextCommand(String opening, String end) {
        this.opening = opening;
        this.end = end;
    }

    @Override
    public String execute(String text) {
        return opening + text + end;
    }

    
    public String getOpening() {
        return opening;
    }

    public String getEnd() {
        return end;
    }
}