package kiv.fjp.antlr_gen.structures;

public class DataType {

    public enum Type {
        STRING,
        BOOL,
        INTEGER;

        private final String text;

        

    }

    public Type type;

    DataType(String strType) {
        if (strType.compareTo("string") == 0) {
            type = Type.STRING;
        } else if (strType.compareTo("bool") == 0) {
            type = Type.
        }
    }
}
