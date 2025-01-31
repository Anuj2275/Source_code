# Date 15-16
## **IMP** quick sort worst case  (when pivot is always the smallest or th largst ele)   
### 20_Divide and conquer
- merge sort
- quick sort

# Date 17 Jan
## Space and Time complexity
### What is time complexity
- amount of space or time taken up by an algorithm code as fnc of input size _NOT THE ACTUAL TIME TAKEN_
- __time for linear search in worst case will remain same even if our array was sorted__

-  _Time complexity for linear search is O(n)_

### Constant time complexity
- O(1)
### Big O Notation
- we always try to find the worst cases firstly
- upper bound
- 1,n,log n, n^2, n log n   
### Big Omega Notation
- lower bound
- best case TC  ()
- n^2,3,4,5
### Big theta Notation
- average bound   (Lower bound = upper bound)
### common complexities
- O(1,n,log n , n^2, 2^n(exponential complexity))

# Date 18 Jan
### Space Complexity
- input space + auxiliary space 
- _time priority is more than the space(as now their is a lot of space in max devices)_

#### Theoretical Analysis
- loop based egs
- sorting/searching
- recusive problems 

#### code Analysis 
- bubble sort _(without optimized - O(n^2))_ and with optimized way _O(n)_
- binary sort _O(log n)_ and with optimized way __

# Date 19 Jan
#### _Recursive complexity Analysis (14)_
- total work done = (no. of calls * work in each call)
- recurrence equation
- _Space complexity_ -> (max depth * memory in each call)

__factorial__
- time complexity --> O(n)
- space complexity  -->O(n)

__Sum of n__
- time complexity --> O(n)
- space complexity  -->O(n)


__fibonacci numbers__
- time complexity --> O(2^n)
- space complexity  -->O(n)

- _in optimized way (using the memoization DP and the iterative) its  TC-O(n) and SC-O(1)_

__merge sort__
- time complexity --> O(n log n )
- space complexity  -->O(n)

__merge sort optimized method__
- time complexity --> O(n log n)
- space complexity  -->O(n)

__power of n__
- normal multiplying the number n times
- time complexity --> O(n)
- space complexity  -->O(1)

__power of n optimized approach__
- n/2 but by calling the recursion two times (next way is more optimized by storing the recursion in an var)
- time complexity --> O(log n )
- space complexity  -->O(log n)

__power of n more optimized approach__
- n/2 but by making only one var which stores the x=  power(m,n/2); and then we use this as x*x  and more
- time complexity --> O(log n )
- space complexity  -->O(1)

# Date 20 Jan
## Back Tracking
### types of bactracking
 - Decision
 - optimization
 - enumeration
 
 # date 21 22 Jan
 - i just wrote the half code and unable to catch with this queen problem
 - __**********do this question again its imp*********__

# Date 23 Jan
- _Grid ways_
_DONE_

# Date 24 -25 -26 Jan
## Array List
- A new data structure
- inbuilt
- linear 
- dynamic size
- primitive data types  can't be stored directly
## 25 done nothing
## 26 starting again
#### Operations that we can do on arraylist
1. Operations
-   _ops_        _timecomplexity_
-   add ele    O(1)         list.add(ele), list.add(index,ele)
-   get ele    1 list.get(index)
-   remove     n  list.remove(index)
-   set ele at index   n    list.set(index,ele)
-   containes ele      n list.contain(ele)  T/F 

2. size of array list
- in for loop we user list.size✅ rather than list.length❌ and to print we user list.get

3. Reverse array list 
4. swap 2 indexes 
5. sorting an arraylist
6. multidimensional arraylist
7. Container with most water    [brute and 2 pointer(ht=min of lp and rp , wid = rp -lp,  curr=ht*wd, max(maxw,cur)inside the while loop )]
8. - Pair sum  (given in sorted order)     (brute force , 2 pointer approach)
- pair sum (sorted and rotated) (2 methods 2 pointer and another also two pointer but with % operator for lp=(lp+1)%n and for rp = (n+rp-1)%n)

# Date 27 Jan
### __Linked List (Part-1)__
- Adding in linked list   (add first and last)
- print nodes
- adding in between
- size of node

# Date 28 Jan
- remove first and last in a linked list
- search (iterative) _search for a key in ll and return the postion where it is found if not found return -1_
- search (recursive)
- reverse a linked list

# Date 28 Jan
- remove nth node starting from the end (tail)

- checkPalindrome  _(also learnt about the fast and slow method where we use this for finding the middle element by jumping the slow var 1 time and fast 2 times and at the end when the fast reaches the end the slow will give u the middle element)_

