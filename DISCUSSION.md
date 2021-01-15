# Problem #1

There was problem with calculating "Bag still needed". In which code was taking wrong index value due to which it was showing wrong value in output not passing unit test cases.
And in Test file parameters of asserEquals was in wrong order, so i have changed the order of parameters it got pass.

After solving problem 4 i have split all the test cases in two different file based on their functionality.

# Problem #2

Location was the important part for details.
So i have created Bean class to store information in which we have defined "day" as a parameter with other three parameter.

# Problem #3

To sort the result i have called "Collections.sort" method with Comparator in which i am passing compare method with logic to sort based on one of the parameter of list of object .

# Problem #4

To support other attribute in future with current data of volunteer i have created the class "RiceVolunteers.java"

Which will act as a bean class for Volunteer who is assigned with rice. 
In future if we need than we can make this class as a sub class of "Volunteer" to support other product(Wheat, Corn) volunteers.

And for calculation and populating data i have created other class which separates Bean class interface and calling class interface.
Which helps to achieve modularization.


#How to run the program

Clone this code from my git repo.(https://github.com/jayD9/GranicusTakeHomeassessment.git)
Open the project in Intellij.
Click on edit configuration top right side near to run button. Set parameter argument as --> src/resources/food_shelf_north.txt (this will take the input text file)
Go to MainClass.java file and run.
