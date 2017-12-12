package kiv.fjp.antlr_gen.structures;

public class DataType {

    public enum Type {
        STRING("string"),
        BOOL("bool"),
        INTEGER("integer"),
        VOID("void");

        private final String text;

        private Type(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    private Type type;

    DataType(String strType) {
        for (Type t : Type.values()) {
            if (t.toString().compareTo(strType) == 0) {
                type = t;
            }
        }
    }

    public Type getType() {
        return type;
    }
}
