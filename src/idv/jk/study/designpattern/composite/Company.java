package idv.jk.study.designpattern.composite;

/**
 * Created by bioyang on 2015/10/19.
 */
public abstract class Company
{
    protected String name;

    public Company(String name)
    {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

    public abstract void describeDuty();
}
