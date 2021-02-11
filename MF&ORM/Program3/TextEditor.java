package Program3;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker) {
		// TODO Auto-generated constructor stub
		this.spellChecker = spellChecker;
	}
	public void spellchecker() {
		spellChecker.display();
	}
}
