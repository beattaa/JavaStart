package zajecia16.zadanie2;

public enum Language {
    PL("PL"),
    EN("EN");
    private final String name;

    Language(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Language findByName(String name) {
        for (Language value : Language.values()) {
            if (value.getName().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
