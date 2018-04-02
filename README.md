# MVC_MVP_MVVM
This repository explains the use of MVC,MVP and MVVM design pattern. It will also explains where to use the Design patterns and where not. it will differentiate the three Design pattern.It will also show the data flow diagram of each design pattern.

# MVC
It is the most used Design pattern Before. Its veri simple and easy to Implement. Mainly it have 3 modules.
1. Model
2. View
3. Controller

### MODEL
Model means , it contains all the data need to display in the view. It also have the data that represent the view.It also defines the business rules for data means as how the data can be changed and manipulated.Its nothing but the Old POJO classes to hold the data.
### VIEW
The View represents UI components like XML, HTML etc. View displays the data that is received from the controller as the outcome. In MVC pattern View monitors the model for any state change and displays updated model.Its the main Presentation Lavel of the application. Its notthing but the XMl in android, HTML in web application. its responsibility only to show the data in the view.
###Controller
The Controller is responsible to process incoming requests. It processes the user’s data through the Model and passing back the results to View. It normally acts as a mediator between the View and the Model.

### ADVANTAGES OF MVC

1. Faster development process: MVC supports rapid and parallel development. With MVC, one programmer can work on the view while other can work on the controller to create business logic of the web application. The application developed using MVC can be three times faster than application developed using other development patterns.

2. Ability to provide multiple views: In the MVC Model, you can create multiple views for a model. Code duplication is very limited in MVC because it separates data and business logic from the display.

3. Support for asynchronous technique: MVC also supports asynchronous technique, which helps developers to develop an application that loads very fast.

4. Modification does not affect the entire model: Modification does not affect the entire model because model part does not depend on the views part. Therefore, any changes in the Model will not affect the entire architecture.

5. MVC model returns the data without formatting: MVC pattern returns data without applying any formatting so the same components can be used and called for use with any interface.

6. SEO friendly Development platform: Using this platform, it is very easy to develop SEO-friendly URLs to generate more visits from a specific application.

### DISADVANTAGES OF MVC

1. THe model is always tightly coupled with View 

2. Increased complexity

3. Inefficiency of data access in view

4. Difficulty of using MVC with modern user interface.

5. Need multiple programmers

6. Knowledge on multiple technologies is required.

7) Developer have knowledge of client side code and html code.

 ## DIAGRAM OF MVC
![alt tag](https://github.com/spdobest/MVC_MVP_MVVM/blob/master/images/mvc.png)
