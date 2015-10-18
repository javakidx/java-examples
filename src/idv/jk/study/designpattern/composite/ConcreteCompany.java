package idv.jk.study.designpattern.composite;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bioyang on 2015/10/19.
 */
public class ConcreteCompany extends Company
{
    public List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name)
    {
        super(name);
    }

    @Override
    public void add(Company company)
    {
        children.add(company);
    }

    @Override
    public void remove(Company company)
    {
        children.remove(company);
    }

    @Override
    public void display(int depth)
    {
        System.out.println(StringUtils.leftPad(name, depth + name.length(), '-'));

        for (Company c : children)
        {
            c.display(depth + 2);
        }
    }

    @Override
    public void describeDuty()
    {
        for (Company c : children)
        {
            c.describeDuty();
        }
    }
}
