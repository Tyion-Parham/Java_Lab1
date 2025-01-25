public record Denomination(String noteName, double noteValue) {

    public String toString() {
        return noteName;
    }
    public Double getNoteValue() {
        return noteValue;
    }
}
