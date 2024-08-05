//main.java
// main class for the program

//Austin Stephens
//Rasmussen Univeristy
// Professor Kumar
//COT4530C
//08/04/2024
//

//Instructions

//Module 05 Content

//Module: 01
//Assignment: Read and review overall project Requirements

//Module: 02
//Assignment: Create a Java program that implements the stack data structure

//Module: 03
//Assignment: Create a Java program that builds a directed graph

//Module: 04
//Assignment: Create a Java program that performs a depth-first search to create a class compiling order

//Module: 05
//Assignment: Put together a complete solution that implements the functionality developed in weeks 2, 3, and 4
//
//Instructions:
//Now that we have completed the modules that make up our course project.
// put together a complete solution that implements the functionality developed in weeks 2, 3, and 4.
// Below are the requirements for the course project that were at the beginning of the project:
//
//
//You have been employed by an Open Source organization that develops and maintains Operating Systems.
// Your first project is to design a system with a data structure that will track all the modules for a specific OS along with their dependencies.
// Given the fact that whenever a module must be compiled or recompiled; all its dependent modules will need to be recompiled and in the correct order.
// Write a Java application that will, given an appropriate data structure, will be able to track these dependencies as well as implement an appropriate search algorithm
// to create the correct graph for any given module.
//The graph will show all the corresponding dependent modules in their correct order of dependency.
//
//        Provide at least 5 test cases and report your findings.


//We will separate module 2, 3, and 4 into separate classes and then call them in the main class to run the program.
//We will create a class called Main
//We will create a class called Stack
//We will create a class called Graph
//We will create a class called DepthFirstSearch
//We will create a class called Module
//We will create a class called ModuleDependency
//We will create a class called ModuleDependencyGraph
//We will create a class called ModuleDependencyGraphTest



public class Main {
    public static void main(String[] args) {
        //Create a new ModuleDependencyGraphTest object
        ModuleDependencyGraphTest moduleDependencyGraphTest = new ModuleDependencyGraphTest();
        //Run the test cases
        moduleDependencyGraphTest.testModuleDependencyGraph();
    }


}