package de.ovgu.cide.language.ecmascript;

import java.io.InputStream;

import tmp.generated_ecmascript.EcmaScriptParser;
import tmp.generated_ecmascript.SimplePrintVisitor;
import cide.gast.ISourceFile;
import cide.gparser.OffsetCharStream;
import cide.gparser.ParseException;
import cide.languages.ILanguageExtension;
import cide.languages.ILanguageParser;
import cide.languages.ILanguagePrintVisitor;
import cide.languages.ILanguageValidator;

public class ECMAScriptExtension implements ILanguageExtension {

	public ILanguageParser getParser(final InputStream inputStream) {
		return new ILanguageParser(){
			public ISourceFile getRoot() throws ParseException {
				return new EcmaScriptParser(new OffsetCharStream(inputStream)).Program();
			}
		};
	}

	public ILanguagePrintVisitor getPrettyPrinter() {
		return new SimplePrintVisitor();
	}

	public ILanguageValidator getValidator() {
		// TODO Auto-generated method stub
		return null;
	}

}
