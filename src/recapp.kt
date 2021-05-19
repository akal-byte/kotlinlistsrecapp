fun main() {
numbersList(mutableListOf(12,45,67,89,9,34,76,78,96))
   listSlice()
}
fun numbersList(nums:MutableList<Int>){
   if (nums.contains(109)){ //USING CONTAIN KEYWORD TO CHECK IF ELEMENT IS IN A LIST
     println("nums2 is contained in num1")
    }
    else if (nums.containsAll(listOf(9,34))){
       println("my list contains 9 and 34")
    //using containall to check if my list has more than one element
    }
    var nuList=nums.subList(2,5) //creates a sublist of the list from a certain index to another
    println(nuList)
    nums.shuffle() //randomly rearranges the list elements
    println(nums)
    nums.sort()//ascending order
    println(nums)
    nums.map { num->num*4 }//map returns a modified version of the list by applying a transform
    println(nums)
    nums.removeAt(4) //removes element at a specific index
    nums.remove(89)//removes first occurrence of an element
    println(nums)
 nums.replaceAll { num ->num*2 }//modifies all elements of the list with the given function.
//    In our case, we create an anonymous function that multiplies each element by 2.
 nums.retainAll(listOf(8,9,10))//retains only elements specified in the parameter; others are removed.
    println(nums)
    nums.fill(56)//replaces all elements with the given value.
    println(nums)
    nums.clear()// removes all elements from the list.
    println(nums)
}
//list slicing using range
fun listSlice(){
var numsList= mutableListOf<Int>(3,9,10,11,89,11234,7890,90789,12345,789,678,907,224,678)
    val dropped=numsList.drop(11234)
    println(dropped)
    numsList.slice(4..9)

   // println(numsList)
    var numlist2= numsList.reduce(){num,next ->num+next}//returns one agregate list value from the list
    println(numlist2) // here we  find the aggregate sum.
    var fruits= mutableListOf<String>("pineapples","bananas","peaches","guavas","melons","tangerines")
    var reducedFruits=fruits.reduceRight(){fruit,next-> "$fruit-$next"}
    //accumulates value starting with last element and applying the operation from right to left
    // to each element and current accumulator value.
    println(reducedFruits)
    val expenses = listOf(20, 40, 80, 15, 25)
    val price=450// initial value
    val foldedExpenses=expenses.fold(price){expense,next -> expense-next}//aggregates list values into
    // a single value  The difference is that folding starts with an initial value.
    println(foldedExpenses)
    val chunkedList=numsList.chunked(4).fold(0){num,next-> num+next[0]  }
    println(chunkedList)
    //Sometimes we need to work with more elements of a list when doing reductions.
// We can use the chunked() method to split the list into a list of lists.



}