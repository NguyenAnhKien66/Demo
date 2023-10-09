open class sinhvien(mssv:String,hoTen:String,namSinh:Int)
{
    var hoTen:String=""
    var mssv:String=""
    var namSinh:Int?=null
    init {
        this.hoTen=hoTen
        this.namSinh=namSinh
        this.mssv=mssv
    }
    open fun hienthi1()
    {
        var mess="Sinh vien $hoTen co MSSV: $mssv sinh nam $namSinh"
        println(mess+"--------------------------------")
    }
}

class sinhvienCNTT(mssv: String,hoTen: String,namSinh: Int):sinhvien(mssv,hoTen,namSinh)
{
    init {
        println("Sinh Viên CNTT")
    }
    override fun hienthi1()
    {
        var mess="Sinh vien $hoTen co MSSV: $mssv sinh nam $namSinh thuoc khoa CNTT"
        println(mess+"-----------  ");
    }
}


fun main(args: Array<String>) {
    var s=sinhvien("0306211472","Nguyễn Anh Kiên",2003)
    s.hienthi1()
    val s2=sinhvienCNTT("0306211472","Nguyễn Anh Kin",2005)
    s2.hienthi1()
}