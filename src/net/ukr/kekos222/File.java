package net.ukr.kekos222;

public class File implements Objects {

    private final int size;

    public File(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "(Size = " + size
                + "b)";
    }
}
