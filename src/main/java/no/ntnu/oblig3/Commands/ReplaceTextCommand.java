package no.ntnu.oblig3.Commands;

public class ReplaceTextCommand implements TextCommand {
    private final String target, replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    @Override
    public String execute(String text) {
        return text.replace(target, replacement);
    }

 
    public String getTarget() {
        return target;
    }

    public String getReplacement() {
        return replacement;
    }
}