package CitizenPackage;

public class CSStudent implements Citizen{

    private String name;
    private String adress;
    private int identityCardNumber;


    @Override
    public String getAddress() {
        return this.adress;
    }

    @Override
    public int getIdentityCardNumber() {
        return this.identityCardNumber;
    }
}
