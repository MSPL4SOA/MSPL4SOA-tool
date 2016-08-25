package util;

import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

public class JavaCodeFormatter {

	public static void formattingCode(File fileJavaCodeFile) {
		String code = Functions.fileToString(fileJavaCodeFile.getAbsolutePath());

		// take default Eclipse formatting options
		Map options = DefaultCodeFormatterConstants.getEclipseDefaultSettings();

		// initialize the compiler settings to be able to format 1.5 code
		options.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_1_5);
		options.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_1_5);
		options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_5);

		// change the option to wrap each enum constant on a new line
		options.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ENUM_CONSTANTS,
				DefaultCodeFormatterConstants.createAlignmentValue(true,
						DefaultCodeFormatterConstants.WRAP_ONE_PER_LINE,
						DefaultCodeFormatterConstants.INDENT_ON_COLUMN));

//		System.out.println(code);
		CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(options);

		TextEdit textEdit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT, code, 0, code.length(), 0, null);
		IDocument doc = new Document(code);
		try {
			textEdit.apply(doc);
			// System.out.println(doc.get());

			Functions.stringToFile(doc.get(), fileJavaCodeFile.getAbsolutePath(), false);
		} catch (MalformedTreeException e) {
			e.printStackTrace();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static void formattingCode2(File fileJavaCodeFile) {
//		ASTParser parser = ASTParser.newParser(AST.JLS3);
//		parser.setSource(
//				"public class A { int i = 9;  \n int j; \n ArrayList<Integer> al = new ArrayList<Integer>();j=1000; }"
//						.toCharArray());
//		// parser.setSource("/*abc*/".toCharArray());
//		parser.setKind(ASTParser.K_COMPILATION_UNIT);
//		// ASTNode node = parser.createAST(null);
//
//		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
//
//		cu.accept(new ASTVisitor() {
//
//			Set names = new HashSet();
//
//			public boolean visit(VariableDeclarationFragment node) {
//				SimpleName name = node.getName();
//				this.names.add(name.getIdentifier());
//				System.out.println("Declaration of '" + name + "' at line" + cu.getLineNumber(name.getStartPosition()));
//				return false; // do not continue to avoid usage info
//			}
//
//			public boolean visit(SimpleName node) {
//				if (this.names.contains(node.getIdentifier())) {
//					System.out.println("Usage of '" + node + "' at line " + cu.getLineNumber(node.getStartPosition()));
//				}
//				return true;
//			}
//
//		});
//	}
}
