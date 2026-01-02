import java.util.HashMap;
import java.util.Map;

public class SemanticAnalyzer {
    // Symbol table: variable name → type
    private HashMap<String, String> symbolTable = new HashMap<>();

    // Declare a variable
    public void declareVariable(String variableName, String type) {
        symbolTable.put(variableName, type);
    }

    // Checking variable usage
    public void useVariable(String variableName) {
        if (!symbolTable.containsKey(variableName)) {
            System.out.println(
                    "Semantic Error: Variable '" + variableName + "' used before declaration");
        }
    }

    // Checking incompatible type operations
    public void checkOperation(String type1, String type2) {
        if (!type1.equals(type2)) {
            System.out.println(
                    "Semantic Error: Incompatible types '" + type1 + "' and '" + type2 + "'");
        }
    }
}
