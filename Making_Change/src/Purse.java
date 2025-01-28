import java.util.HashMap;
import java.util.Map;

public class Purse {
    /* Creates a hash map of Denominations as the key and integers,
    representing the amount of a given denomination, as the values.*/
    public HashMap<Denomination, Integer> cash = new HashMap<>();

    public void addToPurse(Denomination d, Integer amount) {
        cash.put(d, amount);
    }

    // function is unused but is here for possible expansion in the future.
    public double removeFromPurse(Denomination d, Integer amount) {
        double withdraw = (cash.get(d.noteValue()) * amount);
        cash.remove(d, amount);
        return withdraw;
    }

    public double getTotal() {
        double total = 0;
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            total += entry.getKey().getNoteValue() * entry.getValue();
        }
        return total;
    }

    public String outputString() {
        String contents = "";
        if (cash.isEmpty()) {
            return "Nothing";
        }
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()){
            contents = contents + entry.getValue() + " " + entry.getKey() + "\n";
        }
        contents = contents + getTotal() + "\n";
        return contents;
    }
}
