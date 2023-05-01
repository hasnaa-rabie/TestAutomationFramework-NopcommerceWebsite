# TestAutomationFramework-NopcommerceWebsite
The programming language is Java and the testing framework is TestNG.

and I used Maven to manage all the project's dependencies, and GitHub for version control.

The Design Pattern used is the (POM) Page Object Model, and use the Data-Driven Approach to read the test data.

Also, take screenshots of failed test cases and save them, and attach screenshots to automation reports also.

framework is very modular, and I have created page classes for all the common components, not just for particular pages.

This is what I do in the Regression Test Suite:

1- User Registered in the "https://demo.nopcommerce.com/"

2- User Login with the credentials he created in the registration step.

3- Navigate to the My-Account page and Change Password and try to log out and log in again to check the password change is correct and the user is able to log in using the new password.

4- Search for products using the normal way of searching and another test class to use automatic search.

5- Change the Currency for the products.

6-Add product to the cart.

7- Share the product with your friend through his Email.

8- Contact Us section that allows users to contact the owner.
