package edu.suda.ide.asm.editor;

import org.eclipse.jface.text.rules.IWordDetector;

public class MyWordDetector implements IWordDetector {
    /**
     * {@inheritDoc}
     */
    public boolean isWordStart(char c) {
      return ((c > ' ') && (c <= '~'));
    }

    /**
     * {@inheritDoc}
     */
    public boolean isWordPart(char c) {
      return ((c > ' ') && (c <= '~'));
    }
}
