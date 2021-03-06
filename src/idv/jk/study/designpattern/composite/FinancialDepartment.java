package idv.jk.study.designpattern.composite;

import org.apache.commons.lang.StringUtils;

/**
 * Created by bioyang on 2015/10/19.
 */
public class FinancialDepartment extends Company
{
    public FinancialDepartment(String name)
    {
        super(name);
    }
    @Override
    public void add(Company company)
    {

    }

    @Override
    public void remove(Company company)
    {

    }

    @Override
    public void display(int depth)
    {
        System.out.println(StringUtils.leftPad(name, depth + name.length(), '-'));
    }

    @Override
    public void describeDuty()
    {
        System.out.printf("%s 公司財務收支管理%n", name);
    }
}
