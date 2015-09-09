import java.io.File;

public class Exception{

    public static void findFile(File f){
	System.out.println("file exists? "+ f.isFile());
    }

    public static void main(String[] args){
	File file1 = new File("/home/oliver/coding/learn-java/Exception.java");
	File file2 = new File("/cmsaf/nfshome/osus/learn-Java/Exception.java");
	findFile(file1);
	findFile(file2);
    }
    
}
