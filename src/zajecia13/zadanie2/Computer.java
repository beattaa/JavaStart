package zajecia13.zadanie2;

import java.util.Comparator;

public class Computer implements Comparable<Computer> {
    private final String name;
    private final int cpu;
    private final int memory;

    public Computer(String name, int cpu, int memory) {
        this.name = name;
        this.cpu = cpu;
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
