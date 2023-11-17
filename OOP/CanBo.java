package OOP;
public class CanBo {
    private String Name;
    private String Sex;
    private int Age;
    private String Address;

    public CanBo(String Name, int Age, String Sex,String Address) {
        this.Name = Name;
        this.Age = Age;
        this.Sex = Sex;
        this.Address = Address;
    }
}
class NhanVien extends CanBo {

    public NhanVien(String Name, int Age, String Sex, String Address) {
        super(Name, Age, Sex, Address);
    }
}

class CongNhan extends CanBo {

    public CongNhan(String Name, int Age, String Sex, String Address) {
        super(Name, Age, Sex, Address);
    }
}

class KySu extends CanBo {

    public KySu(String Name, int Age, String Sex, String Address) {
        super(Name, Age, Sex, Address);
    }
}

public static void main(String[] args()) {
    
}



