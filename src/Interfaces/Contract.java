package Interfaces;

//Interfaces/contract is like a template for what methods should be found on the implementation class. It makes a
// contract that requires those abstract methods to be implemented in the classes that implements those interfaces.
// But since this interface extends another interface, the implementation class needs to implement all the abstract
// methods of Contract interface and the methods from Extended contract.

//The Collection interfaces just defined methods to be implemented by the Implementation classes.

public interface Contract extends ExtendedContract{
    void term1();
    void term2();
}
