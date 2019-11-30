package hashtable;

import java.util.Objects;

public class ConstantHashcode {
    String name;

    public ConstantHashcode(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstantHashcode that = (ConstantHashcode) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return 42;
    }
}
