package Interfaces;

public class Application {

    public static void main(String[] args) {
     Contract contract = new Implementation(); //creating an instance of the class Implementation type Contract
     printTerms(contract);
       // Implementation: term1
       // Implementation: term2
      //  Implementation: extended...
      //  Implementation: extended custom method
    }

    private static void printTerms(Contract contract) {
       contract.term1();
       contract.term2();
       contract.extendedTerm();
       contract.extendedTermCustom();
    }

}