package net.ukr.kekos222;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Objects {

    private List<Objects> dir = new ArrayList();

    public Directory() {
    }

    public Directory(Objects... obj) {
        for (Objects o : obj) {
            dir.add(o);
        }
    }

    public Directory add(Objects obj) {
        if (obj != this) {
            dir.add(obj);
        }
        return this;
    }

    public int getSize() {
        int size = 0;

        for (Objects o : dir) {
            size += o.getSize();
        }
        return size;
    }
}
