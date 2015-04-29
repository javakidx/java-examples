package idv.jk.util.regex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 安軻 on 2015/4/24.
 */
public class LookaheadDemo
{
    public static void main(String[] args) {

        List<String> input = new ArrayList<String>();

        input.add("password");

        input.add("p4ssword");

        input.add("p4ssw0rd");

        input.add("p45sword");



        for (String ssn : input) {

            if (ssn.matches("^(?=.*[0-9].*[0-9])[0-9a-zA-Z]{8,12}$")) {

                System.out.println(ssn + ": matches");

            } else {

                System.out.println(ssn + ": does not match");

            }

        }

    }
}
