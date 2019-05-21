package composite.file;

import java.util.List;

/**
 * @author iMLe0n
 * @version 1.0.0
 * @date 19-5-21 下午10:27
 */
public class MainClass {
    public static void main(String[] args) {
        IFile rootFolder = new Folder("/root");
        IFile home = new Folder("home");
        IFile user = new Folder("imle0n");
        IFile file = new File("imle0n.java");
        rootFolder.add(home);
        rootFolder.add(user);
        rootFolder.add(file);

        IFile aFolder = new Folder("aFolder");
        IFile aFile = new File("aFile.txt");
        user.add(aFolder);
        user.add(aFile);

        displayTree(rootFolder, 0);
    }

    // 层序遍历树
    private static void displayTree(IFile rootFolder, int deep) {
        for(int i = 0; i < deep; i++) {
            System.out.print("--");
        }
        //显示自身的名称
        rootFolder.display();
        //获得子树
        List<IFile> children = rootFolder.getChild();
        //遍历子树
        for(IFile file : children) {
            if(file instanceof File) {
                for(int i = 0; i <= deep; i++) {
                    System.out.print("--");
                }
                file.display();
            } else {
                displayTree(file, deep + 1);
            }
        }
    }
}
