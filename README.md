# Arrays
non-primitive data type, stores data sequentially, store multiple values of the same type in a single variable, useful for storing and managing collections of data
In java, arrays are objects. 
For primitive arrays, elements are stored in a contiguous memory location. For non-primitive arrays, references are stored at contiguous locations, but the actual objects may be at different locations in memory.


# Declare an Array (not yet initialized)
##	type[] arrayName;
. type: The data type of the array elements (e.g., int, String).
. arrayName: The name of the array.


# Create an array
allocate memory for it using the new keyword.
An array stores values of a particular data type, has a name like any variable, is indicated using square brackets [ ], and can be initialized using curly braces { }
##	int[] age = {24, 23, 18, 19, 20};
	age - the name of the array
	[ ] - represents it as an array
	int - represents that the array can only include integer elements.
	{24, 23, 18, 19, 20} - elements of the array

##	int[] numbers = new int[5]; 
This statement initializes the numbers array to hold 5 integers. The default value for each element is 0.


#Basics Of Arrays: 
## CRUD Operations on Array
1. Accessing -> We can access array elements using their index, which starts from 0. each element is associated with array index (number).
	Array index specifies position of the element inside the array
	It's efficient to access array elements using loops

2. Modifying -> modify or change the value of array elements by simply accessing and assigning value.

3. Size of the Array -> Java has an inbuilt property length to find the size of the array. 
	## arr_name.length

# Java Multi-Dimensional Arrays
An array of arrays, Data in multidimensional arrays are stored in tabular form up to the nth Dimension (visually in code).

## tabular form of multi deminsional array is conditional, as in, if it's a 3D array, it creates a 3D image. So, it has to represented in tabular form. 
Otherwise, for 1D and 2D arrays they are not stored in tabular form. Each row is independently heap allocated, making it possible to have arrays with different row sizes.


## 2D Array
A 2D array can be seen as an array storing multiple 1-D arrays for easier understanding. dimensions of the 2D array are commonly called rows and columns.


# Java System.exit() Method
. used to exit current program by terminating the running Java virtual machine. 
. This method takes a status code.   
	exit(0) : to indicate successful termination.
	exit(1) or exit(-1) or any other non-zero value – Generally indicates unsuccessful termination.


## Java System.err message 
is a PrintStream to write to user terminal to output error texts.
