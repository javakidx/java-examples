package idv.jk.study.designpattern.composite;

import org.apache.commons.lang.StringUtils;

/**
 * Created by bioyang on 2015/10/19.
 */
public class Main
{
    public static void main(String[] args)
    {
        ConcreteCompany root = new ConcreteCompany("台北總公司");
        root.add(new HumanResourceDepartment("總公司人力資源部門"));
        root.add(new FinancialDepartment("總公司財務部門"));

        ConcreteCompany company = new ConcreteCompany("上海華東分公司");
        company.add(new HumanResourceDepartment("上海華東分公司人力資源部門"));
        company.add(new FinancialDepartment("上海華東分公司財務部門"));
        root.add(company);

        root.add(new Company("總稽核處")
        {
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
                System.out.printf("%s 公司稽核管理管理%n", name);
            }
        });
        System.out.println("顯示組織架構：");
        root.display(1);

        System.out.println("顯示組織功能：");
        root.describeDuty();
    }
}
