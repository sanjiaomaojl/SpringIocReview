package IOC;

public class LoginService {
    private AdminDao ad;

    public AdminDao getAd() {
        return ad;
    }

    public void setAd(AdminDao ad) {
        this.ad = ad;
    }

    public LoginService() {
        System.out.println("LoginService()");
    }
    public void execute(){
        ad.f1();
        System.out.println("execute()");
    }
}
