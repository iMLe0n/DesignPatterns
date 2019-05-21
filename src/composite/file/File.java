package composite.file;

import java.util.List;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午10:25
 */
public class File implements IFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile file) {
        return false;
    }

    @Override
    public boolean remove(IFile file) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return null;
    }
}
