abstract class sinhvien1(mssv:String)
{
    var mssv:String=""
    abstract var hoTen:String
    abstract var namSinh:Int
    init {
        this.mssv=mssv
    }




    fun main()
{
    val s1=SinhvienCNTT("030652133");
    s1.hoTen="Nguyen Van Minh"
    s1.namSinh=2005
    s1.hienthii()
    s1.SonamHoc(6)
    println("-------------------")
    var s2=SinhvienKeToan("0306451234");
    s2.hoTen="nguyen Thi thu"
    s2.namSinh=2004
    s2.hienthii()
    s2.SonamHoc(6)
}
