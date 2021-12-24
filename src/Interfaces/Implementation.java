package Interfaces;

//Notice how this implementation class it have to implement the abstract/contract methods from the interfaces, the
// Contract interface and since Contract extends ExtendedContract interface by inheritance we have to implement its
// method (void extendedTerm()) on this class.

public class Implementation implements Contract{
    @Override
    public void term1() {
        System.out.println("Implementation: term1");
    }

    @Override
    public void term2() {
        System.out.println("Implementation: term2");
    }

    @Override
    public void extendedTerm() {
        System.out.println("Implementation: extended...");
    }

    @Override
    public void extendedTermCustom() {
        System.out.println("Implementation: extended custom method");
    }
}
