package org.bullet.value;

import org.bullet.CodeLoc;

public class Symbol {
	
	final private String symbol;
	final private CodeLoc loc;
	final int hash;
	
	public Symbol(String symbol, CodeLoc loc) {
		this.symbol = symbol.intern();
		this.loc = loc;
		this.hash = this.symbol.hashCode();
	}

	public String get() {
		return symbol;
	}
	
	public static Symbol valueOf(String symbol, CodeLoc loc) {
		return new Symbol(symbol, loc);
	}
	
	@Override
	public String toString() {
		return "'" + symbol;
	}
	
	@Override
	public int hashCode() {
		return symbol.hashCode();
	}
	
	@Override
	public boolean equals(Object that) {
		if (that instanceof Symbol)
			return symbol.equals(((Symbol)that).symbol);
		else
			return false;
	}
	
	public String getData() {
		return symbol;
	}

	public static String getData(Object object) {
		if (object instanceof Symbol)
			return ((Symbol)object).symbol;
		else
			return null;
	}

	public CodeLoc getLoc() {
		return loc;
	}
}
