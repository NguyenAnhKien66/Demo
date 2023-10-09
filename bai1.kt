
fun main(args: Array<String>) {
    var n:Int;
    var ht:Int;
    var hc:Int;
    var dv:Int;
    do {
        print("Nhap vao so duong co 3 chu so: ")
        n = readln().toInt()
    }while (n<100||n>999)
    dv=n%10
    hc=n/10%10
    ht=n/100

    when(ht)
    {
        0->print("Không trăm ")
        1->print("Một trăm ")
        2->print("Hai trăm ")
        3->print("Ba trăm ")
        4->print("Bốn trăm ")
        5->print("Năm trăm ")
        6->print("Sáu trăm ")
        7->print("Bảy trăm ")
        8->print("Tám trăm ")
        9->print("Chín trăm ")
    }
    when(hc)
    {
        0->if(dv>0) print("lẻ ")
        1->print("mười ")
        2->print("hai mươi ")
        3->print("ba mươi ")
        4->print("bốn mươi ")
        5->print("năm mươi ")
        6->print("sáu mươi ")
        7->print("bảy mươi ")
        8->print("tám mươi ")
        9->print("chín mươi ")
    }
    when(dv)
    {

        1->if(hc>1) print("mốt") else print("một")
        2->print("hai")
        3->print("ba")
        4->print("bốn")
        5->if(hc==0) print("năm") else print("lăm")
        6->print("sáu")
        7->print("bảy")
        8->print("tám")
        9->print("chín")
    }

}