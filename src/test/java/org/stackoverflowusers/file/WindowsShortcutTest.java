package org.stackoverflowusers.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.*;

public class WindowsShortcutTest
{
    @Test
    public void testLocalLink() throws IOException {
        File file = new File("../../../fixtures/Local file.lnk");
        WindowsShortcut link = new WindowsShortcut(file);
        assertEquals(true, link.isLocal());
    }
}
