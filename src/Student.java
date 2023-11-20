public class Student {
    private String name;
    private int credit;
    private int year;
    private int hours;
    public Student(String n, int c)
    {
        this.name = n;
        this.credit = c;
    }

    public Student(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    public int getCredit()
    {
        return this.credit;
    }

    public int getYear()
    {
        return this.year;
    }

    public void setCredit(int credit)
    {
        this.credit = credit;
    }

    public void setYear()
    {

        if (hours <= 1)
        {
            fee = 5;
        }
        else if (hours <= 2)
        {
            fee = 5 + 3;
        }
        else {
            fee = 5 + 3 + (hours - 2)*2;
        }

        int count = 0;
        int total_fee = 0;
        while (hours != 0)
        {
            if (count == 0)
                total_fee+=5;
            else if (count == 1)
                total_fee+=3;
            else
                total_fee+=2;
            hours--;
        }
    }


} //
