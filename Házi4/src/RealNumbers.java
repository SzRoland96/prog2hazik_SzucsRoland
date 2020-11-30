/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Roland
 */
public interface RealNumbers {
    
    void add(double num); // Adds an element to the list.
    double get(int idx); // Returns the element at the specified position in this list.
    // We assume that the element is present.
    void delete(int idx); // Removes the first occurrence of the specified element
    // from this list, if it is present.
    boolean contains(double num);
    int getFirstOccurrence(double num); // Returns the index of the specified element,
    // -1 if there is no such element.
}
