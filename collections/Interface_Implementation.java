interface Food {
    void sing();
}

public class Interface_Implementation implements Food {
    public static void main(String[] args) {
        UseMe useme = new UseMe();
        Interface_Implementation ii = new Interface_Implementation();
        ii.sing();
        System.out.println(useme.age());
        System.out.println(useme.isTall());
        System.out.println(useme.walk());
        System.out.println(Interface.studentID);

    }

    @Override
    public void sing() {
        System.out.println("Sark ft Cina Soul, Over me!");
    }

}

class UseMe implements Interface {

    @Override
    public String walk() {
        return "I want to Walk Please God!";
    }

    @Override
    public int age() {
        return 29;
    }

    @Override
    public Boolean isTall() {
        return false;
    }
}
