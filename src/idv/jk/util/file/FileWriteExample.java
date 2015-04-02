package idv.jk.util.file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by javakid on 4/2/15.
 */
public class FileWriteExample
{
    public static void main(String[] argv)
    {
        File file = new File("/home/javakid/temp/write_file.txt");
        try
        {
            FileUtils.write(file, "abcde\r\n", true);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
