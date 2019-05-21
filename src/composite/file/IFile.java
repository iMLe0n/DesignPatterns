package composite.file;

import java.util.List;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午10:24
 * 文件节点抽象(是文件和目录的父类)
 */
public interface IFile {
    //显示文件或者文件夹的名称
    void display();

    boolean add(IFile file);

    boolean remove(IFile file);

    //获得子节点
    List<IFile> getChild();
}
