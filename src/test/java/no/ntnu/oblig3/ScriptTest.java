package no.ntnu.oblig3;

import no.ntnu.oblig3.Commands.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ScriptTest {
    @Test
    void testScriptExecution() {
        Script script = new Script(Arrays.asList(
            new ReplaceTextCommand("test", "exam"),
            new CapitalizeWordsTextCommand(),
            new WrapTextCommand("<p>", "</p>")
        ));

        String result = script.execute("this is a test case");
        assertEquals("<p>This Is A Exam Case</p>", result);
    }
}