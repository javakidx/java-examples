package idv.jk.util.regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by bioyang on 15/4/30.
 */
public class SubStringMain
{
    public static void main(String[] argv)
    {
        String filename = "/Users/bioyang/temp/files_in_hadoop_temp.txt";
        Pattern thePattern
                = Pattern.compile("[a-z\\-]+\\s+(\\-|[0-9]) (root|hadoop)\\s+supergroup\\s+([0-9]+) ([0-9\\-]+) ([0-9:]+) (\\D+)\\/?.*");
                //= Pattern.compile("[a-z\\-]+\\s+(\\-|[0-9]) (root|hadoop)\\s+supergroup\\s+([0-9]+) ([0-9\\-]+) ([0-9:]+) (\\D*[^\\d/]).*");

        try
        {
            Files.lines(Paths.get(filename))
                    .map(line -> thePattern.matcher(line))
                    .collect(Collectors.toList())
                    .forEach(theMather -> {
                        if (theMather.find())
                        {
                            System.out.println(theMather.group(3) + "-" + theMather.group(4) + "-" + theMather.group(6));
                        }
                    });
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
