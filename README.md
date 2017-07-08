# BubbleSortAnyNum
   
   I tried to find a way to sort an Array of integers. First, I tried to manually input each variable through 
   
   <p>
   <p> int a = input.nextInt();</p>
   <p>int b = input.nextInt();</p>
   <p>int c = input.nextInt();</p>
   int d = input.nextInt(); </p>
   
   and so forth. I found it very inefficient and not hard-coded. Thus, I decided to insert a basic for loop so that any number that gets inputted automatically gets aded to an array of n integers.  Then, I swapped the element arr1[j-1] with arr1[j] if it was greater, and I kept on doing it until the nested for loop on line 30 reached the end of the array. I tried the program with all sorts of huge integers, and this BubbleSort program works for any integer 2,147,483,647 or under. Thanks for reading my code!

                 /* * *
                 * My Bubble sort algorithm steps are as follows.
                 *
                 * 1. Compare array[0] & array[1]
                 * 2. If array[0] > array [1] swap it.
                 * 3. Compare array[1] & array[2]
                 * 4. If array[1] > array[2] swap it.
                 * ...keep going and swapping
                 * 5. Compare array[n-1] & array[n]
                 * 6. if [n-1] > array[n] then swap it.
                 * After this step, the largest element will be at the last index.
                 *
                 * Repeat the same steps for array[1] to array[n-1]
                 ***/
