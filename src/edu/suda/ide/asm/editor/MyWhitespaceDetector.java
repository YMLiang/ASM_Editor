package edu.suda.ide.asm.editor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class MyWhitespaceDetector implements IWhitespaceDetector{
	public boolean isWhitespace(char character) {
		return Character.isWhitespace(character);
	}
}
