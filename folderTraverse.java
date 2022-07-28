import java.io.File;

public class Recursion {

    public static void folderTraversal(String path){
        File folder = new File(path);
        if (folder.exists()) {
            System.out.printf("%-30s %-10s%n", "--------Root directory--------", "---Name---");
            recursiveTraversal(folder);
        }
    }

    private static void recursiveTraversal(File folder){
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.printf("%-30s %-10s%n", file.getParent(), file.getName());
            if (file.isDirectory()) recursiveTraversal(file);
        }
    }
}
