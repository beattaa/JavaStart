package zajecia10.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class NamesHolder {
    private final List<String> list = new ArrayList<>();

    @Override
    public String toString() {
        return "NamesHolder{" +
                "list=" + list.toString() +
                '}';
    }

    public void add(String name) {
        if (name == null)
            throw new NullPointerException("Provided string is null");
        else if (contains(name))
            throw new DuplicateException();
        else
            list.add(name);
    }

    public boolean contains(String name) {
        if (name == null)
            throw new IllegalArgumentException();
        else {
            for (String str : list) {
                if (str.equalsIgnoreCase(name))
                    return true;
            }
        }
        return false;
    }

    public void remove(String name) {
        if (name == null)
            throw new NullPointerException();
        if (contains(name))
            this.removeElement(name);
    }

    public void removeElement(String name) {
        if (name == null)
            throw new IllegalArgumentException("Provided string is null");
        else {
            for (String str : list) {
                if (str.equalsIgnoreCase(name)) {
                    list.remove(str);
                }
            }
        }
    }

    public int size() {
        return list.size();
    }
}
