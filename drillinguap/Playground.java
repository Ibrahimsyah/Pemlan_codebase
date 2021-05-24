package drillinguap;

/**
 *
 * @author Ibrahimsyah
 */
interface i1 {
}

interface i2 {
}

abstract class a1{}
abstract class a2{}

//Case1: Interface implement banyak interface
//Answer: menggunakan extends
interface i3 extends i1, i2 {}

//Case2: Abstract extends banyak abstract
//Answer: Tidak bisa extends 2 class, max 1 class
abstract class a3 extends a1{}

//Case3: Interface extends abstract
//Answer: Tidak bisa, interface hanya bisa extends interface lainnya
interface i4 extends a1{}


//Case4: Abstract implements interface 
abstract class a4 implements i1{}

public class Playground {

}
