fun main(args:Array<String>)
{
    var ngay:Int
    var thang:Int
    var nam:Int
    var check:Int=1
    print("Nhap vao ngay thang nam: ");
    ngay= readln().toInt()
    thang=readln().toInt()
    nam=readln().toInt()

    if(nam<0)
    {
        check=0

    }

    if(thang<1||thang>12)
    {
        check=0
    }
    if(ngay<1||ngay>31)
    {
        check=0
    }

    if((thang==4||thang==6||thang==9||thang==11)&&ngay>30)
    {
        check=0
    }
    if(thang==2)
    {
        if(nam%4==0||(nam%100==0&&nam%400!=0))
        {
            if(ngay>29)
            {
                check=0
            }
        }
        else
        {
            if(ngay>28)
            {
                check=0
            }
        }
    }

    if(check==1)
    {
        print("Ngay thang nam hop le")
    }
    else
    {
        print("Ngay thang nam khong hop le")
    }

    //1 3 5 7 8 10 12 co 31 ngay
    //4 6 9 11 co 30 ngay
    //2 nhuan thi 29, ko nhuan thi 28
}