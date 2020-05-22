package zajecia13.zadanie3;

import java.util.Comparator;

public class Computer implements Comparable<Computer> {
    private final String name;
    private int cpu = 0;
    private int memory = 0;

    public Computer(String name) {
        nameCheck(name);
        this.name = name;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public int getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpu=" + cpu +
                ", memory=" + memory +
                '}';
    }

    private static void nameCheck(String name) {
        if (name == null) {
            throw new NullNameException("Computer's name cannot be null");
        }
    }

    @Override
    public int compareTo(Computer o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }

    static Comparator<Computer> getCpuComparator() {
        return new Comparator<Computer>() {
            public int compare(Computer one, Computer two) {
                {
                    return two.getCpu() - one.getCpu();
                }
            }
        };
    }

    static Comparator<Computer> getMemoryComparator() {
        return new Comparator<Computer>() {
            public int compare(Computer one, Computer two) {
                {
                    return two.getMemory() - one.getMemory();
                }
            }
        };
    }
}
