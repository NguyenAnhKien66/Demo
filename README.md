abstract class sinhvien1(mssv:String)
{
    var mssv:String=""
    abstract var hoTen:String
    abstract var namSinh:Int
    init {
        this.mssv=mssv
    }
    abstract fun SonamHoc(hocky:Int)
    open fun hienthii()
    {
        var mess="Sinh vien $hoTen co MSSV: $mssv sinh nam $namSinh "
        println(mess);
    }

}
class SinhvienCNTT(mssv:String): sinhvien1(mssv)
{
    override var hoTen: String=" "
    override var namSinh: Int=2003
    override  fun SonamHoc(hocky: Int)
    {
        if(hocky<=6)
        {
            var nam=(hocky-1)/2+1
            println("ban dang la sinh vien nam thu $nam")
        }
    }
    override fun hienthii() {
        println("nganh CNTT, ")
        super.hienthii()
    }
}
class SinhvienKeToan(mssv:String): sinhvien1(mssv)
{
    override var hoTen: String=" "
    override var namSinh: Int=2004
    override  fun SonamHoc(hocky: Int)
    {
        if(hocky<=5)
        {
            var nam=(hocky-1)/2+1
            println("ban dang la sinh vien nam thu $nam")
        }
        else{
            println("Ban da tot nghiep")
        }
    }
    override fun hienthii() {
        println("nganh ke toan, ")
        super.hienthii()
    }
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
