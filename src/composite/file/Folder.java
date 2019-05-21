package composite.file;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午10:26
 */
public class Folder implements IFile {
    private String name;
    // 聚合了文件抽象节点
    private List<IFile> children;

    public Folder(String name) {
        this.name = name;
        children = new ArrayList<IFile>();
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public List<IFile> getChild() {
        return children;
    }

    @Override
    public boolean add(IFile file) {
        return children.add(file);
    }

    @Override
    public boolean remove(IFile file) {
        return children.remove(file);
    }
}
