package no.ntnu.oblig3;

import no.ntnu.oblig3.Commands.ReplaceTextCommand;
import no.ntnu.oblig3.Commands.CapitalizeWordsTextCommand;
import no.ntnu.oblig3.Commands.WrapTextCommand;
import no.ntnu.oblig3.Commands.TextCommand;
import java.util.*;

public class TerminalClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TextCommand> commands = new ArrayList<>();

        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        commands.add(new ReplaceTextCommand("hello", "hi"));
        commands.add(new CapitalizeWordsTextCommand());
        commands.add(new WrapTextCommand("<b>", "</b>"));

        Script script = new Script(commands);
        System.out.println("\nFinal result: " + script.execute(text));
        scanner.close();
    }
}