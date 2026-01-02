public class SemanticAnalyzer_Main {

    public static void main(String[] args) {

        SemanticAnalyzer analyzer = new SemanticAnalyzer();

        // 1. Variable used before declaration
        analyzer.useVariable("x");

        // 2. Declare variable
        analyzer.declareVariable("x", "int");

        // 3. Correct usage
        analyzer.useVariable("x");

        // 4. Type checking
        analyzer.checkOperation("int", "String");
        analyzer.checkOperation("int", "int");
    }
}
