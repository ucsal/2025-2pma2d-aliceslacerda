package br.com.mariojp.solid.dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailNotifierTest {

    @Test
    void testWelcomeDryRunDoesNotThrow(){
        System.setProperty("DRY_RUN", "true");
        EmailNotifier notifier = new EmailNotifier();

        User user = new User("Ana", "ana@gmail.com");

        assertDoesNotThrow(() -> notifier.welcome(user));
    }
 }
