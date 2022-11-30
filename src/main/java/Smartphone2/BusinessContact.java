package Smartphone2;

public class BusinessContact extends Contact{

    public String companyName;


    public BusinessContact(){}
    public BusinessContact(String name, int num, String companyName){
        this.name = name;
        this.num = num;
        this.companyName = companyName;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getNum() {
        return this.num;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
