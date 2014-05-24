package edu.suda.ide.asm.editor;

import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ASMPlugin extends AbstractUIPlugin{
public final static String ASM_PARTITIONING="__asm__partitioning__";
	
    private static ASMPlugin fgInstance;
	private ASMPartitionScanner fPartitionScanner;
	private ASMColorProvider fColorProvider;
	private ASMCodeScanner fCodeScanner;

	/** 
	 * create a new plug-in instance
	 */
	public ASMPlugin(){
		fgInstance=this;
	}
	/**
	 * Returns the default plug-in instance.
	 * 
	 * @return the default plug-in instance
	 */
	public static ASMPlugin getDefault(){
		return fgInstance;
	}
	/**
	 * Return a scanner for creating ASM partitions.
	 * 
	 * @return a scanner for creating ASM partitions
	 */
	public ASMPartitionScanner getASMPartitionScanner(){
		if (fPartitionScanner == null)
			fPartitionScanner= new ASMPartitionScanner();
		return fPartitionScanner;
	}
	/**
	 * Returns the singleton ASM code scanner.
	 * 
	 * @return the singleton ASM code scanner
	 */
	 public RuleBasedScanner getASMCodeScanner() {
	 	if (fCodeScanner == null)
			fCodeScanner= new ASMCodeScanner(getASMColorProvider());
		return fCodeScanner;
	}
	
	/**
	 * Returns the singleton ASM color provider.
	 * 
	 * @return the singleton ASM color provider
	 */
	 public ASMColorProvider getASMColorProvider() {
	 	if (fColorProvider == null)
			fColorProvider= new ASMColorProvider();
		return fColorProvider;
	}
	
}
