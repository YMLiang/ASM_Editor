package edu.suda.ide.asm.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class ASMSourceViewerConfiguration extends SourceViewerConfiguration{
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		ASMColorProvider provider = ASMPlugin.getDefault().getASMColorProvider();
		PresentationReconciler reconciler= new PresentationReconciler();
		reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(ASMPlugin.getDefault().getASMCodeScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		
		
		
		return reconciler;
	}
}
